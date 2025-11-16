package at.htlhl.sew2.oop.basics;

import java.util.Arrays;
import java.time.LocalDate;

public class RaceAnalysis {
    static void main() {
        Formula1Car mcLarenCar = new Formula1Car("McLaren", "Mercedes");
        Formula1Car mercedesCar = new Formula1Car("Mercedes", "Mercedes");
        Formula1Car redBullCar = new Formula1Car("Red Bull Racing", "Honda");
        Formula1Car HaasCar = new Formula1Car("Haas F1 Team", "Ferrari");

        Formula1Driver Lando = new Formula1Driver("Lando Norris", LocalDate.of(1999, 11, 13), mcLarenCar);
        Formula1Driver Antonelli = new Formula1Driver("Andrea Kimi Antonelli", LocalDate.of(2006, 8, 25), mercedesCar);
        Formula1Driver Max = new Formula1Driver("Max Verstappen", LocalDate.of(1997, 9, 30), redBullCar);
        Formula1Driver George = new Formula1Driver("George Russell", LocalDate.of(1998, 2, 15), mercedesCar);
        Formula1Driver Oscar = new Formula1Driver("Oscar Piastri", LocalDate.of(2001, 4, 6), mcLarenCar);
        Formula1Driver Oliver = new Formula1Driver("Oliver Bearman", LocalDate.of(2005, 5, 8), HaasCar);

        Formula1Driver[] monacoLeaderboard = {Lando, Antonelli, Max, George, Oscar, Oliver};

        String[] both = getBothTeammatesOnPodium(monacoLeaderboard);
        for (String team : both) {
            System.out.println(team);
        }

    }

    public Formula1Driver getYoungestDriver(Formula1Driver[] drivers) {
        Formula1Driver youngestDriver = drivers[0];
        for (Formula1Driver driver : drivers) {
            if (driver.getDob().isAfter(youngestDriver.getDob())) {
                youngestDriver = driver;
            }
        }
        return youngestDriver;
    }

    public Formula1Driver getOldestDriver(Formula1Driver[] drivers) {
        Formula1Driver oldestDriver = drivers[0];
        for (Formula1Driver driver : drivers) {
            if (driver.getDob().isBefore(oldestDriver.getDob())) {
                oldestDriver = driver;
            }
        }
        return oldestDriver;
    }

    public static String[] getBothTeammatesOnPodium(Formula1Driver[] drivers) {
        String[] teamsOnPodium = new String[20];
        String[] bothTeammatesOnPodium = new String[20];
        for (Formula1Driver driver : drivers) {
            if (Arrays.asList(teamsOnPodium).contains(driver.car.team)) {
                bothTeammatesOnPodium[Arrays.asList(bothTeammatesOnPodium).indexOf(null)] = driver.car.team;
            } else {
                teamsOnPodium[Arrays.asList(teamsOnPodium).indexOf(null)] = driver.car.team;
            }
        }
        return bothTeammatesOnPodium;
    }
}
