package com.sofka.petProjectDDD.section.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.section.values.BookId;

public class BookRemoved extends DomainEvent {

    private final BookId bookId;

    public BookRemoved(String type, BookId bookId) {
        super("com.sofka.perProjectDDD.events");
        this.bookId = bookId;
    }

    public BookId getBookId() {
        return bookId;
    }
}
