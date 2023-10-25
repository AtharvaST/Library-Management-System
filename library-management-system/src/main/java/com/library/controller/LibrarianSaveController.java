package com.library.controller;

import com.library.dto.Librarian;
import com.library.service.LibrarianService;

public class LibrarianSaveController {
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		Librarian librarian = new Librarian();
		librarian.setName("l4");
		librarian.setMail("l4@mail.com");
		librarian.setStatus("Approved");
		librarianService.saveLibrarian(librarian);
	}
}
