package com.sofka.petProjectDDD.section.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.section.values.BookId;
import com.sofka.petProjectDDD.section.values.Genre;

public class BookGenreAdded extends DomainEvent {

    private final BookId bookId;
    private final Genre genre;

    public BookGenreAdded(String type, BookId bookId, Genre genre) {
        super("com.sofka.perProjectDDD.events");
        this.bookId = bookId;
        this.genre = genre;
    }

    public BookId getBookId() {
        return bookId;
    }

    public Genre getGenre() {
        return genre;
    }
}
