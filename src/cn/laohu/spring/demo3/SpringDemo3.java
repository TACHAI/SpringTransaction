package cn.laohu.spring.demo3;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Spring的声明事务管理的方式二：基于AspetJ的XML方式的配置
 * @author asus30
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("Classpath:appicationContext3.xml")
public class SpringDemo3 {
	@Resource(name="accountService")
	private AccountService accountService;
	@Test
	/**
	 * 转账案例
	 */
	public void demo1(){
		accountService.transfer("aaa", "bbb", 1000d);
	}

}
