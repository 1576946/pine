package com.pine.common.exception;

import com.pine.common.bean.bo.ExceptionResultBean;
import com.pine.common.constant.ExceptionEnums;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 捕获自定义异常捕获
 */
@ControllerAdvice  //默认拦截所有Controller
public class CommonExceptionHandler {

    //对异常分类处理
    @ExceptionHandler(ZtlException.class)
    public ResponseEntity<ExceptionResultBean> handleException(ZtlException e){
        ExceptionEnums exceptionEnums = e.getExceptionEnums();
        return ResponseEntity.status(exceptionEnums.getCode()).body(
                new ExceptionResultBean(e.getExceptionEnums()));
    }
}
