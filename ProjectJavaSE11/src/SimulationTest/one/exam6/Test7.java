package SimulationTest.one.exam6;


class MyClass7 {
    MyClass7() {
        System.out.println(101);
    }
}

class MySubClass extends MyClass7 {
    //Constructors cannot use final, abstract or static modifiers. As no-argument constructor of MySubClass uses final modifier, therefore it causes compilation error.
    //final MySubClass() {
    MySubClass() {
        System.out.println(202);
    }
    final public void getTrip(){

    }
    final void getJob(){

    }
}

final class MyClassA extends MySubClass{
    //'getJob()' cannot override 'getJob()' in 'SimulationTest.one.exam6.MySubClass'; overridden method is final
    //public void getJob(){}

}
//Cannot inherit from final 'SimulationTest.one.exam6.MyClassA'
//class MyClassB extends MyClassA{
class MyClassB{
    public void getJob1(){
    }
}

public class Test7 {
    public static void main(String[] args) {
        System.out.println(new MySubClass());
    }
}