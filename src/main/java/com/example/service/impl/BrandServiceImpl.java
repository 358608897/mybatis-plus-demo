package com.example.service.impl;

import com.example.entity.Brand;
import com.example.mapper.BrandMapper;
import com.example.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pankaiqiang
 * @since 2021-02-02
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
