package com.fun90.globe.door.interceptor;

import com.fun90.globe.door.model.Result;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {


	@ExceptionHandler(ConstraintViolationException.class)
	public Result<Object> validationErrorHandler(ConstraintViolationException ex) {
		List<String> errorInformation = ex.getConstraintViolations()
				.stream()
				.map(ConstraintViolation::getMessage)
				.collect(Collectors.toList());
		return new Result<>(500, errorInformation.toString(), null);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Result<Object> validationErrorHandler(MethodArgumentNotValidException ex) {
		final List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
		return new Result<>(500, fieldErrors.get(0).getDefaultMessage(), null);
	}

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Object handleException(Exception e) {
		log.error(" handler controllerError:", e);

		return new Result<>(500, e.getMessage(), null);
	}

}
