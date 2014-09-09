package com.nhnent.guestbook.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.nhnent.guestbook.vo.GuestbookVO;

/**
 * 
 * @author NHNEnt
 */
public interface GuestbookDAO {
	public List<GuestbookVO> getAllData();
	public String getPasswordByWriterName(String writerName);
 
}
