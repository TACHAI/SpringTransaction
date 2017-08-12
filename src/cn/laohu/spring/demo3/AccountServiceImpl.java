package cn.laohu.spring.demo3;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账实现类
 * @author asus30
 *@Transactional 注解中的属性：
 *propagation  事务的传播行为
 *isolation    事务的隔离级别 
 * readOnly    只读
 *rollbackFor  发生哪些异常回滚
 *noRollbackFor     发生哪些异常不回滚
 */
@Transactional(propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {
    //注入转账的Dao的类
	private AccountDao accountDao;
	
	@Override
	public void transfer( String out,  String in, Double money) {
		// TODO Auto-generated method stub
		accountDao.inMoney(in, money);
		int i=1/0;
		accountDao.outMoney(out, money);
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	
	

}
