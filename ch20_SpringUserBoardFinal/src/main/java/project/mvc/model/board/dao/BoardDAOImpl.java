package project.mvc.model.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.mvc.model.board.dto.ElectronicsDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {

    @Autowired
    private SqlSession session;
    
    @Override
    public List<ElectronicsDTO> selectAll() {
	List<ElectronicsDTO> list = session.selectList("boardMapper.selectAll");
	return list;
    }

    @Override
    public ElectronicsDTO selectByModelNum(String modelNum) {
	return session.selectOne("boardMapper.selectAll", modelNum);
    }

    @Override
    public int readnumUpdate(String modelNum) {
	return session.update("boardMapper.readnumUpdate", modelNum);
    }

    @Override
    public int insert(ElectronicsDTO electronics) {
	return session.insert("boardMapper.boardInsert", electronics);
    }

    @Override
    public int delete(String modelNum, String password) {
	Map<String, String> map = new HashMap<String, String>();
	map.put("modelNum", modelNum);
	map.put("password", password);
	return session.insert("boardMapper.delete", map);
    }

    @Override
    public int update(ElectronicsDTO electronics) {
	return session.insert("boardMapper.update", electronics);
    }
}
