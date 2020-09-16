package cn.bitqian.controller;

import cn.bitqian.entity.Account;
import cn.bitqian.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author echo lovely
 * @date 2020/9/15 21:05
 */
@Controller(value = "accountController")
@RequestMapping(value = "/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping(value = "/queryAllAccount")
    public ModelAndView queryAllAccount() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList", accountService.queryAllAccount());
        modelAndView.setViewName("index");
        // 返回视图和模型对象
        return modelAndView;
    }

    @RequestMapping(value = "/addAccount")
    public ModelAndView addAccount(Account account) {

        ModelAndView modelAndView = new ModelAndView();
        int count = accountService.addAccount(account);

        if (count > 0) {
            return queryAllAccount();
        } else {
            modelAndView.addObject("account", account);
            modelAndView.setViewName("forward:/add-account.jsp");
        }

        return modelAndView;
    }

    @RequestMapping(value = "/update")
    public ModelAndView updateAccount(Account account) {
        if (account != null) {
            int count = accountService.updateAccount(account);
            if (count > 0)
                return queryAllAccount();
        }
        return queryOneAccount(account.getAccountId());
    }

    @RequestMapping(value = "/delete")
    public ModelAndView deleteAccount(int accountId) {

        accountService.deleteAccount(accountId);

        return queryAllAccount();
    }

    @RequestMapping(value = "/queryOne")
    public ModelAndView queryOneAccount(int accountId) {
        ModelAndView modelAndView = new ModelAndView();

        Account account = accountService.queryOneAccount(accountId);
        modelAndView.addObject("account", account);

        modelAndView.setViewName("forward:/update.jsp");

        return modelAndView;
    }

}
