package com.macro.mall.system.service;

import org.springframework.data.domain.Page;
import com.macro.mall.system.nosql.elasticsearch.document.EsProduct;

import java.util.List;

/**
 * @description 商品搜索管理service
 * @date 2025/5/10
 */
public interface EsProductService {
    /**
     * 从数据库导入所有商品到ES
     */
    int importAll();

    /**
     * 根据id删除商品
     */
    void delete(Long id);

    /**
     * 根据id创建商品
     */
    EsProduct create(Long id);

    /**
     * 批量删除商品
     */
    void delete(List<Long> id);

    /**
     * 根据关键字搜索名称或副标题
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);
}
