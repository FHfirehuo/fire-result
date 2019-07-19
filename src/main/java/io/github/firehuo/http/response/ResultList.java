package io.github.firehuo.http.response;

import java.security.ProviderException;
import java.util.List;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ResultList<T> extends DefaultResult {

	protected List<T> data;

	/**
	 * <p>
	 * 	 如果 {@code code} = {@code SUCCESS} 则返回 {@code data},否则抛出{@code java.security.ProviderException} 异常
	 * </p>
	 * 
	 * @return 返回 {@code java.util.List<T>} 列表
	 * @throws ProviderException
	 */
	public final List<T> getDataOnSuccess() {
		return getDataOnSuccess(SUCCESS);
	}

	/**
	 * <p>
	 * 	 如果 {@code code} = {@code successCode} 则返回 {@code data},否则抛出{@code java.security.ProviderException} 异常
	 * </p>
	 * @param successCode 预期成功的 {@code code} 值
	 * @return 返回 {@code java.util.List<T>} 列表
	 * @throws ProviderException
	 */
	public final List<T> getDataOnSuccess(int successCode) {
		if (isSuccess(successCode)) {
			return data;
		}
		throw new ProviderException("远程服务返回失败结果; 失败信息如下:" + (Objects.isNull(getMessage()) ? getMsg() : getMessage()));
	}
}
