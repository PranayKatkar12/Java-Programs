package App.Web;

class App1{
    public String name="Pranay katkar";

    void display(){

        System.out.println("Within the class:"+name);
    }
}
public class main1 {
    public static void main(String[] args) {
       App1 ap1=new App1();
       ap1.display();
        System.out.println("Outside the class:"+ap1.name);
        App2 ap2=new App2();
        ap2.display1();
    }
}

class App2{
    void display1(){
        App1 obj=new App1();
        System.out.println("Accessing from another class:" + obj.name);
    }
}