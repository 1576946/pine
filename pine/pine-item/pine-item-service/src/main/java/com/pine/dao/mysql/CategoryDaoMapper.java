package com.ztl.dao.mysql;


import com.ztl.bean.dto.CategoryDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryDaoMapper {

    List<CategoryDO> queryCategoryListByPid(Long pid);
}
