package com.choudhary.electronics.finance.model;
import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Sales {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Customer customer;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Guarantor guarantor;
	
	@OneToMany( mappedBy="sales" , cascade = CascadeType.ALL  , fetch = FetchType.EAGER)
	Set<SalesItems> items=new LinkedHashSet<SalesItems>();
	
	private Date invoicedate;
	
	@Column(unique=true)
	private Long invoiceno;
	
	private double amountTotal;
	private double downpaymentTotal;
	private double dueTotal;
	private double interestTotal;
	
	public Sales() {
		super();
	}
	
	public Sales(Long id, Customer customer, Set<SalesItems> items, Date invoicedate, Long invoiceno,
			double amountTotal, double downpaymentTotal, double dueTotal) {
		super();
		this.id = id;
		this.customer = customer;
		this.items = items;
		this.invoicedate = invoicedate;
		this.invoiceno = invoiceno;
		this.amountTotal = amountTotal;
		this.downpaymentTotal = downpaymentTotal;
		this.dueTotal = dueTotal;
	}
	
	

	

	public Sales(Long id, Customer customer, Guarantor guarantor, Set<SalesItems> items, Date invoicedate,
			Long invoiceno, double amountTotal, double downpaymentTotal, double dueTotal, double interestTotal) {
		super();
		this.id = id;
		this.customer = customer;
		this.guarantor = guarantor;
		this.items = items;
		this.invoicedate = invoicedate;
		this.invoiceno = invoiceno;
		this.amountTotal = amountTotal;
		this.downpaymentTotal = downpaymentTotal;
		this.dueTotal = dueTotal;
		this.interestTotal = interestTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set<SalesItems> getItems() {
		return items;
	}

	public void setItems(Set<SalesItems> items) {
		this.items = items;
	}

	public Date getInvoicedate() {
		return invoicedate;
	}

	public void setInvoicedate(Date invoicedate) {
		this.invoicedate = invoicedate;
	}

	public Long getInvoiceno() {
		return invoiceno;
	}

	public void setInvoiceno(Long invoiceno) {
		this.invoiceno = invoiceno;
	}

	public double getAmountTotal() {
		return amountTotal;
	}

	public void setAmountTotal(double amountTotal) {
		this.amountTotal = amountTotal;
	}

	public double getDownpaymentTotal() {
		return downpaymentTotal;
	}

	public void setDownpaymentTotal(double downpaymentTotal) {
		this.downpaymentTotal = downpaymentTotal;
	}

	public double getDueTotal() {
		return dueTotal;
	}

	public void setDueTotal(double dueTotal) {
		this.dueTotal = dueTotal;
	}

	public double getInterestTotal() {
		return interestTotal;
	}

	public void setInterestTotal(double interestTotal) {
		this.interestTotal = interestTotal;
	}

	public Guarantor getGuarantor() {
		return guarantor;
	}

	public void setGuarantor(Guarantor guarantor) {
		this.guarantor = guarantor;
	}
	
	
	
	
	

}
