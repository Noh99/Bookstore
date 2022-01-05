package com.bookstore.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bookstore.domain.BookVO;

@Repository
public class BookDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.bookstore.mappers.book";
	
	public List<BookVO> books() throws Exception {
		
		return sql.selectList(namespace + ".books");
		
	}
	
	public BookVO book(int id) throws Exception {
		
		return sql.selectOne(namespace + ".book", id);
		
	}
	
	public void new_book(BookVO vo) throws Exception {
		
		sql.insert(namespace + ".new", vo);
		
	}
	
	public void edit_book(BookVO vo) throws Exception {
		
		sql.update(namespace + ".edit", vo);
		
	}
	
	public void delete_book(int id) throws Exception {
		
		sql.delete(namespace + ".delete", id);
		
	}

}