public class FakultaetWhile {

    public static void main(String[] args) {
    calculateFacultyWhile(4);
    }

    public static int calculateFacultyWhile(int faculty) {
        int result = 1;
        int i = 1;
        while ( i <= faculty) {
            result = result * i;
            i++;
        }
        return result;
    }
}
