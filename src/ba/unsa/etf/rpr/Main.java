package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {
	/*
	1. Klasu ili interfejs Osoba iz koje su izvedene klase ili interfejsi Student i Nastavnik. Iz Student su
izvedene klase BachelorStudent i MasterStudent, a iz Nastavnik klase Docent, VanredniProfesor i
RedovniProfesor.
2. Sve nabrojane klase sadrže (nasljeđuju) atribut imePrezime (jedan string), standardne settere i
gettere za ovaj atribut te konstruktor koji prima string imePrezime.
3. Sve klase se trebaju moći ispisati na ekran koristeći System.out.println, npr. ovako:
Student s = new BachelorStudent("Sara Sarac");
System.out.println(s);
4. Ispis na ekran u slučaju odgovarajućih klasa treba izgledati ovako:
Za BachelorStudent: "Bachelor student Sara Sarac (12345), prosjek ocjena: 8.7"
Za MasterStudent: "Master student Sara Sarac (12345), prosjek ocjena: 8.7"
Za Docent: "Doc. dr Sara Sarac"
Za VanredniProfesor: "V. prof. dr Sara Sarac"
Za RedovniProfesor: "R. prof. dr Sara Sarac"
Prosjek ocjena mora biti zaokružen na jednu decimalu.
5. Broj 12345 u zagradi je broj indeksa. Sve klase izvedene iz Student trebaju imati privatni atribut
brojIndeksa tipa String, te odgovarajući getter i setter. Default vrijednost indeksa je prazan string “”.
6. Klasa Student treba imati privatni atribut ocjene koji je dat kao običan niz (a ne lista ili nešto slično!)
tipa int sa fiksno 100 elemenata. Kod rješenja koja budu koristila nešto što nije niz, odgovarajući
testovi neće biti priznati.
7. Također treba imati metodu dodajOcjenu tipa void koja dodaje jednu ocjenu u niz ocjena. Ako
ocjena nije na intervalu [5,10] treba baciti izuzetak tipa IlegalnaOcjena sa tekstom poruke "Ilegalna
ocjena 3" (gdje se umjesto broja 3 treba nalaziti ocjena koja je poslana metodi). U slučaju da se
prekorači kapacitet niza treba baciti izuzetak tipa IllegalArgumentException sa tekstom poruke
"Dosegnut maksimalan broj ocjena".
8. Konačno ove klase trebaju imati i metodu prosjek koja vraća vrijednost tipa double koja predstavlja
srednju vrijednost dodatih ocjena, ili broj 0 ako nije dodata niti jedna ocjena.
9. U klasi MasterStudent treba se nalaziti drugi niz koji predstavlja ocjene na drugom ciklusu studija,
kao i metode dodajOcjenuMaster koja dodaje ocjenu u taj niz, i prosjekMaster koja vraća prosjek
ocjena na drugom ciklusu. Metoda prosjek klase MasterStudent treba vraćati prosjek ocjena za oba
ciklusa zajedno (posmatrajući ta dva niza kao jedan).
10. Program treba sadržavati i klasu Fakultet koja kao privatni atribut ima neku kolekciju osoba. Treba
posjedovati metodu dodajOsobu koja stavlja novu osobu u tu kolekciju. Ako se fakultet proba ispisati
na ekran metodom System.out.println, treba ispisati sve osobe koje su dodane u fakultet, svaku u
zasebnom redu, onim redom kojim su dodavane.
11. Klasa Fakultet treba imati metodu studenti koja vraća skup (Set) studenata koji sadrži sve studente
na fakultetu, sortirane po prosječnoj ocjeni od veće ka manjoj. Skup treba biti tipa Student a ne tipa
Osoba!
12. Dalje, treba imati metodu filtriraj koja prima lambda funkciju koja prima osobu a vraća boolean
vrijednost. Metoda filtriraj vraća listu (List) svih osoba za koje je lambda funkcija vratila true.
13. Treba imati i metodu topBachelor koja vraća listu svih BachelorStudenata koji imaju prosjek veći
ili jednak 8. Metoda treba vraćati listu BachelorStudenata, a ne listu Osoba! Treba imati dvije linije
koda, od čega je jedna poziv metode filtriraj. Za metode implementirane na neki drugi način neće biti
priznati odgovarajući testovi.
14. Klase MasterStudent i Docent (ali ne i ostale klase!) trebaju imati metodu rodjendan koja prima
datumRodjenja (LocalDate) a vraća string "Sretan rođendan!" ako na datum izvršavanja programa
pada rođendan osobe, u suprotnom vraća prazan string "".
15. Pored toga klasa Fakultet treba imati metodu mladi koja vraća List<Mladi> koja sadrži samo
osobe koje ispunjavaju prethodni uslov.
	 */
    }
}
