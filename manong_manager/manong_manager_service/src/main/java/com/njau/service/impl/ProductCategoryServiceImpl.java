package com.njau.service.impl;

import com.njau.mapper.ProductCategoryMapper;
import com.njau.pojo.EasyUITree;
import com.njau.pojo.ProductCategory;
import com.njau.pojo.ProductCategoryExample;
import com.njau.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/3/1514:51
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
		@Autowired
		ProductCategoryMapper productCategoryMapper;

		/**
		 * 根据Id查询，之后分装到EasyUITree类中
		 *
		 * @param
		 * @return
		 */
		@Override
		public List<EasyUITree> findProductCategoryListByParentId(Short parentid) {

				ProductCategoryExample productCategoryExample = new ProductCategoryExample();
				ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();
				criteria.andParentIdEqualTo(parentid);
				List<ProductCategory> productCategoryList = productCategoryMapper.selectByExample(productCategoryExample);

				List<EasyUITree> easyUITrees = new ArrayList<>(productCategoryList.size());

				for (ProductCategory productCategory:productCategoryList) {

						EasyUITree easyuiTree = new EasyUITree();

						easyuiTree.setId(productCategory.getId());
						easyuiTree.setText(productCategory.getName());
						easyuiTree.setState(productCategory.getParentId()==0?"closed":"open");
//						easyuiTree.setAttributes(productCategory.getParentId()+"");

						easyUITrees.add(easyuiTree);
				}

				return easyUITrees;
		}
}
