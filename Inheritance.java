//It is the mechanism in java by which
// one class is allowed to inherit the features(fields and methods) of another class
public class Inheritance {
    void eat() {
        System.out.println("Hey i am a eating Method_Overloading in Inheritance class");
    }
}

class Dog extends Inheritance{
    void name() {
        System.out.println("Hey i am name Method_Overloading in Dog class");
    }
    public static void main(String[] args) {
        Dog buzo = new Dog();
        //using inheritance class by extends keyword
        buzo.eat();
        buzo.name();

    }
}
//USES OF INHERITANCE:
//Code Reusability
//Method Overriding
//Abstraction


//DISADVANTAGE
//classes are tightly coupled (If you modify your class than it will apply on all other classes which extends that class)





//TYPES OF INHERITANCE
//1.Single
//2.Multi level
//3.Hierarchical
//4.multiple  (Not supported by java)      
//5. Hybrid (Not supported by java) Diamond case problem


class animal{
    void run(){
        System.out.println("hey i am running " +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "Method_Overloading from animal class");
    }
}
class cats extends animal {        //single inheritance - (subclasses inherit the features of one superclass)
    void cname() {
        System.out.println("I am cname Method_Overloading from cats class");
    }
}
class Lion extends cats{           // multi level inheritance
    void wild(){
        System.out.println("I am wild Method_Overloading from Lion class");
    }

    public static void main(String[] args) {
        Lion bahu = new Lion();
        bahu.wild();
        //using cats class
        bahu.cname();
        // using animal class because cats class extends animal class and Lion class extends cats class
        bahu.run();

    }
}
class hybid extends animal{             //Hierarchical inheritance
    public static void main(String[] args) {
        hybid A = new hybid();
        A.run();
    }
}




