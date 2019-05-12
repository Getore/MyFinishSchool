package com.bootdo.therapy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author shenli - XD02551
 * @email
 * @createDate 2019/5/12 12:54
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TherapyDO {
    private static final long serialVersionUID = 1L;

    //所属治法，若本身是治法，则为0
    private String parentId;
    //名称
    private String nametp;
    //名称 代码
    private String nametpUnit;
    //排序值
    private Integer orderNum;
    //适用症候，适用于
    private String applicableSymptom;
    //具体的治疗方法
    private String specificTreatment;
    //同义词
    private String synonymWord;
}