package org.jasmine.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

    private int bookId;
    private String bookName;
    private String authorName;
    private int noOfCopies;
    private LocalDate dateOfPublishing;
}
