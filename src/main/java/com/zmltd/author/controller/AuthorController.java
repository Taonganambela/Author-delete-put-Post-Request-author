package com.zmltd.author.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zmltd.author.entity.Author;
import com.zmltd.author.service.AuthorService;

@RestController
@RequestMapping("/Author")

public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {

        this.authorService = authorService;

    }

    @PostMapping("/saveAuthor")
    public Author author(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @PutMapping("/Update/{id}")
    public String updateAuthor(@RequestBody Author author, @PathVariable("id") int id) {

        System.out.println("we are updating Author");

        return authorService.updateAuthor(id, author);
    }

}
