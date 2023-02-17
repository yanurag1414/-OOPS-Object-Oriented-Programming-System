//Method Overloading allows different methods to have the same name
// In Method overloading compared to parent argument, child argument will get the highest priority.
//conditions for overloading
//same class
//same name
//different arguments
//--sequence of argument
//--number of argument
//--type of argument
public class Method_Overloading{
    // by changing argument type
    void name(String a){
        System.out.println("String method");
    }
    void name(int a){
        System.out.println("int method");
    }




    //by changing sequence
    void age(int a,String b){
        System.out.println("int,String");
    }
    void age(String a,int b){
        System.out.println("String, int");
    }




    //by changing number of argument
    void colour(String a){
        System.out.println("one argument");
    }
    void colour(String a,int b){
        System.out.println("Two arguments");
    }

    public static void main(String[] args) {
        Method_Overloading test = new Method_Overloading();
        test.name("Anurag yadav");
        test.name(10);
        test.age(10,"RAhul");
        test.age("karan",20);
        test.colour("Black");
        test.colour("REd",10);
    }
}
