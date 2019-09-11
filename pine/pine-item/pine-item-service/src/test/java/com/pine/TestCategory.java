package com.pine;

import com.pine.bean.dto.CategoryDO;
import com.pine.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestCategory {

    @Autowired
    private CategoryService categoryService;

    public void Test(){
        Long pid = 1L;
        List<CategoryDO> list = categoryService.queryCategoryListByPid(pid);
        System.out.println(list);
    }
}
