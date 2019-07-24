package project.db;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import project.dto.EmpDTO;

public class EmpDAO {

	public void ifTest(EmpDTO dto) {
		SqlSession session = null;
		try {
			session = DbUtil.getSqlSession();
			List<EmpDTO> list = session.selectList("dynamicMapper.ifTest", dto);
			for (EmpDTO obj : list)
				System.out.println(obj);
		} finally {
			DbUtil.sessionClose(session);
		}
	}

	public void setTest(EmpDTO empDTO) {
		SqlSession session = null;
		boolean state = false;
		try {
			session = DbUtil.getSqlSession();
			state = (session.update("dynamicMapper.updateSetTest", empDTO) > 0) ? true : false;

		} finally {
			DbUtil.sessionClose(session, state);
		}
	}
	
	public void foreachTest(int[] paramList) {
		SqlSession session = null;
		try {
			session = DbUtil.getSqlSession();
			List<EmpDTO> list = session.selectList("dynamicMapper.forEachTest", paramList);
			for (EmpDTO obj : list)
				System.out.println(obj);
		} finally {
			DbUtil.sessionClose(session);
		}
	}
}
