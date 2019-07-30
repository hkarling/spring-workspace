package project.mvc.model.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.mvc.model.board.dao.BoardDAO;
import project.mvc.model.board.dto.ElectronicsDTO;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO boardDAO;
    
    @Override
    public List<ElectronicsDTO> selectAll() {
	List<ElectronicsDTO> list = boardDAO.selectAll();
	return list;
    }

    @Override
    public ElectronicsDTO selectByModelNum(String modelNum, boolean state) {
	if(state) {
	    int result = boardDAO.readnumUpdate(modelNum);
	    if(result==0)
		throw new RuntimeException("조회수 증가 오류 실패했습니다.");
	}
	ElectronicsDTO dto = boardDAO.selectByModelNum(modelNum);
	if(dto == null)
	    throw new RuntimeException("게시물의 검색에 실패했습니다.");
	return dto;
    }

    @Override
    @Transactional
    public int insert(ElectronicsDTO electronics) {
	int result = boardDAO.insert(electronics);
	if(result == 0)
	    throw new RuntimeException("등록되지 않았습니다.");
	return result;
    }

    @Override
    public int delete(String modelNum, String password) {
	int result = boardDAO.delete(modelNum, password);
	if(result == 0)
	    throw new RuntimeException("삭제되지 않았습니다.");
	return result;
    }

    @Override
    public int update(ElectronicsDTO electronics) {
	ElectronicsDTO dto = boardDAO.selectByModelNum(electronics.getModelNum());
	if(!electronics.getPassword().equals(dto.getPassword()))
	    throw new RuntimeException("비밀번호가 맞지않아.");
	int result = boardDAO.update(electronics);
	if(result == 0)
	    throw new RuntimeException("수정되지않았다.");
	return result;
    }

}
