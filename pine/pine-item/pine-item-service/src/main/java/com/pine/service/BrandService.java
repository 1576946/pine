package com.pine.service;

import com.pine.bean.dto.BrandDO;
import com.pine.common.bean.bo.PageResultBean;

import java.util.List;

public interface BrandService {
    PageResultBean<BrandDO> queryBrandByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key);

    void saveBrand(BrandDO brand, List<Long> cids);
}
