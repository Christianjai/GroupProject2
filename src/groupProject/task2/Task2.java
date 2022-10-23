package groupProject.task2;

abstract class Marks{
    abstract double getPercentage();
}
class A extends Marks{

    private float m1;
    private float m2;
    private float m3;

    public A (float m1, float m2, float m3) {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    double getPercentage() {

        return (m1 + m2 + m3)/3;
    }
}
class B extends Marks{
    private float m1;
    private float m2;
    private float m3;
    private float m4;


    public B (float m1, float m2, float m3, float m4) {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;

    }
    double getPercentage() {

        return (m1 + m2 + m3 + m4)/4;
    }
}
class Task2{
    public static void main(String[] args){

        A studentA = new A(80, 90, 70);   //creating object of class A
        double percentage1 = studentA.getPercentage(); //object of class A calling its getPercentage() function
        B studentB = new B(90, 67, 49, 60);  //creating object of class B
        double percentage2 = studentB.getPercentage(); //object of class B calling its getPercentage() function

        System.out.println(percentage1);
        System.out.println(percentage2);
    }
}






