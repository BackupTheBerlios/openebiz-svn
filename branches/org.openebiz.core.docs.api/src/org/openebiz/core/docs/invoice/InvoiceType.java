/*******************************************************************************
 * Copyright (c) 2006 Open E-Biz - http://www.openebiz.org
 * Licensed Material - Property of Open E-Biz. All rights reserved.
 *
 * Contributors:
 *   Open E-Biz - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.docs.invoice;

import java.util.List;

import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.ExchangeRateType;
import org.openebiz.core.common.cac.LegalTotalType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.SupplierPartyType;

import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cbc.CopyIndicatorType;
import org.openebiz.core.common.cbc.DocumentCurrencyCodeType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.InvoiceTypeCodeType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.PricingCurrencyCodeType;
import org.openebiz.core.common.cbc.TaxCurrencyCodeType;
import org.openebiz.core.common.cbc.TaxPointDateType;
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
 *           <ccts:DictionaryEntryName>Invoice. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The document used to request payment</ccts:Definition>
 *           <ccts:ObjectClass>Invoice</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getCopyIndicator <em>Copy Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getInvoiceTypeCode <em>Invoice Type Code</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getTaxPointDate <em>Tax Point Date</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getTransactionCurrencyCode <em>Transaction Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getDocumentCurrencyCode <em>Document Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getTaxCurrencyCode <em>Tax Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getPricingCurrencyCode <em>Pricing Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getAccountingCostCode <em>Accounting Cost Code</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getInvoicePeriod <em>Invoice Period</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getOrderReference <em>Order Reference</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getDespatchDocumentReference <em>Despatch Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getReceiptDocumentReference <em>Receipt Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getAccountingDocumentReference <em>Accounting Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getOriginatorDocumentReference <em>Originator Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getContractDocumentReference <em>Contract Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getAdditionalDocumentReference <em>Additional Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getCreditorSupplierParty <em>Creditor Supplier Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getDebtorCustomerParty <em>Debtor Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getPayeeParty <em>Payee Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getBuyerCustomerParty <em>Buyer Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getSellerSupplierParty <em>Seller Supplier Party</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getDeliveryTerms <em>Delivery Terms</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getPaymentMeans <em>Payment Means</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getPaymentTerms <em>Payment Terms</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getAllowanceCharge <em>Allowance Charge</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getTransactionExchangeRate <em>Transaction Exchange Rate</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getTaxExchangeRate <em>Tax Exchange Rate</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getPricingExchangeRate <em>Pricing Exchange Rate</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getTaxTotal <em>Tax Total</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getLegalTotal <em>Legal Total</em>}</li>
 *   <li>{@link org.openebiz.core.docs.invoice.InvoiceType#getInvoiceLine <em>Invoice Line</em>}</li>
 * </ul>
 * </p>
 *
 */
public interface InvoiceType {
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
	 *               <ccts:DictionaryEntryName>Invoice. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Invoice assigned by the Creditor</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Invoice Number</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 */
	IDType getID();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getID <em>ID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Invoice. Copy Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether a document is a copy (true) or not (false)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getCopyIndicator <em>Copy Indicator</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Invoice. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Invoice instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getGUID <em>GUID</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Invoice. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date assigned by the Creditor on which the Invoice was issued</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Invoice Date</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Date</em>' containment reference.
	 * @see #setIssueDate(IssueDateType)
	 */
	IssueDateType getIssueDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getIssueDate <em>Issue Date</em>}' containment reference.
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
	 *               <ccts:DictionaryEntryName>Invoice. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The time assigned by the Creditor on which the Invoice was issued</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getIssueTime <em>Issue Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Time</em>' containment reference.
	 * @see #getIssueTime()
	 */
	void setIssueTime(IssueTimeType value);

	/**
	 * Returns the value of the '<em><b>Invoice Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Invoice Type. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Code specifying the type of the Invoice.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Invoice Type</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Type Code</em>' containment reference.
	 * @see #setInvoiceTypeCode(InvoiceTypeCodeType)
	 */
	InvoiceTypeCodeType getInvoiceTypeCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getInvoiceTypeCode <em>Invoice Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type Code</em>' containment reference.
	 * @see #getInvoiceTypeCode()
	 */
	void setInvoiceTypeCode(InvoiceTypeCodeType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Invoice. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 */
	void setNote(NoteType value);

	/**
	 * Returns the value of the '<em><b>Tax Point Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Tax Point Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date of the Invoice used to indicate the point at which tax becomes applicable.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Point Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Point Date</em>' containment reference.
	 * @see #setTaxPointDate(TaxPointDateType)
	 */
	TaxPointDateType getTaxPointDate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getTaxPointDate <em>Tax Point Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Point Date</em>' containment reference.
	 * @see #getTaxPointDate()
	 */
	void setTaxPointDate(TaxPointDateType value);

	/**
	 * Returns the value of the '<em><b>Transaction Currency Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Transaction_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The default currency for the overall transaction</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getTransactionCurrencyCode <em>Transaction Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Currency Code</em>' containment reference.
	 * @see #getTransactionCurrencyCode()
	 */
	void setTransactionCurrencyCode(TransactionCurrencyCodeType value);

	/**
	 * Returns the value of the '<em><b>Document Currency Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Document_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The currency in which the Document is presented. This may be the same currency as the pricing or as the tax.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Document</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Currency Code</em>' containment reference.
	 * @see #setDocumentCurrencyCode(DocumentCurrencyCodeType)
	 */
	DocumentCurrencyCodeType getDocumentCurrencyCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getDocumentCurrencyCode <em>Document Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Currency Code</em>' containment reference.
	 * @see #getDocumentCurrencyCode()
	 */
	void setDocumentCurrencyCode(DocumentCurrencyCodeType value);

	/**
	 * Returns the value of the '<em><b>Tax Currency Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Tax_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The currency used for tax amounts in the Invoice</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Tax</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Currency Code</em>' containment reference.
	 * @see #setTaxCurrencyCode(TaxCurrencyCodeType)
	 */
	TaxCurrencyCodeType getTaxCurrencyCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getTaxCurrencyCode <em>Tax Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Currency Code</em>' containment reference.
	 * @see #getTaxCurrencyCode()
	 */
	void setTaxCurrencyCode(TaxCurrencyCodeType value);

	/**
	 * Returns the value of the '<em><b>Pricing Currency Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Pricing_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The currency used for prices in the Invoice</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getPricingCurrencyCode <em>Pricing Currency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing Currency Code</em>' containment reference.
	 * @see #getPricingCurrencyCode()
	 */
	void setPricingCurrencyCode(PricingCurrencyCodeType value);

	/**
	 * Returns the value of the '<em><b>Accounting Cost Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Accounting_ Cost Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Buyer's accounting code applied to the Invoice as a whole</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Accounting</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Cost Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Cost Code</em>' containment reference.
	 * @see #setAccountingCostCode(AccountingCostCodeType)
	 */
	AccountingCostCodeType getAccountingCostCode();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getAccountingCostCode <em>Accounting Cost Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Cost Code</em>' containment reference.
	 * @see #getAccountingCostCode()
	 */
	void setAccountingCostCode(AccountingCostCodeType value);

	/**
	 * Returns the value of the '<em><b>Invoice Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PeriodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Invoice_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to period(s) to which the Invoice applies</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Invoice</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Period</em>' containment reference list.
	 */
	List getInvoicePeriod();

	/**
	 * Returns the value of the '<em><b>Order Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.OrderReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Order Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to an Order</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Order Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Order Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Reference</em>' containment reference list.
	 */
	List getOrderReference();

	/**
	 * Returns the value of the '<em><b>Despatch Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Despatch_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a Despatch Advice</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Despatch</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Despatch Document Reference</em>' containment reference list.
	 */
	List getDespatchDocumentReference();

	/**
	 * Returns the value of the '<em><b>Receipt Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Receipt_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a Receipt Advice</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Receipt</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receipt Document Reference</em>' containment reference list.
	 */
	List getReceiptDocumentReference();

	/**
	 * Returns the value of the '<em><b>Accounting Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AccountingDocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Accounting Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to other accounting documents.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Accounting Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Accounting Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Document Reference</em>' containment reference list.
	 */
	List getAccountingDocumentReference();

	/**
	 * Returns the value of the '<em><b>Originator Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Originator_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to an Originator Document</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Originator</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator Document Reference</em>' containment reference list.
	 */
	List getOriginatorDocumentReference();

	/**
	 * Returns the value of the '<em><b>Contract Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Contract_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a framework agreement or contract</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Contract</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract Document Reference</em>' containment reference list.
	 */
	List getContractDocumentReference();

	/**
	 * Returns the value of the '<em><b>Additional Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Additional_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to other documents</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
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
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.SignatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>One or more signatures applied to the Invoice</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Signature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Signature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 */
	List getSignature();

	/**
	 * Returns the value of the '<em><b>Creditor Supplier Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Creditor_ Supplier Party. Supplier Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Creditor. The party issuing an invoice.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Creditor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Supplier Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Supplier Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Invoice Issuer</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creditor Supplier Party</em>' containment reference.
	 * @see #setCreditorSupplierParty(SupplierPartyType)
	 */
	SupplierPartyType getCreditorSupplierParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getCreditorSupplierParty <em>Creditor Supplier Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creditor Supplier Party</em>' containment reference.
	 * @see #getCreditorSupplierParty()
	 */
	void setCreditorSupplierParty(SupplierPartyType value);

	/**
	 * Returns the value of the '<em><b>Debtor Customer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Debtor_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Debtor. The party to whom an invoice is issued.</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Debtor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Invoicee</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debtor Customer Party</em>' containment reference.
	 * @see #setDebtorCustomerParty(CustomerPartyType)
	 */
	CustomerPartyType getDebtorCustomerParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getDebtorCustomerParty <em>Debtor Customer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debtor Customer Party</em>' containment reference.
	 * @see #getDebtorCustomerParty()
	 */
	void setDebtorCustomerParty(CustomerPartyType value);

	/**
	 * Returns the value of the '<em><b>Payee Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Payee_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Payee</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Payee</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee Party</em>' containment reference.
	 * @see #setPayeeParty(PartyType)
	 */
	PartyType getPayeeParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getPayeeParty <em>Payee Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Party</em>' containment reference.
	 * @see #getPayeeParty()
	 */
	void setPayeeParty(PartyType value);

	/**
	 * Returns the value of the '<em><b>Buyer Customer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Buyer_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Buyer</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Buyer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buyer Customer Party</em>' containment reference.
	 * @see #setBuyerCustomerParty(CustomerPartyType)
	 */
	CustomerPartyType getBuyerCustomerParty();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getBuyerCustomerParty <em>Buyer Customer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buyer Customer Party</em>' containment reference.
	 * @see #getBuyerCustomerParty()
	 */
	void setBuyerCustomerParty(CustomerPartyType value);

	/**
	 * Returns the value of the '<em><b>Seller Supplier Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Seller_ Supplier Party. Supplier Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Seller</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getSellerSupplierParty <em>Seller Supplier Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seller Supplier Party</em>' containment reference.
	 * @see #getSellerSupplierParty()
	 */
	void setSellerSupplierParty(SupplierPartyType value);

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DeliveryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Delivery</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery</em>' containment reference list.
	 */
	List getDelivery();

	/**
	 * Returns the value of the '<em><b>Delivery Terms</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.DeliveryTermsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Delivery Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery Terms</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Terms</em>' containment reference list.
	 */
	List getDeliveryTerms();

	/**
	 * Returns the value of the '<em><b>Payment Means</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PaymentMeansType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Payment Means</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Means</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Means</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Means</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Means</em>' containment reference list.
	 */
	List getPaymentMeans();

	/**
	 * Returns the value of the '<em><b>Payment Terms</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PaymentTermsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Payment Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Terms</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Terms</em>' containment reference list.
	 */
	List getPaymentTerms();

	/**
	 * Returns the value of the '<em><b>Allowance Charge</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Allowances and Charges that apply to the Invoice as a whole</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowance Charge</em>' containment reference list.
	 */
	List getAllowanceCharge();

	/**
	 * Returns the value of the '<em><b>Transaction Exchange Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Transaction_ Exchange Rate. Exchange Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Exchange Rate between the Document Currency and the Transaction Currency</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Transaction</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Exchange Rate</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Exchange Rate</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Exchange Rate</em>' containment reference.
	 * @see #setTransactionExchangeRate(ExchangeRateType)
	 */
	ExchangeRateType getTransactionExchangeRate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getTransactionExchangeRate <em>Transaction Exchange Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Exchange Rate</em>' containment reference.
	 * @see #getTransactionExchangeRate()
	 */
	void setTransactionExchangeRate(ExchangeRateType value);

	/**
	 * Returns the value of the '<em><b>Tax Exchange Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Tax_ Exchange Rate. Exchange Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Exchange Rate between the Document Currency and the Pricing Currency</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Tax</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Exchange Rate</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Exchange Rate</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Exchange Rate</em>' containment reference.
	 * @see #setTaxExchangeRate(ExchangeRateType)
	 */
	ExchangeRateType getTaxExchangeRate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getTaxExchangeRate <em>Tax Exchange Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Exchange Rate</em>' containment reference.
	 * @see #getTaxExchangeRate()
	 */
	void setTaxExchangeRate(ExchangeRateType value);

	/**
	 * Returns the value of the '<em><b>Pricing Exchange Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Pricing_ Exchange Rate. Exchange Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Exchange Rate between the Document Currency and the Tax Currency</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Pricing</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Exchange Rate</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Exchange Rate</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pricing Exchange Rate</em>' containment reference.
	 * @see #setPricingExchangeRate(ExchangeRateType)
	 */
	ExchangeRateType getPricingExchangeRate();

	/**
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getPricingExchangeRate <em>Pricing Exchange Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing Exchange Rate</em>' containment reference.
	 * @see #getPricingExchangeRate()
	 */
	void setPricingExchangeRate(ExchangeRateType value);

	/**
	 * Returns the value of the '<em><b>Tax Total</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxTotalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Tax Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to tax total for specific tax types/rates</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
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
	 *               <ccts:DictionaryEntryName>Invoice. Legal Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the total amount payable on the Invoice including Allowances, Charges and Taxes</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
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
	 * Sets the value of the '{@link org.openebiz.core.docs.invoice.InvoiceType#getLegalTotal <em>Legal Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Total</em>' containment reference.
	 * @see #getLegalTotal()
	 */
	void setLegalTotal(LegalTotalType value);

	/**
	 * Returns the value of the '<em><b>Invoice Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.InvoiceLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Invoice. Invoice Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to one or more Invoice Lines</ccts:Definition>
	 *               <ccts:Cardinality>1..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Invoice</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Invoice Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Invoice Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Line</em>' containment reference list.
	 */
	List getInvoiceLine();

} // InvoiceType