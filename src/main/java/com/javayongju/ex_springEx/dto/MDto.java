package com.javayongju.ex_springEx.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class MDto {
	
	private int mNum;
	private String mName;
	private String mPhone;
	private String mAddr;
	private Date mDate;
	private int recordCount;
	private int idCount;
	
	
	
	
	
	public MDto(int mNum, String mName, String mPhone, String mAddr, Date mDate, int recordCount, int idCount) {
		super();
		this.mNum = mNum;
		this.mName = mName;
		this.mPhone = mPhone;
		this.mAddr = mAddr;
		this.mDate = mDate;
		this.recordCount = recordCount;
		this.idCount = idCount;
	}
	public MDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getmNum() {
		return mNum;
	}
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmPhone() {
		return mPhone;
	}
	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}
	public String getmAddr() {
		return mAddr;
	}
	public void setmAddr(String mAddr) {
		this.mAddr = mAddr;
	}
	public Date getmDate() {
		return mDate;
	}
	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public int getIdCount() {
		return idCount;
	}
	public void setIdCount(int idCount) {
		this.idCount = idCount;
	}
	
	
	
	
	

	
	
	
}
