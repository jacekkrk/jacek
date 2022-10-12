package Zadania;

public class TimeUnits {

    public int hourToMinutes(int hour) {
        return hour * 60;
    }

    ;

    public int minutesToSecends(int minutes) {
        return minutes * 60;
    }

    public int secendsToMilisecends(int milisecends) {
        return milisecends * 1000;
    }

    public void showConvertTimeInsertHour(int hour) {
        int minutes = this.hourToMinutes(hour);
        int secends = this.minutesToSecends(minutes);
        int milisecends = this.secendsToMilisecends(secends);

        System.out.println("Time to covert is " + hour + " hours.");
        System.out.println("This is " + minutes + " minutes");
        System.out.println("This is " + secends + " secends");
        System.out.println("This is " + milisecends + " milisecends");

    }


}
