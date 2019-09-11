package com.pine.common.bean.bo;

import com.pine.common.constant.ExceptionEnums;
import lombok.Data;

/**
 * 自定义异常返回
 */
@Data
public class ExceptionResultBean {
    private int status;
    private String message;
    private Long timestamp;

    public ExceptionResultBean(ExceptionEnums em){
        this.status = em.getCode();
        this.message = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }

}
