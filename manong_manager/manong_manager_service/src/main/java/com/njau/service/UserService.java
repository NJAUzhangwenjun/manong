package com.njau.service;

import com.njau.pojo.User;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/3/1323:52
 */
public interface UserService {
		/**
		 * 通过id获取用户
		 * @param id
		 * @return
		 */
		User getUserById(Integer id);
}
