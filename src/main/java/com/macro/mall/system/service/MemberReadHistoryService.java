package com.macro.mall.system.service;

import com.macro.mall.system.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @description 会员浏览记录管理Service
 * @date 2025/5/12
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
