package com.jasmine.springboot.book.persistence;

import com.jasmine.springboot.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {

}
