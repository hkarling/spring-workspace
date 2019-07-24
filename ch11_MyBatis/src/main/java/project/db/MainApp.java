package project.db;

public class MainApp {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		System.out.println("----- 전체 사원 이름 검색 -----");
		dao.selectName();
		System.out.println("----- 전체 사원 검색 ------");
		dao.selectAll();
	}
}
