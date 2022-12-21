package Controller;

import java.util.Scanner;

public class scanner {
    static Scanner scan = new Scanner(System.in);

    public int readNum() {
        String str = scan.nextLine();
        return Integer.parseInt(str);
    }

    public String readString() {
        return scan.nextLine();
    }

}
