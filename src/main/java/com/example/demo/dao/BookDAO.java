package com.example.demo.dao;

import com.example.demo.pojo.Book;
import com.example.demo.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDAO extends JpaRepository<Book, Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyWord1, String keyWord2);
}
