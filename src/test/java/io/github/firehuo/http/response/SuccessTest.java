package io.github.firehuo.http.response;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SuccessTest {


	@Test
	public void ResultDefaultMethodTest() {
		Result.fail();
		Result.success();
	}

	@Test
	public void defaultResultTest() {
		//DefaultResult successcode is 0
		//不初始化code默认值
		DefaultResult result = new DefaultResult();
		assertFalse(result.isSuccess());
		assertFalse(result.isSuccess(0));
		assertFalse(result.isSuccess(1));
		//初始化code=0
		result = new DefaultResult(0);
		assertTrue(result.isSuccess());
		assertTrue(result.isSuccess(0));
		assertFalse(result.isSuccess(1));
		//初始化code=1
		result = new DefaultResult(1);
		assertFalse(result.isSuccess());
		assertFalse(result.isSuccess(0));
		assertTrue(result.isSuccess(1));
	}
	
	@Test
	public void failResultTest() {
		FailResult result = new FailResult();
		assertFalse(result.isSuccess());
		assertFalse(result.isSuccess(0));
		assertFalse(result.isSuccess(1));
		result = new FailResult(0);
		assertFalse(result.isSuccess());
		assertFalse(result.isSuccess(0));
		assertFalse(result.isSuccess(1));
		
		result = new FailResult(1);
		assertFalse(result.isSuccess());
		assertFalse(result.isSuccess(0));
		assertFalse(result.isSuccess(1));
	}
	
	
	@Test
	public void successResultTest() {
		SuccessResult result = new SuccessResult();
		assertTrue(result.isSuccess());
		assertTrue(result.isSuccess(0));
		assertTrue(result.isSuccess(1));
		result = new SuccessResult(0);
		assertTrue(result.isSuccess());
		assertTrue(result.isSuccess(0));
		assertTrue(result.isSuccess(1));
		
		result = new SuccessResult(1);
		assertTrue(result.isSuccess());
		assertTrue(result.isSuccess(0));
		assertTrue(result.isSuccess(1));
	}
}
