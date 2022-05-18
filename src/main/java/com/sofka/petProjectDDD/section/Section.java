package com.sofka.petProjectDDD.section;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.petProjectDDD.section.values.Aisle;
import com.sofka.petProjectDDD.section.values.Floor;
import com.sofka.petProjectDDD.section.values.SectionId;

import java.util.Set;

public class Section extends AggregateEvent<SectionId> {

    protected Set<Book> books;
    protected Librarian librarian;
    protected Aisle aisle;
    protected Floor floor;


    public Section(SectionId entityId) {
        super(entityId);
    }
}
