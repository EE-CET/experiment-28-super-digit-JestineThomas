import java.util.Scanner;

public class SuperDigit {
    
    static int superDigit(long num) {
        if (num < 10)
            return (int) num;

        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return superDigit(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int k = sc.nextInt();

        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }

        sum = sum * k;

        System.out.println(superDigit(sum));
        sc.close();
    }
}
