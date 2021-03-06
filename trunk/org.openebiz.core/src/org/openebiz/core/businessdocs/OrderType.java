/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.businessdocs;

import org.openebiz.core.common.cac.AllowanceChargeType;
import org.openebiz.core.common.cac.ContractType;
import org.openebiz.core.common.cac.CountryType;
import org.openebiz.core.common.cac.CustomerPartyType;
import org.openebiz.core.common.cac.DeliveryTermsType;
import org.openebiz.core.common.cac.DeliveryType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cac.LegalTotalType;
import org.openebiz.core.common.cac.OrderLineType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.PaymentMeansType;
import org.openebiz.core.common.cac.PeriodType;
import org.openebiz.core.common.cac.SignatureType;
import org.openebiz.core.common.cac.SupplierPartyType;
import org.openebiz.core.common.cac.TaxTotalType;
import org.openebiz.core.common.cac.TransactionConditionsType;

import org.openebiz.core.common.cbc.AccountingCostCodeType;
import org.openebiz.core.common.cbc.CopyIndicatorType;
import org.openebiz.core.common.cbc.CustomerReferenceType;
import org.openebiz.core.common.cbc.DocumentCurrencyCodeType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.IssueDateType;
import org.openebiz.core.common.cbc.IssueTimeType;
import org.openebiz.core.common.cbc.NoteType;
import org.openebiz.core.common.cbc.PricingCurrencyCodeType;
import org.openebiz.core.common.cbc.RequestedInvoiceCurrencyCodeType;
import org.openebiz.core.common.cbc.SalesOrderIDType;
import org.openebiz.core.common.cbc.TaxCurrencyCodeType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Order. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>The document used to order goods and services</ccts:Definition>
 *           <ccts:ObjectClass>Order</ccts:ObjectClass>
 *           <ccts:AlternativeBusinessTerms>Purchase Order</ccts:AlternativeBusinessTerms>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getSalesOrderID <em>Sales Order ID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getCopyIndicator <em>Copy Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getRequestedInvoiceCurrencyCode <em>Requested Invoice Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getDocumentCurrencyCode <em>Document Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getPricingCurrencyCode <em>Pricing Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getTaxCurrencyCode <em>Tax Currency Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getCustomerReference <em>Customer Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getAccountingCostCode <em>Accounting Cost Code</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getQuotationDocumentReference <em>Quotation Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getOrderDocumentReference <em>Order Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getOriginatorDocumentReference <em>Originator Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getAdditionalDocumentReference <em>Additional Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getContract <em>Contract</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getBuyerCustomerParty <em>Buyer Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getSellerSupplierParty <em>Seller Supplier Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getOriginatorCustomerParty <em>Originator Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getFreightForwarderParty <em>Freight Forwarder Party</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getDeliveryTerms <em>Delivery Terms</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getPaymentMeans <em>Payment Means</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getTransactionConditions <em>Transaction Conditions</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getAllowanceCharge <em>Allowance Charge</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getDestinationCountry <em>Destination Country</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getTaxTotal <em>Tax Total</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getLegalTotal <em>Legal Total</em>}</li>
 *   <li>{@link org.openebiz.core.businessdocs.OrderType#getOrderLine <em>Order Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderType implements Serializable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Open E-Biz - Darrell Kundel"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *  Basic surrogate id support
	 */

	/**
	 *  The internal surrogate id
	 */
	protected Long internalId = null;

	/**
	 *  The db version number
	 */
	protected Integer version = null;

	/**
	 * @return the internalId
	 */
	public Long getInternalId() {
		return this.internalId;
	}

	/**
	 * @return the version
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * @param internalId the internalId to set
	 */
	protected void setInternalId(Long internalId) {
		this.internalId = internalId;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected IDType iD = null;

	/**
	 * The cached value of the '{@link #getSalesOrderID() <em>Sales Order ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOrderID()
	 * @generated
	 * @ordered
	 */
	protected SalesOrderIDType salesOrderID = null;

	/**
	 * The cached value of the '{@link #getCopyIndicator() <em>Copy Indicator</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyIndicator()
	 * @generated
	 * @ordered
	 */
	protected CopyIndicatorType copyIndicator = null;

	/**
	 * The cached value of the '{@link #getGUID() <em>GUID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUID()
	 * @generated
	 * @ordered
	 */
	protected GUIDType gUID = null;

	/**
	 * The cached value of the '{@link #getIssueDate() <em>Issue Date</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected IssueDateType issueDate = null;

	/**
	 * The cached value of the '{@link #getIssueTime() <em>Issue Time</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueTime()
	 * @generated
	 * @ordered
	 */
	protected IssueTimeType issueTime = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected NoteType note = null;

	/**
	 * The cached value of the '{@link #getRequestedInvoiceCurrencyCode() <em>Requested Invoice Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedInvoiceCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected RequestedInvoiceCurrencyCodeType requestedInvoiceCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getDocumentCurrencyCode() <em>Document Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected DocumentCurrencyCodeType documentCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getPricingCurrencyCode() <em>Pricing Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected PricingCurrencyCodeType pricingCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getTaxCurrencyCode() <em>Tax Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected TaxCurrencyCodeType taxCurrencyCode = null;

	/**
	 * The cached value of the '{@link #getCustomerReference() <em>Customer Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerReference()
	 * @generated
	 * @ordered
	 */
	protected CustomerReferenceType customerReference = null;

	/**
	 * The cached value of the '{@link #getAccountingCostCode() <em>Accounting Cost Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingCostCode()
	 * @generated
	 * @ordered
	 */
	protected AccountingCostCodeType accountingCostCode = null;

	/**
	 * The cached value of the '{@link #getValidityPeriod() <em>Validity Period</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected List  validityPeriod = null;

	/**
	 * The cached value of the '{@link #getQuotationDocumentReference() <em>Quotation Document Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotationDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected DocumentReferenceType quotationDocumentReference = null;

	/**
	 * The cached value of the '{@link #getOrderDocumentReference() <em>Order Document Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List  orderDocumentReference = null;

	/**
	 * The cached value of the '{@link #getOriginatorDocumentReference() <em>Originator Document Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected DocumentReferenceType originatorDocumentReference = null;

	/**
	 * The cached value of the '{@link #getAdditionalDocumentReference() <em>Additional Document Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List  additionalDocumentReference = null;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected List  contract = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected List  signature = null;

	/**
	 * The cached value of the '{@link #getBuyerCustomerParty() <em>Buyer Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyerCustomerParty()
	 * @generated
	 * @ordered
	 */
	protected CustomerPartyType buyerCustomerParty = null;

	/**
	 * The cached value of the '{@link #getSellerSupplierParty() <em>Seller Supplier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellerSupplierParty()
	 * @generated
	 * @ordered
	 */
	protected SupplierPartyType sellerSupplierParty = null;

	/**
	 * The cached value of the '{@link #getOriginatorCustomerParty() <em>Originator Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorCustomerParty()
	 * @generated
	 * @ordered
	 */
	protected CustomerPartyType originatorCustomerParty = null;

	/**
	 * The cached value of the '{@link #getFreightForwarderParty() <em>Freight Forwarder Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreightForwarderParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType freightForwarderParty = null;

	/**
	 * The cached value of the '{@link #getDelivery() <em>Delivery</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelivery()
	 * @generated
	 * @ordered
	 */
	protected List  delivery = null;

	/**
	 * The cached value of the '{@link #getDeliveryTerms() <em>Delivery Terms</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryTerms()
	 * @generated
	 * @ordered
	 */
	protected DeliveryTermsType deliveryTerms = null;

	/**
	 * The cached value of the '{@link #getPaymentMeans() <em>Payment Means</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMeans()
	 * @generated
	 * @ordered
	 */
	protected PaymentMeansType paymentMeans = null;

	/**
	 * The cached value of the '{@link #getTransactionConditions() <em>Transaction Conditions</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionConditions()
	 * @generated
	 * @ordered
	 */
	protected TransactionConditionsType transactionConditions = null;

	/**
	 * The cached value of the '{@link #getAllowanceCharge() <em>Allowance Charge</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowanceCharge()
	 * @generated
	 * @ordered
	 */
	protected List  allowanceCharge = null;

	/**
	 * The cached value of the '{@link #getDestinationCountry() <em>Destination Country</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationCountry()
	 * @generated
	 * @ordered
	 */
	protected CountryType destinationCountry = null;

	/**
	 * The cached value of the '{@link #getTaxTotal() <em>Tax Total</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxTotal()
	 * @generated
	 * @ordered
	 */
	protected List  taxTotal = null;

	/**
	 * The cached value of the '{@link #getLegalTotal() <em>Legal Total</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalTotal()
	 * @generated
	 * @ordered
	 */
	protected LegalTotalType legalTotal = null;

	/**
	 * The cached value of the '{@link #getOrderLine() <em>Order Line</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderLine()
	 * @generated
	 * @ordered
	 */
	protected List  orderLine = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType() {
		super();
		this.init();
	}
	
	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.accountingCostCode = this.getAccountingCostCode();
		this.additionalDocumentReference = this.getAdditionalDocumentReference();
		this.accountingCostCode = this.getAccountingCostCode();
		this.allowanceCharge = this.getAllowanceCharge();
		this.buyerCustomerParty = this.getBuyerCustomerParty();
		this.contract = this.getContract();
		this.copyIndicator = this.getCopyIndicator();
		this.customerReference = this.getCustomerReference();
		this.delivery = this.getDelivery();
		this.deliveryTerms = this.getDeliveryTerms();
		this.destinationCountry = this.getDestinationCountry();
		this.documentCurrencyCode = this.getDocumentCurrencyCode();
		this.freightForwarderParty = this.getFreightForwarderParty();
		this.gUID = this.getGUID();
		this.iD = this.getID();
		this.issueDate = this.getIssueDate();
		this.issueTime = this.getIssueTime();
		this.legalTotal = this.getLegalTotal();
		this.note = this.getNote();
		this.orderDocumentReference = this.getOrderDocumentReference();
		this.orderLine = this.getOrderLine();
		this.originatorCustomerParty = this.getOriginatorCustomerParty();
		this.originatorDocumentReference = this.getOriginatorDocumentReference();
		this.paymentMeans = this.getPaymentMeans();
		this.pricingCurrencyCode = this.getPricingCurrencyCode();
		this.quotationDocumentReference = this.getQuotationDocumentReference();
		this.requestedInvoiceCurrencyCode = this.getRequestedInvoiceCurrencyCode();
		this.salesOrderID = this.getSalesOrderID();
		this.sellerSupplierParty = this.getSellerSupplierParty();
		this.signature = this.getSignature();
		this.taxCurrencyCode = this.getTaxCurrencyCode();
		this.taxTotal = this.getTaxTotal();
		this.transactionConditions = this.getTransactionConditions();
		this.validityPeriod = this.getValidityPeriod();
	}
	

	/**
	 * Returns the value of the '<em><b>ID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Order assigned by the Buyer</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Purchase Order Number, Order Number</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>'
	 * @see #setID(IDType)
	 * @generated
	 */
	public IDType getID() {
		return (iD == null) ? new IDType() : iD;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getID <em>ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>'
	 * @see #getID()
	 * @generated
	 */
	public void setID(IDType newID) {
		iD = newID;
	}

	/**
	 * Returns the value of the '<em><b>Sales Order ID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Sales Order Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An identifier for the Order assigned by the Seller</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Sales Order Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Sales Order Number</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sales Order ID</em>'
	 * @see #setSalesOrderID(SalesOrderIDType)
	 * @generated
	 */
	public SalesOrderIDType getSalesOrderID() {
		return (salesOrderID == null) ? new SalesOrderIDType() : salesOrderID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getSalesOrderID <em>Sales Order ID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Order ID</em>'
	 * @see #getSalesOrderID()
	 * @generated
	 */
	public void setSalesOrderID(SalesOrderIDType newSalesOrderID) {
		salesOrderID = newSalesOrderID;
	}

	/**
	 * Returns the value of the '<em><b>Copy Indicator</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Copy Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates whether the Order is a copy (true) or not (false)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Copy Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Indicator</em>'
	 * @see #setCopyIndicator(CopyIndicatorType)
	 * @generated
	 */
	public CopyIndicatorType getCopyIndicator() {
		return (copyIndicator == null) ? new CopyIndicatorType()
				: copyIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getCopyIndicator <em>Copy Indicator</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Indicator</em>'
	 * @see #getCopyIndicator()
	 * @generated
	 */
	public void setCopyIndicator(CopyIndicatorType newCopyIndicator) {
		copyIndicator = newCopyIndicator;
	}

	/**
	 * Returns the value of the '<em><b>GUID</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Order instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUID</em>'
	 * @see #setGUID(GUIDType)
	 * @generated
	 */
	public GUIDType getGUID() {
		return (gUID == null) ? new GUIDType() : gUID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getGUID <em>GUID</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>'
	 * @see #getGUID()
	 * @generated
	 */
	public void setGUID(GUIDType newGUID) {
		gUID = newGUID;
	}

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Issue Date. Date</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The date assigned by the Buyer on which the Order was issued</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Date</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Date</ccts:RepresentationTerm>
	 *               <ccts:DataType>Date. Type</ccts:DataType>
	 *               <ccts:AlternativeBusinessTerms>Order Date</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Date</em>'
	 * @see #setIssueDate(IssueDateType)
	 * @generated
	 */
	public IssueDateType getIssueDate() {
		return (issueDate == null) ? new IssueDateType() : issueDate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getIssueDate <em>Issue Date</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>'
	 * @see #getIssueDate()
	 * @generated
	 */
	public void setIssueDate(IssueDateType newIssueDate) {
		issueDate = newIssueDate;
	}

	/**
	 * Returns the value of the '<em><b>Issue Time</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Issue Time. Time</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The time assigned by the Buyer on which the Order was issued</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Issue Time</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Time</ccts:RepresentationTerm>
	 *               <ccts:DataType>Time. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Time</em>'
	 * @see #setIssueTime(IssueTimeType)
	 * @generated
	 */
	public IssueTimeType getIssueTime() {
		return (issueTime == null) ? new IssueTimeType() : issueTime;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getIssueTime <em>Issue Time</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Time</em>'
	 * @see #getIssueTime()
	 * @generated
	 */
	public void setIssueTime(IssueTimeType newIssueTime) {
		issueTime = newIssueTime;
	}

	/**
	 * Returns the value of the '<em><b>Note</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Order. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>'
	 * @see #setNote(NoteType)
	 * @generated
	 */
	public NoteType getNote() {
		return (note == null) ? new NoteType() : note;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getNote <em>Note</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>'
	 * @see #getNote()
	 * @generated
	 */
	public void setNote(NoteType newNote) {
		note = newNote;
	}

	/**
	 * Returns the value of the '<em><b>Requested Invoice Currency Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Requested Invoice_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The currency requested for amount totals in Invoices related to this Order</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Requested Invoice</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Invoice Currency Code</em>'
	 * @see #setRequestedInvoiceCurrencyCode(RequestedInvoiceCurrencyCodeType)
	 * @generated
	 */
	public RequestedInvoiceCurrencyCodeType getRequestedInvoiceCurrencyCode() {
		return (requestedInvoiceCurrencyCode == null) ? new RequestedInvoiceCurrencyCodeType()
				: requestedInvoiceCurrencyCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getRequestedInvoiceCurrencyCode <em>Requested Invoice Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Invoice Currency Code</em>'
	 * @see #getRequestedInvoiceCurrencyCode()
	 * @generated
	 */
	public void setRequestedInvoiceCurrencyCode(
			RequestedInvoiceCurrencyCodeType newRequestedInvoiceCurrencyCode) {
		requestedInvoiceCurrencyCode = newRequestedInvoiceCurrencyCode;
	}

	/**
	 * Returns the value of the '<em><b>Document Currency Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Document_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The default currency for the Order</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Document</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Currency Code</em>'
	 * @see #setDocumentCurrencyCode(DocumentCurrencyCodeType)
	 * @generated
	 */
	public DocumentCurrencyCodeType getDocumentCurrencyCode() {
		return (documentCurrencyCode == null) ? new DocumentCurrencyCodeType()
				: documentCurrencyCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getDocumentCurrencyCode <em>Document Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Currency Code</em>'
	 * @see #getDocumentCurrencyCode()
	 * @generated
	 */
	public void setDocumentCurrencyCode(
			DocumentCurrencyCodeType newDocumentCurrencyCode) {
		documentCurrencyCode = newDocumentCurrencyCode;
	}

	/**
	 * Returns the value of the '<em><b>Pricing Currency Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Pricing_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The currency that is used for all prices in the Order</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Pricing</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pricing Currency Code</em>'
	 * @see #setPricingCurrencyCode(PricingCurrencyCodeType)
	 * @generated
	 */
	public PricingCurrencyCodeType getPricingCurrencyCode() {
		return (pricingCurrencyCode == null) ? new PricingCurrencyCodeType()
				: pricingCurrencyCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getPricingCurrencyCode <em>Pricing Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing Currency Code</em>'
	 * @see #getPricingCurrencyCode()
	 * @generated
	 */
	public void setPricingCurrencyCode(
			PricingCurrencyCodeType newPricingCurrencyCode) {
		pricingCurrencyCode = newPricingCurrencyCode;
	}

	/**
	 * Returns the value of the '<em><b>Tax Currency Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Tax_ Currency. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The currency requested for tax amounts in Invoices related to this Order</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Tax</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Currency</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Currency_ Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Currency Code</em>'
	 * @see #setTaxCurrencyCode(TaxCurrencyCodeType)
	 * @generated
	 */
	public TaxCurrencyCodeType getTaxCurrencyCode() {
		return (taxCurrencyCode == null) ? new TaxCurrencyCodeType()
				: taxCurrencyCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getTaxCurrencyCode <em>Tax Currency Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Currency Code</em>'
	 * @see #getTaxCurrencyCode()
	 * @generated
	 */
	public void setTaxCurrencyCode(TaxCurrencyCodeType newTaxCurrencyCode) {
		taxCurrencyCode = newTaxCurrencyCode;
	}

	/**
	 * Returns the value of the '<em><b>Customer Reference</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Customer Reference. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A supplementary reference for the Order.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Customer Reference</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *               <ccts:Examples>CRI in a purchasing card transaction</ccts:Examples>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customer Reference</em>'
	 * @see #setCustomerReference(CustomerReferenceType)
	 * @generated
	 */
	public CustomerReferenceType getCustomerReference() {
		return (customerReference == null) ? new CustomerReferenceType()
				: customerReference;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getCustomerReference <em>Customer Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Reference</em>'
	 * @see #getCustomerReference()
	 * @generated
	 */
	public void setCustomerReference(CustomerReferenceType newCustomerReference) {
		customerReference = newCustomerReference;
	}

	/**
	 * Returns the value of the '<em><b>Accounting Cost Code</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Accounting_ Cost Code. Code</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The Buyer's accounting code applied to the Order as a whole</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Accounting</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Cost Code</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Code</ccts:RepresentationTerm>
	 *               <ccts:DataType>Code. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Cost Code</em>'
	 * @see #setAccountingCostCode(AccountingCostCodeType)
	 * @generated
	 */
	public AccountingCostCodeType getAccountingCostCode() {
		return (accountingCostCode == null) ? new AccountingCostCodeType()
				: accountingCostCode;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getAccountingCostCode <em>Accounting Cost Code</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Cost Code</em>'
	 * @see #getAccountingCostCode()
	 * @generated
	 */
	public void setAccountingCostCode(
			AccountingCostCodeType newAccountingCostCode) {
		accountingCostCode = newAccountingCostCode;
	}

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.PeriodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Validity_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The period for which the Order is valid</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Validity</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>'
	 * @generated
	 */
	public List getValidityPeriod() {
		if (validityPeriod == null) {
			validityPeriod = new ArrayList<PeriodType>();
		}
		return validityPeriod;
	}

	/**
	 * Returns the value of the '<em><b>Quotation Document Reference</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Quotation_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a Quotation</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Quotation</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quotation Document Reference</em>'
	 * @see #setQuotationDocumentReference(DocumentReferenceType)
	 * @generated
	 */
	public DocumentReferenceType getQuotationDocumentReference() {
		return (quotationDocumentReference == null) ? new DocumentReferenceType()
				: quotationDocumentReference;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getQuotationDocumentReference <em>Quotation Document Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quotation Document Reference</em>'
	 * @see #getQuotationDocumentReference()
	 * @generated
	 */
	public void setQuotationDocumentReference(
			DocumentReferenceType newQuotationDocumentReference) {
		quotationDocumentReference = newQuotationDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Order Document Reference</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Order_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to other Orders</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Order</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Document Reference</em>'
	 * @generated
	 */
	public List getOrderDocumentReference() {
		if (orderDocumentReference == null) {
			orderDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return orderDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Originator Document Reference</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Originator_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to an Originator document</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Originator</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator Document Reference</em>'
	 * @see #setOriginatorDocumentReference(DocumentReferenceType)
	 * @generated
	 */
	public DocumentReferenceType getOriginatorDocumentReference() {
		return (originatorDocumentReference == null) ? new DocumentReferenceType()
				: originatorDocumentReference;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getOriginatorDocumentReference <em>Originator Document Reference</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator Document Reference</em>'
	 * @see #getOriginatorDocumentReference()
	 * @generated
	 */
	public void setOriginatorDocumentReference(
			DocumentReferenceType newOriginatorDocumentReference) {
		originatorDocumentReference = newOriginatorDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Additional Document Reference</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.DocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Additional_ Document Reference. Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to other documents</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Additional</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Document Reference</em>'
	 * @generated
	 */
	public List getAdditionalDocumentReference() {
		if (additionalDocumentReference == null) {
			additionalDocumentReference = new ArrayList<
					DocumentReferenceType>();
		}
		return additionalDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Contract</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.ContractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Contract</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a framework agreement or contract</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Contract</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Contract</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>'
	 * @generated
	 */
	public List getContract() {
		if (contract == null) {
			contract = new ArrayList<ContractType>();
		}
		return contract;
	}

	/**
	 * Returns the value of the '<em><b>Signature</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.SignatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Signature</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Associates the Order with zero or more signatures.</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Signature</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Signature</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>'
	 * @generated
	 */
	public List getSignature() {
		if (signature == null) {
			signature = new ArrayList<SignatureType>();
		}
		return signature;
	}

	/**
	 * Returns the value of the '<em><b>Buyer Customer Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Buyer_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Buyer</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Buyer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buyer Customer Party</em>'
	 * @see #setBuyerCustomerParty(CustomerPartyType)
	 * @generated
	 */
	public CustomerPartyType getBuyerCustomerParty() {
		return (buyerCustomerParty == null) ? new CustomerPartyType()
				: buyerCustomerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getBuyerCustomerParty <em>Buyer Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buyer Customer Party</em>'
	 * @see #getBuyerCustomerParty()
	 * @generated
	 */
	public void setBuyerCustomerParty(CustomerPartyType newBuyerCustomerParty) {
		buyerCustomerParty = newBuyerCustomerParty;
	}

	/**
	 * Returns the value of the '<em><b>Seller Supplier Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Seller_ Supplier Party. Supplier Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Seller</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Seller</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Supplier Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Supplier Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seller Supplier Party</em>'
	 * @see #setSellerSupplierParty(SupplierPartyType)
	 * @generated
	 */
	public SupplierPartyType getSellerSupplierParty() {
		return (sellerSupplierParty == null) ? new SupplierPartyType()
				: sellerSupplierParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getSellerSupplierParty <em>Seller Supplier Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seller Supplier Party</em>'
	 * @see #getSellerSupplierParty()
	 * @generated
	 */
	public void setSellerSupplierParty(SupplierPartyType newSellerSupplierParty) {
		sellerSupplierParty = newSellerSupplierParty;
	}

	/**
	 * Returns the value of the '<em><b>Originator Customer Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Originator_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Originator</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Originator</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator Customer Party</em>'
	 * @see #setOriginatorCustomerParty(CustomerPartyType)
	 * @generated
	 */
	public CustomerPartyType getOriginatorCustomerParty() {
		return (originatorCustomerParty == null) ? new CustomerPartyType()
				: originatorCustomerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getOriginatorCustomerParty <em>Originator Customer Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator Customer Party</em>'
	 * @see #getOriginatorCustomerParty()
	 * @generated
	 */
	public void setOriginatorCustomerParty(
			CustomerPartyType newOriginatorCustomerParty) {
		originatorCustomerParty = newOriginatorCustomerParty;
	}

	/**
	 * Returns the value of the '<em><b>Freight Forwarder Party</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Freight Forwarder_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to a Freight Forwarder or Carrier</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Freight Forwarder</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Carrier</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freight Forwarder Party</em>'
	 * @see #setFreightForwarderParty(PartyType)
	 * @generated
	 */
	public PartyType getFreightForwarderParty() {
		return (freightForwarderParty == null) ? new PartyType()
				: freightForwarderParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getFreightForwarderParty <em>Freight Forwarder Party</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freight Forwarder Party</em>'
	 * @see #getFreightForwarderParty()
	 * @generated
	 */
	public void setFreightForwarderParty(PartyType newFreightForwarderParty) {
		freightForwarderParty = newFreightForwarderParty;
	}

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.DeliveryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Delivery</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery</em>'
	 * @generated
	 */
	public List getDelivery() {
		if (delivery == null) {
			delivery = new ArrayList<DeliveryType>();
		}
		return delivery;
	}

	/**
	 * Returns the value of the '<em><b>Delivery Terms</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Delivery Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Delivery Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Delivery Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Delivery Terms</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Terms</em>'
	 * @see #setDeliveryTerms(DeliveryTermsType)
	 * @generated
	 */
	public DeliveryTermsType getDeliveryTerms() {
		return (deliveryTerms == null) ? new DeliveryTermsType()
				: deliveryTerms;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getDeliveryTerms <em>Delivery Terms</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Terms</em>'
	 * @see #getDeliveryTerms()
	 * @generated
	 */
	public void setDeliveryTerms(DeliveryTermsType newDeliveryTerms) {
		deliveryTerms = newDeliveryTerms;
	}

	/**
	 * Returns the value of the '<em><b>Payment Means</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Payment Means</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Means</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Means</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Means</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Means</em>'
	 * @see #setPaymentMeans(PaymentMeansType)
	 * @generated
	 */
	public PaymentMeansType getPaymentMeans() {
		return (paymentMeans == null) ? new PaymentMeansType() : paymentMeans;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getPaymentMeans <em>Payment Means</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Means</em>'
	 * @see #getPaymentMeans()
	 * @generated
	 */
	public void setPaymentMeans(PaymentMeansType newPaymentMeans) {
		paymentMeans = newPaymentMeans;
	}

	/**
	 * Returns the value of the '<em><b>Transaction Conditions</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Transaction Conditions</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association with any sales or purchasing conditions applying to the whole order.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Transaction Conditions</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Transaction Conditions</ccts:AssociatedObjectClass>
	 *               <ccts:AlternativeBusinessTerms>Sales condition, procurement condition</ccts:AlternativeBusinessTerms>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Conditions</em>'
	 * @see #setTransactionConditions(TransactionConditionsType)
	 * @generated
	 */
	public TransactionConditionsType getTransactionConditions() {
		return (transactionConditions == null) ? new TransactionConditionsType()
				: transactionConditions;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getTransactionConditions <em>Transaction Conditions</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Conditions</em>'
	 * @see #getTransactionConditions()
	 * @generated
	 */
	public void setTransactionConditions(
			TransactionConditionsType newTransactionConditions) {
		transactionConditions = newTransactionConditions;
	}

	/**
	 * Returns the value of the '<em><b>Allowance Charge</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.AllowanceChargeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Allowance Charge</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Allowances and Charges that apply to the Order as a whole</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Allowance Charge</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Allowance Charge</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowance Charge</em>'
	 * @generated
	 */
	public List getAllowanceCharge() {
		if (allowanceCharge == null) {
			allowanceCharge = new ArrayList<AllowanceChargeType>();
		}
		return allowanceCharge;
	}

	/**
	 * Returns the value of the '<em><b>Destination Country</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Destination_ Country. Country</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the country of destination (for customs purposes)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Destination</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Country</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Country</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Country</em>'
	 * @see #setDestinationCountry(CountryType)
	 * @generated
	 */
	public CountryType getDestinationCountry() {
		return (destinationCountry == null) ? new CountryType()
				: destinationCountry;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getDestinationCountry <em>Destination Country</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Country</em>'
	 * @see #getDestinationCountry()
	 * @generated
	 */
	public void setDestinationCountry(CountryType newDestinationCountry) {
		destinationCountry = newDestinationCountry;
	}

	/**
	 * Returns the value of the '<em><b>Tax Total</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.TaxTotalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Tax Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the total tax amount of the Order (as calculated by the Buyer)</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Tax Total</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Tax Total</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Total</em>'
	 * @generated
	 */
	public List getTaxTotal() {
		if (taxTotal == null) {
			taxTotal = new ArrayList<TaxTotalType>();
		}
		return taxTotal;
	}

	/**
	 * Returns the value of the '<em><b>Legal Total</b></em>'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Legal Total</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An assocation to the total amounts for the Order net of allowances and taxes (as projected by the Buyer)</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Legal Total</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Legal Total</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Total</em>'
	 * @see #setLegalTotal(LegalTotalType)
	 * @generated
	 */
	public LegalTotalType getLegalTotal() {
		return (legalTotal == null) ? new LegalTotalType() : legalTotal;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.businessdocs.order.OrderType#getLegalTotal <em>Legal Total</em>}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Total</em>'
	 * @see #getLegalTotal()
	 * @generated
	 */
	public void setLegalTotal(LegalTotalType newLegalTotal) {
		legalTotal = newLegalTotal;
	}

	/**
	 * Returns the value of the '<em><b>Order Line</b></em>'
	 * The list contents are of type {@link org.openebiz.core.common.cac.OrderLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Order. Order Line</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to one or more Order Lines</ccts:Definition>
	 *               <ccts:Cardinality>1..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Order</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Order Line</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Order Line</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Line</em>'
	 * @generated
	 */
	public List getOrderLine() {
		if (orderLine == null) {
			orderLine = new ArrayList<OrderLineType>();
		}
		return orderLine;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.accountingCostCode == null) ? 0 : this.accountingCostCode.hashCode());
		result = PRIME * result + ((this.additionalDocumentReference == null) ? 0 : this.additionalDocumentReference.hashCode());
		result = PRIME * result + ((this.allowanceCharge == null) ? 0 : this.allowanceCharge.hashCode());
		result = PRIME * result + ((this.buyerCustomerParty == null) ? 0 : this.buyerCustomerParty.hashCode());
		result = PRIME * result + ((this.contract == null) ? 0 : this.contract.hashCode());
		result = PRIME * result + ((this.copyIndicator == null) ? 0 : this.copyIndicator.hashCode());
		result = PRIME * result + ((this.customerReference == null) ? 0 : this.customerReference.hashCode());
		result = PRIME * result + ((this.delivery == null) ? 0 : this.delivery.hashCode());
		result = PRIME * result + ((this.deliveryTerms == null) ? 0 : this.deliveryTerms.hashCode());
		result = PRIME * result + ((this.destinationCountry == null) ? 0 : this.destinationCountry.hashCode());
		result = PRIME * result + ((this.documentCurrencyCode == null) ? 0 : this.documentCurrencyCode.hashCode());
		result = PRIME * result + ((this.freightForwarderParty == null) ? 0 : this.freightForwarderParty.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.issueDate == null) ? 0 : this.issueDate.hashCode());
		result = PRIME * result + ((this.issueTime == null) ? 0 : this.issueTime.hashCode());
		result = PRIME * result + ((this.legalTotal == null) ? 0 : this.legalTotal.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.orderDocumentReference == null) ? 0 : this.orderDocumentReference.hashCode());
		result = PRIME * result + ((this.orderLine == null) ? 0 : this.orderLine.hashCode());
		result = PRIME * result + ((this.originatorCustomerParty == null) ? 0 : this.originatorCustomerParty.hashCode());
		result = PRIME * result + ((this.originatorDocumentReference == null) ? 0 : this.originatorDocumentReference.hashCode());
		result = PRIME * result + ((this.paymentMeans == null) ? 0 : this.paymentMeans.hashCode());
		result = PRIME * result + ((this.pricingCurrencyCode == null) ? 0 : this.pricingCurrencyCode.hashCode());
		result = PRIME * result + ((this.quotationDocumentReference == null) ? 0 : this.quotationDocumentReference.hashCode());
		result = PRIME * result + ((this.requestedInvoiceCurrencyCode == null) ? 0 : this.requestedInvoiceCurrencyCode.hashCode());
		result = PRIME * result + ((this.salesOrderID == null) ? 0 : this.salesOrderID.hashCode());
		result = PRIME * result + ((this.sellerSupplierParty == null) ? 0 : this.sellerSupplierParty.hashCode());
		result = PRIME * result + ((this.signature == null) ? 0 : this.signature.hashCode());
		result = PRIME * result + ((this.taxCurrencyCode == null) ? 0 : this.taxCurrencyCode.hashCode());
		result = PRIME * result + ((this.taxTotal == null) ? 0 : this.taxTotal.hashCode());
		result = PRIME * result + ((this.transactionConditions == null) ? 0 : this.transactionConditions.hashCode());
		result = PRIME * result + ((this.validityPeriod == null) ? 0 : this.validityPeriod.hashCode());
		result = PRIME * result + ((this.version == null) ? 0 : this.version.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final OrderType other = (OrderType) obj;
		if (this.accountingCostCode == null) {
			if (other.accountingCostCode != null)
				return false;
		} else if (!this.accountingCostCode.equals(other.accountingCostCode))
			return false;
		if (this.additionalDocumentReference == null) {
			if (other.additionalDocumentReference != null)
				return false;
		} else if (!this.additionalDocumentReference.equals(other.additionalDocumentReference))
			return false;
		if (this.allowanceCharge == null) {
			if (other.allowanceCharge != null)
				return false;
		} else if (!this.allowanceCharge.equals(other.allowanceCharge))
			return false;
		if (this.buyerCustomerParty == null) {
			if (other.buyerCustomerParty != null)
				return false;
		} else if (!this.buyerCustomerParty.equals(other.buyerCustomerParty))
			return false;
		if (this.contract == null) {
			if (other.contract != null)
				return false;
		} else if (!this.contract.equals(other.contract))
			return false;
		if (this.copyIndicator == null) {
			if (other.copyIndicator != null)
				return false;
		} else if (!this.copyIndicator.equals(other.copyIndicator))
			return false;
		if (this.customerReference == null) {
			if (other.customerReference != null)
				return false;
		} else if (!this.customerReference.equals(other.customerReference))
			return false;
		if (this.delivery == null) {
			if (other.delivery != null)
				return false;
		} else if (!this.delivery.equals(other.delivery))
			return false;
		if (this.deliveryTerms == null) {
			if (other.deliveryTerms != null)
				return false;
		} else if (!this.deliveryTerms.equals(other.deliveryTerms))
			return false;
		if (this.destinationCountry == null) {
			if (other.destinationCountry != null)
				return false;
		} else if (!this.destinationCountry.equals(other.destinationCountry))
			return false;
		if (this.documentCurrencyCode == null) {
			if (other.documentCurrencyCode != null)
				return false;
		} else if (!this.documentCurrencyCode.equals(other.documentCurrencyCode))
			return false;
		if (this.freightForwarderParty == null) {
			if (other.freightForwarderParty != null)
				return false;
		} else if (!this.freightForwarderParty.equals(other.freightForwarderParty))
			return false;
		if (this.gUID == null) {
			if (other.gUID != null)
				return false;
		} else if (!this.gUID.equals(other.gUID))
			return false;
		if (this.iD == null) {
			if (other.iD != null)
				return false;
		} else if (!this.iD.equals(other.iD))
			return false;
		if (this.internalId == null) {
			if (other.internalId != null)
				return false;
		} else if (!this.internalId.equals(other.internalId))
			return false;
		if (this.issueDate == null) {
			if (other.issueDate != null)
				return false;
		} else if (!this.issueDate.equals(other.issueDate))
			return false;
		if (this.issueTime == null) {
			if (other.issueTime != null)
				return false;
		} else if (!this.issueTime.equals(other.issueTime))
			return false;
		if (this.legalTotal == null) {
			if (other.legalTotal != null)
				return false;
		} else if (!this.legalTotal.equals(other.legalTotal))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.orderDocumentReference == null) {
			if (other.orderDocumentReference != null)
				return false;
		} else if (!this.orderDocumentReference.equals(other.orderDocumentReference))
			return false;
		if (this.orderLine == null) {
			if (other.orderLine != null)
				return false;
		} else if (!this.orderLine.equals(other.orderLine))
			return false;
		if (this.originatorCustomerParty == null) {
			if (other.originatorCustomerParty != null)
				return false;
		} else if (!this.originatorCustomerParty.equals(other.originatorCustomerParty))
			return false;
		if (this.originatorDocumentReference == null) {
			if (other.originatorDocumentReference != null)
				return false;
		} else if (!this.originatorDocumentReference.equals(other.originatorDocumentReference))
			return false;
		if (this.paymentMeans == null) {
			if (other.paymentMeans != null)
				return false;
		} else if (!this.paymentMeans.equals(other.paymentMeans))
			return false;
		if (this.pricingCurrencyCode == null) {
			if (other.pricingCurrencyCode != null)
				return false;
		} else if (!this.pricingCurrencyCode.equals(other.pricingCurrencyCode))
			return false;
		if (this.quotationDocumentReference == null) {
			if (other.quotationDocumentReference != null)
				return false;
		} else if (!this.quotationDocumentReference.equals(other.quotationDocumentReference))
			return false;
		if (this.requestedInvoiceCurrencyCode == null) {
			if (other.requestedInvoiceCurrencyCode != null)
				return false;
		} else if (!this.requestedInvoiceCurrencyCode.equals(other.requestedInvoiceCurrencyCode))
			return false;
		if (this.salesOrderID == null) {
			if (other.salesOrderID != null)
				return false;
		} else if (!this.salesOrderID.equals(other.salesOrderID))
			return false;
		if (this.sellerSupplierParty == null) {
			if (other.sellerSupplierParty != null)
				return false;
		} else if (!this.sellerSupplierParty.equals(other.sellerSupplierParty))
			return false;
		if (this.signature == null) {
			if (other.signature != null)
				return false;
		} else if (!this.signature.equals(other.signature))
			return false;
		if (this.taxCurrencyCode == null) {
			if (other.taxCurrencyCode != null)
				return false;
		} else if (!this.taxCurrencyCode.equals(other.taxCurrencyCode))
			return false;
		if (this.taxTotal == null) {
			if (other.taxTotal != null)
				return false;
		} else if (!this.taxTotal.equals(other.taxTotal))
			return false;
		if (this.transactionConditions == null) {
			if (other.transactionConditions != null)
				return false;
		} else if (!this.transactionConditions.equals(other.transactionConditions))
			return false;
		if (this.validityPeriod == null) {
			if (other.validityPeriod != null)
				return false;
		} else if (!this.validityPeriod.equals(other.validityPeriod))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // OrderType