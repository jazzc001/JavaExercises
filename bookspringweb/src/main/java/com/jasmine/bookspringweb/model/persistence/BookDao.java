package com.jasmine.bookspringweb.model.persistence;

import com.jasmine.bookspringweb.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
    List<Book> findByNoOfCopiesGreaterThan(int copies);
    int countDistinctByAuthorName(String name);

    //JPQL
    @Query(value = "insert into books values(:bid, :na, :au, :co, :dop")
    int insertBook(@Param("bid")int bookId, @Param("na") String bookName, @Param("au") String authorName, @Param("co") int noOfCopies, @Param("dop") LocalDate dateOfPublising);



}

