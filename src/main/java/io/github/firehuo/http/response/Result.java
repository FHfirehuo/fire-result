package io.github.firehuo.http.response;

public abstract class Result {

	static final int FAIL = 1;
	static final int SUCCESS = 0;
	static final String FAIL_MESSAGE = "失败";
	static final String SUCCESS_MESSAGE = "成功";

	abstract boolean isSuccess();

	abstract boolean isSuccess(int successCode);
	
	public final static Result success() {
		return new SuccessResult();
	}

	public final static Result fail() {
		return new FailResult();
	}
}
