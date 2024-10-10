package Task_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


//2.c
public class Cafe {

    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void setCoffeMenu(ArrayList<String> coffeeMenu) {
        this.coffeeMenu = coffeeMenu;
    }

    //2.d + 2.e
    public void loadMenuData() {
        try {
            File file = new File("coffees.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                coffeeMenu.add(scan.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found. Check path and filename");
        }
    }

    //2.h
    @Override
    public String toString() {
        String option = "";
        for (String coffee : coffeeMenu) {
            option += coffee + "\n";;
        }
        return option;
    }
}
