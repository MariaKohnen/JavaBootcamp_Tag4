public class RetryTasks {

    public static void main(String[] args) {
        int result = calcFacultyWhile(2);
        System.out.println(result);
    }

    public static int calcFacultyFor(int number) {
        int result = 1;
        for (int i = 1; i <= number; ++i) {
            result = result * i;
        }
        return result;
    }

    public static int calcFacultyWhile(int number) {
        int i = 1;
        int result = 1;
        while (i < number) {
            result = result * ++i;
        }
        return result;
    }

}