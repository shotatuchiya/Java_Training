public final class Student8 extends Person4{
  private int stuNo;

  public Student8(String name, int stuNo){
    super(name);
    this.stuNo = stuNo;
  }
  public void display(){
    super.display();
    System.out.println("学籍番号：" + stuNo);
  }
}
