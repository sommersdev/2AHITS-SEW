package at.htlhl.sew2.oop.basics;

import java.time.LocalDate;

public class Formula1Driver {
    final String name;
    final LocalDate dob;
    final Formula1Car car;

    public Formula1Driver(String name, LocalDate dob, Formula1Car car) {
        this.name = name;
        this.dob = dob;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Formula1Driver{" + "name=" + name + ", dob=" + dob + ", car=" + car + "}";
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public Formula1Car getCar() {
        return this.car;
    }
}
