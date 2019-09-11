package com.pine;

import com.pine.bean.dto.CategoryDO;
import com.pine.dao.mysql.CategoryDaoMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class TestCategory {

    @Resource
    private CategoryDaoMapper categoryDaoMapper;

    @Test
    public void Test(){
        Long pid = 1L;
        List<CategoryDO> list = categoryDaoMapper.queryCategoryListByPid(pid);
        System.out.println(list);
    }
}
