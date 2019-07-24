package io.github.firehuo.http.response.wx;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper=true)
public class WXMessageResult extends WXResult {

	private String invaliduser;
	private String invalidparty;
	private String invalidtag;
}
