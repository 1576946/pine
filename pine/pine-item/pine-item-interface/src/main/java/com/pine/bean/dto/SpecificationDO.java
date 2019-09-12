package com.pine.bean.dto;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_specification")
@Data
public class SpecificationDO {
    @Id
    private Long categoryId;
    private String specifications;
}