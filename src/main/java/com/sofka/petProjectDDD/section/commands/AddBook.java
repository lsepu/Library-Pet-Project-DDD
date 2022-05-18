package com.sofka.petProjectDDD.section.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.section.values.Editorial;
import com.sofka.petProjectDDD.section.values.Genre;
import com.sofka.petProjectDDD.section.values.NumberOfPages;
import com.sofka.petProjectDDD.section.values.Title;

public class AddBook extends Command {

    private final NumberOfPages numberOfPages;
    private final Genre genre;
    private final Editorial editorial;
    private final Title title;

    public AddBook(NumberOfPages numberOfPages, Genre genre, Editorial editorial, Title title) {
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.editorial = editorial;
        this.title = title;
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
