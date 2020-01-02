package sample10;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BoardServiceImpl implements BoardService {

	@Resource(name="boardDAOImpl")
	private BoardDAO boardDao;
	@Resource(name="boardMyBatisDAOImpl")
	private BoardDAO boardMyBatisDAOImpl;
	@Override
	public void select() {
		boardDao.select();
		boardMyBatisDAOImpl.select();
	}

}
