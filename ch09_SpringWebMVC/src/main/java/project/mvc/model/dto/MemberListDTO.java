package project.mvc.model.dto;

import java.util.List;

public class MemberListDTO {
	private List<MemberDTO> list;

	public List<MemberDTO> getList() {
		return list;
	}

	public void setList(List<MemberDTO> list) {
		System.out.println("MemberListDTO의 setList(List<MemberDTO> list) 호출..");
		this.list = list;
	}
}
