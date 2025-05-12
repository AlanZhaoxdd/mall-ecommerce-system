package com.macro.mall.system.service;

import com.macro.mall.system.common.api.CommonResult;
import com.macro.mall.system.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description 前台订单管理Service
 * @date 2025/5/12
 */
public interface OmsPortalOrderService {

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}

