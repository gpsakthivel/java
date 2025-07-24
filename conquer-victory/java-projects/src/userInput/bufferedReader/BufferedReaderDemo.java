package userInput.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("Enter any message : ");
        System.err.println("Hi : ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Your message : " + num);
    }
}
