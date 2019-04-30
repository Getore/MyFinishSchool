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
public class TreatprojectDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id - 治则(专属)表ID
	private Integer id;
	//治则，此处默认为0，1.设置这个参数，是为了以后中医疾病、证候部分做区别的，2.为了与后期做匹配，3.如果在治则中有小治则，那么此处的值是相应治则的名称代码
	private String parentId;
	//名称
	private String title;
	//名称 代码
	private String titleUnit;
	//排序值，用于内部排序
	private Integer orderNum;
	//创建时间
	private Date createTime;
	//创建人编号
	private Integer createUser;
	//备注
	private String remark;

	/**
	 * 设置：id - 治则(专属)表ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：id - 治则(专属)表ID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：治则，此处默认为0
1.设置这个参数，是为了以后中医疾病、证候部分做区别的
2.为了与后期做匹配
3.如果在治则中有小治则，那么此处的值是相应治则的名称代码
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：治则，此处默认为0
1.设置这个参数，是为了以后中医疾病、证候部分做区别的
2.为了与后期做匹配
3.如果在治则中有小治则，那么此处的值是相应治则的名称代码
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：名称
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：名称
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：名称 代码
	 */
	public void setTitleUnit(String titleUnit) {
		this.titleUnit = titleUnit;
	}
	/**
	 * 获取：名称 代码
	 */
	public String getTitleUnit() {
		return titleUnit;
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
