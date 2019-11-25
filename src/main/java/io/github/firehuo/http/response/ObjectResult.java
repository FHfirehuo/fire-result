package io.github.firehuo.http.response;

import java.security.ProviderException;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper=true)
public class ObjectResult<T> extends DefaultResult {

	private T data;

	/**
	 * 不初始化data认为是失败的结果
	 */
	public ObjectResult() {

	}

	/**
	 * 初始化data 则认为是成功
	 * 
	 * @param data 最终的消息体
	 */
	public ObjectResult(T data) {
		this(SUCCESS, data);
	}

	/**
	 * 初始化data 则认为是成功。code值为成功值。message默认为成功消息
	 * 
	 * @param code  自定义的返回值
	 * @param data  最终的消息体
	 */
	public ObjectResult(int code, T data) {
		this(code, SUCCESS_MESSAGE, data);
	}

	/**
	 * 初始化data 则认为是成功。code值为默认成功值 {@code SUCCESS}。message默认为消息
	 * 
	 * @param message  自定义描述
	 * @param data 最终的消息体
	 */
	public ObjectResult(String message, T data) {
		this(SUCCESS, message, data);
	}

	/**
	 * 自己构建完整消息体
	 * 
	 * @param code 自定义返回值
	 * @param message 自定义描述
	 * @param data 最终的消息体
	 */
	public ObjectResult(int code, String message, T data) {
		super(code, message);
		this.data = data;
	}

	/**
	 * <p>
	 * 如果 {@code code} = {@code SUCCESS} 则返回
	 * {@code data},否则抛出{@code java.security.ProviderException} 异常
	 * </p>
	 * 
	 * @return 返回 {@code (T)java.lang.Object}类型的对象
	 * @throws ProviderException 服务提供方出现异常返回失败结果
	 */
	public final T getDataOnSuccess() {
		return getDataOnSuccess(SUCCESS);
	}

	/**
	 * <p>
	 * 如果 {@code code} = {@code successCode} 则返回
	 * {@code data},否则抛出{@code java.security.ProviderException} 异常
	 * </p>
	 * 
	 * @param successCode 预期成功的 {@code code} 值
	 * @return 返回 {@code  (T)java.lang.Object} 类型的对象
	 * @throws ProviderException 服务提供方出现异常返回失败结果
	 */
	public final T getDataOnSuccess(int successCode) {
		if (isSuccess(successCode)) {
			return data;
		}
		throw new ProviderException("远程服务返回失败结果; 失败信息如下:" + (Objects.isNull(getMessage()) ? getMsg() : getMessage()));
	}
}
