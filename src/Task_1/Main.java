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

package Task_1;

import java.util.ArrayList;

//1.e
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        //1.e - Instances on one line:
        customerList.add(new Customer("David", "Bowie", "Ziggy Stardust"));
        customerList.add(new Customer("David Robert", "Jones", "Major Tom"));
        customerList.add(new Customer("David", "Jones", "The Thin White Duke"));

        /*1.e - Alternative solution: Set up the instances and add them to the list
        Customer customerOne = new Customer("David", "Bowie", "Ziggy Stardust");
        Customer customerTwo = new Customer("David Robert", "Jones", "Major Tom");
        Customer customerThree = new Customer("David", "Jones", "The Thin White Duke");
        customerList.add(customerOne);
        customerList.add(customerTwo);
        customerList.add(customerThree);
        */

        printCustomers(customerList);
    }

    public static void printCustomers(ArrayList<Customer> customerList) {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

}