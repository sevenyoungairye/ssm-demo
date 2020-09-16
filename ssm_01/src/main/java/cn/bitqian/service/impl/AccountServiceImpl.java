package cn.bitqian.service.impl;

import cn.bitqian.dao.AccountMapper;
import cn.bitqian.entity.Account;
import cn.bitqian.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author echo lovely
 * @date 2020/9/15 21:02
 */
@Service(value = "accountServiceImpl")
public class AccountServiceImpl implements AccountService {

    @Resource
    public AccountMapper accountMapper;

    @Override
    public List<Account> queryAllAccount() {
        if (accountMapper != null) {
            return accountMapper.queryAllAccount();
        }
        return null;
    }

    @Transactional
    @Override
    public int addAccount(Account account) {
        if (accountMapper != null)
            return accountMapper.addAccount(account);

        return 0;
    }

    @Override
    public int updateAccount(Account account) {
        if (accountMapper != null) {
            return accountMapper.updateAccount(account);
        }

        return 0;
    }

    @Override
    public int deleteAccount(int accountId) {
        if (accountMapper != null) {
            return accountMapper.deleteAccount(accountId);
        }
        return 0;
    }

    @Override
    public Account queryOneAccount(int accountId) {
        if (accountId > 0)
            return accountMapper.queryOneAccount(accountId);
        return null;
    }

    public void show() {
        //System.out.println(accountMapper.queryAllAccount());
    }
}
