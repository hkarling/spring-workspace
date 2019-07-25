package project.db;

public class MainApp {

	public static void main(String[] args) {
		JoinDAO dao = new JoinDAO();
		
		dao.associationJoin();
		
		dao.collectionJoin();
	}
}
