class Algebra{
    int a=10;
    int b=30;

    int show(){
        return a+b;
    }

    {
        int p=10;
        int q=30;
        System.out.printf("%d\n%d",p,q);
    }

}

public class Scopes {
    public static void main(String[] args) {
       Algebra b=new Algebra();
        System.out.println();
        System.out.println("Show method:"+b.show());

    }
}
