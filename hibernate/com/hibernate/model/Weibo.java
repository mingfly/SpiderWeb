package com.hibernate.model;

// Generated 2015-3-22 13:12:17 by Hibernate Tools 3.2.2.GA

import java.util.Date;

/**
 * Weibo generated by hbm2java
 */
public class Weibo implements java.io.Serializable {

	private Integer id;
	private String weiboId;
	private String userId;
	private Date createTime;
	private String content;
	private String source;
	private Integer forwards;
	private Integer comments;
	private String http;
	private Integer page;

	public Weibo() {
	}

	public Weibo(String weiboId, String userId, Date createTime,
			String content, String source, Integer forwards, Integer comments,
			String http, Integer page) {
		this.weiboId = weiboId;
		this.userId = userId;
		this.createTime = createTime;
		this.content = content;
		this.source = source;
		this.forwards = forwards;
		this.comments = comments;
		this.http = http;
		this.page = page;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWeiboId() {
		return this.weiboId;
	}

	public void setWeiboId(String weiboId) {
		this.weiboId = weiboId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Integer getForwards() {
		return this.forwards;
	}

	public void setForwards(Integer forwards) {
		this.forwards = forwards;
	}

	public Integer getComments() {
		return this.comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public String getHttp() {
		return this.http;
	}

	public void setHttp(String http) {
		this.http = http;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

}
