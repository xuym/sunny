package com.xym.sunny.base.entity;

public class Response<T> {
	private String status = "SUCCESS";
	private String message = "成功";
	private Result<T> result = new Result<T>();
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Result<T> getResult() {
		return result;
	}
	public void setResult(Result<T> result) {
		this.result = result;
	}
	public Response() {
		super();
	}
	public Response(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	
}
