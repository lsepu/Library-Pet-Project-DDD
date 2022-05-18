package com.sofka.petProjectDDD.section.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.section.values.*;

public class BookAdded extends DomainEvent {

    private final BookId bookId;
    private final NumberOfPages numberOfPages;
    private final Genre genre;
    private final Editorial editorial;
    private final Title title;

    public BookAdded(String type, BookId bookId, NumberOfPages numberOfPages, Genre genre, Editorial editorial, Title title) {
        super("com.sofka.petProjectDDD.events");
        this.bookId = bookId;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.editorial = editorial;
        this.title = title;
    }

    public BookId getBookId() {
        return bookId;
    }

    public NumberOfPages getNumberOfPages() {
        return numberOfPages;
    }

    public Genre getGenre() {
        return genre;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Title getTitle() {
        return title;
    }
}
