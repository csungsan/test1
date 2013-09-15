package ch.sungsan.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.sungsan.test.dao.TestUserDao;
import ch.sungsan.test.model.TestUserVo;

@Controller
@RequestMapping(value = "users")
public class TestUserController {
	
	@Autowired
	private TestUserDao testUserDao;

	@RequestMapping(value = "{userId}", method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getUser(@PathVariable("userId") int userId) {
		Map<String, Object> m = new HashMap<String, Object>();		
		m.put("user", testUserDao.getTestUser(userId));
		return m;
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getUserList() {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("users", testUserDao.getTestUserList());

		return m;
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	Map<String, Object> postUser(@ModelAttribute TestUserVo testUserVo) {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("user", testUserDao.postTestUser(testUserVo.getName(), 
				testUserVo.getAddress(), testUserVo.getAge()));
		return m;
	}

	@RequestMapping(value = "{userId}", method = RequestMethod.PUT)
	public @ResponseBody
	Map<String, Object> putUser(@PathVariable("userId") int userId,
			@ModelAttribute TestUserVo testUserVo) {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("user", testUserDao.putTestUser(userId, testUserVo.getName(), 
				testUserVo.getAddress(), testUserVo.getAge()));
		return m;
	}

	@RequestMapping(value = "{userId}", method = RequestMethod.DELETE)
	public @ResponseBody
	Map<String, Object> deleteUser(@PathVariable("userId") int userId) {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("user", testUserDao.deleteTestUser(userId));
		return m;
	}

}
