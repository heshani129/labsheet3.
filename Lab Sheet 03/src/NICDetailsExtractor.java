
import java.util.Scanner;

class NICDetailsExtractor {

    static String year, month, date, gender = "Male";
    static int datesOfMonth[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        System.out.print("Enter ID Card Number : ");

        Scanner idScanner = new Scanner(System.in);
        String idNumber = idScanner.nextLine();

        if (idNumber.length() == 10) {
            oldNIC(idNumber);
        } else if (idNumber.length() == 12) {
            newNIC(idNumber);
        } else {
            System.out.println("Enter a valid ID number.\nEx :- 970000000V or 199700000000");
        }
    }

    public static void oldNIC(String idNumber) {
        year = "19" + idNumber.substring(0, 2); // Get year from id number

        int day = Integer.parseInt(idNumber.substring(2, 5)); // Get the day of the year from id number

        if (day > 500) {
            day -= 500;
            gender = "Female"; // if day value > 500 it means id owner is a female.
        }

        int total = 0;

        for (int i = 0; i < datesOfMonth.length; i++) {
            total += datesOfMonth[i];
            // Calculate birth month
            if (day <= total) {
                month = months[i];
                date = Integer.toString(day - (total - datesOfMonth[i])); // Calculate birth date
                break;
            }
        }

        // Print final result
        System.out.println("Date of birth : " + year + " " + month + " " + date);
        System.out.println("Gender : " + gender);
    }// End of the oldNIC() method.

    public static void newNIC(String idNumber) {
        year = idNumber.substring(0, 4); // Get year from id number

        int day = Integer.parseInt(idNumber.substring(4, 7)); // Get the day of the year from id number

        if (day > 500) {
            day -= 500;
            gender = "Female"; // if day value > 500 it means id owner is a female.
        }

        int total = 0;

        for (int i = 0; i < datesOfMonth.length; i++) {
            total += datesOfMonth[i];
            // Calculate birth month
            if (day <= total) {
                month = months[i];
                date = Integer.toString(day - (total - datesOfMonth[i])); // Calculate birth date
                break;
            }
        }

        // Print final result
        System.out.println("Date of birth : " + year + " " + month + " " + date);
        System.out.println("Gender : " + gender);
    }// End of the newNIC() method.
}
