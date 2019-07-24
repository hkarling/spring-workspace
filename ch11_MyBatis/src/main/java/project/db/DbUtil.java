package project.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * MyBatis Framework를 위한 DB연동을 위한 로드, 연결, 닫기 기능 클래스
 */
public class DbUtil {
	static SqlSessionFactory factory;

	/* MyBatis 환경설정문서를 로딩하면서 SqlSessionFactory를 생성 */
	static {
		try (Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml")) {
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* 연결 */
	public static SqlSession getSqlSession() {
		return factory.openSession();
	}

	/**
	 * 닫기 (insert, update, delete인 경우 )
	 * 
	 * @param state가 true이면 commit, false면 rollback
	 */
	public static void sessionClose(SqlSession session, boolean state) {
		if (session != null) {
			if (state)
				session.commit();
			else
				session.rollback();

			session.close();
		}
	}

	/* 닫기(select인 경우) */
	public static void sessionClose(ResultSet rs, SqlSession session, boolean state) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sessionClose(session, state);
	}
}
