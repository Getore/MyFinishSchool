package com.bootdo.treatment.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author shenli - XD02551
 * @email
 * @createDate 2019/5/10 11:41
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TreatmentDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //id - 治则(专属)表ID
    private Integer id;
    //治则，此处默认为0，1.设置这个参数，是为了以后中医疾病、证候部分做区别的，2.为了与后期做匹配，3.如果在治则中有小治则，那么此处的值是相应治则的名称代码
    private String parentId;
    //名称 代码
    private String titleUnit;
    //名称
    private String title;
    //注释内容
    private String content;
    //排序值，用于内部排序
    private Integer orderNum;

}