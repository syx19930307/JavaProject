package com.ssm.controller;

import com.ssm.domain.Items;
import com.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemService itemService;
    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        Items items=itemService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }

}
