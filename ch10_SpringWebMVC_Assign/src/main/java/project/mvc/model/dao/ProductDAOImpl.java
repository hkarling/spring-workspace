package project.mvc.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.mvc.model.dto.ProductDTO;
import project.mvc.model.exception.MyErrorException;

@Repository // id="productDAOImpl"
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	List<ProductDTO> list;
	
	@Override
	public List<ProductDTO> select() {
		return list;
	}

	@Override
	public int insert(ProductDTO productDTO) throws MyErrorException {
		for(ProductDTO obj : list) {
			if(obj.getCode().equals(productDTO.getCode()))
				throw new MyErrorException("상품코드 중복");
		}
		list.add(productDTO);
		return 1;
	}

	@Override
	public int delete(String code) throws MyErrorException {
		for(ProductDTO obj : list) {
			if(obj.getCode().equals(code)) {
				list.remove(obj);
				return 1;
			}
		}
		throw new MyErrorException("코드에 해당하는 상품이 존재하지 않음.");
	}
}