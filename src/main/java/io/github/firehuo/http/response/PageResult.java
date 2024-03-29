package io.github.firehuo.http.response;

import java.security.ProviderException;
import java.util.List;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Setter
@Getter
@ToString(callSuper=true)
public class PageResult<T> extends ListResult<T> {

	private long total;

	private PageResult(){
		super();
	};

	public void setTotal(long total) {
		this.total = total;
	}

	public PageResult(List<T> data, long total) {
		this(SUCCESS, data, total);
	}

	public PageResult(int code, List<T> data, long total) {
		this(code, SUCCESS_MESSAGE, data, total);
	}

	public PageResult(String message, List<T> data, long total) {
		this(SUCCESS, message, data, total);
	}

	public PageResult(int code, String message, List<T> data, long total) {
		super(code, message, data);
		this.total = total;
	}
	
	/**
	 * <p>
	 * 	 如果 {@code code} = {@code SUCCESS} 则返回 {@code Page<T>},否则抛出{@code java.security.ProviderException} 异常
	 * </p>
	 * 
	 * @return 返回 {@code io.github.firehuo.http.response.Page<T>}类型的对象
	 * @throws ProviderException 服务提供方出现异常返回失败结果
	 */
	public final Page<T> getPageOnSuccess() {
		return getPageOnSuccess(SUCCESS);
	}

	/**
	 * <p>
	 * 	 如果 {@code code} = {@code successCode} 则返回 {@code data},否则抛出{@code java.security.ProviderException} 异常
	 * </p>
	 * @param successCode 预期成功的 {@code code} 值
	 * @return 返回 {@code io.github.firehuo.http.response.Page<T>}类型的对象
	 * @throws ProviderException 服务提供方出现异常返回失败结果
	 */
	public final Page<T> getPageOnSuccess(int successCode) {
		if (isSuccess(successCode)) {
			return new Page<T>(this.total, getData());
		}
		throw new ProviderException("远程服务返回失败结果; 失败信息如下:" + (Objects.isNull(getMessage()) ? getMsg() : getMessage()));
	}
}
