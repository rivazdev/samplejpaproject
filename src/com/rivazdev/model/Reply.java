package com.rivazdev.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the reply database table.
 * 
 */
@Entity
@NamedQuery(name="Reply.findAll", query="SELECT r FROM Reply r")
public class Reply implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_time_reply")
	private Date dateTimeReply;

	@Column(name="query_id")
	private int queryId;

	@Column(name="reply_message")
	private String replyMessage;

	@Column(name="support_user_id")
	private int supportUserId;

	public Reply() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateTimeReply() {
		return this.dateTimeReply;
	}

	public void setDateTimeReply(Date dateTimeReply) {
		this.dateTimeReply = dateTimeReply;
	}

	public int getQueryId() {
		return this.queryId;
	}

	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}

	public String getReplyMessage() {
		return this.replyMessage;
	}

	public void setReplyMessage(String replyMessage) {
		this.replyMessage = replyMessage;
	}

	public int getSupportUserId() {
		return this.supportUserId;
	}

	public void setSupportUserId(int supportUserId) {
		this.supportUserId = supportUserId;
	}

}