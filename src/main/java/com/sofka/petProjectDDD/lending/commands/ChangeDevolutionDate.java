package com.sofka.petProjectDDD.lending.commands;

import com.sofka.petProjectDDD.lending.values.DevolutionDate;

public class ChangeDevolutionDate {

    private final DevolutionDate devolutionDate;

    public ChangeDevolutionDate(DevolutionDate devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public DevolutionDate getDevolutionDate() {
        return devolutionDate;
    }
}
