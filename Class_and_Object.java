//default class is created because no access modifier is used.
//class name first letter should be in capital letter.
class Animal{
    //Method_Overloading is created.
    //Method_Overloading is set of codes which perform a particular task.
    //code reusability and optimization are the advantages of Method_Overloading.
    //tells the action of an object.
    public void eat(){
        System.out.println("I am eat Method_Overloading:");
    }
    public void run(){
        System.out.println("I am run Method_Overloading");
    }

    public static void main(String[] args) {
        //creating a Method_Overloading.
        //Animal is class.
        //dog is a name of object.
        //new is keyword to create an object.
        //Animal() is a constructor.
        Animal dog = new Animal();
        //using Method_Overloading for an object.
        // . is used
        dog.eat();
        dog.run();
        //Note: you cannot use Method_Overloading without object.
    }
}
//initializing object by reference variable(how to put values in object)
class Animal2{

    String name;
    String colour;

    public static void main(String[] args) {
        Animal2 cat = new Animal2();
        cat.colour = "Black";
        cat.name = "Kitten";
        System.out.println(cat.colour+" "+cat.name);
    }
}
//initializing object by  Method_Overloading
class Animal3{
    String name;
    String colour;
    int age;
    public void temp(String n,String c ,int a){
        name=n;
        colour=c;
        age=a;
    }
    public void display(){
        System.out.println(name+" "+colour+" "+age);
    }

    public static void main(String[] args) {
        Animal3 cow = new Animal3();
        cow.temp("Padma","White",15);
        cow.display();

    }
}
