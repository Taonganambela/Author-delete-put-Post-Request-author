package com.zmltd.author.service;

import java.util.Optional;

import org.springframework.stereotype.Service;


import com.zmltd.author.Repo.AuthorRepo;
import com.zmltd.author.entity.Author;

@Service

public class AuthorService {

    public final AuthorRepo authorRepo;
    String message = null;

    public AuthorService (AuthorRepo authorRepo){

        this.authorRepo = authorRepo;
    }

    public Author saveAuthor (Author author) {

        Author author1 = new Author();
        author1.setFName(author.getFName());
        author1.setTitle(author.getTitle());
        author1.setPages(author.getPages());
        return authorRepo.save(author1);
    }

    public String updateAuthor(int id, Author author) {


        Optional<Author> theAuthor = authorRepo.findById(id);
        theAuthor.ifPresentOrElse(a -> {
            a.setFName(author.getFName());
            a.setTitle(author.getTitle());
            a.setPages(author.getPages());
            authorRepo.save(a);
            message = "Author is Successful";
        }
        ,() -> {
            message = "Author Update Failed";
        });

        return message;


    }

}
