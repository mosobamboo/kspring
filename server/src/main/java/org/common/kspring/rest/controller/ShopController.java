package org.common.kspring.rest.controller;

import org.common.kspring.rest.model.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jiazhong on 12/2/15.
 */
@Controller
@RequestMapping("/shop")
public class ShopController {

    @RequestMapping(value="{name}", method = RequestMethod.GET)
    public @ResponseBody Shop getShop(@PathVariable String name){
        Shop shop = new Shop();
        shop.setName(name);
        shop.setStaffName(new String[]{"v1","v2"});
        return shop;
    }
}
