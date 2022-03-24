public class Recursion {

    public static void main(String[] args) {
        int fact = factorial (4);
        System.out.println(fact);
    }

    public static int factorial(int number) {

        /*
        0!= 1   1
        1!= 1   1
        2!= 2   2 * 1
        3!= 6   3 * 2 * 1
        4!= 24  4 * 3 * 2 * 1
        5!= 120 5 *
         */

        if (number == 0) {
            return 1;
        }

        return number * factorial(number -1);
        /*
        4 * ((((4-1)-1)-1)-1)! + )
         */
    }
}
