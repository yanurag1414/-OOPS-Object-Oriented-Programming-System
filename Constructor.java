public class Constructor {
    //It is similar to Method_Overloading having same name as that of class name.
    //it does not have any return type.
    //The only modifiers applicable for constructor are public,protected,default & private,
    //It executes automatically when we create an object.
    String name;
    int age;
    public Constructor(String name,int age) {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {
        Constructor t1 = new Constructor("Anurag",19);
        Constructor t2 = new Constructor("Shivam",19);
        System.out.println(t1.name+" "+ t1.age);
        System.out.println(t2.name+" "+t2.age);
    }
}
// Types of Constructor:
// 1 - Default Constructor    (Defined by compiler with no argument)
// 2 - No arg constructor      (user defined without any argument passed)
// 3 - parameterized constructor    (user defined with argument)

