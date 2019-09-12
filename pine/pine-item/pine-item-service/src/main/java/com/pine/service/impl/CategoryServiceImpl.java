package com.pine.service.impl;

import com.pine.dao.mysql.CategoryDaoMapper;
import com.pine.service.CategoryService;
import com.pine.bean.dto.CategoryDO;
import com.pine.common.constant.ExceptionEnums;
import com.pine.common.exception.ZtlException;
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

    @Override
    public List<CategoryDO> queryById(List<Long> ids) {
        return categoryDaoMapper.queryById(ids);
    }


}
