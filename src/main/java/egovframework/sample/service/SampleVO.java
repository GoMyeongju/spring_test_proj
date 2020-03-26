package egovframework.sample.service;

import java.sql.Date;

public class SampleVO {
	//VO(Value Object) 클래스는 레이어와 레이어 사이에서 관련된 데이터를 한꺼번에 주고받을 목적으로 사용하는 클래스.
	//DTO(Data Transfer Object)라고도 함.
	
	private int id;
	private String title;
	private String regUser;
	private String content;
	private Date regDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRegUser() {
		return regUser;
	}
	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "SampleVO [id=" + id + ", title=" + title + ", regUser=" + regUser + ", content=" + content
				+ ", regDate=" + regDate + "]";
	}
	
	
	
}
