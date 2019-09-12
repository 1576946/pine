package com.pine.dao.mysql;


import com.github.pagehelper.Page;
import com.pine.bean.vo.SpuBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDaoMapper {
    Page<SpuBean> querySpuByPage(Integer page, Integer rows, Boolean saleable, String key);
}
