package io.github.firehuo.http.response;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DefaultResult extends Result {

	private Integer code;
	private String msg;
	private String message;

	public DefaultResult() {
		
	}

	public DefaultResult(int code) {
		this(code, null);
	}

	public DefaultResult(String message) {
		this(null, message);
	}

	public DefaultResult(Integer code, String message) {
		this.code = code;
		this.message = message;
		this.msg = message;
	}
	
	@Override
	public boolean isSuccess() {
		return isSuccess(SUCCESS);
	}

	@Override
	public boolean isSuccess(int successCode) {
		if (Objects.isNull(this.code)) {
			return false;
		}
		return code == successCode;
	}
	
}
