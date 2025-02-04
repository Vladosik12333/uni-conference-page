package by.vb.uniconferencepage.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {
	private final MessageSource messageSource;

	@RequestMapping(method = RequestMethod.GET)
	public String getMessage(
			final @RequestParam String key,
			final @RequestParam(name = "lang", defaultValue = "en") String language
	) {
		log.info("MessageController#getMessage : processing request. Key: {}; Language: {};", key,
				language);

		return messageSource.getMessage(key, null, null, new Locale(language));
	}
}
