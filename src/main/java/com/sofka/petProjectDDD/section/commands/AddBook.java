package com.sofka.petProjectDDD.section.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.section.values.*;

public class AddBook extends Command {

    private final BookId bookId;
    private final NumberOfPages numberOfPages;
    private final Genre genre;
    private final Editorial editorial;
    private final Title title;

    public AddBook(BookId bookId, NumberOfPages numberOfPages, Genre genre, Editorial editorial, Title title) {
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
