package cn.laohu.spring.demo4;

/**
 * @author asus30
 *
 */
public interface AccountDao {

	/**
	 * 
	 * @param outת���˺�
	 * @param Moneyת�ʽ��
	 */
	public void outMoney(String out, Double money);

	/**
	 * @param inת���˺�
	 * @param Moneyת�ʽ��
	 */
	public void inMoney(String in, Double money);
}
