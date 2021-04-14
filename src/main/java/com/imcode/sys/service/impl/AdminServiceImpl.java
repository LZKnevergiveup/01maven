package com.imcode.sys.service.impl;

import com.imcode.sys.entity.Admin;
import com.imcode.sys.mapper.AdminMapper;
import com.imcode.sys.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
