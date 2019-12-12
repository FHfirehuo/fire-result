package io.github.firehuo.http.response;

import java.security.ProviderException;
import java.util.List;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper=true)
public class ListResult<T> extends DefaultResult {

	protected List<T> data;

	public ListResult(){

	}

	public ListResult(List<T> data) {
		this(SUCCESS, data);
	}


	public ListResult(int code, List<T> data) {
		this(code, SUCCESS_MESSAGE, data);
	}

	public ListResult(String message, List<T> data) {
		this(SUCCESS, message, data);
	}


	public ListResult(int code, String message, List<T> data) {
		super(code, message);
		this.data = data;
	}

	/**
	 * <p>
	 * 	 如果 {@code code} = {@code SUCCESS} 则返回 {@code data},否则抛出{@code java.security.ProviderException} 异常
	 * </p>
	 * 
	 * @return 返回 {@code java.util.List<T>} 列表
	 * @throws ProviderException 服务提供方出现异常返回失败结果
	 */
	public final List<T> getDataOnSuccess() {
		return getDataOnSuccess(SUCCESS);
	}

	private final void setDataOnSuccess(List<T> data){
		//解决反序列化时data数量翻倍的bug
	}

	/**
	 * <p>
	 * 	 如果 {@code code} = {@code successCode} 则返回 {@code data},否则抛出{@code java.security.ProviderException} 异常
	 * </p>
	 * @param successCode 预期成功的 {@code code} 值
	 * @return 返回 {@code java.util.List<T>} 列表
	 * @throws ProviderException 服务提供方出现异常返回失败结果
	 */
	public final List<T> getDataOnSuccess(int successCode) {
		if (isSuccess(successCode)) {
			return this.data;
		}
		throw new ProviderException("远程服务返回失败结果; 失败信息如下:" + (Objects.isNull(getMessage()) ? getMsg() : getMessage()));
	}
}
