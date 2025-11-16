package at.htlhl.sew2.oop.basics;

public class Formula1Car {
    final String team;
    final String engine;

    public Formula1Car(String team, String engine) {
        this.team = team;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Formula1Car{" + "team=" + team + ", engine=" + engine + "}";
    }

    public String getTeam() {
        return this.team;
    }

    public String getEngine() {
        return this.engine;
    }
}
