package com.bookstore.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bookstore.dao.BookDAO;
import com.bookstore.domain.BookVO;

@Service
public class BookService {

	@Inject
	private BookDAO dao;
	
	public List<BookVO> books() throws Exception {
		
		return dao.books();
		
	}

	public void write(BookVO vo) throws Exception {

		dao.new_book(vo);
		
	}
	
	public BookVO book(int id) throws Exception {
		
		return dao.book(id);
		
	}
	
	public void modify(BookVO vo) throws Exception {

		dao.edit_book(vo);
		
	}
	
	public void delete(int id) throws Exception {
		
		dao.delete_book(id);
		
	}

}