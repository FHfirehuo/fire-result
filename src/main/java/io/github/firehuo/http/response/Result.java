package io.github.firehuo.http.response;

public interface Result {

	public static final int FAIL = 1;
	public static final int SUCCESS = 0;
	public static final String FAIL_MESSAGE = "失败";
	public static final String SUCCESS_MESSAGE = "成功";

	public boolean isSuccess();

	public boolean isSuccess(int successCode);

}
