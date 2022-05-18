package com.sofka.petProjectDDD.section;

import co.com.sofka.domain.generic.Entity;
import com.sofka.petProjectDDD.section.values.*;

import java.util.Set;

public class Book extends Entity<BookId> {

    private Title title;
    private Editorial editorial;
    private Set<Genre> genres;
    private NumberOfPages numberOfPages;

    public Book(BookId entityId, Title title, Editorial editorial, Set<Genre> genres, NumberOfPages numberOfPages) {
        super(entityId);
        this.title = title;
        this.editorial = editorial;
        this.genres = genres;
        this.numberOfPages = numberOfPages;
    }

    public void addGenre(Genre genre){
        this.genres.add(genre);
    }

    public void updateEditorial(Editorial editorial){
        this.editorial = editorial;
    }

    public Title Title() {
        return title;
    }

    public Editorial Editorial() {
        return editorial;
    }

    public Set<Genre> Genres() {
        return genres;
    }

    public NumberOfPages NumberOfPages() {
        return numberOfPages;
    }
}
