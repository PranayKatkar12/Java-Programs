class algebra{
    int a;
    int b;

    algebra(){
        System.out.println("constructor is called");
    }

    int Add(){
        return a+b;
    }

    int sub(){
        return a-b;
    }

    int mul(){
        return a*b;
    }
}


public class main2 {
    public static void main(String[] args) {
      algebra al=new algebra();
      al.a=10;
      al.b=20;
      int res1=al.Add();
        System.out.println("Addition is:"+res1);
      int res2=al.sub();
        System.out.println("Subtraction is:"+res2);
      int res3=al.mul();
        System.out.println("multiplication is:"+res3);

        return;
    }
}
