package project.db;

import project.dto.EmpDTO;

public class MainApp {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
//		System.out.println("----- 전체 사원 이름 검색 -----");
//		dao.selectName();
//		System.out.println("----- 전체 사원 검색 ------");
//		dao.selectAll();
//		System.out.println("----- 사원 등록 -----");
//		dao.insert(new EmpDTO(9898,"김미영", "팀장", 4000));
//		dao.selectAll();
//		System.out.println("----- 사원 수정 -----");
//		dao.update(new EmpDTO(9898, "어이이", "아무것",5000));
//		dao.selectAll();
//		System.out.println("----- 사원 삭제 -----");
//		dao.delete(9898);
//		dao.selectAll();
//		dao.updateByJob(new EmpDTO(9898,"형님", "실직", 0), "팀장");
//		dao.selectAll();		
//		System.out.println("----- 전체 사원 검색 -----");
//		dao.empSelectAll();
//		System.out.println("----- 사원 번호 검색 -----");
//		dao.empSelectByempno(7369);
//		System.out.println("----- 범위 검색 -----");
//		dao.empSelectBySal(3000, 10000);
//		System.out.println("----- sal 얼마 이하 검색 -----");
//		dao.empSelectBySal2(3000);
//		System.out.println("----- 컬럼명으로 정렬 -----");
//		dao.empSelectByOrder("sal");
		System.out.println("----- 특정 컬럼, 특정 단어로 정렬 -----");
		dao.selectByKeyField("job", "MAN");
	}
}
