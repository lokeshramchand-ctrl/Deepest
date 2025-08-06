public class Main {
    public static void main(String[] args) {
        int num = 30;
        int count = 0;
        for (int i = 2; i <= num; i++) {
            int sum = 0;
            for (int j = i; j > 0; j /= 10) {
                int digit = j % 10;
                sum += digit;
            }
            if (sum % 2 == 0)
                count++;
        }
        System.out.println(count);
    }
    }

