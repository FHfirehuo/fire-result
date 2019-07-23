package io.github.firehuo.http.response.wx;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WXUserListResult extends WXResult {

	private List<WXUser> userlist;
}
