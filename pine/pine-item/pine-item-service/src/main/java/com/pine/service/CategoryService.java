package com.ztl.service;

import com.ztl.bean.dto.CategoryDO;

import java.util.List;

public interface CategoryService {
    List<CategoryDO> queryCategoryListByPid(Long pid);
}
