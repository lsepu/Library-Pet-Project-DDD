package com.sofka.petProjectDDD.section.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.section.values.BookId;
import com.sofka.petProjectDDD.section.values.Genre;

public class AddBookGenre extends Command {

    private final BookId bookId;
    private final Genre genre;

    public BookId getBookId() {
        return bookId;
    }

    public Genre getGenre() {
        return genre;
    }

    public AddBookGenre(BookId bookId, Genre genre) {
        this.bookId = bookId;
        this.genre = genre;
    }
}
