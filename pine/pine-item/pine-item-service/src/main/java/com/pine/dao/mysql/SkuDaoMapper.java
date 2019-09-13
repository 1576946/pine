package com.pine.dao.mysql;

import com.pine.bean.dto.SkuDO;
import tk.mybatis.mapper.common.Mapper;


public interface SkuDaoMapper extends Mapper<SkuDO> {
    void insertSkuDO(SkuDO sku);
}
