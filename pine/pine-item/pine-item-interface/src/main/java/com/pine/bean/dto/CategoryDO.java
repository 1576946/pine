package com.pine.bean.dto;

import lombok.Data;

import javax.persistence.Table;

@Table(name="tb=category")
@Data
public class CategoryDO {
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent; // 注意isParent生成的getter和setter方法需要手动加上Is
    private Integer sort;
}
