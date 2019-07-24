package project.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import project.dto.EmpDTO;

public class EmpDAO {

	/** 모든사원 이름 검색하기 */
	public void selectName() {
		SqlSession session = null;
		try {
			session = DbUtil.getSqlSession();
			List<String> list = session.selectList("empMapper.selectName"); // namespace + id

			System.out.println(list);
		} finally {
			DbUtil.sessionClose(session, false);
		}
	}

	/** */
	public void selectAll() {
		SqlSession session = null;
		try {
			session = DbUtil.getSqlSession();
			List<EmpDTO> list = session.selectList("empMapper.selectAll");

			for (EmpDTO dto : list) {
				System.out.println(dto);
			}
		} finally {
			DbUtil.sessionClose(session);
		}
	}

	/**
	 * 등록하기
	 */
	public void insert(EmpDTO empDTO) {
		SqlSession session = null;
		boolean state = false;
		try {
			session = DbUtil.getSqlSession();
			state = (session.insert("empMapper.empInsert", empDTO) > 0) ? true : false;
		} finally {
			DbUtil.sessionClose(session, state);
		}
	}

	/**
	 * 삭제하기
	 */
	public void delete(int empno) {
		SqlSession session = null;
		boolean state = false;
		try {
			session = DbUtil.getSqlSession();
			state = (session.insert("empMapper.empDelete", empno) > 0) ? true : false;
		} finally {
			DbUtil.sessionClose(session, state);
		}
	}

	/**
	 * 수정하기
	 */
	public void update(EmpDTO empDTO) {
		SqlSession session = null;
		boolean state = false;
		try {
			session = DbUtil.getSqlSession();
			state = (session.insert("empMapper.empUpdate", empDTO) > 0) ? true : false;
		} finally {
			DbUtil.sessionClose(session, state);
		}
	}

	/**
	 * 수정하기 2
	 */
	public void updateByJob(EmpDTO empDTO, String job) {
		SqlSession session = null;
		boolean state = false;
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("dto", empDTO);
			map.put("job", job);
			session = DbUtil.getSqlSession();
			state = (session.insert("empMapper.updateByJob", map) > 0) ? true : false;
		} finally {
			DbUtil.sessionClose(session, state);
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * 전체검색
	 */
	public void empSelectAll() {
		SqlSession session = null;
		try {
			session = DbUtil.getSqlSession();
			RowBounds rb = new RowBounds(0, 5);
			List<EmpDTO> list = session.selectList("empSelectMapper.selectAll", null, rb);

			for (EmpDTO dto : list) {
				System.out.println(dto);
			}
		} finally {
			DbUtil.sessionClose(session);
		}
	}

	/**
	 * 사원번호에 해당하는 검색
	 */
	public void empSelectByempno(int empno) {
		SqlSession session = null;
		try {
			session = DbUtil.getSqlSession();
			EmpDTO dto = session.selectOne("empSelectMapper.selectByEmpNo", empno);

			System.out.println(dto);
		} finally {
			DbUtil.sessionClose(session);
		}
	}

	/**
	 * sal의 최소 ~ 최대 검색
	 */
	public void empSelectBySal(int min, int max) {
		SqlSession session = null;
		boolean state = false;
		try {
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("min", min);
			map.put("max", max);
			session = DbUtil.getSqlSession();
			List<EmpDTO> list = session.selectList("empSelectMapper.selectBySal", map);
			for (EmpDTO dto : list) {
				System.out.println(dto);
			}
		} finally {
			DbUtil.sessionClose(session, state);
		}
	}

	/**
	 * 급여보다 더 적게 받는 사원 검색
	 */
	public void empSelectBySal2(int sal) {
		SqlSession session = null;
		boolean state = false;
		try {
			session = DbUtil.getSqlSession();
			List<EmpDTO> list = session.selectList("empSelectMapper.selectBySal2", sal);
			for (EmpDTO dto : list) {
				System.out.println(dto);
			}
		} finally {
			DbUtil.sessionClose(session, state);
		}
	}
	
	/**
	 * 특정 컬럼을 기준으로 정렬하기
	 */
	public void empSelectByOrder(String column) {
		SqlSession session = null;
		boolean state = false;
		try {
			session = DbUtil.getSqlSession();
			List<EmpDTO> list = session.selectList("empSelectMapper.selectByOrder", column);
			for (EmpDTO dto : list) {
				System.out.println(dto);
			}
		} finally {
			DbUtil.sessionClose(session, state);
		}
	}
}
