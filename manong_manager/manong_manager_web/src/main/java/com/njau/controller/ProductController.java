package com.njau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 张文军
 * @Description:商品管理控制层
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/3/1423:24
 */
@Controller
public class ProductController {
		/**
		 * 商品列表
		 * @return
		 */
		@RequestMapping("product_list")
		public String productList(){
				return "product_list";
		}
}
