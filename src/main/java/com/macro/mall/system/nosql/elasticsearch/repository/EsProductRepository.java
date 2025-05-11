package com.macro.mall.system.nosql.elasticsearch.repository;

import com.macro.mall.system.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @description 商品ES操作类
 * @date 2025/5/11
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {

    /**
     * 搜索查询
     *
     * @param name  商品名称
     * @param subTitle  商品标签
     * @param keywords  商品关键字
     * @param page  分页信息
     * @return
     */
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);

}
