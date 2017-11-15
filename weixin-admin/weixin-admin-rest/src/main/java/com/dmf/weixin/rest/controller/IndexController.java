package com.dmf.weixin.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dmf.weixin.admin.common.utils.WeixinResult;
import com.dmf.weixin.product.pojo.CatResult;
import com.dmf.weixin.product.service.ProductService;

@Controller
@RequestMapping("/product")
public class IndexController {

	// 发布服务，接收查询参数
	@Autowired
	private ProductService productService;

	/*
	 * @RequestMapping("/list/{cid}")
	 * 
	 * @ResponseBody public WeixinResult getContentList(@PathVariable Long cid)
	 * { try { List<TbContent> list = contentService.getContentList(cid); return
	 * WeixinResult.ok(list); } catch (Exception e) { e.printStackTrace();
	 * return WeixinResult.build(500, ExceptionUtil.getStackTrace(e)); } }
	 */

	@RequestMapping("/index")
	@ResponseBody
	public WeixinResult getIndexs() {
		return WeixinResult.ok();
	}

	@RequestMapping("/list")
	@ResponseBody
	public Object getItemCatList(String callback) {
		CatResult catResult = productService.getProductList();
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(catResult);
		mappingJacksonValue.setJsonpFunction(callback);
		return mappingJacksonValue;
	}

}
