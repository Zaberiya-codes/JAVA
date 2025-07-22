//Use of final,this,new
public class FinalExample {
    final int maxMarks = 100;

    String name;

    FinalExample(String name){
        this.name = name; //refers to current objects field
    }
    public static void main(String[] args){
        FinalExample s = new FinalExample("Mudgul"); //'New' creates object
        System.out.println(s.name);
    }
}
