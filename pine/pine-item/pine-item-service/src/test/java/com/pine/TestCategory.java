package com.pine;

import com.pine.bean.dto.CategoryDO;
import com.pine.dao.mysql.CategoryDaoMapper;
import com.pine.service.CategoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class TestCategory {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void Test(){
        Long pid = 1L;
        List<CategoryDO> list = categoryService.queryCategoryListByPid(pid);
        System.out.println(list);
    }
}
