package project.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import project.dto.ProductDTO;

public class ProductDAO {
//	[1]. 레코드 삽입
	public void insert(ProductDTO dto) {
		SqlSession session = null;
		boolean state = false;
		try {
			session = DbUtil.getSqlSession();
			state = (session.insert("productMapper.insertDTO", dto) > 0) ? true : false;
		} finally {
			DbUtil.sessionClose(session, state);
		}
	}
	
//		[2]. ex) select * from productList
//	 ex) select * from productList where 검색필드 like  검색단어
//	 ex) select * from productList order by 정렬대상
//	 ex) select * from productList where 검색필드 like  검색단어  order by 정렬대상
	public void select() {
		this.select(null, null, null);
	}
	public void select(String order) {
		this.select(order, null, null);
	}
	public void select(String keyfield, String keyword) {
		this.select(null, keyfield, keyword);
	}
	public void select(String order, String keyfield, String keyword) {
		SqlSession session = null;
		Map<String, String> map = new HashMap<String, String>();
		map.put("order", order);
		map.put("keyfield", keyfield);
		map.put("keyword", keyword);
		
		try {
			session = DbUtil.getSqlSession();
			List<ProductDTO> list = session.selectList("productMapper.selectProduct", map);

			for (ProductDTO dto : list) {
				System.out.println(dto);
			}
		} finally {
			DbUtil.sessionClose(session);
		}
	}
//	[3]. parameter 정보에 따라 레코드 수정한다.
//	 상품코드에 해당하는 상품의 
//	 상품이름, 상품수량, 상품가격, 상품상세정보를 수정하데 parameter 의 정보가 있는 데이터만 수정한다.
	public void update(ProductDTO dto) {
		SqlSession session = null;
		boolean state = false;
		try {
			session = DbUtil.getSqlSession();
			state = (session.insert("productMapper.updateProduct", dto) > 0) ? true : false;
		} finally {
			DbUtil.sessionClose(session, state);
		}
	}
//	[4].상품코드에 해당하는 레코드 삭제
	public void delete(String code) {
		SqlSession session = null;
		boolean state = false;
		try {
			session = DbUtil.getSqlSession();
			state = (session.insert("productMapper.deleteProduct", code) > 0) ? true : false;
		} finally {
			DbUtil.sessionClose(session, state);
		}
	}
//	[5]. 모든 상품의 개수를 출력한다.
//	 select count(*) from product -- 총 레코드수
//	 select sum(p_qty) from product -- 모든상품의 qty의총합계
	public void count() {
		SqlSession session = null;
		try {
			session = DbUtil.getSqlSession();
			int count = session.selectOne("productMapper.countProduct");
			System.out.println("모든 상품 qty합 : " + count);
		} finally {
			DbUtil.sessionClose(session);
		}
	}
//	[6]. parameter의 상품코드에 해당하는 레코드 검색 ex)select * from productList where in 상품코드
//	 in (?,?,...)
	public void select(List<String> codes) {
		SqlSession session = null;
		
		try {
			session = DbUtil.getSqlSession();
			List<ProductDTO> list = session.selectList("productMapper.selectByCode", codes);

			for (ProductDTO dto : list) {
				System.out.println(dto);
			}
		} finally {
			DbUtil.sessionClose(session);
		}
	}
}
