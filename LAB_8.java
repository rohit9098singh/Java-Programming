import java.util.Scanner;

class acharya_student{
    int eid;
    int s1, s2, s3, total;
    String name;

    public void getstudentinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        name = sc.nextLine();
        System.out.println("enter the student id");
        eid = sc.nextInt();
        System.out.println("enter the three subject");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        if (s1 >= 50 && s2 >= 50 && s3 >= 50) {
            total = s1 + s2 + s3;
        } else {
            total = 0;
        }
    }

    public acharya_student() {
        getstudentinfo();
    }

    public void display() {
        System.out.println(name+"\t\t"+eid+"\t\t"+total);
    }
}

public class LAB_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of student you want as per your choice");
        int no=sc.nextInt();
        acharya_student s[] = new acharya_student[no];
        for (int i = 0; i < no; i++) {
            s[i] = new acharya_student();
        }
        System.out.println("student detail :");
         System.out.println("name            eid            total");
        for (int i = 0; i < no; i++) {
            s[i].display();
        }
    }
}
