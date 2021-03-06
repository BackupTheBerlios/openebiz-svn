/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.cac;

import org.openebiz.core.common.cbc.BalanceAmountType;
import org.openebiz.core.common.cbc.BalanceBroughtForwardIndicatorType;
import org.openebiz.core.common.cbc.CreditLineAmountType;
import org.openebiz.core.common.cbc.DebitLineAmountType;
import org.openebiz.core.common.cbc.GUIDType;
import org.openebiz.core.common.cbc.IDType;
import org.openebiz.core.common.cbc.NoteType;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
 *           <ccts:ComponentType>ABIE</ccts:ComponentType>
 *           <ccts:DictionaryEntryName>Statement Line. Details</ccts:DictionaryEntryName>
 *           <ccts:Version/>
 *           <ccts:Definition>Information about a Line on a Statement of Account</ccts:Definition>
 *           <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
 *         </ccts:Component>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getID <em>ID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getNote <em>Note</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getGUID <em>GUID</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getBalanceBroughtForwardIndicator <em>Balance Brought Forward Indicator</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getDebitLineAmount <em>Debit Line Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getCreditLineAmount <em>Credit Line Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getBalanceAmount <em>Balance Amount</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getPaymentMeans <em>Payment Means</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getPaymentTerms <em>Payment Terms</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getBuyerCustomerParty <em>Buyer Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getSellerSupplierParty <em>Seller Supplier Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getOriginatorCustomerParty <em>Originator Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getCreditorSupplierParty <em>Creditor Supplier Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getDebtorCustomerParty <em>Debtor Customer Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getPayeeParty <em>Payee Party</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getInvoicePeriod <em>Invoice Period</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getAccountingDocumentReference <em>Accounting Document Reference</em>}</li>
 *   <li>{@link org.openebiz.core.common.cac.StatementLineType#getExchangeRate <em>Exchange Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementLineType implements Serializable {
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

	/*
	 * Basic Entity support code for surrogate id's
	 */
	protected Long internalId = null;

	protected Integer version = null;

	/**
	 * @return Returns the internalId.
	 */
	public Long getInternalId() {
		return this.internalId;
	}

	/**
	 * @param internalId The internalId to set.
	 */
	public void setInternalId(Long internalId) {
		this.internalId = internalId;
	}

	/**
	 * @return Returns the version.
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * @param version The version to set.
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected IDType iD = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected NoteType note = null;

	/**
	 * The cached value of the '{@link #getGUID() <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUID()
	 * @generated
	 * @ordered
	 */
	protected GUIDType gUID = null;

	/**
	 * The cached value of the '{@link #getBalanceBroughtForwardIndicator() <em>Balance Brought Forward Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalanceBroughtForwardIndicator()
	 * @generated
	 * @ordered
	 */
	protected BalanceBroughtForwardIndicatorType balanceBroughtForwardIndicator = null;

	/**
	 * The cached value of the '{@link #getDebitLineAmount() <em>Debit Line Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitLineAmount()
	 * @generated
	 * @ordered
	 */
	protected DebitLineAmountType debitLineAmount = null;

	/**
	 * The cached value of the '{@link #getCreditLineAmount() <em>Credit Line Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditLineAmount()
	 * @generated
	 * @ordered
	 */
	protected CreditLineAmountType creditLineAmount = null;

	/**
	 * The cached value of the '{@link #getBalanceAmount() <em>Balance Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalanceAmount()
	 * @generated
	 * @ordered
	 */
	protected BalanceAmountType balanceAmount = null;

	/**
	 * The cached value of the '{@link #getPaymentMeans() <em>Payment Means</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMeans()
	 * @generated
	 * @ordered
	 */
	protected PaymentMeansType paymentMeans = null;

	/**
	 * The cached value of the '{@link #getPaymentTerms() <em>Payment Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTerms()
	 * @generated
	 * @ordered
	 */
	protected List paymentTerms = null;

	/**
	 * The cached value of the '{@link #getBuyerCustomerParty() <em>Buyer Customer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyerCustomerParty()
	 * @generated
	 * @ordered
	 */
	protected CustomerPartyType buyerCustomerParty = null;

	/**
	 * The cached value of the '{@link #getSellerSupplierParty() <em>Seller Supplier Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellerSupplierParty()
	 * @generated
	 * @ordered
	 */
	protected SupplierPartyType sellerSupplierParty = null;

	/**
	 * The cached value of the '{@link #getOriginatorCustomerParty() <em>Originator Customer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorCustomerParty()
	 * @generated
	 * @ordered
	 */
	protected CustomerPartyType originatorCustomerParty = null;

	/**
	 * The cached value of the '{@link #getCreditorSupplierParty() <em>Creditor Supplier Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditorSupplierParty()
	 * @generated
	 * @ordered
	 */
	protected SupplierPartyType creditorSupplierParty = null;

	/**
	 * The cached value of the '{@link #getDebtorCustomerParty() <em>Debtor Customer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebtorCustomerParty()
	 * @generated
	 * @ordered
	 */
	protected CustomerPartyType debtorCustomerParty = null;

	/**
	 * The cached value of the '{@link #getPayeeParty() <em>Payee Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayeeParty()
	 * @generated
	 * @ordered
	 */
	protected PartyType payeeParty = null;

	/**
	 * The cached value of the '{@link #getInvoicePeriod() <em>Invoice Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoicePeriod()
	 * @generated
	 * @ordered
	 */
	protected List invoicePeriod = null;

	/**
	 * The cached value of the '{@link #getAccountingDocumentReference() <em>Accounting Document Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected List accountingDocumentReference = null;

	/**
	 * The cached value of the '{@link #getExchangeRate() <em>Exchange Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeRate()
	 * @generated
	 * @ordered
	 */
	protected ExchangeRateType exchangeRate = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public StatementLineType() {
		super();
		this.init();
	}

	/**
	 * Init method to fill in the object to a generic npe-free (stable) state
	 */
	public void init() {
		this.iD = this.getID();
		this.note = this.getNote();
		this.gUID = this.getGUID();
		this.balanceBroughtForwardIndicator = this.getBalanceBroughtForwardIndicator();
		this.debitLineAmount = this.getDebitLineAmount();
		this.creditLineAmount = this.getCreditLineAmount();
		this.balanceAmount = this.getBalanceAmount();
		this.paymentMeans = this.getPaymentMeans();
		this.paymentTerms = this.getPaymentTerms();
		this.buyerCustomerParty = this.getBuyerCustomerParty();
		this.sellerSupplierParty = this.getSellerSupplierParty();
		this.originatorCustomerParty = this.getOriginatorCustomerParty();
		this.creditorSupplierParty = this.getCreditorSupplierParty();
		this.debtorCustomerParty = this.getDebtorCustomerParty();
		this.payeeParty = this.getPayeeParty();
		this.invoicePeriod = this.getInvoicePeriod();
		this.accountingDocumentReference = this.getAccountingDocumentReference();
		this.exchangeRate = this.getExchangeRate();
	}

	public String getShortDisplay() {
		StringBuilder sdisplay = new StringBuilder();
		sdisplay.append(this.getID().getValue());
		return sdisplay.toString();
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The identifier for the Statement Line</ccts:Definition>
	 *               <ccts:Cardinality>1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' containment reference.
	 * @see #setID(IDType)
	 * @generated
	 */
	public IDType getID() {
		return (iD == null) ? new IDType() : iD;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getID <em>ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' containment reference.
	 * @see #getID()
	 * @generated
	 */
	public void setID(IDType newID) {
		iD = newID;
	}

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Note. Text</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Free form text applying to the Statement Line. This element may contain notes or any other similar information that is not contained explicitly in another structure.</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Note</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Text</ccts:RepresentationTerm>
	 *               <ccts:DataType>Text. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 * @generated
	 */
	public NoteType getNote() {
		return (note == null) ? new NoteType() : note;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	public void setNote(NoteType newNote) {
		note = newNote;
	}

	/**
	 * Returns the value of the '<em><b>GUID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Globally Unique Identifier. Identifier</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>A computer-generated globally unique identifier (GUID) for the Statement Line instance</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Globally Unique Identifier</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Identifier</ccts:RepresentationTerm>
	 *               <ccts:DataType>Identifier. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUID</em>' containment reference.
	 * @see #setGUID(GUIDType)
	 * @generated
	 */
	public GUIDType getGUID() {
		return (gUID == null) ? new GUIDType() : gUID;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getGUID <em>GUID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>' containment reference.
	 * @see #getGUID()
	 * @generated
	 */
	public void setGUID(GUIDType newGUID) {
		gUID = newGUID;
	}

	/**
	 * Returns the value of the '<em><b>Balance Brought Forward Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Balance Brought Forward Indicator. Indicator</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>Indicates (true) that the Statement Line contains a balance brought forward</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Balance Brought Forward Indicator</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Indicator</ccts:RepresentationTerm>
	 *               <ccts:DataType>Indicator. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Balance Brought Forward Indicator</em>' containment reference.
	 * @see #setBalanceBroughtForwardIndicator(BalanceBroughtForwardIndicatorType)
	 * @generated
	 */
	public BalanceBroughtForwardIndicatorType getBalanceBroughtForwardIndicator() {
		return (balanceBroughtForwardIndicator == null) ? new BalanceBroughtForwardIndicatorType()
				: balanceBroughtForwardIndicator;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getBalanceBroughtForwardIndicator <em>Balance Brought Forward Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance Brought Forward Indicator</em>' containment reference.
	 * @see #getBalanceBroughtForwardIndicator()
	 * @generated
	 */
	public void setBalanceBroughtForwardIndicator(
			BalanceBroughtForwardIndicatorType newBalanceBroughtForwardIndicator) {
		balanceBroughtForwardIndicator = newBalanceBroughtForwardIndicator;
	}

	/**
	 * Returns the value of the '<em><b>Debit Line Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Debit_ Line Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The amount debitted on the Statement Line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Debit</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debit Line Amount</em>' containment reference.
	 * @see #setDebitLineAmount(DebitLineAmountType)
	 * @generated
	 */
	public DebitLineAmountType getDebitLineAmount() {
		return (debitLineAmount == null) ? new DebitLineAmountType()
				: debitLineAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getDebitLineAmount <em>Debit Line Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit Line Amount</em>' containment reference.
	 * @see #getDebitLineAmount()
	 * @generated
	 */
	public void setDebitLineAmount(DebitLineAmountType newDebitLineAmount) {
		debitLineAmount = newDebitLineAmount;
	}

	/**
	 * Returns the value of the '<em><b>Credit Line Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Credit_ Line Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The amount creditted on the Statement Line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Credit</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Line Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credit Line Amount</em>' containment reference.
	 * @see #setCreditLineAmount(CreditLineAmountType)
	 * @generated
	 */
	public CreditLineAmountType getCreditLineAmount() {
		return (creditLineAmount == null) ? new CreditLineAmountType()
				: creditLineAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getCreditLineAmount <em>Credit Line Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Line Amount</em>' containment reference.
	 * @see #getCreditLineAmount()
	 * @generated
	 */
	public void setCreditLineAmount(CreditLineAmountType newCreditLineAmount) {
		creditLineAmount = newCreditLineAmount;
	}

	/**
	 * Returns the value of the '<em><b>Balance Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>BBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Balance Amount. Amount</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>The balance amount on the Statement Line</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Balance Amount</ccts:PropertyTerm>
	 *               <ccts:RepresentationTerm>Amount</ccts:RepresentationTerm>
	 *               <ccts:DataType>Amount. Type</ccts:DataType>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Balance Amount</em>' containment reference.
	 * @see #setBalanceAmount(BalanceAmountType)
	 * @generated
	 */
	public BalanceAmountType getBalanceAmount() {
		return (balanceAmount == null) ? new BalanceAmountType()
				: balanceAmount;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getBalanceAmount <em>Balance Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance Amount</em>' containment reference.
	 * @see #getBalanceAmount()
	 * @generated
	 */
	public void setBalanceAmount(BalanceAmountType newBalanceAmount) {
		balanceAmount = newBalanceAmount;
	}

	/**
	 * Returns the value of the '<em><b>Payment Means</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Payment Means</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Means</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Means</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Means</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Means</em>' containment reference.
	 * @see #setPaymentMeans(PaymentMeansType)
	 * @generated
	 */
	public PaymentMeansType getPaymentMeans() {
		return (paymentMeans == null) ? new PaymentMeansType() : paymentMeans;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getPaymentMeans <em>Payment Means</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Means</em>' containment reference.
	 * @see #getPaymentMeans()
	 * @generated
	 */
	public void setPaymentMeans(PaymentMeansType newPaymentMeans) {
		paymentMeans = newPaymentMeans;
	}

	/**
	 * Returns the value of the '<em><b>Payment Terms</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PaymentTermsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Payment Terms</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Payment Terms</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Payment Terms</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Payment Terms</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Terms</em>' containment reference list.
	 * @generated
	 */
	public List getPaymentTerms() {
		if (paymentTerms == null) {
			paymentTerms = new ArrayList<PaymentTermsType>();
		}
		return paymentTerms;
	}

	/**
	 * Returns the value of the '<em><b>Buyer Customer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Buyer_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Buyer</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Buyer</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buyer Customer Party</em>' containment reference.
	 * @see #setBuyerCustomerParty(CustomerPartyType)
	 * @generated
	 */
	public CustomerPartyType getBuyerCustomerParty() {
		return (buyerCustomerParty == null) ? new CustomerPartyType()
				: buyerCustomerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getBuyerCustomerParty <em>Buyer Customer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buyer Customer Party</em>' containment reference.
	 * @see #getBuyerCustomerParty()
	 * @generated
	 */
	public void setBuyerCustomerParty(CustomerPartyType newBuyerCustomerParty) {
		buyerCustomerParty = newBuyerCustomerParty;
	}

	/**
	 * Returns the value of the '<em><b>Seller Supplier Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Seller_ Supplier Party. Supplier Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Seller</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Seller</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Supplier Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Supplier Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seller Supplier Party</em>' containment reference.
	 * @see #setSellerSupplierParty(SupplierPartyType)
	 * @generated
	 */
	public SupplierPartyType getSellerSupplierParty() {
		return (sellerSupplierParty == null) ? new SupplierPartyType()
				: sellerSupplierParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getSellerSupplierParty <em>Seller Supplier Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seller Supplier Party</em>' containment reference.
	 * @see #getSellerSupplierParty()
	 * @generated
	 */
	public void setSellerSupplierParty(SupplierPartyType newSellerSupplierParty) {
		sellerSupplierParty = newSellerSupplierParty;
	}

	/**
	 * Returns the value of the '<em><b>Originator Customer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Originator_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Originator</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Originator</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator Customer Party</em>' containment reference.
	 * @see #setOriginatorCustomerParty(CustomerPartyType)
	 * @generated
	 */
	public CustomerPartyType getOriginatorCustomerParty() {
		return (originatorCustomerParty == null) ? new CustomerPartyType()
				: originatorCustomerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getOriginatorCustomerParty <em>Originator Customer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator Customer Party</em>' containment reference.
	 * @see #getOriginatorCustomerParty()
	 * @generated
	 */
	public void setOriginatorCustomerParty(
			CustomerPartyType newOriginatorCustomerParty) {
		originatorCustomerParty = newOriginatorCustomerParty;
	}

	/**
	 * Returns the value of the '<em><b>Creditor Supplier Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Creditor_ Supplier Party. Supplier Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Creditor</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Creditor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Supplier Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Supplier Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creditor Supplier Party</em>' containment reference.
	 * @see #setCreditorSupplierParty(SupplierPartyType)
	 * @generated
	 */
	public SupplierPartyType getCreditorSupplierParty() {
		return (creditorSupplierParty == null) ? new SupplierPartyType()
				: creditorSupplierParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getCreditorSupplierParty <em>Creditor Supplier Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creditor Supplier Party</em>' containment reference.
	 * @see #getCreditorSupplierParty()
	 * @generated
	 */
	public void setCreditorSupplierParty(
			SupplierPartyType newCreditorSupplierParty) {
		creditorSupplierParty = newCreditorSupplierParty;
	}

	/**
	 * Returns the value of the '<em><b>Debtor Customer Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Debtor_ Customer Party. Customer Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Debtor</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Debtor</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Customer Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Customer Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debtor Customer Party</em>' containment reference.
	 * @see #setDebtorCustomerParty(CustomerPartyType)
	 * @generated
	 */
	public CustomerPartyType getDebtorCustomerParty() {
		return (debtorCustomerParty == null) ? new CustomerPartyType()
				: debtorCustomerParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getDebtorCustomerParty <em>Debtor Customer Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debtor Customer Party</em>' containment reference.
	 * @see #getDebtorCustomerParty()
	 * @generated
	 */
	public void setDebtorCustomerParty(CustomerPartyType newDebtorCustomerParty) {
		debtorCustomerParty = newDebtorCustomerParty;
	}

	/**
	 * Returns the value of the '<em><b>Payee Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Payee_ Party. Party</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Payee</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Payee</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Party</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Party</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee Party</em>' containment reference.
	 * @see #setPayeeParty(PartyType)
	 * @generated
	 */
	public PartyType getPayeeParty() {
		return (payeeParty == null) ? new PartyType() : payeeParty;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getPayeeParty <em>Payee Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Party</em>' containment reference.
	 * @see #getPayeeParty()
	 * @generated
	 */
	public void setPayeeParty(PartyType newPayeeParty) {
		payeeParty = newPayeeParty;
	}

	/**
	 * Returns the value of the '<em><b>Invoice Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.PeriodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Invoice_ Period. Period</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to Invoice Period</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTermQualifier>Invoice</ccts:PropertyTermQualifier>
	 *               <ccts:PropertyTerm>Period</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Period</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Period</em>' containment reference list.
	 * @generated
	 */
	public List getInvoicePeriod() {
		if (invoicePeriod == null) {
			invoicePeriod = new ArrayList<PeriodType>();
		}
		return invoicePeriod;
	}

	/**
	 * Returns the value of the '<em><b>Accounting Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.openebiz.core.common.cac.AccountingDocumentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Accounting Document Reference</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to an Accounting Document</ccts:Definition>
	 *               <ccts:Cardinality>0..n</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Accounting Document Reference</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Accounting Document Reference</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounting Document Reference</em>' containment reference list.
	 * @generated
	 */
	public List getAccountingDocumentReference() {
		if (accountingDocumentReference == null) {
			accountingDocumentReference = new ArrayList<
					AccountingDocumentReferenceType>();
		}
		return accountingDocumentReference;
	}

	/**
	 * Returns the value of the '<em><b>Exchange Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <ccts:Component xmlns:ccts="urn:oasis:names:draft:ubl:schema:xsd:CoreComponentParameters-2">
	 *               <ccts:ComponentType>ASBIE</ccts:ComponentType>
	 *               <ccts:DictionaryEntryName>Statement Line. Exchange Rate</ccts:DictionaryEntryName>
	 *               <ccts:Version/>
	 *               <ccts:Definition>An association to the Exchange Rate (between the Statement Line currency and the Related Document Currency)</ccts:Definition>
	 *               <ccts:Cardinality>0..1</ccts:Cardinality>
	 *               <ccts:ObjectClass>Statement Line</ccts:ObjectClass>
	 *               <ccts:PropertyTerm>Exchange Rate</ccts:PropertyTerm>
	 *               <ccts:AssociatedObjectClass>Exchange Rate</ccts:AssociatedObjectClass>
	 *             </ccts:Component>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange Rate</em>' containment reference.
	 * @see #setExchangeRate(ExchangeRateType)
	 * @generated
	 */
	public ExchangeRateType getExchangeRate() {
		return (exchangeRate == null) ? new ExchangeRateType() : exchangeRate;
	}

	/**
	 * Sets the value of the '{@link org.openebiz.core.common.cac.StatementLineType#getExchangeRate <em>Exchange Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Rate</em>' containment reference.
	 * @see #getExchangeRate()
	 * @generated
	 */
	public void setExchangeRate(ExchangeRateType newExchangeRate) {
		exchangeRate = newExchangeRate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.accountingDocumentReference == null) ? 0 : this.accountingDocumentReference.hashCode());
		result = PRIME * result + ((this.balanceAmount == null) ? 0 : this.balanceAmount.hashCode());
		result = PRIME * result + ((this.balanceBroughtForwardIndicator == null) ? 0 : this.balanceBroughtForwardIndicator.hashCode());
		result = PRIME * result + ((this.buyerCustomerParty == null) ? 0 : this.buyerCustomerParty.hashCode());
		result = PRIME * result + ((this.creditLineAmount == null) ? 0 : this.creditLineAmount.hashCode());
		result = PRIME * result + ((this.creditorSupplierParty == null) ? 0 : this.creditorSupplierParty.hashCode());
		result = PRIME * result + ((this.debitLineAmount == null) ? 0 : this.debitLineAmount.hashCode());
		result = PRIME * result + ((this.debtorCustomerParty == null) ? 0 : this.debtorCustomerParty.hashCode());
		result = PRIME * result + ((this.exchangeRate == null) ? 0 : this.exchangeRate.hashCode());
		result = PRIME * result + ((this.gUID == null) ? 0 : this.gUID.hashCode());
		result = PRIME * result + ((this.iD == null) ? 0 : this.iD.hashCode());
		result = PRIME * result + ((this.internalId == null) ? 0 : this.internalId.hashCode());
		result = PRIME * result + ((this.invoicePeriod == null) ? 0 : this.invoicePeriod.hashCode());
		result = PRIME * result + ((this.note == null) ? 0 : this.note.hashCode());
		result = PRIME * result + ((this.originatorCustomerParty == null) ? 0 : this.originatorCustomerParty.hashCode());
		result = PRIME * result + ((this.payeeParty == null) ? 0 : this.payeeParty.hashCode());
		result = PRIME * result + ((this.paymentMeans == null) ? 0 : this.paymentMeans.hashCode());
		result = PRIME * result + ((this.paymentTerms == null) ? 0 : this.paymentTerms.hashCode());
		result = PRIME * result + ((this.sellerSupplierParty == null) ? 0 : this.sellerSupplierParty.hashCode());
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
		final StatementLineType other = (StatementLineType) obj;
		if (this.accountingDocumentReference == null) {
			if (other.accountingDocumentReference != null)
				return false;
		} else if (!this.accountingDocumentReference.equals(other.accountingDocumentReference))
			return false;
		if (this.balanceAmount == null) {
			if (other.balanceAmount != null)
				return false;
		} else if (!this.balanceAmount.equals(other.balanceAmount))
			return false;
		if (this.balanceBroughtForwardIndicator == null) {
			if (other.balanceBroughtForwardIndicator != null)
				return false;
		} else if (!this.balanceBroughtForwardIndicator.equals(other.balanceBroughtForwardIndicator))
			return false;
		if (this.buyerCustomerParty == null) {
			if (other.buyerCustomerParty != null)
				return false;
		} else if (!this.buyerCustomerParty.equals(other.buyerCustomerParty))
			return false;
		if (this.creditLineAmount == null) {
			if (other.creditLineAmount != null)
				return false;
		} else if (!this.creditLineAmount.equals(other.creditLineAmount))
			return false;
		if (this.creditorSupplierParty == null) {
			if (other.creditorSupplierParty != null)
				return false;
		} else if (!this.creditorSupplierParty.equals(other.creditorSupplierParty))
			return false;
		if (this.debitLineAmount == null) {
			if (other.debitLineAmount != null)
				return false;
		} else if (!this.debitLineAmount.equals(other.debitLineAmount))
			return false;
		if (this.debtorCustomerParty == null) {
			if (other.debtorCustomerParty != null)
				return false;
		} else if (!this.debtorCustomerParty.equals(other.debtorCustomerParty))
			return false;
		if (this.exchangeRate == null) {
			if (other.exchangeRate != null)
				return false;
		} else if (!this.exchangeRate.equals(other.exchangeRate))
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
		if (this.invoicePeriod == null) {
			if (other.invoicePeriod != null)
				return false;
		} else if (!this.invoicePeriod.equals(other.invoicePeriod))
			return false;
		if (this.note == null) {
			if (other.note != null)
				return false;
		} else if (!this.note.equals(other.note))
			return false;
		if (this.originatorCustomerParty == null) {
			if (other.originatorCustomerParty != null)
				return false;
		} else if (!this.originatorCustomerParty.equals(other.originatorCustomerParty))
			return false;
		if (this.payeeParty == null) {
			if (other.payeeParty != null)
				return false;
		} else if (!this.payeeParty.equals(other.payeeParty))
			return false;
		if (this.paymentMeans == null) {
			if (other.paymentMeans != null)
				return false;
		} else if (!this.paymentMeans.equals(other.paymentMeans))
			return false;
		if (this.paymentTerms == null) {
			if (other.paymentTerms != null)
				return false;
		} else if (!this.paymentTerms.equals(other.paymentTerms))
			return false;
		if (this.sellerSupplierParty == null) {
			if (other.sellerSupplierParty != null)
				return false;
		} else if (!this.sellerSupplierParty.equals(other.sellerSupplierParty))
			return false;
		if (this.version == null) {
			if (other.version != null)
				return false;
		} else if (!this.version.equals(other.version))
			return false;
		return true;
	}

} // StatementLineType