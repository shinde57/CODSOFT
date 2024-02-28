import java.util.Scanner;

public class StudentGradeCalculator {

        public static void main(String[] args) {
                int n;
                int totalMark;
                float persentage;
                char grade;
                String next;
                String endStatement;

                Scanner input = new Scanner(System.in);

                do {
                        totalMark = 0;
                        System.out.println("\nHow many Subject you have ?");
                        n = input.nextInt();
                        int[] marks = new int[n];
                        String[] subjects = new String[n];
                        try {
                                for (int i = 0; i < n; i++) {
                                        input.nextLine();
                                        System.out.println("\nEnter the Subject Name");
                                        subjects[i] = input.nextLine();
                                        System.out.println("Enter the Subject Marks (out of 100)");
                                        marks[i] = input.nextInt();
                                }
                        } catch (Exception e) {
                        }

                        //show Enter data
                        System.out.println("\n =============== Your Data ==============");
                        System.out.println("Marks" + "                                " + "Subjects");
                        for (int i = 0; i < n; i++) {
                                System.out.println(marks[i] + "                :                " + subjects[i]);
                        }

                        //calculation of marks
                        for (int mark : marks) {
                                totalMark += mark;
                        }
                        persentage = totalMark / n;
                        if (persentage >= 80) {
                                grade = 'A';
                                endStatement = "Congratulations for Your Great Achivement";
                        } else if (persentage < 80 && persentage >= 65) {
                                grade = 'B';
                                endStatement = "Well done! Keep it up!";
                        } else if (persentage < 65 && persentage >= 50) {
                                grade = 'c';
                                endStatement = "Very Good! Keep Working Hard!";
                        } else if (persentage < 50 && persentage >= 36) {
                                grade = 'd';
                                endStatement = "Good! Best of lucK for Better Next Time";
                        } else if (persentage == 35) {
                                grade = 'p';
                                endStatement = "You Did it";
                        } else {
                                grade = 'F';
                                endStatement = "Keep working hard and come back Stronger";
                        }
                        //SHOW RESUALT
                        System.out.println("\n ===================================        RESUALT =============================================");
                        System.out.println("\n Total marks : " + totalMark + "/" + n*100 + "\t Persentage : " + persentage +"%" + "\t Gade : " + grade + "\n");
                        System.out.println(endStatement);
                        System.out.println("\n ==========================================================================================");
                        System.out.print("\n Press 'Y' : Calculate anoter result \n Press 'E' : exit \n");
                        next = input.next();
                } while ("y".equals(next) || "Y".equals(next));

        }

}