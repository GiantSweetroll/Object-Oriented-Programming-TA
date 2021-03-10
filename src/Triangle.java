import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        Scanner originalTriangle = new Scanner(System.in);
        System.out.println("How many rows for the right angled triangle?");
        int asterisk = originalTriangle.nextInt();{


        for (int i = 1; i <= asterisk; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

        Scanner flippedTriangle = new Scanner(System.in);
        System.out.println(" How many rows for the upside down right angled triangle? ");
        int asterisk2 = flippedTriangle.nextInt();

        for (int i = 0; i < asterisk2; i++) {
            for (int x = 0; x < asterisk2; x++) {
                System.out.print((x >= i) ? "*" : " ");
            }

            System.out.println();
        }

        Scanner triangle = new Scanner(System.in);

        System.out.println(" How many rows for the isosceles triangle?");
        int finalAsterisk = triangle.nextInt();

        triangle.close();

        int initial = 1;

        for (int a = finalAsterisk; a > 0; a--) {
            for (int s = 1; s <= a * 2; s++) {
                System.out.print(" ");
            }

            //print s value where s value will be from 1 to initial
            for (int s = 1; s <= initial; s++) {
                System.out.print("* ");
            }

            //print s value where s value will be from initial-1 to 1
            for (int s = initial - 1; s >= 1; s--) {
                System.out.print("* ");
            }
            System.out.println();

            //increment
            initial++;
            }
        }
    }
}