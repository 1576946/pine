package com.pine.service;

import com.pine.bean.dto.SpuDO;
import com.pine.bean.vo.SpuBean;
import com.pine.common.bean.bo.PageResultBean;

public interface GoodsService {
    void saveGoods(SpuDO spu);

    PageResultBean<SpuBean> querySpuByPage(Integer page, Integer rows, Boolean saleable, String key);
}
