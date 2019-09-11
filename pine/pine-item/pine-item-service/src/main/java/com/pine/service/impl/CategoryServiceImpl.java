package com.ztl.service.impl;

import com.ztl.bean.dto.CategoryDO;
import com.ztl.common.constant.ExceptionEnums;
import com.ztl.common.exception.ZtlException;
import com.ztl.dao.mysql.CategoryDaoMapper;
import com.ztl.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDaoMapper categoryDaoMapper;

    @Override
    public List<CategoryDO> queryCategoryListByPid(Long pid) {
        List<CategoryDO> list = categoryDaoMapper.queryCategoryListByPid(pid);
        if(CollectionUtils.isEmpty(list))
            throw new ZtlException(ExceptionEnums.CATEGORY_NOT_FOND);

        return list;
    }
}
