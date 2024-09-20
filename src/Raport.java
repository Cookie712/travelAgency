import java.util.HashMap;
import java.util.Map;

public abstract class Raport {
    /**
     * Generuje raporty na podstawie klientow oraz wycieczek
     * 
     * @param purchasedTours zakupione wycieczki przez klientow
     * @param excursions     wszystkie dostepne wycieczki w ofercie
     * @param clients        klienci biura podrozy
     */
    public static void generateReports(PurchasedTour[] purchasedTours, Excursion[] excursions, Client[] clients) {
        sumOfTrips(purchasedTours);
        infoAboutTrips(excursions);
        reportIndividualClients(clients, purchasedTours);
        sortTrips(purchasedTours);
    }

    /**
     * Raport: Suma wszystkich zakupionych wycieczek
     * 
     * @param purchasedTours tablica przechowywujaca zakupione wycieczki przez
     *                       klientow
     */
    private static void sumOfTrips(PurchasedTour[] purchasedTours) {
        double totalSales = 0;
        for (PurchasedTour tour : purchasedTours) {
            totalSales += tour.getprice();
        }
        System.out.println("Raport: Suma wszystkich zakupionych wycieczek: " + totalSales);
    }

    /**
     * Raport: Informacje o poszczególnych wycieczkach
     * 
     * @param excursions tablica z dostepnymi wycieczkami w ofercie
     */
    private static void infoAboutTrips(Excursion[] excursions) {
        for (Excursion excursion : excursions) {
            System.out.println("Raport: Informacje o wycieczce - " + excursion.gettripDestination());
            System.out.println("Data wylotu: " + excursion.getdepartureDate().getday() + "/"
                    + excursion.getdepartureDate().getmonth() + "/" + excursion.getdepartureDate().getyear());
            System.out.println("Cena: " + excursion.getprice());
        }
    }

    /**
     * Raport: Raport według klientów - wszystkie wycieczki dla danego klienta
     * Raport: Klient z największą zapłaconą kwotą
     * 
     * @param clients        tablica z klientami biura podrozy
     * @param purchasedTours tablica przechowywujaca zakupione wycieczki przez
     *                       klientow
     */
    private static void reportIndividualClients(Client[] clients, PurchasedTour[] purchasedTours) {
        Map<Client, Double> clientTotalSpending = new HashMap<>();
        for (PurchasedTour tour : purchasedTours) {
            Client client = tour.getclient();
            double spending = tour.getprice();
            clientTotalSpending.put(client, clientTotalSpending.getOrDefault(client, 0.0) + spending);
        }
        for (Client client : clientTotalSpending.keySet()) {
            System.out.println("Raport dla klienta " + client.getname() + " " + client.getsurname() + ":");
            System.out.println("Wszystkie wycieczki: " + clientTotalSpending.get(client));
        }

        Client topSpendingClient = null;
        double topSpendingAmount = 0;
        for (Map.Entry<Client, Double> entry : clientTotalSpending.entrySet()) {
            if (entry.getValue() > topSpendingAmount) {
                topSpendingAmount = entry.getValue();
                topSpendingClient = entry.getKey();
            }
        }
        System.out.println("Raport: Klient z największą zapłaconą kwotą: " + topSpendingClient.getname() + " "
                + topSpendingClient.getsurname());
    }

    /**
     * Raport: Wycieczki posortowane według obrotów (suma wszystkich wycieczek
     * dla danego dnia)
     * 
     * @param purchasedTours tablica z zakupionymi wycieczkami przez klientow
     */
    private static void sortTrips(PurchasedTour[] purchasedTours) {
        Map<Date, Double> dailySales = new HashMap<>();
        for (PurchasedTour tour : purchasedTours) {
            Date purchaseDate = tour.getpurchaseDate();
            double purchaseAmount = tour.getprice();
            dailySales.put(purchaseDate, dailySales.getOrDefault(purchaseDate, 0.0) + purchaseAmount);
        }
        System.out.println("Raport: Wycieczki posortowane według obrotów:");
        dailySales.entrySet().stream()
                .sorted(Map.Entry.<Date, Double>comparingByValue().reversed())
                .forEach(entry -> {
                    System.out.println("Data: " + entry.getKey().getday() + "/" + entry.getKey().getmonth() + "/"
                            + entry.getKey().getyear());
                    System.out.println("Suma obrotów: " + entry.getValue());
                    System.out.println();
                });
    }
}
