package com.pine.dao.mysql;

import com.github.pagehelper.Page;
import com.pine.bean.dto.BrandDO;

public interface BrandDaoMapper {
    Page<BrandDO> queryBrandByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key);
}
