class A {
    void display(){
        System.out.print("A");
    }
}

class B {
    void disp(){
        System.out.print("B");
    }
}

/* A class can be extended from only one Class
   to overcome ambiguity
*/
class C extends A{
    
}


class TestInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}