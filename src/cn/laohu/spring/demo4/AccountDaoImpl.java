package cn.laohu.spring.demo4;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	/**
	 * 通过继承JdbcDaoSupport类里面有一个jdbc模板下面有使用
	 * @param out转出账号
	 * @param Money转帐金额
	 */
	@Override
	public void outMoney(String out, Double money) {
		// TODO Auto-generated method stub
		String sql = "update account set money = money - ? where name = ?";
		//调用模板来执行sql语句
		this.getJdbcTemplate().update(sql,money,out);
	}

	/**
	 * @param in转入账号
	 * @param Money转帐金额
	 */
	@Override
	public void inMoney(String in, Double money) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String sql = "update account set money = money + ? where name = ?";
				this.getJdbcTemplate().update(sql,money,in);

	}

}
