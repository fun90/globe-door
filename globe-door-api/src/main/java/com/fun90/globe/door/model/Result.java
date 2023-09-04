package com.fun90.globe.door.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {
	public static final int CODE_SUCCESS = 200;
	private Integer code = 200;
	private String message;
	private T obj;

	public static <T> Result<PageObject<T>> buildPageResult(long total, List<T> objects) {
		PageObject<T> pageObject = new PageObject<>(total, objects);
		return new Result<>(CODE_SUCCESS, null, pageObject);
	}

	@Getter
	@Setter
	@AllArgsConstructor
	public static class PageObject<T> {
		private long total;
		private List<T> content;
	}
}
