//----------Task 2: Load coffee menu for a cafe----------//
/*
In this program we will load a list of coffee names and display it to the user. We will create a <code>Cafe</code> class which loads the list and a <code>Main</code> class which tests that the <code>Cafe</code> class is working as expected.

2.a In this repository you will find a file called coffees.txt. Open it and check that is contains 5 names for types of coffee. Download it or copy the text to a new text file and save it with the same name coffee.txt. Remember to save it in the root of your project and not in the src folder with the .java files.

2.b Create a class called <code>Main</code> with a <code>main</code>-method.

2.c Create another class called <code>Cafe</code>. Give it an attribute called <code>coffeeMenu</code> of type <code>ArrayList\<String\></code> (later you will fill this <code>ArrayList</code> with the names of the coffees from the textfile). Make the attribute private and write a getter-method that returns the list.

2.c In the <code>Cafe</code> class add a method <code>loadMenuData()</code>.
In the method make a <code>File</code>-object representing the coffees.txt file like this:
<p><code>File file = new File("coffees.txt") </code>  </p>
(make sure that the path is right)

2.d In this step you will read from the file, using a Scanner object: Add the <code>File</code> instance to a new Scanner object. (This piece of code will need to be wrapped in a <code>try -catch</code> block)

The solution to this step is given below, but give it a go before peeping.
<details>
  <summary>Sneak peek</summary>
  <code>try {
          File file = new File("coffees.txt");
          Scanner scan = new Scanner(file);
        } catch(FileNotFoundException e){
          System.out.println("File not found. Check path and filename");
        }
</code>
</details>

2.e Inside the try block from the last step, you will now add this piece of code that loops over the lines of the textfile:

Use a while loop with the <code>hasNextLine()</code> and <code>nextLine()</code> -methods called on the Scanner instance, to loop over the lines of the file and add the lines to the coffees ArrayList in this class.
<details>
  <summary>Sneak peek
  </summary>
<code>
while(scan.hasNextLine()){
  coffeeMenu.add(scan.nextLine());
}
</code>
</details>

2.g In the <code>main</code>-method create a new instance of the <code>Cafe</code> class and call it's <code>loadMenuData()</code> -method.

2.h Still in the <code>main</code>-method, print all the elements in the list <code>coffeeMenu</code> from the <code>Cafe</code> instance you just created.
<details>
  <summary>Hint</summary>
  Use the getter-method from the <code>Cafe</code> class to retrieve the list of coffees. Then use a for loop to iterate through the list and and print the names of the coffees one by one.
</details>
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