package ch.sungsan.test.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.sungsan.test.model.TestUserVo;

@Controller
@RequestMapping(value = "users", method = RequestMethod.GET)
public class TestUserController {

	@RequestMapping(value = "{user_id}", method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getUser(@PathVariable("user_id") int user_id) {
		Map<String, Object> m = new HashMap<String, Object>();

		return m;
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getUsers(Locale locale, Model model) {

		Map<String, Object> m = new HashMap<String, Object>();

		return m;
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	Map<String, Object> postUser(Locale locale, Model model) {

		Map<String, Object> m = new HashMap<String, Object>();

		return m;
	}

	@RequestMapping(value = "{user_id}", method = RequestMethod.PUT)
	public @ResponseBody
	Map<String, Object> putUser(@PathVariable("user_id") int user_id) {
		Map<String, Object> m = new HashMap<String, Object>();

		return m;
	}

	@RequestMapping(value = "{user_id}", method = RequestMethod.DELETE)
	public @ResponseBody
	Map<String, Object> deleteUser(@PathVariable("user_id") int user_id) {
		Map<String, Object> m = new HashMap<String, Object>();

		return m;
	}

}
