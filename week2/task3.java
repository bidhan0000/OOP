package task.week2;

public class task3 {
    public static void main(String[] args) {
        /*3. Write a program to calculate, 
        area of the triangle, and 
        the Volume of the Cube and Cuboid. */

        int base = 7;
        int height = 4;
        
        System.out.println("The area of triangle is :"+ (1/2*base*height));

        int length =10;
        int width = 4;
        int height1 = 7;
        int volume = length*width*height1;

        System.out.println("The volume of cuboid is :" +(volume));

        int side = 5;
        int volume1 = side*side*side;

        System.out.println("The volume of cube is :" +(volume1));


    }
    
}
