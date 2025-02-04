package by.vb.uniconferencepage.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Slf4j
@Controller("/")
public class MainPageController {
	@Value("${metadata.email}")
	String email;

	@Value("${metadata.phoneNumber}")
	String phoneNumber;

	@Value("${metadata.registrationLink}")
	String registrationLink;

	@RequestMapping(method = RequestMethod.GET)
	public String announcement(final Model model, final Locale locale) {
		log.info("MainPageController#announcement : processing request");

		model.addAttribute("language", locale.getLanguage());
		model.addAttribute("phoneNumber", phoneNumber);
		model.addAttribute("email", email);
		model.addAttribute("registrationLink", registrationLink);

		return "announcement";
	}
}
