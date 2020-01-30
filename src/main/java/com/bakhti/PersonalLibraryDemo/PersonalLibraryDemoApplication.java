package com.bakhti.PersonalLibraryDemo;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bakhti.PersonalLibraryDemo.entity.Book;
import com.bakhti.PersonalLibraryDemo.repository.BookRepository;

@SpringBootApplication
public class PersonalLibraryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalLibraryDemoApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(BookRepository bookRepository) {
        return args -> {
            Stream.of("The Sun Also Rises", "Old Man and the Sea", "Sarviqomat Dilbarim").forEach(title -> {
                Book book = new Book(title, "Ernest Hemignway");
                bookRepository.save(book);
            });
            bookRepository.findAll().forEach(System.out::println);
        };
    }
}
