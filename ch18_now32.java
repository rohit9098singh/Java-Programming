class hisEmployee {
    String empName;
    int empId;
    double salary;
    String phone;

    public hisEmployee(String empName, int empId, double salary, String phone) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
        this.phone = phone;
    }

    public void display() {
        System.out.println( empId+"\t\t\t"+empName+"\t\t"+salary+"\t\t"+phone);
      
    }
}

public class ch18_now32 {
    public static void main(String[] args) {
        System.out.println("employeename\t\tempId\t\tsalary\t\tphone");
        hisEmployee[] employees = new hisEmployee[5];
        employees[0] = new hisEmployee("rahul", 101, 50000.0, "1234567890");
        employees[1] = new hisEmployee("vinod", 102, 55000.0, "9876543210");
        employees[2] = new hisEmployee("devang", 103, 60000.0, "5551234567");
        employees[3] = new hisEmployee("rohit", 104, 52000.0, "7778889999");
        employees[4] = new hisEmployee("suresh", 105, 48000.0, "3334445555");

        for(int i=0;i<employees.length;i++)
        {
            employees[i].display();
        }
    }
}


