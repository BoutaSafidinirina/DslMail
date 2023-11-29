/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import org.xtext.example.mydsl.mail.EmailRecipient
import org.xtext.example.mydsl.mail.AlefasoMailaka

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MailGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// Parcourez tous les éléments du modèle dans la ressource
        for (element : resource.allContents.toIterable) {
            // Si l'élément est une instance de AlefasoMailaka
            if (element instanceof AlefasoMailaka) {
                // Castez l'élément en AlefasoMailaka
                val mailaka = element as AlefasoMailaka

                // Accédez aux différentes propriétés du modèle
                val recipients = mailaka.recipients
                val objetDeMail = mailaka.objet_de_mail
                val message = mailaka.message
                val sender = mailaka.sender
                val password = mailaka.password
                
				// Utilisez la méthode map pour extraire les emails de chaque destinataire
				val recipientsEmails = mailaka.recipients.map[recipient | recipient.email]

				// Utilisez la méthode join pour concaténer les emails avec une virgule
				val recipientsEmailsString = recipientsEmails.join('","')
                // Générez le code JavaScript en utilisant les propriétés du modèle
                val jsCode = '''
                    const express = require('express');
                    const app = express();
                    app.use(express.json());
                    const { createTransport } = require('nodemailer')

                    

                    const PORT = 3000;

                    app.listen(PORT, () => {
                        console.log("🚀 @ http://localhost:" + PORT)
                         try {
                                                    // Utilisez un tableau pour spécifier plusieurs destinataires
                                                    const toList =["«recipientsEmailsString»"];
                                                    const subject = "«objetDeMail»";
                                                    const message = "«message»";
                        
                                                    const transporter = createTransport({
                                                        host: "smtp.gmail.com",
                                                        port: 587,
                                                        secure: false,
                                                        auth: {
                                                            user: "«sender»",
                                                            pass: "«password»"
                                                        }
                                                    })
                        
                                                    // Envoyez un email à chaque destinataire dans la liste
                                                    for (const to of toList) {
                                                        const data = {
                                                            from: process.env.MAIL_USER,
                                                            to,
                                                            subject,
                                                            html: '<h1> BONJOUR ET BIENVENU SUR VFTM </h1>' +
                                                                '<h3> <u>Notre Information du Jour</u> </h3>' +
                                                                '<p>' + message + '</p>' +
                                                                '<p> <i> Merci de vous avoir inscrit sur notre site web </i> </p>'
                                                        }
                        
                                                        transporter.sendMail(data, (err, info) => {
                                                            if (err) return console.log(err)
                                                            console.log("Mail bien envoyé à", to);
                                                        });
                                                    }
                        
                                                } catch (error) {
                                                    next(error)
                                                }
                    });
                '''

                // Générez un fichier JavaScript avec le code généré
                fsa.generateFile("output.js", jsCode)
            }
        }
	}
}