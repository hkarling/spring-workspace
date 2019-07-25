package project.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommentbDTO {
	private int commentNo;
	private String userId;
	private String commentContent;
	private String regDate;	
	
	// 1:1인 경우 Users정보
	private UsersDTO user;
	
	// 1:다인 경우 reply정보
	private List<ReplyDTO> replies;
}
