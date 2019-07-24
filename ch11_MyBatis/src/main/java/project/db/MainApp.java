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
		dao.selectAll();
		System.out.println("----- 사원 수정 -----");
		dao.update(new EmpDTO(9898, "어이이", "아무것",5000));
		dao.selectAll();
		System.out.println("----- 사원 삭제 -----");
		dao.delete(9898);
		dao.selectAll();
		
	}
}
