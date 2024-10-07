import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 23));
        System.out.println(permission(generateRandomAge(), -4));
        System.out.println(permission(generateRandomAge(), 32));
        System.out.println(permission(generateRandomAge(), 15));
        System.out.println(permission(generateRandomAge(), -1));
    }
    private static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return  "Можно идти гулять";
        } else if (age <= 20 && temperature >= 0 && temperature <=28){
            return "Можно идти гулять";
        } else if (age >= 45 || temperature >= -10 && temperature <=25) {
            return "Можно идти гулять";
        } else{
            return "Оставайся дома";
        }
    }
    private static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(81);
    }
}