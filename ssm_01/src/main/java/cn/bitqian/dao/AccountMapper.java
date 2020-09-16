package cn.bitqian.dao;

import cn.bitqian.entity.Account;

import java.util.List;

public interface AccountMapper {

    // 查询所有账单
    List<Account> queryAllAccount();

    // 新增账单
    int addAccount(Account account);

    // 修改账户
    int updateAccount(Account account);

    // 删除账户
    int deleteAccount(int accountId);

    // 查询单个账户
    Account queryOneAccount(int accountId);
}
