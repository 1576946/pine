package com.pine.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pine.bean.dto.BrandDO;
import com.pine.common.bean.bo.PageResultBean;
import com.pine.dao.mysql.BrandDaoMapper;
import com.pine.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandDaoMapper brandDaoMapper;

    @Override
    public PageResultBean<BrandDO> queryBrandByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key) {
        // 开始分页
        PageHelper.startPage(page, rows);
        // 过滤
        Page<BrandDO> pageInfo = brandDaoMapper.queryBrandByPageAndSort(page,rows,sortBy,desc,key);
        System.out.println(pageInfo);
        return new PageResultBean<>(pageInfo.getTotal(),pageInfo);
    }

    @Override
    @Transactional
    public void saveBrand(BrandDO brand, List<Long> cids) {
        // 新增品牌信息
        brandDaoMapper.saveBrand(brand);
        //查新增表id
        brand.setId(brandDaoMapper.findIdByName(brand.getName()));
        // 新增品牌和分类中间表
        for (Long cid : cids) {
            brandDaoMapper.insertCategoryBrand(cid, brand.getId());
        }
    }
}
