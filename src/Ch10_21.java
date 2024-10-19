class Company {
    void printInfo() {
        System.out.println("company.printInfo:公司簡介");
    }
}

class Department extends Company {
    void printInfo() {
        System.out.println("Department.printInfo:部門簡介");
    }

    void printInfo2() {
        System.out.println("Department.printInfo:部門簡介2");
    }

}

public class Ch10_21 {
    public static void main(String[] args) {
        Company company = new Department();   //upcasting
        company.printInfo();
        //company.printInfo2(); 不做downcasting會出現compile error(因upcasting後只會看到可跟父類別override的方法)

        //instanceof->確認用
        if (company instanceof Department) {
            Department department = (Department) company; //downcasting
            department.printInfo();
            department.printInfo2();
        }
    }
}
