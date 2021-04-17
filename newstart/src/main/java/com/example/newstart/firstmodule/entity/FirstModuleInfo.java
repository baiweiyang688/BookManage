package com.example.newstart.firstmodule.entity;

public class FirstModuleInfo {
    /**
     * 测试ID
     */
    private int id;
    /**
     * 测试称号
     */
    private String goodsName;
    /**
     * 页码
     */
    private int pageSize;
    /**
     * 页数 
     */
    private int pageNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
