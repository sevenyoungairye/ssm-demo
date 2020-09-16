import cn.bitqian.dao.AccountMapper;
import cn.bitqian.entity.Account;
import cn.bitqian.service.AccountService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author echo lovely
 * @date 2020/9/15 21:44
 */
public class DemoTest {

    @Test
    public void test1() {
        ApplicationContext app =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(app.getBean("accountServiceImpl"));
        AccountService bean = (AccountService) app.getBean("accountServiceImpl");

        bean.show();
        //AccountService bean = (AccountServiceImpl) app.getBean("accountServiceImpl");
        List<Account> accountList = bean.queryAllAccount();

        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    @Test
    public void test2() {
        ApplicationContext app =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactoryBean sqlSessionFactoryBean = app.getBean(SqlSessionFactoryBean.class);
        System.out.println("sqlSessionBean:" + sqlSessionFactoryBean);
        try {
            SqlSessionFactory factory = sqlSessionFactoryBean.getObject();
            SqlSession sqlSession = factory.openSession();
            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            System.out.println(mapper);

            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        ApplicationContext app =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService bean = (AccountService) app.getBean("accountServiceImpl");
        System.out.println(bean.queryOneAccount(3));
    }
}
