package com.pine.dao.mysql;

import com.pine.bean.dto.SpuDetailDO;
import tk.mybatis.mapper.common.Mapper;

public interface SpuDetailMapper extends Mapper<SpuDetailDO> {

    void insertSpuDetail(SpuDetailDO spuDetailDO);
}
