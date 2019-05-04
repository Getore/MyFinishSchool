package com.bootdo.therapy.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-04 22:46:36
 */
public class TheraprojectDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Integer id;
	//所属治法，若本身是治法，则为0
	private String parentId;
	//名称
	private String nametp;
	//名称 代码
	private String nametpUnit;
	//排序值
	private Integer orderNum;
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
	 * 设置：所属治法，若本身是治法，则为0
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：所属治法，若本身是治法，则为0
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：名称
	 */
	public void setNametp(String nametp) {
		this.nametp = nametp;
	}
	/**
	 * 获取：名称
	 */
	public String getNametp() {
		return nametp;
	}
	/**
	 * 设置：名称 代码
	 */
	public void setNametpUnit(String nametpUnit) {
		this.nametpUnit = nametpUnit;
	}
	/**
	 * 获取：名称 代码
	 */
	public String getNametpUnit() {
		return nametpUnit;
	}
	/**
	 * 设置：排序值
	 */
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * 获取：排序值
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
