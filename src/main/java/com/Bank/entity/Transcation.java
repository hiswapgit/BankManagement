  package com.Bank.entity;
 
  import java.util.Date;
  
  import javax.persistence.Column; import javax.persistence.Entity;
import javax.persistence.FetchType;
import
  javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
  import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
  
  @Entity
  
  @Table(name="transcation") public class Transcation {
  
  @Id
  
  @Column(name="transcation_id")
  
  @GeneratedValue(strategy=GenerationType.IDENTITY) private Long transcationId;
  
  @Column(name="transcation_Date") private Date transcationDate;
 
  @OneToOne(fetch=FetchType.EAGER)
  @JoinColumn(name="account_from") private Account accountfrom;
  
  @OneToOne(fetch=FetchType.EAGER)
  @JoinColumn(name="account_to") private Account accountto;
  
  public Long getTranscationId() {
	return transcationId;
}

public void setTranscationId(Long transcationId) {
	this.transcationId = transcationId;
}

public Date getTranscationDate() {
	return transcationDate;
}

public void setTranscationDate(Date transcationDate) {
	this.transcationDate = transcationDate;
}

public Account getAccountfrom() {
	return accountfrom;
}

public void setAccountfrom(Account accountfrom) {
	this.accountfrom = accountfrom;
}

public Account getAccountto() {
	return accountto;
}

public void setAccountto(Account accountto) {
	this.accountto = accountto;
}

public Long getBalance() {
	return balance;
}

public void setBalance(Long balance) {
	this.balance = balance;
}

public String getTransacationType() {
	return transacationType;
}

public void setTransacationType(String transacationType) {
	this.transacationType = transacationType;
}

@Column(name="balance") private Long balance;
  
  @Column(name="transacation_type") private String transacationType;
  
 
  
  
  
 }
 