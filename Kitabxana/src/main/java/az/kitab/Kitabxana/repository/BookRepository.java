package az.kitab.Kitabxana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.kitab.Kitabxana.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
