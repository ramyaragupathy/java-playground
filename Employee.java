class Employee {
    int empno;
    String name;
    float sal;

    void getDetails(){
         System.out.println("From getDetails(): "  
            + empno 
            + "|" 
            + name  
            + "|"  
            + sal);
    }
    public static void main (String[] args){
        Employee emp1 = new Employee();
        emp1.getDetails();
    }
}

class ObjectInstantiate {
    public static void main (String[] args){
        Employee emp1 = new Employee();
        System.out.println(emp1.empno + "|" + emp1.name + "|" + emp1.sal);
    }

}