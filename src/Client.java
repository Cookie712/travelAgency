public class Client {
    private String name;
    private String surname;
    private String adress;

    private int age;

    /**
     * Konstruktor parametrowy klasy Client
     * 
     * @param name    imie klienta
     * @param surname nazwisko klienta
     * @param adress  adres zamieszkania
     * @param age     wiek klienta biura podrozy
     */
    public Client(String name, String surname, String adress, int age) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.age = age;
    }

    /**
     * Konstruktor kopiujacy klasy Client
     * 
     * @param client obiekt klienta uzywany w konstruktorze kopiujacym
     */
    public Client(Client client) {
        this.name = client.name;
        this.surname = client.surname;
        this.adress = client.adress;
        this.age = client.age;
    }

    /**
     * Getter imienia klienta
     * 
     * @return zwraca imie klienta
     */
    public String getname() {
        return name;
    }

    /**
     * Getter adresu zamieszkania
     * 
     * @return zwraca adres zamieszkania
     */
    public String getadress() {
        return adress;
    }

    /**
     * Getter nazwiska klienta
     * 
     * @return zwraca nazwisko klienta
     */
    public String getsurname() {
        return surname;
    }

    /**
     * Getter wieku klienta biura podrozy
     * 
     * @return zwraca wiek klienta biura podrozy
     */
    public int getage() {
        return age;
    }
}
