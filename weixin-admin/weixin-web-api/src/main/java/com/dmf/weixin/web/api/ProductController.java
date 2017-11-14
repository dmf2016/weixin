package com.dmf.weixin.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 产品管理
 * 
 * @Description
 * @Project: weixin-web-api
 * @Date:Nov 14, 2017
 * @Author dmf
 * @Copyright (c) 2017, 33e9 All Rights Reserved.
 */
@Controller
@RequestMapping("/product")
public class ProductController {

	@RequestMapping("/index")
	public String index() {
		return "hello";
	}
}
