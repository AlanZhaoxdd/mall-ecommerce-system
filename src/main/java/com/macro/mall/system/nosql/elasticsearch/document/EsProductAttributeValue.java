package com.macro.mall.system.nosql.elasticsearch.document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @description 搜索商品的属性信息
 * @date 2025/5/10
 */
@Data
@EqualsAndHashCode
public class EsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long productAttributeId;
    //属性值
    @Field(type = FieldType.Keyword)
    private String value;
    //属性参数：0->规格；1->参数
    private Integer type;
    //属性名称
    @Field(type=FieldType.Keyword)
    private String name;
}
