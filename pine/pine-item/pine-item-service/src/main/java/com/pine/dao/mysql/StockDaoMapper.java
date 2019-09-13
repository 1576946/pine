package com.pine.dao.mysql;

import com.pine.bean.dto.StockDO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @
 */
public interface StockDaoMapper extends Mapper<StockDO>, InsertListMapper<StockDO> {
    void insertStock(StockDO stock);
}
