package com.sofka.petProjectDDD.section;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.petProjectDDD.section.commands.UpdateBookEditorial;
import com.sofka.petProjectDDD.section.events.*;

import java.util.HashSet;

public class SectionChange extends EventChange {
    public SectionChange(Section section){

        apply((SectionAdded event) -> {
            section.name = event.getName();
            section.aisle = event.getAisle();
            section.librarian = event.getLibrarian();
            section.floor = event.getFloor();
            section.books = new HashSet<>();
        });

        apply((BookAdded event) -> {
            section.books.add( new Book(
                    event.getBookId(),
                    event.getNumberOfPages(),
                    event.getEditorial(),
                    event.getGenres(),
                    event.getTitle()
                    )
            );

        });

        apply((BookGenreAdded event) -> {
            var book = section.getBookById(event.getBookId())
                    .orElseThrow(() -> new IllegalArgumentException("The book was not found"));
            book.addGenre(event.getGenre());
        });

        apply((LibrarianAdded event) -> {
            section.librarian = new Librarian(event.getLibrarianId(), event.getName());
        });

        apply((AisleAssigned event) -> {
            section.aisle = event.getAisle();
        });

        apply((FloorAssigned event) -> {
            section.floor = event.getFloor();
        });

        apply((BookRemoved event) ->{
            section.books.removeIf(book -> book.identity().equals(event.getBookId()));
        });

        apply((BookEditorialUpdated event) -> {
            var book = section.getBookById(event.getBookId())
                    .orElseThrow(() -> new IllegalArgumentException("The book was not found"));
            book.updateEditorial(event.getEditorial());
        });

        apply((LibrarianNameUpdated event) -> {
            section.librarian.updateName(event.getName());
        });


    }

}
