
//import java.util.Scanner;
//
//public  class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("podaj liczbe (a): ");
//        int a = scanner.nextInt();
//        System.out.print("podaj liczbe (b): ");
//        int b = scanner.nextInt();
//
//        while (a != b){
//            if (a>b){
//                a = a - b;
//            }else {
//                b = b - a;
//            }
//        }
//        System.out.println("NSD = " + a);
//        scanner.close();
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//
//    public static int gcd(int a, int b) {
//        while (a != b) {
//            if (a > b) {
//                a = a - b;
//            } else {
//                b = b - a;
//            }
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj liczbę: ");
//        int a = scanner.nextInt();
//
//        System.out.print("Podaj liczbę: ");
//        int b = scanner.nextInt();
//
//        if (a <= 0 || b <= 0) {
//            System.out.println("Błąd: Liczby muszą być większe od zera.");
//        } else {
//            int result = gcd(a, b);
//            System.out.println("Największy wspólny dzielnik: " + result);
//        }
//
//        scanner.close();
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String login = "admin";
//        String haslo = "12345";
//
//        boolean programAktywny = true;
//
//        while (programAktywny) {
//            int proby = 3;
//            boolean zalogowany = false;
//
//            System.out.println("=== Logowanie do systemu ===");
//
//            while (proby > 0 && !zalogowany) {
//                System.out.print("Podaj login: ");
//                String loginInput = scanner.nextLine();
//
//                System.out.print("Podaj hasło: ");
//                String hasloInput = scanner.nextLine();
//
//                if (loginInput.equals(login) && hasloInput.equals(haslo)) {
//                    System.out.println("Logowanie udane: " + login + "!");
//                    zalogowany = true;
//                } else {
//                    proby--;
//                    if (proby > 0) {
//                        System.out.println("Błędne dane, pozostało prób: " + proby);
//                    } else {
//                        System.out.println("Zbyt wiele nieudanych prób logowania. Dostęp zablokowany.");
//                        programAktywny = false;
//                    }
//                }
//            }
//
//            while (zalogowany) {
//                System.out.println("\n== Menu ==");
//                System.out.println("1. Zmień hasło");
//                System.out.println("2. Wyloguj");
//                System.out.println("3. Wyjdź z programu");
//                System.out.print("Wybierz opcję: ");
//                String wybor = scanner.nextLine();
//
//                switch (wybor) {
//                    case "1":
//                        System.out.print("Podaj nowe hasło: ");
//                        haslo = scanner.nextLine();
//                        System.out.println("Hasło zostało zmienione.");
//                        break;
//                    case "2":
//                        zalogowany = false;
//                        System.out.println("Wylogowano.");
//                        break;
//                    case "3":
//                        zalogowany = false;
//                        programAktywny = false;
//                        System.out.println("Zamykanie programu...");
//                        break;
//                    default:
//                        System.out.println("Nieprawidłowy wybór.");
//                        break;
//                }
//            }
//        }
//
//        scanner.close();
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("podaj liczbe 1: ");
//        double a = sc.nextDouble();
//
//        System.out.print("podaj operacje(+,-,*,/): ");
//        char op = sc.next().charAt(0);
//
//        System.out.print("podaj liczbe 2: ");
//        double b = sc.nextDouble();
//
//        double result;
//
//        switch (op) {
//            case '+' :
//                result = a + b;
//                System.out.println("result" + result);
//                break;
//            case '-' :
//                result = a - b;
//                System.out.println("result" + result);
//                break;
//            case '*' :
//                result = a * b;
//                System.out.println("result" + result);
//                break;
//            case '/' :
//                result = a / b;
//                System.out.println("result" + result);
//                break;
//        }
//        sc.close();
//    }
//}



//import java.util.*;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        Map<String, String> users = new HashMap<>();
//        users.put("admin","1234");
//        users.put("user1","4321");
//        users.put("user","1020");
//
//        int attempts = 0;
//        boolean loggedIn = false;
//
//        while (attempts < 3 && !loggedIn) {
//            System.out.print("Podaj login: ");
//            String login = scanner.nextLine();
//
//            System.out.print("Podaj haslo: ");
//            String haslo = scanner.nextLine();
//
//            if (users.containsKey(login) && users.get(login).equals(haslo)) {
//                System.out.print("logogwanie udane! Witam," + login + "!");
//            }else {
//                System.out.print("Blond !!!: ");
//            }
//        }
//        if (!loggedIn) {
//            System.out.print("Blend sprawdz czy jezt prawidlowo wpisane haslo lub login");
//        }
//        scanner.close();
//    }
//}

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        int wylosowana = random.nextInt(100) +1;
//        int proby = 5;
//        boolean zgadl = false;
//
//        for (int i = 1; i <= proby; i++) {
//            System.out.print("Proba" + i + ":");
//            int liczba = scanner.nextInt();
//
//            if (liczba == wylosowana) {
//                System.out.print("Brawo! zagdles liczbe!");
//                zgadl = true;
//                break;
//            }else if (liczba > wylosowana) {
//                System.out.println("za duza liczba!");
//            }else {
//                System.out.println("Za mala liczba!");
//            }
//        }
//        if (!zgadl) {
//            System.out.println("Nie udalo sie!( Wylosowana liczba to: " + wylosowana);
//        }
//        scanner.close();
//    }
//}

//import java.util.*;
//
//public class Main {
//    private static Map<String, String> users = new HashMap<>();
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        boolean running = true;
//
//        System.out.println("=== Prosty system rejestracji i logowania ===");
//
//        while (running) {
//            System.out.println("\nWybierz opcję:");
//            System.out.println("1. Zarejestruj konto");
//            System.out.println("2. Zaloguj się");
//            System.out.println("3. Wyjdź z programu");
//            System.out.print("Wybór: ");
//
//            String choice = scanner.nextLine().trim();
//
//            switch (choice) {
//                case "1":
//                    register();
//                    break;
//                case "2":
//                    login();
//                    break;
//                case "3":
//                    System.out.println("Zamykanie programu...");
//                    running = false;
//                    break;
//                default:
//                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
//                    break;
//            }
//        }
//    }
//
//    private static void register() {
//        System.out.print("Podaj nazwę użytkownika: ");
//        String username = scanner.nextLine().trim();
//
//        if (users.containsKey(username)) {
//            System.out.println("Użytkownik o takiej nazwie już istnieje.");
//            return;
//        }
//
//        System.out.print("Podaj hasło: ");
//        String password = scanner.nextLine();
//
//        users.put(username, password);
//        System.out.println("Rejestracja zakończona sukcesem!");
//    }
//
//    private static void login() {
//        System.out.print("Podaj nazwę użytkownika: ");
//        String username = scanner.nextLine().trim();
//
//        if (!users.containsKey(username)) {
//            System.out.println("Nie znaleziono użytkownika.");
//            return;
//        }
//
//        System.out.print("Podaj hasło: ");
//        String password = scanner.nextLine();
//
//        if (users.get(username).equals(password)) {
//            System.out.println("Zalogowano pomyślnie! Witaj, " + username + "!");
//        } else {
//            System.out.println("Nieprawidłowe hasło.");
//        }
//    }
//}

//import java.util.*;
//class Uzytkownik {
//    String login;
//    String haslo;
//    String rola;
//
//    Uzytkownik(String login, String haslo, String rola) {
//        this.login = login;
//        this.haslo = haslo;
//        this.rola = rola;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Uzytkownik[] users = {
//                new Uzytkownik("admin", "admin1234", "admin"),
//                new Uzytkownik("annia", "annia1234", "user"),
//                new Uzytkownik("roma", "roma1234", "user")
//        };
//
//        System.out.println("===Logowanie do systemy===");
//
//        System.out.println("Login: ");
//        String login = sc.nextLine();
//
//        System.out.println("haslo: ");
//        String haslo = sc.nextLine();
//
//        boolean zalogowano = false;
//
//        for(Uzytkownik u : users) {
//            if (u.login.equals(login) && u.equals(haslo)) {
//                System.out.println("Zalogowano jako: " +u.rola);
//                zalogowano = true;
//                break;
//            }
//        }
//        if (!zalogowano) {
//            System.out.println("Blendne logowanie");
//        }
//        sc.close();
//    }
//}

//import java.util.*;
//
//class Uczen {
//    String imie;
//    String nazwisko;
//    double ocena;
//
//    Uczen(String imie, String nazwisko, double ocena) {
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//        this.ocena = ocena;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Uczen[] uczniowie = {
//                new Uczen("Ruwim", "Barboskin", 4.5),
//                new Uczen("Wład", "Os", 5.5),
//                new Uczen("Jarik", "Narik", 6.3)
//        };
//
//        int wybor;
//        do {
//            System.out.println("\n==== System oceny uczniów ====");
//            System.out.println("1. Wyświetl wszystkich uczniów");
//            System.out.println("2. Znajdź ucznia po nazwisku");
//            System.out.println("3. Zmień ocenę ucznia");
//            System.out.println("4. Zakończ program");
//            System.out.print("Wybierz opcję: ");
//
//            wybor = sc.nextInt();
//            sc.nextLine();
//
//            switch (wybor) {
//                case 1:
//                    System.out.println("\nLista uczniów:");
//                    for (Uczen u : uczniowie) {
//                        System.out.println(u.imie + " " + u.nazwisko + " - Ocena: " + u.ocena);
//                    }
//                    break;
//
//                case 2:
//                    System.out.print("Podaj nazwisko ucznia: ");
//                    String nazwiskoSzukane = sc.nextLine();
//                    boolean znaleziono = false;
//                    for (Uczen u : uczniowie) {
//                        if (u.nazwisko.equalsIgnoreCase(nazwiskoSzukane)) {
//                            System.out.println("Znaleziono: " + u.imie + " " + u.nazwisko + " - Ocena: " + u.ocena);
//                            znaleziono = true;
//                            break;
//                        }
//                    }
//                    if (!znaleziono) {
//                        System.out.println("Uczeń o takim nazwisku nie istnieje.");
//                    }
//                    break;
//
//                case 3:
//                    System.out.print("Podaj nazwisko ucznia do zmiany oceny: ");
//                    String nazwiskoDoZmiany = sc.nextLine();
//                    boolean zmieniono = false;
//                    for (Uczen u : uczniowie) {
//                        if (u.nazwisko.equalsIgnoreCase(nazwiskoDoZmiany)) {
//                            System.out.print("Podaj nową ocenę: ");
//                            double nowaOcena = sc.nextDouble();
//                            u.ocena = nowaOcena;
//                            System.out.println("Ocena została zaktualizowana.");
//                            zmieniono = true;
//                            break;
//                        }
//                    }
//                    if (!zmieniono) {
//                        System.out.println("Nie znaleziono ucznia o podanym nazwisku.");
//                    }
//                    sc.nextLine();
//                    break;
//
//                case 4:
//                    System.out.println("Zamykanie programu...");
//                    break;
//
//                default:
//                    System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
//            }
//        } while (wybor != 4);
//
//        sc.close();
//    }
//}

//import java.util.*;
//
//class Biblioteka {
//    String ksiazka;
//    String autor;
//    String info;
//    boolean wypozyczona;
//
//    Biblioteka(String ksiazka, String autor, String info, boolean wypozyczona) {
//        this.ksiazka = ksiazka;
//        this.autor = autor;
//        this.info = info;
//        this.wypozyczona = wypozyczona;
//    }
//
//    void wyswietl() {
//        System.out.println("Tytuł: " + ksiazka + ", Autor: " + autor + ", Info: " + info +
//                ", Wypożyczona: " + (wypozyczona ? "Tak" : "Nie"));
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Biblioteka[] ksiazki = {
//                new Biblioteka("Czarne życie", "Adam Kowalski", "Thriller", false),
//                new Biblioteka("Władca Czasu", "Olga Nowak", "Fantasy", true),
//                new Biblioteka("Jarik", "Narik Bor", "Sci-Fi", false)
//        };
//
//        int wybor;
//        do {
//            System.out.println("\n==== System biblioteczny ====");
//            System.out.println("1. Wyświetl wszystkie książki");
//            System.out.println("2. Wyszukaj książkę po tytule");
//            System.out.println("3. Zmień status wypożyczenia książki");
//            System.out.println("4. Zakończ program");
//            System.out.print("Wybierz opcję: ");
//
//            wybor = sc.nextInt();
//            sc.nextLine();  // czyść bufor
//
//            switch (wybor) {
//                case 1:
//                    for (Biblioteka k : ksiazki) {
//                        k.wyswietl();
//                    }
//                    break;
//
//                case 2:
//                    System.out.print("Podaj tytuł książki: ");
//                    String szukanyTytul = sc.nextLine();
//                    boolean znaleziono = false;
//                    for (Biblioteka k : ksiazki) {
//                        if (k.ksiazka.equalsIgnoreCase(szukanyTytul)) {
//                            k.wyswietl();
//                            znaleziono = true;
//                        }
//                    }
//                    if (!znaleziono) {
//                        System.out.println("Nie znaleziono książki.");
//                    }
//                    break;
//
//                case 3:
//                    System.out.print("Podaj tytuł książki do zmiany statusu: ");
//                    String tytulDoZmiany = sc.nextLine();
//                    boolean zmieniono = false;
//                    for (Biblioteka k : ksiazki) {
//                        if (k.ksiazka.equalsIgnoreCase(tytulDoZmiany)) {
//                            k.wypozyczona = !k.wypozyczona;
//                            System.out.println("Zmieniono status wypożyczenia.");
//                            zmieniono = true;
//                        }
//                    }
//                    if (!zmieniono) {
//                        System.out.println("Nie znaleziono książki.");
//                    }
//                    break;
//
//                case 4:
//                    System.out.println("Zamykanie programu...");
//                    break;
//
//                default:
//                    System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
//            }
//        } while (wybor != 4);
//
//        sc.close();
//    }
//}

import java.util.*;

class Sklep {
    String produkt;
    int ilosc;
    double cena;

    Sklep(String produkt, int ilosc, double cena) {
        this.produkt = produkt;
        this.ilosc = ilosc;
        this.cena = cena;
    }

    public String toString() {
        return produkt + " - " + cena + " zł, sztuk: " + ilosc;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sklep> produkty = new ArrayList<>();

        int wybor;

        do {
            System.out.println("\n====== SKLEP KOMPUTEROWY ======");
            System.out.println("1. Wyświetl produkty");
            System.out.println("2. Kup produkt");
            System.out.println("3. Dodaj nowy produkt");
            System.out.println("4. Zakończ");
            System.out.print("Wybierz opcję: ");
            wybor = scanner.nextInt();
            scanner.nextLine();

            switch (wybor) {
                case 1:
                    System.out.println("\n--- Lista produktów ---");
                    if (produkty.isEmpty()) {
                        System.out.println("Brak produktów.");
                    } else {
                        for (int i = 0; i < produkty.size(); i++) {
                            System.out.println((i + 1) + ". " + produkty.get(i));
                        }
                    }
                    break;

                case 2:
                    if (produkty.isEmpty()) {
                        System.out.println("Brak produktów do kupienia.");
                        break;
                    }
                    System.out.println("\nPodaj numer produktu do zakupu:");
                    for (int i = 0; i < produkty.size(); i++) {
                        System.out.println((i + 1) + ". " + produkty.get(i));
                    }
                    int nr = scanner.nextInt();
                    scanner.nextLine();
                    if (nr < 1 || nr > produkty.size()) {
                        System.out.println("Nieprawidłowy numer.");
                    } else {
                        Sklep produkt = produkty.get(nr - 1);
                        if (produkt.ilosc > 0) {
                            produkt.ilosc--;
                            System.out.println("Kupiono: " + produkt.produkt);
                        } else {
                            System.out.println("Brak na stanie.");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nazwa produktu: ");
                    String nazwa = scanner.nextLine();
                    System.out.print("Cena: ");
                    double cena = scanner.nextDouble();
                    System.out.print("Ilość: ");
                    int ilosc = scanner.nextInt();
                    scanner.nextLine();
                    produkty.add(new Sklep(nazwa, ilosc, cena));
                    System.out.println("Produkt dodany.");
                    break;

                case 4:
                    System.out.println("Zakończono program.");
                    break;

                default:
                    System.out.println("Nieprawidłowa opcja.");
            }
        } while (wybor != 4);

        scanner.close();
    }
}





