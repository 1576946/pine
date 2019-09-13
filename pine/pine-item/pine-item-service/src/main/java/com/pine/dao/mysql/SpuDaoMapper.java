package com.pine.dao.mysql;

import com.pine.bean.dto.SpuDO;
import org.apache.ibatis.annotations.Insert;
import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.common.Mapper;


public interface SpuDaoMapper extends Mapper<SpuDO> , IdListMapper<SpuDO,Long> {
    @Insert("insert into tb_spu value ")
    void insertSpu(SpuDO spu);
}
