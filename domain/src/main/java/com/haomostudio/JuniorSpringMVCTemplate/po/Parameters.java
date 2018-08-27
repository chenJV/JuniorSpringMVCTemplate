package com.haomostudio.JuniorSpringMVCTemplate.po;


public class Parameters<T> {

    private  String pageNo;
    private  String pageSize;
    private  String sortItem;
    private  String sortOrder;
    private T entity;

    public String getPageNo() {
        return pageNo;
    }
    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getPageSize() {
        return pageSize;
    }
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortOrder() {
        return sortOrder;
    }
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortItem() {
        return sortItem;
    }
    public void setSortItem(String sortItem) {
        this.sortItem = sortItem;
    }

    public T getEntity() {
        return entity;
    }
    public void setEntity(T entity) {
        this.entity = entity;
    }


}
