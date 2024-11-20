public class Student {
    int age;
    String name;

    public void addName( String name,int age){
        this.name=name;
        this.age=age;
    }


    public void view(){
        System.out.println("your name is " + name + " and your "+  age);
    }
}
