public class PurchasedTour {
    private Date purchaseDate;
    private Client client;
    private Excursion excursion;

    private int transportFilling;
    private double price;

    /**
     * Metoda obliczajaca finalna cene wycieczki po zastosowanych rabatach
     */
    private void calculatePrice() {
        if (purchaseDate != null) {
            int daysBeetwenExcursion = Date.calculateDateDifference(this.excursion.getdepartureDate(),
                    this.purchaseDate);

            if (daysBeetwenExcursion <= 30) {
                this.price = excursion.getprice() - (excursion.getprice() * 0.1);
            } else {
                this.price = excursion.getprice();
            }
        }
    }

    /**
     * Konstruktor parametrowy klasy PurchasedTour
     * 
     * @param client           klient biura podrozy ktory zakupil wycieczke
     * @param excursion        wycieczka zakupiona przez klienta
     * @param purchaseDate     data zakupu konkretnej wycieczki
     * @param transportFilling zapelnienie transportu w zakupionej wycieczce
     */
    public PurchasedTour(Client client, Excursion excursion, Date purchaseDate,
            int transportFilling) {
        this.purchaseDate = purchaseDate;
        this.client = client;
        this.excursion = excursion;
        this.transportFilling = transportFilling;
        calculatePrice();
    }

    /**
     * Konstruktor kopiujacy klasy PurchasedTour
     * 
     * @param purchasedTour obiekt zakupionej wycieczki uzywany w konstruktorze
     *                      kopiujacym
     */
    public PurchasedTour(PurchasedTour purchasedTour) {
        this.purchaseDate = purchasedTour.purchaseDate;
        this.client = purchasedTour.client;
        this.excursion = purchasedTour.excursion;
        this.transportFilling = purchasedTour.transportFilling;
        calculatePrice();
    }

    /**
     * Getter ceny wycieczki
     * 
     * @return zwraca cene zakupionej wycieczki
     */
    public double getprice() {
        return price;
    }

    /**
     * Getter daty zakupu wycieczki
     * 
     * @return zwraca date zakupu
     */
    public Date getpurchaseDate() {
        return purchaseDate;
    }

    /**
     * Getter klienta ktory zakupil wycieczke
     * 
     * @return zwraca klienta danej wycieczki
     */
    public Client getclient() {
        return client;
    }

    /**
     * Getter wycieczki ktora zostala wybrana przez klienta
     * 
     * @return zwraca wycieczka jaka zostala zakupiona
     */
    public Excursion getexcursion() {
        return excursion;
    }

    /**
     * Getter zapelnienia srodka transportu w pojezdzie transportowym do wyjazdu
     * 
     * @return zwraca zapelnienie srodka transportu
     */
    public int gettransportFilling() {
        return transportFilling;
    }
}
