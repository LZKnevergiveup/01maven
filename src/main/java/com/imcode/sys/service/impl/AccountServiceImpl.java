package com.imcode.sys.service.impl;

import com.imcode.sys.entity.Account;
import com.imcode.sys.mapper.AccountMapper;
import com.imcode.sys.service.IAccountService;
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
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
