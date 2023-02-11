/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: Build an application that will step through some possible problems to restore internet connectivity..
 * Due: 02/10/2022
 * Platform/compiler: IntelliJ
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: __Nardos Lemma________
*/

import java.util.Scanner;

public class WifiDiagnosis {
    public static void main(String[] args) {

        String answer;
        Scanner scan = new Scanner(System.in);

        System.out.println("If you have a problem with internet connectivity this WiFi Diagnosis might work. ");
        System.out.println("                                                                                 ");

        System.out.println("reboot the computer and try again");
        System.out.println("Did that fix the problem? (yes or no)");
        answer = scan.next();
        if (answer.equals("yes")) {
            System.out.println("Done");
            System.out.println("Programmer: Nardos Lemma");
            System.exit(0);
        } else if ((answer.equals("no"))) {
            System.out.println("reboot the router and try to connect");
            System.out.println("Did that fix the problem? (yes or no)");
            answer = scan.next();
            if (answer.equals("no")) {

                System.out.println("make sure the cables connecting the router are firmly plugged in"
                        + "and power is getting to the router");
                System.out.println("Did that fix the problem? (yes or no)");
                answer = scan.next();
                if (answer.equals("no")) {

                    System.out.println("move the computer closer to the router and try to connect");
                    System.out.println("Did that fix the problem? (yes or no)");
                    answer = scan.next();
                    if (answer.equals("no")) {

                        System.out.println("Contact your ISP");
                    } else {
                        System.out.println("Done");
                        System.out.println("Programmer: Nardos Lemma");
                        System.exit(0);
                    }

                } else {
                    System.out.println("Done");
                    System.out.println("Programmer: Nardos Lemma");
                    System.exit(0);
                }
            } else {
                System.out.println("Done");
                System.out.println("Programmer: Nardos Lemma");
                System.exit(0);
            }
        } else {
            System.out.println("Invalid answer; try again ");

        }


        System.out.println("Programmer: Nardos Lemma");
        System.exit(0);

    }
}


