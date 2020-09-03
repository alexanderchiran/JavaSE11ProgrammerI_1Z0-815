package SimulationTest.exam1.part3;


/*
Above code is currently giving compilation error. Which 2 modifications, done independently, enable the code to compile?

liena 14: public void setOrientation(){}            = ok
Linea 12: abstract class NewsPaper extends Paper{   =ok
linea 9: public abstract void setOrientation();     = no
linea 7: class Paper implements Printable{          = no

interface Printable {
    public void setMargin();
    public void setOrientation();
}

abstract class Paper implements Printable { //Line 7
    public void setMargin() {}
    //Line 9
}

class Test65 extends Paper { //Line 12
    public void setMargin() {}
    //Line 14
}

 */
interface Printable {
    public void setMargin();
    public void setOrientation();
}

//class Paper implements Printable{
abstract class Paper implements Printable { //Line 7
    public void setMargin() {}
    //public abstract void setOrientation();
    //Line 9
}
//ok
//abstract class NewsPaper extends Paper{
class NewsPaper extends Paper { //Line 12
    public void setMargin() {}
  //ok
   public void setOrientation(){}
}

public class Test65 {

}
