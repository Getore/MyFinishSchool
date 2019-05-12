package com.bootdo.suggestwords.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-12 12:34:33
 */
public class SuggestwordsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Integer id;
	//专有名词名称
	private String namesg;
	//SuggestWords
	private String typesg;
	//专有名词词库
	private String describesg;
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
	 * 设置：专有名词名称
	 */
	public void setNamesg(String namesg) {
		this.namesg = namesg;
	}
	/**
	 * 获取：专有名词名称
	 */
	public String getNamesg() {
		return namesg;
	}
	/**
	 * 设置：SuggestWords
	 */
	public void setTypesg(String typesg) {
		this.typesg = typesg;
	}
	/**
	 * 获取：SuggestWords
	 */
	public String getTypesg() {
		return typesg;
	}
	/**
	 * 设置：专有名词词库
	 */
	public void setDescribesg(String describesg) {
		this.describesg = describesg;
	}
	/**
	 * 获取：专有名词词库
	 */
	public String getDescribesg() {
		return describesg;
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
