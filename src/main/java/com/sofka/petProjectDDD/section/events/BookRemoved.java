package com.sofka.petProjectDDD.section.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.section.values.BookId;

public class BookRemoved extends DomainEvent {

    private final BookId bookId;

    public BookRemoved(BookId bookId) {
        super("com.sofka.perProjectDDD.section.bookremoved");
        this.bookId = bookId;
    }

    public BookId getBookId() {
        return bookId;
    }
}
