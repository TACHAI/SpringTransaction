package cn.laohu.spring.demo4;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账实现类
 * @author asus30
 *
 */
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
