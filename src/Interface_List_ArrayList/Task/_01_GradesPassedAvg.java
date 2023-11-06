package Interface_List_ArrayList.Task;

import java.util.ArrayList;
import java.util.Scanner;

// TODO
//  Get as many grades as a teacher wants to enter, and
//  Find the number of students who passed the average.
public class _01_GradesPassedAvg {
    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        try {
            String isContinue;
            while (true) {
                System.out.println("Do you wanna add to Grades? (Y/N): ");
                isContinue = in.next();

                if (isContinue.equalsIgnoreCase("N")) {
                    break;
                } else if (isContinue.equalsIgnoreCase("Y")) {
                    System.out.println("Grade: ");
                    int grade = in.nextInt();
                    grades.add(grade);
                } else {
                    System.out.println("Wrong Command");
                }
            }

            int sum = 0;
            double avg;

            for (Integer grade : grades) {
                sum = sum + grade;

            }
            avg = (double) sum / grades.size();

            int count = 0;
            for (Integer grade : grades) {
                if (grade > avg) {
                    count++;
                }
            }
            System.out.println("avg : " + avg);
            System.out.println("Peoples who passed avg: " + count);
        } catch (Exception ignored) {

        }


    }
}
