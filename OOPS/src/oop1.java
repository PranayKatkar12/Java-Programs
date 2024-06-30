import java.util.Scanner;

public class oop1 {
    public static void get(String name[],int roll_no[],char section[]){
       Scanner sc=new Scanner(System.in);

       for (int i=0;i<5;i++){
           System.out.println("Enter name,roll_no and Section of  student");
           name[i]=sc.next();
           roll_no[i]=sc.nextInt();
           section[i]=sc.next().charAt(0);
       }
    }

    public static void display(String name[],int roll_no[],char section[]){
        for (int i=0;i<5;i++){
            System.out.println("Name of the student is:->"+name[i]);
            System.out.println("Roll_number of the student is:->"+roll_no[i]);
            System.out.println("Section of the student is:->"+section[i]);
        }
    }
    public static void main(String[] args) {

        String name[] =new String[5];
        int roll_no[]=new int[5];
        char section[]=new char[5];
        get(name,roll_no,section);
        display(name,roll_no,section);
    }
}
