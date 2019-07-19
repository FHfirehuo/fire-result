package io.github.firehuo.http.response;

public class FailResult extends DefaultResult {

	public FailResult() {
		this(FAIL, FAIL_MESSAGE);
	}

	public FailResult(int code) {
		this(code, FAIL_MESSAGE);
	}

	public FailResult(String message) {
		this(FAIL, message);
	}

	public FailResult(Integer code, String message) {
		super(code, message);
	}

	@Override
	public final boolean isSuccess() {
		return false;
	}
	
	@Override
	public final boolean isSuccess(int successCode) {
		return false;
	}
	
}
