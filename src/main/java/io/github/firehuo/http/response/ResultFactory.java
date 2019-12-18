package io.github.firehuo.http.response;

import java.util.List;

/**
 * 返回的工厂方法
 *
 * @author liuyi27
 */
public final class ResultFactory {

    public static SuccessResult buildSuccessResult() {
        return new SuccessResult();
    }

    public static FailResult buildFailResult() {
        return new FailResult();
    }

    public static FailResult buildFailResult(String failMsg) {
        return new FailResult(failMsg);
    }

    public static <T> ObjectResult<T> buildObjectResult(T data) {
        return new ObjectResult<T>(data);
    }

    public static <T> ListResult<T> buildListResult(List<T> data) {
        return new ListResult<T>(data);
    }

    public static <T> PageResult<T> buildPageResult(List<T> data, long total) {
        return new PageResult<T>(data, total);
    }
}
