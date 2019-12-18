package io.github.firehuo.http.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author liuyi27
 */
@Getter
@Setter
@ToString
public class ArrayBody<T> {

    T[] data;
}