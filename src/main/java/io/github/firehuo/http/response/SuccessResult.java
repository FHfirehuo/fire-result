package io.github.firehuo.http.response;

public class SuccessResult extends DefaultResult {

	public SuccessResult() {
		this(SUCCESS, SUCCESS_MESSAGE);
	}

	public SuccessResult(int code) {
		this(code, SUCCESS_MESSAGE);
	}

	public SuccessResult(String message) {
		this(SUCCESS, message);
	}

	public SuccessResult(int code, String message) {
		super(code, message);
	}

	@Override
	public final boolean isSuccess() {
		return true;
	}

	@Override
	public final boolean isSuccess(int successCode) {
		return true;
	}
}
