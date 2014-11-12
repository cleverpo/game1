package com.server.datamanager;

import java.util.Date;

import com.server.utility.DateUtil;

public class Notice {
	
	private String content;
	private int cdTime;	//ˢ�¼��(��λs)
	private Date startTime;
	private Date endTime;
	private Date lastSendTime = DateUtil.getSystemMinDate();//�ϴη��͹����ʱ��
	
	public Notice() {

	}
	
	public Notice(String content,int cdTime,String startTime,String endTime) {
		this.content = content;
		this.cdTime = cdTime;
		this.startTime = DateUtil.getTimeByString(startTime);
		this.endTime = DateUtil.getTimeByString(endTime);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCdTime() {
		return cdTime;
	}

	public void setCdTime(int cdTime) {
		this.cdTime = cdTime;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getLastSendTime() {
		return lastSendTime;
	}

	public void setLastSendTime(Date lastSendTime) {
		this.lastSendTime = lastSendTime;
	}

}
