package pers.springcore;

public class MyTest
{

    @MyAnnotation(hello = "Hello,Beijing",world = "Hello,world")
    public void output() {
        System.out.println("method output is running ");
    }
}
