/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.docs.quotation;

import java.util.List;

import org.openebiz.core.common.cac.CountryType;
import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.DeliveryTermsType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cac.LegalTotalType;
import org.openebiz.core.common.cac.PaymentMeansType;
import org.openebiz.core.common.cac.PeriodType;
import org.openebiz.core.common.cac.SupplierPartyType;
import org.openebiz.core.common.cac.TransactionConditionsType;

import org.openebiz.core.common.cbc.CopyIndicatorType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.PricingCurrencyCodeType;
import org.openebiz.core.common.cbc.TransactionCurrencyCodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Quotation. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The document used to quote for the provision of goods and services</ccts:Definition>
 *           <ccts:ObjectClass>Quotation</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Purchase Order</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getCopyIndicator <em>Copy Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getTransactionCurrencyCode <em>Transaction Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getPricingCurrencyCode <em>Pricing Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getRequestForQuotationDocumentReference <em>Request For Quotation Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getAdditionalDocumentReference <em>Additional Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getContract <em>Contract</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getSellerSupplierParty <em>Seller Supplier Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getOriginatorCustomerParty <em>Originator Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getDeliveryTerms <em>Delivery Terms</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getPaymentMeans <em>Payment Means</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getTransactionConditions <em>Transaction Conditions</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getAllowanceCharge <em>Allowance Charge</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getDestinationCountry <em>Destination Country</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getTaxTotal <em>Tax Total</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getLegalTotal <em>Legal Total</em>}</li>
 *   <li>{@link org.openebiz.core.docs.quotation.QuotationType#getQuotationLine <em>Quotation Line</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface QuotationType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	String copyright = "Open E-Biz - http://www.openebiz.org"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Quotation assigned by the Seller</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 */
	void setID(IDType value);

	/**
	 * Returns the value of the '<em><b>Copy Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Copy Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the Quotation is a copy (true) or not (false)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Copy Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Indicator</em>' containment reference.
	 * @see #setCopyIndicator(CopyIndicatorType)
	 */
	CopyIndicatorType getCopyIndicator();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getCopyIndicator <em>Copy Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Indicator</em>' containment reference.
	 * @see #getCopyIndicator()
	 */
	void setCopyIndicator(CopyIndicatorType value);

	/**
	 * Returns the value of the '<em><b>GUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Quotation instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUID</em>' containment reference.
	 * @see #setGUID(GUIDType)
	 */
	GUIDType getGUID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getGUID <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>' containment reference.
	 * @see #getGUID()
	 */
	void setGUID(GUIDType value);

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date assigned by the Seller on which the Quotation was issued</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Date</em>' containment reference.
	 * @see #setIssueDate(IssueDateType)
	 */
	IssueDateType getIssueDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getIssueDate <em>Issue Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' containment reference.
	 * @see #getIssueDate()
	 */
	void setIssueDate(IssueDateType value);

	/**
	 * Returns the value of the '<em><b>Issue Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The time assigned by the Seller on which the Quotation was issued</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Time</em>' containment reference.
	 * @see #setIssueTime(IssueTimeType)
	 */
	IssueTimeType getIssueTime();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getIssueTime <em>Issue Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Time</em>' containment reference.
	 * @see #getIssueTime()
	 */
	void setIssueTime(IssueTimeType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Quotation. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 */
	NoteType getNote();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 */
	void setNote(NoteType value);

	/**
	 * Returns the value of the '<em><b>Transaction Currency Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Transaction_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The default currency for the transaction, to be used for Invoicing</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transaction</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Currency Code</em>' containment reference.
	 * @see #setTransactionCurrencyCode(TransactionCurrencyCodeType)
	 */
	TransactionCurrencyCodeType getTransactionCurrencyCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getTransactionCurrencyCode <em>Transaction Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Currency Code</em>' containment reference.
	 * @see #getTransactionCurrencyCode()
	 */
	void setTransactionCurrencyCode(TransactionCurrencyCodeType value);

	/**
	 * Returns the value of the '<em><b>Pricing Currency Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Pricing_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The currency that is used for all prices in the Quotation</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Pricing</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pricing Currency Code</em>' containment reference.
	 * @see #setPricingCurrencyCode(PricingCurrencyCodeType)
	 */
	PricingCurrencyCodeType getPricingCurrencyCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getPricingCurrencyCode <em>Pricing Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing Currency Code</em>' containment reference.
	 * @see #getPricingCurrencyCode()
	 */
	void setPricingCurrencyCode(PricingCurrencyCodeType value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Validity_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The period for which the Quotation is valid</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Validity</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference.
	 * @see #setValidityPeriod(PeriodType)
	 */
	PeriodType getValidityPeriod();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getValidityPeriod <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' containment reference.
	 * @see #getValidityPeriod()
	 */
	void setValidityPeriod(PeriodType value);

	/**
	 * Returns the value of the '<em><b>Request For Quotation Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Request For Quotation_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a Request For Quotation</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Request For Quotation</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request For Quotation Document Reference</em>' containment reference.
	 * @see #setRequestForQuotationDocumentReference(DocumentReferenceType)
	 */
	DocumentReferenceType getRequestForQuotationDocumentReference();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getRequestForQuotationDocumentReference <em>Request For Quotation Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request For Quotation Document Reference</em>' containment reference.
	 * @see #getRequestForQuotationDocumentReference()
	 */
	void setRequestForQuotationDocumentReference(DocumentReferenceType value);

	/**
	 * Returns the value of the '<em><b>Additional Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Additional_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to other documents</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Document Reference</em>' containment reference list.
	 */
	List getAdditionalDocumentReference();

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.ContractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Contract</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a framework agreement or contract</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Contract</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contract</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 */
	List getContract();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.SignatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Associates the Quotation with zero or more signatures.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Signature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Signature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 */
	List getSignature();

	/**
	 * Returns the value of the '<em><b>Seller Supplier Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Seller_ Supplier Party. Supplier Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Seller</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Seller</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Supplier Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Supplier Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seller Supplier Party</em>' containment reference.
	 * @see #setSellerSupplierParty(SupplierPartyType)
	 */
	SupplierPartyType getSellerSupplierParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getSellerSupplierParty <em>Seller Supplier Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seller Supplier Party</em>' containment reference.
	 * @see #getSellerSupplierParty()
	 */
	void setSellerSupplierParty(SupplierPartyType value);

	/**
	 * Returns the value of the '<em><b>Originator Customer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Originator_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Originator</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Originator</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator Customer Party</em>' containment reference.
	 * @see #setOriginatorCustomerParty(CustomerPartyType)
	 */
	CustomerPartyType getOriginatorCustomerParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getOriginatorCustomerParty <em>Originator Customer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator Customer Party</em>' containment reference.
	 * @see #getOriginatorCustomerParty()
	 */
	void setOriginatorCustomerParty(CustomerPartyType value);

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DeliveryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Delivery</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery</em>' containment reference list.
	 */
	List getDelivery();

	/**
	 * Returns the value of the '<em><b>Delivery Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Delivery Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery Terms</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Terms</em>' containment reference.
	 * @see #setDeliveryTerms(DeliveryTermsType)
	 */
	DeliveryTermsType getDeliveryTerms();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getDeliveryTerms <em>Delivery Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Terms</em>' containment reference.
	 * @see #getDeliveryTerms()
	 */
	void setDeliveryTerms(DeliveryTermsType value);

	/**
	 * Returns the value of the '<em><b>Payment Means</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Payment Means</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to potential Payment Means for Orders related to this Quotation</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Means</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Means</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Means</em>' containment reference.
	 * @see #setPaymentMeans(PaymentMeansType)
	 */
	PaymentMeansType getPaymentMeans();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getPaymentMeans <em>Payment Means</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Means</em>' containment reference.
	 * @see #getPaymentMeans()
	 */
	void setPaymentMeans(PaymentMeansType value);

	/**
	 * Returns the value of the '<em><b>Transaction Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Transaction Conditions</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association with any sales or purchasing conditions applying to Orders related to this Quotation.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transaction Conditions</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transaction Conditions</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Conditions</em>' containment reference.
	 * @see #setTransactionConditions(TransactionConditionsType)
	 */
	TransactionConditionsType getTransactionConditions();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getTransactionConditions <em>Transaction Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Conditions</em>' containment reference.
	 * @see #getTransactionConditions()
	 */
	void setTransactionConditions(TransactionConditionsType value);

	/**
	 * Returns the value of the '<em><b>Allowance Charge</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Allowances and Charges that apply to the Quotation as a whole</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowance Charge</em>' containment reference list.
	 */
	List getAllowanceCharge();

	/**
	 * Returns the value of the '<em><b>Destination Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Destination_ Country. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the country of destination (for customs purposes for potential orders)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Destination</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Country</em>' containment reference.
	 * @see #setDestinationCountry(CountryType)
	 */
	CountryType getDestinationCountry();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getDestinationCountry <em>Destination Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Country</em>' containment reference.
	 * @see #getDestinationCountry()
	 */
	void setDestinationCountry(CountryType value);

	/**
	 * Returns the value of the '<em><b>Tax Total</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxTotalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Tax Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the total tax amount of the Order (as estimated by the Seller)</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Total</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Total</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Total</em>' containment reference list.
	 */
	List getTaxTotal();

	/**
	 * Returns the value of the '<em><b>Legal Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Legal Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An assocation to the total amounts for the Order net of allowances and taxes (as quoted by the Seller)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Legal Total</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Legal Total</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Total</em>' containment reference.
	 * @see #setLegalTotal(LegalTotalType)
	 */
	LegalTotalType getLegalTotal();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.quotation.QuotationType#getLegalTotal <em>Legal Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Total</em>' containment reference.
	 * @see #getLegalTotal()
	 */
	void setLegalTotal(LegalTotalType value);

	/**
	 * Returns the value of the '<em><b>Quotation Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.QuotationLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Quotation. Quotation Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to one or more Quotation Lines</ccts:Definition>
	 *               <ccts:Cardinality>1..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Quotation</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Quotation Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Quotation Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quotation Line</em>' containment reference list.
	 */
	List getQuotationLine();

} // QuotationType