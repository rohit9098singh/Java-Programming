class faculty
{
    float total_salary =0;
    float salary=20000;
}
class hra_ma extends faculty{
    int hra=3000;
    int ma=1000;
}
public class ch5_1_singleinheritance_part_2 {
    public static void main(String[] args) {
        hra_ma salary=new hra_ma();
         salary.total_salary=salary.hra+salary.ma+salary.salary;
        System.out.println("total salary="+salary.total_salary);
    }
    
}
