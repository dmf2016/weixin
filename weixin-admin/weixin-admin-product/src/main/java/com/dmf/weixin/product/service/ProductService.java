package com.dmf.weixin.product.service;

import java.util.List;

import com.dmf.weixin.admin.common.utils.WeixinResult;
import com.dmf.weixin.product.pojo.CatResult;

/**
 * 产品接口
 * 
 * @Description
 * @Project: weixin-admin-product
 * @Date:Nov 15, 2017
 * @Author dmf
 * @Copyright (c) 2017, 33e9 All Rights Reserved.
 */
public interface ProductService {

	/**
	 * 根据产品id查找产品信息 TODO
	 * 
	 * @param productId
	 * @return
	 * @Date:Nov 15, 2017
	 * @Author dmf
	 */
	public WeixinResult getProductById(long productId);

	/**
	 * 查找所有产品
	 * 
	 * @return
	 * @Date:Nov 15, 2017
	 * @Author dmf
	 */
	public  CatResult getProductList();

}
