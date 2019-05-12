package com.bootdo.synonymwords.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-12 12:34:57
 */
public class SynonymwordsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Integer id;
	//同义词库名称
	private String namesy;
	//SynonymWords
	private String typesy;
	//同义词词库
	private String describesy;
	//同义词
	private String synonymsy;
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
	 * 设置：同义词库名称
	 */
	public void setNamesy(String namesy) {
		this.namesy = namesy;
	}
	/**
	 * 获取：同义词库名称
	 */
	public String getNamesy() {
		return namesy;
	}
	/**
	 * 设置：SynonymWords
	 */
	public void setTypesy(String typesy) {
		this.typesy = typesy;
	}
	/**
	 * 获取：SynonymWords
	 */
	public String getTypesy() {
		return typesy;
	}
	/**
	 * 设置：同义词词库
	 */
	public void setDescribesy(String describesy) {
		this.describesy = describesy;
	}
	/**
	 * 获取：同义词词库
	 */
	public String getDescribesy() {
		return describesy;
	}
	/**
	 * 设置：同义词
	 */
	public void setSynonymsy(String synonymsy) {
		this.synonymsy = synonymsy;
	}
	/**
	 * 获取：同义词
	 */
	public String getSynonymsy() {
		return synonymsy;
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
