package com.bootdo.stopwords.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-12 12:29:42
 */
public class StopwordsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Integer id;
	//停用词名称
	private String namest;
	//StopWords
	private String typest;
	//停用词库
	private String describest;
	//创建时间
	private Date createTime;
	//创建人编号
	private Integer createUser;
	//备注
	private String remark;

	/**
	 * 设置：id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：停用词名称
	 */
	public void setNamest(String namest) {
		this.namest = namest;
	}
	/**
	 * 获取：停用词名称
	 */
	public String getNamest() {
		return namest;
	}
	/**
	 * 设置：StopWords
	 */
	public void setTypest(String typest) {
		this.typest = typest;
	}
	/**
	 * 获取：StopWords
	 */
	public String getTypest() {
		return typest;
	}
	/**
	 * 设置：停用词库
	 */
	public void setDescribest(String describest) {
		this.describest = describest;
	}
	/**
	 * 获取：停用词库
	 */
	public String getDescribest() {
		return describest;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：创建人编号
	 */
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：创建人编号
	 */
	public Integer getCreateUser() {
		return createUser;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
}
