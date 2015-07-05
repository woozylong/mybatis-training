package mybatis;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import com.yonyou.mapping.UserMapper;
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
		User user = session.selectOne("com.yonyou.mapping.UserMapper.getUser", 1);
		System.out.println(user);
		session.close();
	}
	
	@org.junit.Test
	public void testManytoOne(){
		SqlSession session = sessionFactory.openSession();
		System.out.println("step 1:");
		User user = session.selectOne("com.yonyou.mapping.UserMapper.getUserAsso", 1);
		System.out.println("step 2:");
		System.out.println(user.getGroup());
		session.close();
		System.out.println("===============================");
		//嵌套select方式，采用了懒加载，要在conf.xml setting配置
		session = sessionFactory.openSession();
		System.out.println("step 1:");
		//namespace和接口类名一致，这样可以使用getmapper
		UserMapper userMapper = session.getMapper(UserMapper.class);
		System.out.println("step 2:");
		user = userMapper.getUserAsso(1);
		System.out.println("usermapper:" + user.getGroup());
		session.close();
	}
}
