package com.sofka.petProjectDDD.section.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.section.values.BookId;
import com.sofka.petProjectDDD.section.values.Editorial;

public class UpdateBookEditorial extends Command {

    private final BookId bookId;
    private final Editorial editorial;

    public UpdateBookEditorial(BookId bookId, Editorial editorial) {
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
