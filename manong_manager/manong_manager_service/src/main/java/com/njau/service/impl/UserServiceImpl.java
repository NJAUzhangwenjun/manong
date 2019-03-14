package com.njau.service.impl;

import com.njau.mapper.UserMapper;
import com.njau.pojo.User;
import com.njau.pojo.UserExample;
import com.njau.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/3/1323:54
 */
@Service
public class UserServiceImpl implements UserService {
		@Autowired
		UserMapper userMapper;


		@Override
		public User getUserById(Integer id) {

				UserExample userExample = new UserExample();
				UserExample.Criteria criteria = userExample.createCriteria();
				criteria.andIdEqualTo(id);

				List<User> userList = userMapper.selectByExample(userExample);

				if(userList!=null){
						return userList.get(0);
				}

				return null;
		}
}
