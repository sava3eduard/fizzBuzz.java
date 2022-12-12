import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alegeti un numar : ");
        int numar = sc.nextInt();
        String result = "";
        System.out.println("result init: " + result);
        if (numar % 3 == 0) {
            result = "Fizz";
            System.out.println("result #1: " + result);
        }
        if (numar % 5 == 0) {
            result = result + "Buzz";
            System.out.println("result #2: " + result);
        }

        if (result.length()>0){
            System.out.println("result final: " + result);

        }else {
            System.out.println("result final: " + numar);
        }



        // divizibil cu 3 Fizz
        // divizibil cu 5 Buzz
        // divizibil si cu 3 si cu 5 FizzBuzz
    }
}
