package io.github.firehuo.http.response.wx;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper=true)
public class WXUserListResult extends WXResult {

	private List<WXUser> userlist;
}
