package cn.laohu.spring.demo2;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring的声明事务管理的方式的测试类
 * @author asus30
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2 {
	@Resource(name="accountService")
	private AccountService accountService;
	@Test
	public void demo1(){
		
	}

}
