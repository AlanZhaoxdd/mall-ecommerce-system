package com.macro.mall.system.service;


import com.macro.mall.system.mbg.model.PmsBrand;

import java.util.List;

/**
 * @description PmsBrandService
 * @date 2025/5/8
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
