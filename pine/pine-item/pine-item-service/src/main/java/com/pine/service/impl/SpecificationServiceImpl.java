package com.pine.service.impl;

import com.pine.bean.dto.SpecificationDO;
import com.pine.dao.mysql.SpecificationDaoMapper;
import com.pine.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecificationServiceImpl implements SpecificationService {
    @Autowired
    private SpecificationDaoMapper specificationDaoMapper;
    @Override
    public SpecificationDO querySpecificationByCategoryId(Long id) {
        return specificationDaoMapper.querySpecificationByCategoryId(id);
    }
}
