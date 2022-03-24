public class FakultaetFor {

    public static void main(String[] args) {
        int faculty= calculateFakulty(4);
        System.out.println(faculty);

    }

    public static int calculateFakulty(int number) {
        int result = 1;
        for (int i = 1 ; i <= number ; i++ ) {  /* int i könnte auch = 2 sein, da 1! eh =1 ist*/
            /*System.out.println(i);   === Braucht man nicht*/
            result = result * i;
        }
        return result;
    }
}
