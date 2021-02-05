package com.example.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.example.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pankaiqiang
 * @since 2021-02-02
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private IBrandService brandService;

    @GetMapping
    public R queryList(){
        return R.ok(brandService.list());
    }
}

