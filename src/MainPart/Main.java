package MainPart;

import Cars.Ambulance;
import Cars.Police;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<String> firstList = new ArrayList<>();
    public List<String> secondList = new ArrayList<>();

    public static void FillInTheList(List<String> firstList, List<String> secondList) {
        Scanner scanner = new Scanner(System.in);

        firstList.add(scanner.nextLine());
        String key_word_situation1 = "bad";
        String key_word_situation2 = "robbed";
        FillInTheListLogic(key_word_situation1, key_word_situation2, firstList, secondList);
    }
    public static void FillInTheListLogic(String key_word_situation1, String key_word_situation2, List<String> firstList, List<String> secondList) {
        String firstElement = firstList.get(0);

        if (!firstElement.equals(key_word_situation2)) {
            StringBuilder decimalCode = new StringBuilder();

            for (int i = 0; i < firstElement.length(); i++) {
                char c = firstElement.charAt(i);

                if (!Character.isWhitespace(c)) {
                    decimalCode.append((int) c);
                }
            }
            System.out.println("Car number: " + decimalCode.toString());
            Ambulance ambulance = new Ambulance();
            ambulance.ambulance();

        } else if (firstElement.contains(key_word_situation2)) {
            StringBuilder decimalCode = new StringBuilder();

            for (int i = 0; i < firstElement.length(); i++) {
                char c = firstElement.charAt(i);

                if (!Character.isWhitespace(c) && !key_word_situation2.contains(String.valueOf(c)) && Character.isDigit(c)) {
                    decimalCode.append(c);
                }
            }
            System.out.println("Car number: " + decimalCode.toString());
            Police police = new Police();
            police.police();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type what's wrong: ");

        FillInTheList(new Main().firstList, new Main().secondList);
    }
}

