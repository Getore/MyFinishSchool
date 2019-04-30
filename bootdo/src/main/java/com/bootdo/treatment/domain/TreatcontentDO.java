package com.bootdo.treatment.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-04-30 11:29:39
 */
public class TreatcontentDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id - 治法部分的注释部分
	private Integer id;
	//rule_of_treatment表中的name_unit
	private String parentId;
	//注释内容
	private String content;
	//排序值，用于内部排序
	private Integer orderNum;
	//创建时间
	private Date createTime;
	//创建人编号
	private Integer createUser;
	//备注
	private String remark;

	/**
	 * 设置：id - 治法部分的注释部分
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：id - 治法部分的注释部分
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：rule_of_treatment表中的name_unit
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：rule_of_treatment表中的name_unit
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：注释内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：注释内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：排序值，用于内部排序
	 */
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * 获取：排序值，用于内部排序
	 */
	public Integer getOrderNum() {
		return orderNum;
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
