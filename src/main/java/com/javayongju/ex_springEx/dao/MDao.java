package com.javayongju.ex_springEx.dao;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.javayongju.ex_springEx.dto.MDto;

public interface MDao {
	
	public ArrayList<MDto> listDao();
	public void memberDao(String mName, String mPhone, String mAddr,int idCount);
	
	public void deleteDao(String mNum);
	public int recordCountDao();
	public void modifyDao(String mPhone, String mAddr, String mNum);
	public MDto memberView(String mNum,String mName , String mPhone , String mAddr);

}
