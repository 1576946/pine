package com.pine.bean.vo;


import com.pine.bean.dto.SkuDO;
import com.pine.bean.dto.SpuDO;
import com.pine.bean.dto.SpuDetailDO;
import lombok.Data;

import javax.persistence.Transient;
import java.util.List;
@Data
public class SpuBo extends SpuDO {

    @Transient
    String cname;// 商品分类名称
    @Transient
    String bname;// 品牌名称
    @Transient
    SpuDetailDO spuDetail;// 商品详情
    @Transient
    List<SkuDO> skus;// sku列表
}