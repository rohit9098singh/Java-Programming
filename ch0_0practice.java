
   import java.util.Scanner;

class Student {
    int e_id;
    int s1, s2, s3, total;
    String name;

    public Student() {
        getStudentInfo();
    }

    public void getStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student id");
        e_id = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline character
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the three subjects");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        if (s1 >= 50 && s2 >= 50 && s3 >= 50) {
            total = s1 + s2 + s3;
        } else {
            total = 0;
        }
    }

    public void display() {
        System.out.println(e_id + " " + name + " " + total);
    }
}

public class ch0_0practice {
    public static void main(String[] args) {
        Student[] s = new Student[3];
        for (int i = 0; i < 3; i++) {
            s[i] = new Student();
        }
        System.out.println("Student details:");
        for (int i = 0; i < 3; i++) {
            s[i].display();
        }
    }
}
