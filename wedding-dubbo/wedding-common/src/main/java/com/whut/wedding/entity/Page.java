package com.whut.wedding.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 分页实体类(泛型，将类型作为参数，实现通用化)
 */
public class Page<T> implements Serializable {
    //数据集合
    private List<T> data;
    //页面总数
    private int pageCount;
    //当前页数
    private int currentPage;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "Page{" +
                "data=" + data +
                ", pageCount=" + pageCount +
                ", currentPage=" + currentPage +
                '}';
    }
}
