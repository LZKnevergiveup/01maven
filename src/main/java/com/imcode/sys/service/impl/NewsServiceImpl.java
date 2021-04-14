package com.imcode.sys.service.impl;

import com.imcode.sys.entity.News;
import com.imcode.sys.mapper.NewsMapper;
import com.imcode.sys.service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuzhengkai
 * @since 2020-04-19
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

}
