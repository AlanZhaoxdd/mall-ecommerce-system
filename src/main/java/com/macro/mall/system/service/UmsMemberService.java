package com.macro.mall.system.service;

import com.macro.mall.system.common.api.CommonResult;

/**
 * @description 会员管理Service
 * @date 2025/5/9
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}