package section8.quiz.pkga;

public class SuperClass {
    String text="hello";
    //error if this method not is public
    public SuperClass() {}
    protected SuperClass(String text) {}
    protected void setText(String text) { this.text = text; }
    public String toString() {  return text;  }


}
