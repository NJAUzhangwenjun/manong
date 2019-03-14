package com.njau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/3/1421:29
 */
@Controller
public class IndexController {

		/**
		 * 跳转访问主页
		 * @return
		 */
		@RequestMapping("/")
		public String requestIndex(){
				return "index";
		}
}
