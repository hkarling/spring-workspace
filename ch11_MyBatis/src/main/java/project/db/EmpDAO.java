package project.db;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import project.dto.EmpDTO;

public class EmpDAO {

	/** 모든사원 이름 검색하기 */
	public void selectName() {
		SqlSession session = null;
		try {
			session = DbUtil.getSqlSession();
			List<String> list =  session.selectList("empMapper.selectName"); // namespace + id
			
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
			List<EmpDTO> list =  session.selectList("empMapper.selectAll"); 
			
			for(EmpDTO dto: list) {
				System.out.println(dto);
			}
		} finally {
			DbUtil.sessionClose(session, false);
		}
	}
}
