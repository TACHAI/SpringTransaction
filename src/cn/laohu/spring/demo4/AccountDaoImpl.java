package cn.laohu.spring.demo4;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	/**
	 * ͨ���̳�JdbcDaoSupport��������һ��jdbcģ��������ʹ��
	 * @param outת���˺�
	 * @param Moneyת�ʽ��
	 */
	@Override
	public void outMoney(String out, Double money) {
		// TODO Auto-generated method stub
		String sql = "update account set money = money - ? where name = ?";
		//����ģ����ִ��sql���
		this.getJdbcTemplate().update(sql,money,out);
	}

	/**
	 * @param inת���˺�
	 * @param Moneyת�ʽ��
	 */
	@Override
	public void inMoney(String in, Double money) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String sql = "update account set money = money + ? where name = ?";
				this.getJdbcTemplate().update(sql,money,in);

	}

}
