public class Tarea1 {

    public static void main(String[] args) {

        int[] degrees = {10, 5 , 7, 3, 8, 4};
        int number = 0;
        int result;

        for(int i = 0; i < degrees.length; i++) {
            number = number + degrees[i];
        }

        result = number / degrees.length;
        System.out.println(result);
    }
}
