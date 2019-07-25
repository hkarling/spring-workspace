package project.dto;

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
public class ReplyDTO {
	private int replyNo;
	private int commentNo;
	private String userId;
	private String replyContent;
	private String regDate;
}