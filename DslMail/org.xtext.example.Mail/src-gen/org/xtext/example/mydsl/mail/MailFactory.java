/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.mail;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.mail.MailPackage
 * @generated
 */
public interface MailFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MailFactory eINSTANCE = org.xtext.example.mydsl.mail.impl.MailFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Alefaso Mailaka</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alefaso Mailaka</em>'.
   * @generated
   */
  AlefasoMailaka createAlefasoMailaka();

  /**
   * Returns a new object of class '<em>Email Recipient</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Email Recipient</em>'.
   * @generated
   */
  EmailRecipient createEmailRecipient();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MailPackage getMailPackage();

} //MailFactory