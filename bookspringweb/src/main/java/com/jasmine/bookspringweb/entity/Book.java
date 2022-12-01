package com.jasmine.bookspringweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="books")
public class Book {
    @Id
    @Column(name="bookId")
    private int bookId;
    private String bookName;
    private String authorName;
    private int noOfCopies;
    @Column(name="dateOfPublising")
    private LocalDate dateOfPublishing;
}

