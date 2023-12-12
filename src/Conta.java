import javax.crypto.*;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;

public class Conta {
    String user;
    String password;

    public Conta(String user, String password) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            sb.append((char)(c + 5));
        }
        this.password = sb.toString();
        this.user = user.toLowerCase();
    }

    public boolean login() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha de sua conta: ");
        String password = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            sb.append((char)(c + 5));
        }
        password = sb.toString();
        return password.equals(this.password);
    }

}
