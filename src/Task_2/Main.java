//----------Task 2: Load coffee menu for a cafe----------//
/*
In this program we will load a list of coffee names and display it to the user. We will create a Cafe class which loads the list and a Main class which tests that the Cafe class is working as expected.

2.a In this repository you will find a file called coffees.txt. Open it and check that is contains 5 names for types of coffee. Download it or copy the text to a new text file and save it with the same name coffee.txt. Remember to save it in the root of your project and not in the src folder with the .java files.

2.b Create a class called Main with a main-method.

2.c Create another class called Cafe. Give it an attribute called coffeeMenu of type ArrayList<String> (later you will fill this ArrayList with the names of the coffees from the textfile). Make the attribute private and write a getter-method that returns the list.

2.c In the Cafe class add a method loadMenuData(). In the method make a File-object representing the coffees.txt file like this:

File file = new File("coffees.txt")

(make sure that the path is right)
2.d In this step you will read from the file, using a Scanner object: Add the File instance to a new Scanner object. (This piece of code will need to be wrapped in a try -catch block)

The solution to this step is given below, but give it a go before peeping.
Sneak peek:
try {
          File file = new File("coffees.txt");
          Scanner scan = new Scanner(file);
        } catch(FileNotFoundException e){
          System.out.println("File not found. Check path and filename");
        }
2.e Inside the try block from the last step, you will now add this piece of code that loops over the lines of the textfile:

Use a while loop with the hasNextLine() and nextLine() -methods called on the Scanner instance, to loop over the lines of the file and add the lines to the coffees ArrayList in this class.
Sneak peek:
while(scan.hasNextLine()){
  coffeeMenu.add(scan.nextLine());
}

2.g In the main-method create a new instance of the Cafe class and call it's loadMenuData() -method.

2.h Still in the main-method, print all the elements in the list coffeeMenu from the Cafe instance you just created.

Hint: Use the getter-method from the Cafe class to retrieve the list of coffees. Then use a for loop to iterate through the list and and print the names of the coffees one by one.
*/

package Task_2;

//2.a + 2.b
public class Main {
    public static void main(String[] args) {
        //2.g
        Cafe myCafe = new Cafe();
        myCafe.loadMenuData();
        //2.h
        System.out.println(myCafe);
    }



}