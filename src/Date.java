import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
    private int day;
    private int month;
    private int year;

    /**
     * Metoda obliczajaca roznice dni pomiedzy dwoma oddalonymi od siebie datami
     * 
     * @param date      pierwsza data
     * @param otherDate druga data
     * @return zwraca liczbe dni pomiedzy datami
     */
    public static int calculateDateDifference(Date date, Date otherDate) {
        LocalDate date1 = LocalDate.of(date.getyear(), date.getmonth(), date.getday());
        LocalDate date2 = LocalDate.of(otherDate.getyear(), otherDate.getmonth(), otherDate.getday());

        long dayDifference = ChronoUnit.DAYS.between(date1, date2);
        return (int) dayDifference;
    }

    /**
     * Konstruktor klasy Date
     * 
     * @param day   dzien (1-31)
     * @param month miesiac (1-12)
     * @param year  rok (granica zakresu typu danych integer)
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Konstruktor kopiujacy klasy Date
     * 
     * @param date obiekt daty uzywany w konstruktorze kopiujacym
     */
    public Date(Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    /**
     * Getter dnia w dacie
     * 
     * @return zwraca dzien
     */
    public int getday() {
        return day;
    }

    /**
     * Getter miesiaca w dacie
     * 
     * @return zwraca miesiac
     */
    public int getmonth() {
        return month;
    }

    /**
     * Getter roku w dacie
     * 
     * @return zwraca rok
     */
    public int getyear() {
        return year;
    }
}
