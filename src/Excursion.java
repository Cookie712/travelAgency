public class Excursion {
    private Date departureDate;
    private Date returnDate;
    private Time departureTime;
    private Time returnTime;

    private String tripDestination;
    private String tripDescription;

    private double price;

    private int numberOfPlaces;

    /**
     * Konstruktor klasy Excursion
     * 
     * @param departureDate   data wyjazdu
     * @param returnDate      data powrotu
     * @param departureTime   czas wyjazdu
     * @param returnTime      czas powrotu
     * @param tripDestination miejsce docelowe podrozy
     * @param tripDescription opis danej wycieczki
     * @param price           cena za konkretny wyjazd
     * @param numberOfPlaces  ilosc miejsc jaka moze zostac zapelniona
     */
    public Excursion(Date departureDate, Date returnDate, Time departureTime, Time returnTime, String tripDestination,
            String tripDescription, double price, int numberOfPlaces) {
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.departureTime = departureTime;
        this.returnTime = returnTime;
        this.tripDestination = tripDestination;
        this.tripDescription = tripDescription;
        this.price = price;
    }

    /**
     * Konstruktor kopiujacy klasy Excursion
     * 
     * @param excursion obiekt wycieczki uzywany w konstrukotrze kopiujacym
     */
    public Excursion(Excursion excursion) {
        this.departureDate = excursion.departureDate;
        this.returnDate = excursion.returnDate;
        this.departureTime = excursion.departureTime;
        this.returnTime = excursion.returnTime;
        this.tripDestination = excursion.tripDestination;
        this.tripDescription = excursion.tripDescription;
        this.price = excursion.price;
    }

    /**
     * Getter miejsca docelowego podrozy
     * 
     * @return zwraca miejsce docelowe
     */
    public String gettripDestination() {
        return tripDestination;
    }

    /**
     * Getter czasu powrotu
     * 
     * @return zwraca czas powrotu
     */
    public Time getreturnTime() {
        return returnTime;
    }

    /**
     * Getter czasu wyjazdu
     * 
     * @return zwraca czas wyjazdu
     */
    public Time getdepartureTime() {
        return departureTime;
    }

    /**
     * Getter daty powrotu
     * 
     * @return zwraca date powrotu
     */
    public Date getreturnDate() {
        return returnDate;
    }

    /**
     * Getter daty wyjazdu
     * 
     * @return zwraca date wyjazdu
     */
    public Date getdepartureDate() {
        return departureDate;
    }

    /**
     * Getter ilosci miejsc jaka moze zostac zapelniona
     * 
     * @return zwraca ilosc miejsc
     */
    public int getnumberOfPlaces() {
        return numberOfPlaces;
    }

    /**
     * Getter opisu danej wycieczki
     * 
     * @return zwraca opis wycieczki
     */
    public String gettripDescription() {
        return tripDescription;
    }

    /**
     * Getter ceny za konkretny wyjad
     * 
     * @return zwraca cene wycieczki
     */
    public double getprice() {
        return price;
    };
}
