package by.vb.uniconferencepage.handlers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public String handleException(final Exception exception) {
		log.error("GlobalExceptionHandler#handleException : processing exception STARTED");

		log.error("Error: {}", exception.toString());

		log.error("Error Stack Trace: {}", (Object) exception.getStackTrace());

		log.error("GlobalExceptionHandler#handleException : processing exception FINISHED");

		return "redirect:/"; // can be rendered error page
	}
}
