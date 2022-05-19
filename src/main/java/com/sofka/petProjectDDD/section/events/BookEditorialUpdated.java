package com.sofka.petProjectDDD.section.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.section.values.BookId;
import com.sofka.petProjectDDD.section.values.Editorial;

public class BookEditorialUpdated extends DomainEvent {

    private final BookId bookId;
    private final Editorial editorial;

    public BookEditorialUpdated(BookId bookId, Editorial editorial) {
        super("com.sofka.perProjectDDD.section.bookeditorialupdated");
        this.bookId = bookId;
        this.editorial = editorial;
    }

    public BookId getBookId() {
        return bookId;
    }

    public Editorial getEditorial() {
        return editorial;
    }
}
