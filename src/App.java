import java.util.Random;

public class App {
        public static void main(String[] args) throws Exception {
                // Tablica dynamiczna excursions
                Excursion[] excursions = new Excursion[0];
                excursions = (Excursion[]) Structure.extendArray(excursions,
                                new Excursion(new Date(7, 12, 2023), new Date(14, 12, 2023),
                                                new Time(7, 40, 27), new Time(18, 55, 42), "Zakopane",
                                                "Wycieczka w góry",
                                                2500.5, 80));
                excursions = (Excursion[]) Structure.extendArray(excursions,
                                new Excursion(new Date(9, 11, 2023), new Date(11, 12, 2023),
                                                new Time(7, 40, 27), new Time(18, 55, 42), "Warszawa",
                                                "Zwiedzanie palacu kultury",
                                                2000, 40));
                excursions = (Excursion[]) Structure.extendArray(excursions,
                                new Excursion(new Date(5, 6, 2024), new Date(14, 6, 2024),
                                                new Time(7, 40, 27), new Time(18, 55, 42), "Oswiecim",
                                                "Ogladanie Auschwitz Birkenau",
                                                1500, 30));
                excursions = (Excursion[]) Structure.extendArray(excursions,
                                new Excursion(new Date(9, 7, 2025), new Date(10, 8, 2024),
                                                new Time(7, 40, 27), new Time(18, 55, 42), "Kreta",
                                                "Wczasy w Grecji",
                                                4500, 240));
                excursions = (Excursion[]) Structure.extendArray(excursions,
                                new Excursion(new Date(6, 11, 2024), new Date(14, 11, 2024),
                                                new Time(7, 40, 27), new Time(18, 55, 42), "Czarnobyl",
                                                "Urbex elektrowni atomowej",
                                                2800, 10));
                excursions = (Excursion[]) Structure.extendArray(excursions,
                                new Excursion(new Date(7, 12, 2025), new Date(14, 12, 2025),
                                                new Time(7, 40, 27), new Time(18, 55, 42), "Dubaj",
                                                "Luksusowe wakacje w Emiratach",
                                                18500, 50));
                excursions = (Excursion[]) Structure.extendArray(excursions,
                                new Excursion(new Date(7, 12, 2025), new Date(14, 12, 2025),
                                                new Time(7, 40, 27), new Time(18, 55, 42), "Los Angeles",
                                                "Imprezowa wycieczka w Stanach",
                                                16500, 90));

                // Tablica dynamiczna clients
                Client[] clients = new Client[0];
                clients = (Client[]) Structure.extendArray(clients,
                                new Client("Mateusz", "Bozek", "Monte-Casino 30/15", 18));
                clients = (Client[]) Structure.extendArray(clients,
                                new Client("Hubert", "Lech", "Warszawska 10", 17));
                clients = (Client[]) Structure.extendArray(clients,
                                new Client("Michał", "Mastalerz", "Finskie domki 33", 17));
                clients = (Client[]) Structure.extendArray(clients,
                                new Client("Mateusz", "Miedzinski", "Trauguta 3", 17));
                clients = (Client[]) Structure.extendArray(clients,
                                new Client("Kamil", "Korczyk", "Koszalinska 43", 17));
                clients = (Client[]) Structure.extendArray(clients,
                                new Client("Kacper", "Kmiecik", "Kopalniana 22", 17));
                clients = (Client[]) Structure.extendArray(clients,
                                new Client("Pawel", "Ociepka", "Bialostocka 22/44", 17));
                clients = (Client[]) Structure.extendArray(clients,
                                new Client("Alan", "Dostal", "Mari Konopnickiej 39", 17));
                clients = (Client[]) Structure.extendArray(clients,
                                new Client("Mateusz", "Juskowiak", "11 listopada 15/45", 17));
                clients = (Client[]) Structure.extendArray(clients,
                                new Client("Dawid", "Chwist", "Lubelska 15", 17));

                // Tablica dynoamiczna pruchasedTours
                Random random = new Random();
                PurchasedTour[] pruchasedTours = { new PurchasedTour(clients[0], excursions[0],
                                new Date(random.nextInt(1, 28), random.nextInt(1, 12),
                                                random.nextInt(2022, 2023)),
                                random.nextInt(1, 100)) };

                for (int i = 0; i < 19; i++) {
                        int losowyKlient = random.nextInt(0, clients.length - 1);
                        int losowaWycieczka = random.nextInt(0, excursions.length - 1);

                        pruchasedTours = (PurchasedTour[]) Structure.extendArray(pruchasedTours,
                                        new PurchasedTour(clients[losowyKlient], excursions[losowaWycieczka],
                                                        new Date(random.nextInt(1, 28), random.nextInt(1, 12),
                                                                        random.nextInt(2022, 2023)),
                                                        random.nextInt(1, 100)));
                }

                Raport.generateReports(pruchasedTours, excursions, clients);
        }
}
