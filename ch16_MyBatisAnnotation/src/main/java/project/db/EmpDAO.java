package project.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import project.dto.EmpDTO;

public class EmpDAO {

    /** 모든 사원 검색하기 */
    public void selectAll() {
	SqlSession session = null;
	try {
	    session = DbUtil.getSqlSession();
	    EmpMapper mapper = session.getMapper(EmpMapper.class);
	    List<EmpDTO> list = mapper.selectAll();
	    for (EmpDTO dto : list)
		System.out.println(dto);
	} finally {
	    DbUtil.sessionClose(session, false);
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
	    EmpMapper mapper = session.getMapper(EmpMapper.class);
	    state = (mapper.insert(empDTO) > 0) ? true : false;
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
	    EmpMapper mapper = session.getMapper(EmpMapper.class);
	    state = (mapper.delete(empno) > 0) ? true : false;
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
	    EmpMapper mapper = session.getMapper(EmpMapper.class);
	    state = (mapper.update(empDTO) > 0) ? true : false;
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

	Map<String, Object> map = new HashMap<String, Object>();
	map.put("dto", empDTO);
	map.put("job", job);

	try {
	    session = DbUtil.getSqlSession();
	    EmpMapper mapper = session.getMapper(EmpMapper.class);
	    state = (mapper.update2(map) > 0) ? true : false;
	} finally {
	    DbUtil.sessionClose(session, state);
	}
    }

    public void ifTest(EmpDTO empDTO) {
	SqlSession session = null;
	try {
	    session = DbUtil.getSqlSession();
	    EmpMapper mapper = session.getMapper(EmpMapper.class);

	    List<EmpDTO> list = mapper.ifTest(empDTO);
	    for (EmpDTO obj : list)
		System.out.println(obj);
	} finally {
	    DbUtil.sessionClose(session);
	}
    }
}
