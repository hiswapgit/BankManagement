package com.Bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	
	@Id
	@Column(name="account_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long accountId;
	

	@Column(name="balence")
	private Long balence;
	
	@Column(name="acc_no")
	private Long accNO;
	
	@OneToOne(fetch=FetchType.EAGER)
 @JoinColumn(name="user_id") private User userid;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	public Long getBalence() {
		return balence;
	}

	public void setBalence(Long balence) {
		this.balence = balence;
	}

	public Long getAccNO() {
		return accNO;
	}

	public void setAccNO(Long accNO) {
		this.accNO = accNO;
	}
	
	

}
