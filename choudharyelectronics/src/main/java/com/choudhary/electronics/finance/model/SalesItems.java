package com.choudhary.electronics.finance.model;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table
public class SalesItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private int qty;
	private double amount;
	private double downpayment;
	private double due;
	private int emicount;
	private double emiamt;
	private int paidemicount;
	private int unpaidemicount;
	private double interest;
	private double interestamt;
	private Date firstemidate;
	private Date nextemidate;
	private double netamount;
	private double processingamt;
	private boolean status;
	
	@ElementCollection
	Map<Date, Boolean> map = new HashMap<Date ,Boolean>();
	
	@ElementCollection
	Map<Date , Double> emimap=new HashMap<Date , Double>();
		
	@ManyToOne(fetch = FetchType.EAGER)
	private Product product;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Sales sales;

	public SalesItems() {
		super();
	}

	

	public SalesItems(Long id, int qty, double amount, double downpayment, double due, int emicount, double emiamt,
			double interest, Date firstemidate, Date nextemidate, double netamount, Product product, Sales sales) {
		super();
		this.id = id;
		this.qty = qty;
		this.amount = amount;
		this.downpayment = downpayment;
		this.due = due;
		this.emicount = emicount;
		this.emiamt = emiamt;
		this.interest = interest;
		this.firstemidate = firstemidate;
		this.nextemidate = nextemidate;
		this.netamount = netamount;
		this.product = product;
		this.sales = sales;
	}

	

	public SalesItems(Long id, int qty, double amount, double downpayment, double due, int emicount, double emiamt,
			int paidemicount, int unpaidemicount, double interest, double interestamt, Date firstemidate,
			Date nextemidate, double netamount, Map<Date, Boolean> map, Map<Date, Double> emimap, Product product,
			Sales sales) {
		super();
		this.id = id;
		this.qty = qty;
		this.amount = amount;
		this.downpayment = downpayment;
		this.due = due;
		this.emicount = emicount;
		this.emiamt = emiamt;
		this.paidemicount = paidemicount;
		this.unpaidemicount = unpaidemicount;
		this.interest = interest;
		this.interestamt = interestamt;
		this.firstemidate = firstemidate;
		this.nextemidate = nextemidate;
		this.netamount = netamount;
		this.map = map;
		this.emimap = emimap;
		this.product = product;
		this.sales = sales;
	}

	
	


	


	public SalesItems(Long id, int qty, double amount, double downpayment, double due, int emicount, double emiamt,
			int paidemicount, int unpaidemicount, double interest, double interestamt, Date firstemidate,
			Date nextemidate, double netamount, double processingamt, boolean status, Map<Date, Boolean> map,
			Map<Date, Double> emimap, Product product, Sales sales) {
		super();
		this.id = id;
		this.qty = qty;
		this.amount = amount;
		this.downpayment = downpayment;
		this.due = due;
		this.emicount = emicount;
		this.emiamt = emiamt;
		this.paidemicount = paidemicount;
		this.unpaidemicount = unpaidemicount;
		this.interest = interest;
		this.interestamt = interestamt;
		this.firstemidate = firstemidate;
		this.nextemidate = nextemidate;
		this.netamount = netamount;
		this.processingamt = processingamt;
		this.status = status;
		this.map = map;
		this.emimap = emimap;
		this.product = product;
		this.sales = sales;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getDownpayment() {
		return downpayment;
	}

	public void setDownpayment(double downpayment) {
		this.downpayment = downpayment;
	}

	public double getDue() {
		return due;
	}

	public void setDue(double due) {
		this.due = due;
	}

	public int getEmicount() {
		return emicount;
	}

	public void setEmicount(int emicount) {
		this.emicount = emicount;
	}

	public double getEmiamt() {
		return emiamt;
	}

	public void setEmiamt(double emiamt) {
		this.emiamt = emiamt;
	}

	public Date getFirstemidate() {
		return firstemidate;
	}

	public void setFirstemidate(Date firstemidate) {
		this.firstemidate = firstemidate;
	}

	public Date getNextemidate() {
		return nextemidate;
	}

	public void setNextemidate(Date nextemidate) {
		this.nextemidate = nextemidate;
	}

	public double getNetamount() {
		return netamount;
	}

	public void setNetamount(double netamount) {
		this.netamount = netamount;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Sales getSales() {
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}



	public double getInterest() {
		return interest;
	}



	public void setInterest(double interest) {
		this.interest = interest;
	}



	public double getInterestamt() {
		return interestamt;
	}



	public void setInterestamt(double interestamt) {
		this.interestamt = interestamt;
	}



	public Map<Date, Boolean> getMap() {
		return map;
	}



	public void setMap(Map<Date, Boolean> map) {
		this.map = map;
	}



	public int getPaidemicount() {
		return paidemicount;
	}



	public void setPaidemicount(int paidemicount) {
		this.paidemicount = paidemicount;
	}



	public int getUnpaidemicount() {
		return unpaidemicount;
	}



	public void setUnpaidemicount(int unpaidemicount) {
		this.unpaidemicount = unpaidemicount;
	}



	public Map<Date, Double> getEmimap() {
		return emimap;
	}



	public void setEmimap(Map<Date, Double> emimap) {
		this.emimap = emimap;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public double getProcessingamt() {
		return processingamt;
	}



	public void setProcessingamt(double processingamt) {
		this.processingamt = processingamt;
	}
	
	
	

}
