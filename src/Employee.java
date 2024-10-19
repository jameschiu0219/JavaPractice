class Employee {
    String name;
    int id;
    int age;

    Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;

    }

    void printInfo() {
        System.out.println("名字:" + name);
        System.out.println("ID:" + id);
        System.out.println("年齡:" + age);
    }
}
