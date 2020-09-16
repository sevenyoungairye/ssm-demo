package cn.bitqian.service;

import cn.bitqian.entity.Account;

import java.util.List;

public interface AccountService {

    List<Account> queryAllAccount();

    int addAccount(Account account);

    int updateAccount(Account account);

    int deleteAccount(int accountId);

    Account queryOneAccount(int accountId);

    void show();
}
