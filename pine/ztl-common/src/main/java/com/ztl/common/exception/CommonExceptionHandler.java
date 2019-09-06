package com.ztl.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice  //默认拦截所有Controller
public class CommonExceptionHandler {

    //对异常分类处理
    @ExceptionHandler(ZtlException.class)
    public ResponseEntity<String> handleException(ZtlException e){
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
