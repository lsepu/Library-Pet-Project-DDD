package com.sofka.petProjectDDD.section.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.section.values.*;

import java.util.Set;

public class AddBook extends Command {

    private final BookId bookId;
    private final NumberOfPages numberOfPages;
    private final Set<Genre> genres;
    private final Editorial editorial;
    private final Title title;

    public AddBook(BookId bookId, NumberOfPages numberOfPages, Set<Genre> genres, Editorial editorial, Title title) {
        this.bookId = bookId;
        this.numberOfPages = numberOfPages;
        this.genres = genres;
        this.editorial = editorial;
        this.title = title;
    }

    public BookId getBookId() {
        return bookId;
    }

    public NumberOfPages getNumberOfPages() {
        return numberOfPages;
    }

    public Set<Genre> getGenre() {
        return genres;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Title getTitle() {
        return title;
    }
}
