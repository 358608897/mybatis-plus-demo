package com.example.service.impl;

import com.example.entity.Author;
import com.example.mapper.AuthorMapper;
import com.example.service.IAuthorService;
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
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements IAuthorService {

}
