package com.ztl.common.exception;

import com.ztl.common.constant.ExceptionEnums;
import lombok.Getter;

public class ZtlException extends RuntimeException{

    @Getter
    private ExceptionEnums exceptionEnums;

    public ZtlException(ExceptionEnums exceptionEnums){
        this.exceptionEnums = exceptionEnums;
    }

}
