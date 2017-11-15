package com.dmf.weixin.product.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dmf.weixin.admin.common.utils.WeixinResult;
import com.dmf.weixin.product.pojo.CatResult;
import com.dmf.weixin.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public WeixinResult getProductById(long productId) {
		String str = "hello  dmf! ";
		return WeixinResult.ok();
	}

	@Override
	public CatResult getProductList() {
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		CatResult result = new CatResult();
		result.setData(list);
		return result;
	}

}
