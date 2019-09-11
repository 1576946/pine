package com.pine.bean.dto;

import lombok.Data;

@Data
public class CateoryDO {
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent; // 注意isParent生成的getter和setter方法需要手动加上Is
    private Integer sort;
}
