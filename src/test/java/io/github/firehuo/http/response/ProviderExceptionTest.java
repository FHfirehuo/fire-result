package io.github.firehuo.http.response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.security.ProviderException;

import org.junit.Test;

public class ProviderExceptionTest {

	@Test
	public void objectResultTest() {

		// 不初始化data默认值
		ResultObject<String> result = new ResultObject<String>();
		assertFalse(result.isSuccess());

		// 始化data默认值为 "成功"
		result = new ResultObject<String>("成功");
		assertTrue(result.isSuccess());
		assertTrue(result.isSuccess(0));
		assertTrue(result.isSuccess(Result.SUCCESS));
		assertEquals(result.getDataOnSuccess(), "成功");
		assertEquals(result.getDataOnSuccess(0), "成功");
		assertEquals(result.getDataOnSuccess(Result.SUCCESS), "成功");
		assertFalse(result.isSuccess(Result.FAIL));
		result = new ResultObject<String>(1, "失败", "fail");
		
		try {
			result.getDataOnSuccess();
		} catch (Exception e) {
			assertTrue(e instanceof ProviderException);
			assertTrue(e.getMessage().contains("远程服务返回失败结果; 失败信息如下:"));
		}
		assertEquals(result.getDataOnSuccess(1), "fail");

	}
}
