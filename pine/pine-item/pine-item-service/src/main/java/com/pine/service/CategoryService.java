package com.pine.service;

import com.pine.bean.dto.CategoryDO;

import java.util.List;

public interface CategoryService {
    List<CategoryDO> queryCategoryListByPid(Long pid);
}
