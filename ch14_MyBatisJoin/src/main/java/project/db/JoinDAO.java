package project.db;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import project.dto.CommentbDTO;
import project.dto.ReplyDTO;

public class JoinDAO {

	/* 1:1인 경우 */
	public void associationJoin() {
		SqlSession session = null;
		try {
			session = DbUtil.getSqlSession();
			List<CommentbDTO> list = session.selectList("joinMapper.associationJoin");
			
			for(CommentbDTO obj : list) {
				System.out.print(obj.getCommentNo() + " | ");
				System.out.print(obj.getCommentContent() + " | ");
				System.out.print(obj.getUser().getUserId() + " | ");
				System.out.print(obj.getUser().getUserName() + " | ");
				System.out.println(obj.getRegDate());
			}
		}finally {
			DbUtil.sessionClose(session);
		}
	}
	
	public void collectionJoin() {
		SqlSession session = null;
		try {
			session = DbUtil.getSqlSession();
			List<CommentbDTO> list = session.selectList("joinMapper.collectionJoin");
			System.out.println("게시물 수 : " + list.size());
			for(CommentbDTO obj : list) {
				for(ReplyDTO reply : obj.getReplies()) {
					System.out.print(obj.getCommentNo() + " | ");
					System.out.print(obj.getUserId() + " | ");
					System.out.print(obj.getCommentContent() + " | ");
					System.out.print(reply.getReplyNo() + " | ");
					System.out.print(reply.getReplyContent() + " | ");
					System.out.println(reply.getRegDate());					
				}
			}
		} finally {
			DbUtil.sessionClose(session);
		}
	}
}
