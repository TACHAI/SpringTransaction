package cn.laohu.spring.demo4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring事务声明事务管理的方式3：基于注解的事务管理的方式
 * @author asus30
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("Classpath:appicationContext4.xml")
public class SpringDemo4 {
	@Resource(name="accountService")
	private AccountService accountService;
	@Test	
	public void demo1(){
		accountService.transfer("aaa", "bbb", 1000d);
		}
}
