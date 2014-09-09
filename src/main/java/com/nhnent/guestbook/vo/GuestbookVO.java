package com.nhnent.guestbook.vo;

public class GuestbookVO {

	int id;
	String writerName;
	String writerPassword;
	String writeDate;
	String contents;
	String modifyDate = null;
	
	

	public GuestbookVO() {
	}

	public GuestbookVO(String writerName, String writerPassword){
		this.writerName = writerName;
		this.writerPassword = writerPassword;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the contents
	 */
	public String getContents() {
		return contents;
	}

	/**
	 * @param contents the contents to set
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	/**
	 * @return the writerName
	 */
	public String getWriterName() {
		return writerName;
	}
	/**
	 * @param writerName the writerName to set
	 */
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	/**
	 * @return the writerPassword
	 */
	public String getWriterPassword() {
		return writerPassword;
	}
	/**
	 * @param writerPassword the writerPassword to set
	 */
	public void setWriterPassword(String writerPassword) {
		this.writerPassword = writerPassword;
	}
	/**
	 * @return the writeDate
	 */
	public String getWriteDate() {
		return writeDate;
	}
	/**
	 * @param writeDate the writeDate to set
	 */
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	/**
	 * @return the modifyDate
	 */
	public String getModifyDate() {
		return modifyDate;
	}
	/**
	 * @param modifyDate the modifyDate to set
	 */
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	 
}
