package cn.laohu.spring.demo1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.laohu.spring.demo1.AccountService;

/*
 * 模板类测试
 * 转账案例的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {
	
	//测试业务类
	@Resource(name="accountService")
	private AccountService accountService;
	//private AccountDao accountDaol;
	@Test
	public void demo1(){
		accountService.transfer("aaa", "bbb", 2000.00);
	}
}
