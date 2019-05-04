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
public class DetailtcmDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Integer id;
	//1.所属治法编号，therapy_project中的namept_unit字段对应 2.如果是小小法，那么与此表中的nameptd_unit字段对应
	private String parentId;
	//小法名称
	private String nametpd;
	//小法名称 代码
	private String nametpdUnit;
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
	 * 设置：1.所属治法编号，therapy_project中的namept_unit字段对应
2.如果是小小法，那么与此表中的nameptd_unit字段对应
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：1.所属治法编号，therapy_project中的namept_unit字段对应
2.如果是小小法，那么与此表中的nameptd_unit字段对应
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：小法名称
	 */
	public void setNametpd(String nametpd) {
		this.nametpd = nametpd;
	}
	/**
	 * 获取：小法名称
	 */
	public String getNametpd() {
		return nametpd;
	}
	/**
	 * 设置：小法名称 代码
	 */
	public void setNametpdUnit(String nametpdUnit) {
		this.nametpdUnit = nametpdUnit;
	}
	/**
	 * 获取：小法名称 代码
	 */
	public String getNametpdUnit() {
		return nametpdUnit;
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
