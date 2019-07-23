package io.github.firehuo.http.response.wx;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WXUser {

	private String userid;
	private String name;
	private String mobile = "";

	/**
	 * 头像url。注：如果要获取小图将url最后的”/0”改成”/100”即可。第三方仅通讯录应用可获取
	 */
	private String avatar;

	/**
	 * 成员所属部门id列表。注意，每个部门的直属员工上限为1000个
	 */
	private List<Integer> department;
	/**
	 * 职位信息。长度为0~64个字符
	 */
	private String position;

	/**
	 * 邮箱。长度为0~64个字符。企业内必须唯一
	 */
	private String email = "";


}
