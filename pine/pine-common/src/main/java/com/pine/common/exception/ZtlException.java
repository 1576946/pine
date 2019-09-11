package com.pine.common.exception;

import com.pine.common.constant.ExceptionEnums;
import lombok.Getter;

public class ZtlException extends RuntimeException{

    @Getter
    private ExceptionEnums exceptionEnums;

    public ZtlException(ExceptionEnums exceptionEnums){
        this.exceptionEnums = exceptionEnums;
    }

}
