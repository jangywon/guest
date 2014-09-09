package com.nhnent.guestbook.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.nhnent.guestbook.dao.GuestbookDAO;
import com.nhnent.guestbook.vo.GuestbookVO;

@Service
@Repository
public class GuestbookDAOImpl implements GuestbookDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<GuestbookVO> getAllData() {
		return sqlSession.selectList("getAllData");
	}

	@Override
	public String getPasswordByWriterName(String writerName) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getPasswordByWriterName");
	}

	@Override
	public void insertData(GuestbookVO guestbookVO) {
		sqlSession.insert("insertData",guestbookVO);
	}

	@Override
	public void deleteDataById(String writerName) {
		// TODO Auto-generated method stub
		sqlSession.delete("deleteDataById", writerName);
	}
	@Override
	public GuestbookVO getDataByWriterName(String writerName) {
		return sqlSession.selectOne("getDataByWriterName", writerName);
	}
}
