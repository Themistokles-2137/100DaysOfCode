import java.util.Scanner;
class Day4{
    public static void main (String []args){
        Scanner myObj = new Scanner(System.in);
        int x = 3;
        int y = 27;
        System.out.println(x+y);
        System.out.println(y-x);
        System.out.println(x*y);
        System.out.println(y/x);
        System.out.println("Enter length of rectangle in decimals: ");
        double length = myObj.nextDouble();
        System.out.println("Enter width of rectangle: ");
        double width = myObj.nextDouble();
        double area = length*width;
        System.out.println("The area of the rectangle is: "+area);
        myObj.close();
    }
}
