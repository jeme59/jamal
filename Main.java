import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("  Choose a language  اختار اللغة  בחר את השפה ");


        System.out.println("1- عربي ");
        System.out.println("2-English");
        System.out.println("3-Hebrew");

        int langChoice = scan.nextInt();
        scan.nextLine();

        int userAction = 0; // تعريف المتغير هنا

        if (langChoice == 1) {
            System.out.println("اختار خيار يا بطل !:");
            System.out.println("1. انشاء حساب");
            System.out.println("2. تسجيل الدخول ");
            userAction = scan.nextInt();
            scan.nextLine();
        } else if (langChoice == 2) {
            System.out.println("Select an option:");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            userAction = scan.nextInt();
            scan.nextLine();
        } else {
            System.out.println("בחר, גיבור :");
            System.out.println("1. צור חשבון");
            System.out.println("2. כְּנִיסָה לַמַעֲרֶכֶת");
            userAction = scan.nextInt();
            scan.nextLine();
        }

        String langCode = "";
        switch (langChoice) {
            case 1: langCode = "ar"; break;
            case 2: langCode = "en"; break;
            case 3: langCode = "he"; break;
            default: langCode = "en"; break;
        }


        LanguageHandler.handleLanguageChoice(langChoice, scan, userAction, langCode);
    }
}
