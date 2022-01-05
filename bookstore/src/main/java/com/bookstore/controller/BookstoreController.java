package com.bookstore.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookstore.dao.BookDAO;
import com.bookstore.domain.BookVO;
import com.bookstore.service.BookService;

@Controller
public class BookstoreController {
	
	@Inject
	BookService service;
	
	@RequestMapping(value = "/Bookstore", method = RequestMethod.GET)
	public void getBookstore() throws Exception{}
	
	@RequestMapping(value = "/books/books", method = RequestMethod.GET)
	public void getBooks(Model model) throws Exception {
	  
		List<BookVO> books = null;
		books = service.books();
		
		model.addAttribute("books", books);
	}
	
	@RequestMapping(value = "/books/new", method = RequestMethod.GET)
	public void getNew() throws Exception {}

	@RequestMapping(value = "/books/new", method = RequestMethod.POST)
	public String postNew(BookVO vo) throws Exception {
		
		service.write(vo);
		
		return "redirect:/books/books";
		
	}
	
	@RequestMapping(value = "/books/edit", method = RequestMethod.GET)
	public void getEdit(@RequestParam("id") int id, Model model) throws Exception {
		
		BookVO vo = service.book(id);
		
		model.addAttribute("book", vo);
	}
	
	@RequestMapping(value = "/books/edit", method = RequestMethod.POST)
	public String postEdit(BookVO vo) throws Exception {
		
		service.modify(vo);
		
		return "redirect:/books/books";
		
	}
	
	@RequestMapping(value = "/books/delete", method = RequestMethod.GET)
	public String getDelete(@RequestParam("id") int id) throws Exception {
		
		service.delete(id);
		
		return "redirect:/books/books";
		
	}
	
}