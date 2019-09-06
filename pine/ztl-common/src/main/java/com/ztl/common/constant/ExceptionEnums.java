package com.ztl.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
// 枚举只能有固定的个数 实例
public enum ExceptionEnums {

    PRICE_CANNOT_BE_NULL(400,"错误信息")
    ;
    private int code;
    private String msg;

}
