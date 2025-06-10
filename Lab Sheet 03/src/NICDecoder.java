
import java.util.Scanner;

public class NICDecoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char select;

        System.out.println("\n\n\n\t\t\t\t\t\t     __ _____  ___ ");
        System.out.println("\t\t\t\t\t\t  /\\ \\ \\\\_   \\/ __\\");
        System.out.println("\t\t\t\t\t\t /  \\/ / / /\\/ /   ");
        System.out.println("\t\t\t\t\t\t/ /\\  /\\/ /_/ /___ ");
        System.out.println("\t\t\t\t\t\t\\_\\ \\/\\____/\\____/ ");

        System.out.println("\t\t\t\t   ___      _            _       _");
        System.out.println("\t\t\t\t  / __\\__ _| | ___ _   _| | __ _| |_ ___  _ __");
        System.out.println("\t\t\t\t / /  / _' | |/ __| | | | |/ _' | __/ _ \\| '__|");
        System.out.println("\t\t\t\t/ /__| (_| | | (__| |_| | | (_| | || (_) | |");
        System.out.println("\t\t\t\t\\____/\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|");

        System.out.println("\n\t\t\tWelcome to Sri Lanka's NIC decoder. You can retrieve the information");
        System.out.println("\t\t\tfrom your NIC by using this tool.");
        System.out.println("\n\t\t\tEnter 'O' if you are holding an old type of NIC numbers.");
        System.out.println("\t\t\tEnter 'N' if you are holding a new type of NIC numbers.");
        System.out.println("\t\t\t--------------------------------------------------------------------");
        System.out.print("\n\t\t\tEnter your NIC type: ");
        select = scanner.next().charAt(0);

        NICDecoder decoder = new NICDecoder();

        switch (select) {
            case 'o':
            case 'O':
                decoder.oldNIC();
                break;
            case 'n':
            case 'N':
                decoder.newNIC();
                break;
            default:
                System.out.println("Entered NIC type does not exist.");
                break;
        }

        scanner.close();
    }

    void newNIC() {
        Scanner scanner = new Scanner(System.in);
        String nic, dob, year;
        int choice;

        //clearScreen();
        System.out.print("\n\n\n\t\t\t\tEnter your new NIC number : ");
        nic = scanner.next();
        if (nic.length() == 12) {
            dob = nic.substring(4, 7);
            int val = Integer.parseInt(dob);
            if (val > 500 && val < 867) {
                System.out.println("\t\t\t\tGender : Female");
                val -= 500;
            } else if (val <= 500) {
                System.out.println("\t\t\t\tGender : Male");
            } else {
                System.out.println("\n\t\t\t\tYou entered the wrong NIC numbers.");
            }
            year = nic.substring(0, 4);
            System.out.printf("\t\t\t\tThe Birth year : %s\n", year);
            dateMonth(val);

            System.out.println("\n\n\nPress 0 to Exit.");
            System.out.println("\nPress 1 to go to the main menu. ");
            choice = scanner.nextInt();

            if (choice == 1) {
                //clearScreen();

            } else {
                //clearScreen();
                System.out.println("\n\t\t\t\t.....### The action has been terminated ###.....");
                System.exit(0);
            }
        } else {
            System.out.println("\n\t\t\t\tYou entered the wrong NIC numbers.");

            System.out.println("\n\n\nPress 0 to Exit.");
            System.out.println("\nPress 1 to go to the main menu. ");
            choice = scanner.nextInt();

            if (choice == 1) {
                //clearScreen();

            } else {
                //clearScreen();
                System.out.println("\n\t\t\t\t.....### The action has been terminated ###.....");
                System.exit(0);
            }
        }

        scanner.close();
    }

    void oldNIC() {
        Scanner scanner = new Scanner(System.in);
        String nic, dob, year;
        int choice;

        //clearScreen();
        System.out.print("\n\n\n\t\t\t\tEnter your new NIC number without V: ");
        nic = scanner.next();
        if (nic.length() == 9) {
            dob = nic.substring(2, 5);
            int val = Integer.parseInt(dob);
            if (val > 500 && val < 867) {
                System.out.println("\t\t\t\tGender : Female");
                val -= 500;
            } else if (val <= 500) {
                System.out.println("\t\t\t\tGender : Male");
            } else {
                System.out.println("\n\t\t\t\tYou entered the wrong NIC numbers.");
            }

            year = nic.substring(0, 2);
            int birthYear = Integer.parseInt(year);
            birthYear = 1900 + birthYear;
            System.out.printf("\t\t\t\tThe Birth year : %d\n", birthYear);
            dateMonth(val);

            System.out.println("\n\n\nPress 0 to Exit.");
            System.out.println("\nPress 1 to go to the main menu. ");
            choice = scanner.nextInt();

            if (choice == 1) {
                // clearScreen();
                // land_f();
            } else {
                //clearScreen();
                System.out.println("\n\t\t\t\t.....### The action has been terminated ###.....");
                System.exit(0);
            }
        } else {
            System.out.println("\n\t\t\t\tYou entered the wrong NIC numbers.");

            System.out.println("\n\n\nPress 0 to Exit.");
            System.out.println("\nPress 1 to go to the main menu. ");
            choice = scanner.nextInt();

            if (choice == 1) {
                //clearScreen();
            } else {
                //clearScreen();
                System.out.println("\n\t\t\t\t.....### The action has been terminated ###.....");
                System.exit(0);
            }
        }

        scanner.close();

    }

    void dateMonth(int val) {
        if (val <= 31) {
            System.out.printf("\t\t\t\tThe month you were born: January\n\t\t\t\tThe date you were born: %d", val);
        } else if (val <= 60) {
            System.out.printf("\t\t\t\tThe month you were born: February\n\t\t\t\tThe date you were born: %d", val - 31);
        } else if (val <= 91) {
            System.out.printf("\t\t\t\tThe month you were born: March\n\t\t\t\tThe date you were born: %d", val - 60);
        } else if (val <= 121) {
            System.out.printf("\t\t\t\tThe month you were born: April\n\t\t\t\tThe date you were born: %d", val - 91);
        } else if (val <= 152) {
            System.out.printf("\t\t\t\tThe month you were born: May\n\t\t\t\tThe date you were born: %d", val - 121);
        } else if (val <= 182) {
            System.out.printf("\t\t\t\tThe month you were born: June\n\t\t\t\tThe date you were born: %d", val - 152);
        } else if (val <= 213) {
            System.out.printf("\t\t\t\tThe month you were born: July\n\t\t\t\tThe date you were born: %d", val - 182);
        } else if (val <= 244) {
            System.out.printf("\t\t\t\tThe month you were born: August\n\t\t\t\tThe date you were born: %d", val - 213);
        } else if (val <= 274) {
            System.out.printf("\t\t\t\tThe month you were born: September\n\t\t\t\tThe date you were born: %d", val - 244);
        } else if (val <= 305) {
            System.out.printf("\t\t\t\tThe month you were born: October\n\t\t\t\tThe date you were born: %d", val - 274);
        } else if (val <= 335) {
            System.out.printf("\t\t\t\tThe month you were born: November\n\t\t\t\tThe date you were born: %d", val - 305);
        } else if (val <= 366) {
            System.out.printf("\t\t\t\tThe month you were born: December\n\t\t\t\tThe date you were born: %d", val - 335);
        } else {
            System.out.printf("\t\t\t\tYou entered the wrong NIC numbers.\n");
        }

    }

}
