class Employee {
    int empno;
    String name;
    float sal;

    public static void main (String[] args){
        Employee emp1 = new Employee();
        System.out.println(emp1.empno + "|" + emp1.name + "|" + emp1.sal);
    }
}

class ObjectInstantiate {
    public static void main (String[] args){
        Employee emp1 = new Employee();
        System.out.println(emp1.empno + "|" + emp1.name + "|" + emp1.sal);
    }

}