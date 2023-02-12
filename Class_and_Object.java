//default class is created because no access modifier is used.
//class name first letter should be in capital letter.
class Animal{
    //
    //method is created.
    //method is set of codes which perform a particular task.
    //code reusability and optimization are the advantages of method.
    //tells the action of an object.
    public void eat(){
        System.out.println("I am eat method:");
    }

    public static void main(String[] args) {
        //creating a method.
        //Animal is class.
        //dog is a name of object.
        //new is keyword to create an object.
        //Animal() is a constructor.
        Animal dog = new Animal();
        //using method for an object.
        // . is used
        dog.eat();
    }
}
