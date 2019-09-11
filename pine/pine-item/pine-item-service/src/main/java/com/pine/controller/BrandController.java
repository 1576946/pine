package com.pine.controller;

import com.pine.bean.dto.BrandDO;
import com.pine.common.bean.bo.PageResultBean;
import com.pine.common.constant.ExceptionEnums;
import com.pine.common.exception.ZtlException;
import com.pine.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /*  page：当前页，int
        rows：每页大小，int
        sortBy：排序字段，String
        desc：是否为降序，boolean
        key：搜索关键词，String*/

    /*  total：总条数
        items：当前页数据
        totalPage：有些还需要总页数*/

    @GetMapping("page")
    public ResponseEntity<PageResultBean<BrandDO>> queryBrandByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy", defaultValue = "letter") String sortBy,
            @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
            @RequestParam(value = "key", required = false) String key) {
        System.out.println("page = "+page);
        System.out.println("rows = "+rows);
        System.out.println("sortBy = "+sortBy);
        System.out.println("desc = "+desc);
        System.out.println("key = "+key);
        PageResultBean<BrandDO> result = this.brandService.queryBrandByPageAndSort(page,rows,sortBy,desc,key);
        System.out.println("---------");
        if (result == null || result.getItems().size() == 0) {
            throw new ZtlException(ExceptionEnums.CATEGORY_NOT_FOND);
        }
        return ResponseEntity.ok(result);
    }
}
