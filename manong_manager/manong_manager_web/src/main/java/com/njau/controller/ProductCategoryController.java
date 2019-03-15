package com.njau.controller;

import com.njau.pojo.EasyUITree;
import com.njau.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 张文军
 * @Description:商品分类列表
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/3/1514:31
 */
@Controller
@RequestMapping("/product_category")
public class ProductCategoryController {

		@Autowired
		ProductCategoryService productCategoryService;

		/**
		 * 根据parentId返回数据列表
		 *
		 * @return
		 */
		@RequestMapping("/list")
		@ResponseBody
		public List<EasyUITree> findProductCategoryListByParentId(@RequestParam(value = "id", defaultValue = "0") Short parentID) {

				List<EasyUITree> easyUITrees = productCategoryService.findProductCategoryListByParentId(parentID);
				return easyUITrees;

		}

}
