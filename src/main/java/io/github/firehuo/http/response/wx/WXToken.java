package io.github.firehuo.http.response.wx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class WXToken {
	
	private String accessToken;
	private long expiresTime;

}
