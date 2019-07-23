package io.github.firehuo.http.response.wx;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WXResult {

	public static final int SUCCESS = 0;
	
	private int errcode;
	private String errmsg;
	
}
