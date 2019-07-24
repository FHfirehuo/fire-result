package io.github.firehuo.http.response.wx;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper=true)
public class WXTokenResult extends WXResult {

	private String access_token;
	private int expires_in;
}
