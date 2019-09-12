package com.pine.dao.mysql;

import com.github.pagehelper.Page;
import com.pine.bean.dto.BrandDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface BrandDaoMapper {
    Page<BrandDO> queryBrandByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key);

    @Insert("INSERT INTO tb_category_brand (category_id,brand_id) VALUES (#{cid},#{bid})")
    int insertCategoryBrand(Long cid, Long bid);

    @Insert("INSERT INTO tb_brand (name,image,letter) VALUES (#{name},#{image},#{letter})")
    void saveBrand(BrandDO brand);

    @Select("Select id from tb_brand where name = #{name}")
    Long findIdByName(String name);

    @Select("Select * from tb_brand where id = #{id}")
    BrandDO queryById(Long id);
}
