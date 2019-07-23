package io.github.firehuo.http.response.wx;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WXDepartment {

	private int id;
	private String name;
	private int parentid;
	private int order;
}
