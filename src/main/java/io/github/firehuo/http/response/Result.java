package io.github.firehuo.http.response;

public abstract class Result {

	int FAIL = 1;
	int SUCCESS = 0;
	String FAIL_MESSAGE = "失败";
	String SUCCESS_MESSAGE = "成功";

	abstract boolean isSuccess();

	abstract boolean isSuccess(int successCode);
	
	public final static Result success() {
		return new SuccessResult();
	}

	public final static Result fail() {
		return new FailResult();
	}
}
