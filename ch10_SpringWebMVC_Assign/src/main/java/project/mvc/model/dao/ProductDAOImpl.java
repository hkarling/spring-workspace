package project.mvc.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.mvc.model.dto.ProductDTO;
import project.mvc.model.exception.MyErrorException;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	List<ProductDTO> list;
	
	@Override
	public List<ProductDTO> select() {
		
		return list;
	}

	@Override
	public int insert(ProductDTO productDTO) throws MyErrorException {

		return 0;
	}

	@Override
	public int delete(String code) throws MyErrorException {

		return 0;
	}

}