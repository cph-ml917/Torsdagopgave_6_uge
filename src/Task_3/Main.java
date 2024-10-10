//----------Task 3: Buildings and Rooms----------//

/*
This task is an excercise in accessing fields in objects within objects. You will create a building with some rooms. Each room will have some attributes which you will access (read the value of) in order to determine how many windows and lamps are in the building.

3.a Create a class Room with the following attributes/fields (use appropriate types and make them private):
- numberOfLamps
- numberOfWindows

3.b Create a constructor that populates (assigns values to) all the fields.

3.c As the fields of Room are private, create getter- and setter-methods for them.

3.d Create a class Building with the following fields (use appropriate types and make them private):
- rooms (Hint; This should be a datatype that can hold multiple objects of type Room.)
- numberOfFloors

3.e Create a constructor that populates all the fields.

3.f As the fields of Building are private, create getters and setters for them.

3.g Create a class Main with a main-method. In your main-method, instantiate at least three different rooms.

3.h Add the three rooms to a collection (preferably of the same data type used for the "rooms" field in your class Building).

3.i In your main-method, instantiate a new building with the rooms you created in 3.h.

3.j Create a static method in Main called countLampsInBuilding() that takes an object of type Building and returns the total number of lamps in the entire building.
- Hint: You will need to create a loop that looks at each room in the building and adds the number of lamps in each room to a variable.

Create methods countWindowsInBuilding() and countRoomsInBuilding(). Test in main that your methods work as expected. If not, debug your program.

3.k create another static method in Main called isNormal() that takes an object of type Building as argument. The method should return true if the building's number of floors is greater than or equal to it's number of rooms. If not it should return false. Test this method from your main using both a normal and a anormal building.
*/

package Task_3;

public class Main {
    public static void main(String[] args) {

    }
}