package project.mvc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.mvc.model.dao.ProductDAO;
import project.mvc.model.dao.ProductDAOImpl;
import project.mvc.model.dto.ProductDTO;
import project.mvc.model.exception.MyErrorException;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO dao;
	
	@Override
	public List<ProductDTO> select() {

		return dao.select();
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