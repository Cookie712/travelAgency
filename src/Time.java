public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Konstruktor parametrowy klasy Time
     * 
     * @param hours   godzina 0-23
     * @param minutes minuty 0-59
     * @param seconds sekundy 0-59
     */
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
     * Konstruktor kopiujacy klasy Time
     * 
     * @param time obiekt czasu uzywany w konstruktorze kopiujacym
     */
    public Time(Time time) {
        this.hours = time.hours;
        this.minutes = time.minutes;
        this.seconds = time.seconds;
    }

    /**
     * Getter godziny w dacie
     * 
     * @return zwraca godzine
     */
    public int gethours() {
        return hours;
    }

    /**
     * Getter minut w dacie
     * 
     * @return zwraca minuty
     */
    public int getminutes() {
        return minutes;
    }

    /**
     * Getter sekund w dacie
     * 
     * @return zwraca sekundy
     */
    public int getseconds() {
        return seconds;
    }
}
