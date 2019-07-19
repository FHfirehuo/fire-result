package io.github.firehuo.http.response;

import java.security.ProviderException;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ResultPage<T> extends ResultList<T> {

	private long total;
	
	/**
	 * <p>
	 * 	 如果 {@code code} = {@code SUCCESS} 则返回 {@code Page<T>},否则抛出{@code java.security.ProviderException} 异常
	 * </p>
	 * 
	 * @return 返回 {@code io.github.firehuo.http.response.Page<T>}类型的对象
	 * @throws ProviderException
	 */
	public final Page<T> getReusltPageOnSuccess() {
		return getReusltPageOnSuccess(SUCCESS);
	}

	/**
	 * <p>
	 * 	 如果 {@code code} = {@code successCode} 则返回 {@code data},否则抛出{@code java.security.ProviderException} 异常
	 * </p>
	 * @param successCode 预期成功的 {@code code} 值
	 * @return 返回 {@code io.github.firehuo.http.response.Page<T>}类型的对象
	 * @throws ProviderException
	 */
	public final Page<T> getReusltPageOnSuccess(int successCode) {
		if (isSuccess(successCode)) {
			return new Page<T>(this.total, getData());
		}
		throw new ProviderException("远程服务返回失败结果; 失败信息如下:" + (Objects.isNull(getMessage()) ? getMsg() : getMessage()));
	}
}
