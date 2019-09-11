package com.ztl.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
// 枚举只能有固定的个数 实例
public enum ExceptionEnums {

    PRICE_CANNOT_BE_NULL(400,"错误信息"),  //请求参数有误
    CATEGORY_NOT_FOND(404,"商品分类没有查到") //资源服务未找到
    ;
    private int code;
    private String msg;

}
