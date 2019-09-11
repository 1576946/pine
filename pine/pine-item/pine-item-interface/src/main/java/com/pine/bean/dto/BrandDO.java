package com.pine.bean.dto;

import lombok.Data;
import javax.persistence.Table;

@Table(name = "tb_brand)")
@Data
public class BrandDO {
    private Long id;
    private String name;// 品牌名称
    private String image;// 品牌图片
    private Character letter;
}
