package io.github.firehuo.http.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString(callSuper=true)
public class Page<T> {

	private long total;
	private List<T> data;
}
