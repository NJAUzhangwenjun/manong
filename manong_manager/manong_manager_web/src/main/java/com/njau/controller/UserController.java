package com.njau.controller;

import com.njau.pojo.User;
import com.njau.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/3/1323:59
 */
@Controller
public class UserController {

		@Autowired
		UserService userService;

		@RequestMapping("/user/{userid}")
		@ResponseBody
		public User getUserById(@PathVariable Integer userid){
				User user = userService.getUserById(userid);
				return user;
		}


}
