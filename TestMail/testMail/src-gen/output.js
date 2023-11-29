const express = require('express');
const app = express();
app.use(express.json());
const { createTransport } = require('nodemailer')



const PORT = 3000;

app.listen(PORT, () => {
    console.log("🚀 @ http://localhost:" + PORT)
     try {
                                // Utilisez un tableau pour spécifier plusieurs destinataires
                                const toList =["itokianarabenantenaina@gmail.com","safidinirinaraz@gmail.com"];
                                const subject = "sur e mety e rabona";
                                const message = "rabona mety am 1 alina";
    
                                const transporter = createTransport({
                                    host: "smtp.gmail.com",
                                    port: 587,
                                    secure: false,
                                    auth: {
                                        user: "elianeramanandraisoa@gmail.com",
                                        pass: "csqc ramh izox vpdl"
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
