package com.roncoo.eshop.product.ha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/9/19 17:47
 */
@Controller
public class ProductController {

    @RequestMapping("/getProductInfo")
    @ResponseBody
    public String getProductInfo(Long productId) {
        return  "{\n" +
                "  \"id\": " + productId + ",\n" +
                "  \"name\": \"iphone7手机\",\n" +
                "  \"price\": 5599,\n" +
                "  \"pictureList\": \"a.jpg,b.jpg\",\n" +
                "  \"specification\": \"iphone7的规格\",\n" +
                "  \"service\": \"iphone7的售后服务\",\n" +
                "  \"color\": \"红色,白色,黑色\",\n" +
                "  \"size\": 5.5,\n" +
                "  \"shopId\": 1,\n" +
                "  \"modifiedTime\": \"2021-06-28 12:01:00\",\n" +
                "  \"cityId\": 1\n" +
                "}";
    }
}
