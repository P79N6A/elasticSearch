package com.iqiyi.vip.vipes.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

import com.iqiyi.vip.vipes.bean.BookBean;

/**
 * @author Lin ZeBin
 * @date 2019/4/2 17:26
 */
public interface BookService {

    Optional<BookBean> findById(String id);

    BookBean save(BookBean blog);

    void delete(BookBean blog);

    Optional<BookBean> findOne(String id);

    List<BookBean> findAll();

    Page<BookBean> findByAuthor(String author, PageRequest pageRequest);

    Page<BookBean> findByTitle(String title, PageRequest pageRequest);
}

