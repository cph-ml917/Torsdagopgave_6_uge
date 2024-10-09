package Task_1;

//----------Task 1: ArrayList og objekter----------//

/*
1.a Lav en klasse, Customer, med attributterne (felterne/instansvariablene):
String firstName
String lastName
String username
int id
static int counter

1.b Klassen skal have en konstruktør, der tager kundens navn og brugernavn som parametre.

1.c Sørg for at counter tælles op med 1, hver gang konstruktoren bliver kaldt. Brug counter til at initialisere id

1.d Giv klassen en toString() metode, der printer kundens detaljer pænt ud. Gør alle klassens felter private, og tilføj getters og setters.

1.e Skriv en Main klasse med en main-metode, hvor der oprettes en ArrayList, som du kalder 'customers'.
(Du kan oprette instanserne først, og så add'e dem til listen. Du kan også instantiere og add'e i samme linie.)

1.f Skriv en static metode i Main kaldet printCustomers(ArrayList customers), hvor du printer alle kunderne ud ved at gennemløbe customers med et for each loop. Test metoden fra main ved at kalde den med din ArrayList som argument.
* */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}