package com.sofka.petProjectDDD.section;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.section.events.*;
import com.sofka.petProjectDDD.section.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Section extends AggregateEvent<SectionId> {

    protected Set<Book> books;
    protected SectionName name;
    protected Librarian librarian;
    protected Aisle aisle;
    protected Floor floor;


    public Section(SectionId entityId, SectionName name, Librarian librarian, Aisle aisle, Floor floor) {
        super(entityId);
        appendChange(new SectionAdded(name, aisle, floor, librarian));
        subscribe(new SectionChange(this));
    }

    private Section(SectionId entityId){
        super(entityId);
        subscribe(new SectionChange(this));
    }

    public static Section from (SectionId sectionId, List<DomainEvent> events){
        var section = new Section(sectionId);
        events.forEach(section::applyEvent);
        return section;
    }

    //behaviors
    public void addBook(BookId bookId, NumberOfPages numberOfPages, Set<Genre> genres, Editorial editorial, Title title){
        Objects.requireNonNull(bookId);
        Objects.requireNonNull(genres);
        Objects.requireNonNull(numberOfPages);
        Objects.requireNonNull(editorial);
        Objects.requireNonNull(title);

        appendChange(new BookAdded(bookId, numberOfPages, genres, editorial, title)).apply();
    }

    public void addBookGenre(BookId bookId, Genre genre){
        Objects.requireNonNull(bookId);
        Objects.requireNonNull(genre);

        appendChange(new BookGenreAdded(bookId, genre));
    }

    public void addLibrarian(LibrarianId librarianId, Name name){
        Objects.requireNonNull(librarianId);
        Objects.requireNonNull(name);

        appendChange(new LibrarianAdded(librarianId, name));
    }

    public void assignAisle(Aisle aisle){
        Objects.requireNonNull(aisle);

        appendChange(new AisleAssigned(aisle));
    }

    public void assignFloor(Floor floor){
        Objects.requireNonNull(floor);

        appendChange(new FloorAssigned(floor));
    }

    public void removeBook(BookId bookId){
        Objects.requireNonNull(bookId);

        appendChange(new BookRemoved(bookId));
    }

    public void updateBookEditorial(BookId bookId, Editorial editorial){
        Objects.requireNonNull(bookId);
        Objects.requireNonNull(editorial);

        appendChange(new BookEditorialUpdated(bookId, editorial));
    }

    public void updateLibrarianName(LibrarianId librarianId, Name name){
        Objects.requireNonNull(librarianId);
        Objects.requireNonNull(name);

        appendChange(new LibrarianNameUpdated(librarianId, name));
    }

    protected Optional<Book> getBookById(BookId bookId){
        return books
                .stream()
                .filter(book -> book.identity().equals(bookId))
                .findFirst();
    }




}
