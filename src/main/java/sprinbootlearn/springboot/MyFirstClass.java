package sprinbootlearn.springboot;

public class MyFirstClass {

    private String className;

    public MyFirstClass(String name) {
        this.className = name;
    }

    public String sayHello() {
        return "Hello world from MyfirstClass and the class name=> " + this.className;
    }
}
