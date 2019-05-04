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
public class TheracontentDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id - 治法内容ID
	private Integer id;
	//与therapy_project_detail部分的name_unit相对应约定:如果有小小法，那么此表存的是小小法name_unit的注释；如果只有小法，那么此表存的是小法name_unit的注释；
	private String parentId;
	//适用症候，适用于
	private String applicableSymptom;
	//具体的治疗方法
	private String specificTreatment;
	//同义词
	private String synonymWord;
	//排序值，用于内部排序
	private Integer orderNum;
	//创建时间
	private Date createTime;
	//创建人
	private Integer createUser;
	//备注
	private String remark;

	/**
	 * 设置：id - 治法内容ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：id - 治法内容ID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：与therapy_project_detail部分的name_unit相对应
约定:如果有小小法，那么此表存的是小小法name_unit的注释；
如果只有小法，那么此表存的是小法name_unit的注释；
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：与therapy_project_detail部分的name_unit相对应
约定:如果有小小法，那么此表存的是小小法name_unit的注释；
如果只有小法，那么此表存的是小法name_unit的注释；
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：适用症候，适用于
	 */
	public void setApplicableSymptom(String applicableSymptom) {
		this.applicableSymptom = applicableSymptom;
	}
	/**
	 * 获取：适用症候，适用于
	 */
	public String getApplicableSymptom() {
		return applicableSymptom;
	}
	/**
	 * 设置：具体的治疗方法
	 */
	public void setSpecificTreatment(String specificTreatment) {
		this.specificTreatment = specificTreatment;
	}
	/**
	 * 获取：具体的治疗方法
	 */
	public String getSpecificTreatment() {
		return specificTreatment;
	}
	/**
	 * 设置：同义词
	 */
	public void setSynonymWord(String synonymWord) {
		this.synonymWord = synonymWord;
	}
	/**
	 * 获取：同义词
	 */
	public String getSynonymWord() {
		return synonymWord;
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
	 * 设置：创建人
	 */
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：创建人
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
