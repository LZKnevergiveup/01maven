package com.imcode.sys.service.impl;

import com.imcode.sys.entity.Person;
import com.imcode.sys.mapper.PersonMapper;
import com.imcode.sys.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuzhengkai
 * @since 2020-02-17
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
