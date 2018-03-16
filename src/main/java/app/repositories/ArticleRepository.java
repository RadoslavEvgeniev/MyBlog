package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
