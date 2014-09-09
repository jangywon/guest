package com.nhnent.guestbook.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.nhnent.guestbook.dao.GuestbookDAO;
import com.nhnent.guestbook.vo.GuestbookVO;

public class HomeControllerTest {
	
	@Autowired
	GuestbookDAO guestbookDAO;
	
	GuestbookVO guestbookVO;
	
	@before
	public void 셋업() {
		guestbookVO = new GuestbookVO(null,"TC Title","TC Description");
	}
	
	@Test
	public void 데이터_입력_테스트(){
		guestbookDAO.insertData(guestbookVO);
	}
}
