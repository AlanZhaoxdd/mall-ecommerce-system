package com.macro.mall.system.dao;

import com.macro.mall.system.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description 搜索系统中的商品管理自定义Dao
 * @date 2025/5/11
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
