package com.nhnent.guestbook.controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nhnent.guestbook.dao.GuestbookDAO;
import com.nhnent.guestbook.vo.GuestbookVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/appServlet/*.xml",
		"classpath:/context/*.xml" })

public class HomeControllerTest {

	@Autowired
	GuestbookDAO guestbookDAO;
	GuestbookVO guestbookVO;

	@Before
	public void 셋업() {
		guestbookVO = new GuestbookVO();
		guestbookVO.setWriterName("testcase");
		guestbookVO.setWriterPassword("password");
		guestbookVO.setContents("contents");
	}
	@Test
	public void 모든데이터_출력_테스트(){
		guestbookDAO.getAllData();
	}
	
	@Test
	public void 데이터_입력_테스트() {
		guestbookDAO.insertData(guestbookVO);
		}
	@Test
	public void 입력된_데이터_삭제(){
		guestbookDAO.deleteDataById(guestbookVO.getWriterName());
	}
	
}
