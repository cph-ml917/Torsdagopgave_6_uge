package Task_1;

//1.a
public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter = 1;

    //1.b + 1.c
    Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = counter++;
    }

    //1.d
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName() {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String s =  "Customer ID: " + id + "\n" +
                "Name: " + this.firstName + " " + this.lastName + "\n" +
                "Username: " + this.userName + "\n";
        return s;
    }

}





