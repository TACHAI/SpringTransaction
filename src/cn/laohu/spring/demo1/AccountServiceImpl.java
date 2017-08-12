package cn.laohu.spring.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * ת��ʵ����
 * @author asus30
 *
 */
public class AccountServiceImpl implements AccountService {
    //ע��ת�˵�Dao����
	private AccountDao accountDao;
	//ע����������ģ��
	private TransactionTemplate transactionTemplate;
	/* (non-Javadoc)
	 * @see cn.laohu.spring.demo1.AccountService#transfer(java.lang.String, java.lang.String, java.lang.Double)
	 */
	
	@Override
	public void transfer(final String out, final String in,final Double money) {
		// TODO Auto-generated method stub
		
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				accountDao.outMoney(out, money);
				int i=1/0;
		        accountDao.inMoney(in, money);
			}
		});
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	
	

}
