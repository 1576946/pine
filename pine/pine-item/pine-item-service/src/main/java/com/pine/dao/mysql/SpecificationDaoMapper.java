package com.pine.dao.mysql;

import com.pine.bean.dto.SpecificationDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SpecificationDaoMapper {
    @Select("selsct * from tb_specification where Category_id = #{id}")
    SpecificationDO querySpecificationByCategoryId(Long id);
}
