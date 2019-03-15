package com.njau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/3/1514:12
 */
@Controller
public class PageController {
		/**
		 * 跳转到指定的page页面
		 * @param page
		 * @return
		 */
		@RequestMapping("/{page}")
		public String toPate(@PathVariable String page){
				return page;
		}

		/**
		 * 跳转访问主页
		 * @return
		 */
		@RequestMapping("/")
		public String requestIndex(){
				return "index";
		}
}
