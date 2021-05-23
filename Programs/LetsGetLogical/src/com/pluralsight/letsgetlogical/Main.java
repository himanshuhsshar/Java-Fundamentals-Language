package com.pluralsight.letsgetlogical;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int students = 150;
        int rooms = 0;

        /*if(rooms > 0 & students/rooms > 30)
        {
            System.out.println("Crowded");
        }*/
        if(rooms > 0 && students/rooms > 30)
        {
            System.out.println("Crowded");
        }

        System.out.println("End of the Program");
    }
}
