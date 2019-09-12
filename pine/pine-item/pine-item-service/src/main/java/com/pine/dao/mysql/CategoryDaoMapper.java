package com.pine.dao.mysql;


import com.pine.bean.dto.CategoryDO;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryDaoMapper {
    List<CategoryDO> queryCategoryListByPid(Long pid);

    List<CategoryDO> queryById(List<Long> ids);
}
