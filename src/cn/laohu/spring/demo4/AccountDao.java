package cn.laohu.spring.demo4;

/**
 * @author asus30
 *
 */
public interface AccountDao {

	/**
	 * 
	 * @param out转出账号
	 * @param Money转帐金额
	 */
	public void outMoney(String out, Double money);

	/**
	 * @param in转入账号
	 * @param Money转帐金额
	 */
	public void inMoney(String in, Double money);
}
