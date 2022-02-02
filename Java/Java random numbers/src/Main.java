import  java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(1, 7);
            double y = random.nextDouble(1, 6);
            boolean z = random.nextBoolean();

            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
    }

}
