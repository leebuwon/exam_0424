package com.ll.exam_0424.article.repository;

import com.ll.exam_0424.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
