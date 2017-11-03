package com.xym.sunny.base.entity;

public class Result<T> { 
	//分页信息
	private Page page;
	//返回数据
	private T data;
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Result() {
		super();
	}
	public Result(Page page, T data) {
		super();
		this.page = page;
		this.data = data;
	}

}
