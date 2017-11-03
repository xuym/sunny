package com.xym.sunny.base.entity;

public class Page {
	//总记录条数
	private int totalCount;
	//总页数
	private int totalPage;
	//每页条数
	private int pageSize;
	//当前页
	private int currentPage;
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public Page() {
		super();
	}
	public Page(int totalCount, int totalPage, int pageSize, int currentPage) {
		super();
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.pageSize = pageSize;
		this.currentPage = currentPage;
	}
}
