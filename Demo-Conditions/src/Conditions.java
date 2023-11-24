public class Conditions {
    public static void main(String[] args) {

        // double salary - 15000.0; // by default 15000.0 is double
        double salary = 15000.0d;
        if (salary > 14000) {
            System.out.println("Salary > 14000");
        }

        if (salary >= 15000) { // double vs int}
            System.out.println("salary > 15000");
        }

        if (salary < 17000) { // double vs int
            System.out.println("salary < 17000");
        }

        if (salary <= 15000) { // double vs int
            System.out.println("Salary <= 15000");
        }

        char grade = 'A';
        if (grade == 'A') {
            System.out.println("grade = A");
        } else if (grade == 'B') {
            System.out.println("grade = B");
        } else if (grade == 'C') {
            System.out.println("grade = C");
        } else if (grade == 'D') {
            System.out.println("grade = D");
        } else if (grade == 'E') {
            System.out.println("grade = E");
        } else if (grade == 'F') {
            System.out.println("grade = F");
        }

        // int score = 75
        // Score and Score2 >= 50, (score+score2)/2 -> grade F
        // either score or score2 < 50 -> grade F
        // both Score and Score2 < 50 -> F

        int score = 60;
        int score2 = 80;

        if (score < 50 || score2 < 50 || (score + score2) / 2 < 50) {
            grade = 'F';
        } else if ((score + score2) / 2 >= 90) {
            grade = 'A';
        } else if ((score + score2) / 2 >= 80) {
            grade = 'B';
        } else if ((score + score2) / 2 >= 70) {
            grade = 'C';
        } else if ((score + score2) / 2 >= 60) {
            grade = 'D';
        } else if ((score + score2) / 2 >= 50) {
            grade = 'E';
        }
        System.out.println("Your final grade is " + grade + "!!!");

        score = 75;
        // If
        // >= 90 -> A, >= 80 and 90 -> B, 70 - 79 -> C, 60 - 69 -> D
        // 50 - 59 -> E, < 50 -> F

        if (score < 50) {
            grade = 'F';
        } else if (score < 60 && score >= 50) {
            grade = 'E';
        } else if (score < 70 && score >= 60) {
            grade = 'D';
        } else if (score < 80 && score >= 70) {
            grade = 'C';
        } else if (score < 90 && score >= 80) {
            grade = 'B';
        } else if (score <= 100 && score >= 90) { // this event has no overlap with the previous one
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);

        // switch: single value comparison
     grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("grade=A");
            case 'B':
                System.out.println("grade=B");
            case 'C':
                System.out.println("grade=C");
            case 'D':
                System.out.println("grade=D");
            case 'E':
                System.out.println("grade=E");
            case 'F':
                System.out.println("grade=F");
        }

        // With Break

        char VipGrade = 'P';
        double discount = 0.0d;
        switch (VipGrade) {
            case 'P':
                discount += 0.2d;
                break;
            case 'G':
                discount += 0.1d;
                break;
            case 'N':
            default: // other characters
        }
        // If Else -> Switch pratice

        int Light = 0;

        switch (Light) {
            case (0):
            default:
            case (1):
                System.out.println("One light on");
            case (2):
                System.out.println("Two lights on");
            case (3):
                System.out.println("Three lights on + play sound effect 'you're elimated'");
        }

        System.out.println("Your grade is " + grade + "!!!");

    }
}
