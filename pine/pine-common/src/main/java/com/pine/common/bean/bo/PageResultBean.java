package com.pine.common.bean.bo;

import lombok.Data;

import java.util.List;

@Data
public class PageResultBean<T> {
    // 总条数
    private Long total;
    // 总页数
    private Long totalPage;
    // 当前页数据
    private List<T> items;

    public PageResultBean() {
    }

    public PageResultBean(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }

    public PageResultBean(Long total, Long totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }
}