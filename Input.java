import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");

//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);

        // OR

        Scanner sc = new Scanner(System.in);


//        int number = Integer.parseInt(bf.readLine());
            int number = sc.nextInt();

        System.out.println(number);
//        bf.close();
    }


}
