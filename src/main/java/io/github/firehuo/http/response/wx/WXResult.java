package io.github.firehuo.http.response.wx;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WXResult {

	private final int SUCCESS = 0;

	private Integer errcode;
	private String errmsg;

	public final boolean isSuccess() {
		return Objects.equals(errcode, SUCCESS);
	}
	
	public final boolean isFail() {
		return !isSuccess();
	}

}
