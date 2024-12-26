package work.digigo;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        User user = new User();



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username: ");

        String username = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();


        user.setUsername(username);
        user.setPassword(password);


        UserRepository userRepository = new UserRepository();

        userRepository.save(user);

    }
}