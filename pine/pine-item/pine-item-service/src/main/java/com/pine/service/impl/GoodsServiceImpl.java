package com.pine.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pine.bean.dto.BrandDO;
import com.pine.bean.dto.CategoryDO;
import com.pine.bean.dto.SpuDO;
import com.pine.bean.vo.SpuBean;
import com.pine.common.bean.bo.PageResultBean;
import com.pine.common.constant.ExceptionEnums;
import com.pine.common.exception.ZtlException;
import com.pine.dao.mysql.GoodsDaoMapper;
import com.pine.service.BrandService;
import com.pine.service.CategoryService;
import com.pine.service.GoodsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDaoMapper goodsDaoMapper;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BrandService brandService;

    @Override
    public void saveGoods(SpuDO spu) {

    }

    @Override
    public PageResultBean<SpuBean> querySpuByPage(Integer page, Integer rows, Boolean saleable, String key) {
        // 开始分页
        PageHelper.startPage(page, rows);
        // 过滤
        Page<SpuBean> pageInfo = goodsDaoMapper.querySpuByPage(page,rows,saleable,key);


        System.out.println(pageInfo);
        if(pageInfo==null)
            throw new ZtlException(ExceptionEnums.CATEGORY_NOT_FOND);
        
        //解析分类和品牌的名称
        loadCategoryAndBrandName(pageInfo);

        return new PageResultBean<>(pageInfo.getTotal(),pageInfo);
    }

    private void loadCategoryAndBrandName(Page<SpuBean> spus) {
        for (SpuBean spuDO: spus) {
            //分类名称
            List<String> names = categoryService.queryById(Arrays.asList(spuDO.getCid1(), spuDO.getCid2(), spuDO.getCid3())).stream().map(CategoryDO::getName).collect(Collectors.toList());
            spuDO.setCname(StringUtils.join(names,"/"));
            //品牌名称
            spuDO.setBname(brandService.queryById(spuDO.getBrandId()).getName());
        }
    }
}
