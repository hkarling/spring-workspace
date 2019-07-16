package sample09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpController {
	@Autowired // byType -> byName
	private EmpDTO empDTO;
	@Autowired
	@Qualifier("test")
	private EmpDTO empDTO2;
	@Autowired
	private EmpService service;
	
	public void invoker() {
		System.out.println("empDTO = " + empDTO);
		System.out.println("empNo = " + empDTO.getEmpno() );
		System.out.println("service = " + service);
		service.test();
	}
}
