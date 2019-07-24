package project.db;

import project.dto.EmpDTO;

public class MainApp {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
//		dao.ifTest(new EmpDTO());
//		dao.ifTest(new EmpDTO(0, "이쁜", null, 0));
//		dao.ifTest(new EmpDTO(0, null, "MANAGER", 0));
//		dao.ifTest(new EmpDTO(0, "이쁜", "MANAGER", 0));

//		dao.setTest(new EmpDTO(9898, "ㅌㅌㅌ", "백수", 0));
//		dao.setTest(new EmpDTO(9898, null, "백수", 0));
//		dao.setTest(new EmpDTO(9898, "ㅌㅌㅌ", null, 0));
//		dao.setTest(new EmpDTO(9898, null, null, 10));

		dao.foreachTest(new int[] { 7369, 7499, 7521 });
	}
}
