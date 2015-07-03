package mybatis;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import com.yonyou.model.User;

public class Test {

	private SqlSessionFactory sessionFactory;

	@Before
	public void init() {
		InputStream in = Test.class.getResourceAsStream("/conf.xml");
		sessionFactory = new SqlSessionFactoryBuilder().build(in);
	}

	@org.junit.Test
	public void testSingleSelect() {
		SqlSession session = sessionFactory.openSession();
		User user = session.selectOne("com.yonyou.mapping.userMapper.getUser", 1);
		System.out.println(user);
		session.close();
	}
}
