package com.haomostudio.JuniorSpringMVCTemplate.po;

import java.io.Serializable;

public class PageInfo implements Serializable {
    private int pageSize;
    private int pageNum;
    private int currentPage;
    private long totalNum;

    public PageInfo() {
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public long getTotalNum() {
        return this.totalNum;
    }

    public void setPageSize(final int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(final int pageNum) {
        this.pageNum = pageNum;
    }

    public void setCurrentPage(final int currentPage) {
        this.currentPage = currentPage;
    }

    public void setTotalNum(final long totalNum) {
        this.totalNum = totalNum;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PageInfo)) {
            return false;
        } else {
            PageInfo other = (PageInfo)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getPageSize() != other.getPageSize()) {
                return false;
            } else if (this.getPageNum() != other.getPageNum()) {
                return false;
            } else if (this.getCurrentPage() != other.getCurrentPage()) {
                return false;
            } else {
                return this.getTotalNum() == other.getTotalNum();
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PageInfo;
    }


    public String toString() {
        return "PageInfo(pageSize=" + this.getPageSize() + ", pageNum=" + this.getPageNum() + ", currentPage=" + this.getCurrentPage() + ", totalNum=" + this.getTotalNum() + ")";
    }
}