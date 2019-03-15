package com.njau.service;

import com.njau.pojo.EasyUITree;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/3/1514:46
 */
public interface ProductCategoryService {

		/**
		 * 通过父节点Id查询列表
		 *
		 * @param parentId
		 * @return
		 */
		List<EasyUITree> findProductCategoryListByParentId(Short parentId);

}
