package com.pine.service;

import com.pine.bean.dto.BrandDO;
import com.pine.common.bean.bo.PageResultBean;

public interface BrandService {
    PageResultBean<BrandDO> queryBrandByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key);
}
