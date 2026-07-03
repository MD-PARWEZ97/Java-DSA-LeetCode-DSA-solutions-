import java.util.Scanner;
/* 
public class towerOfHonoi {
    static int count =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the Number :");
        int n=sc.nextInt();
        toh(n,'A','B','C');
        System.out.println("Total Number of count is : "+count);
    }
    public static void toh(int n, char from, char aux, char to){
        count++;
        if(n==1){
            System.out.println("Move to Disk "+ from + " to "+to);
        return;
        }
        toh (n-1, from ,to,aux);
        System.out.println("Move to Disk "+ from + " to "+to);
        toh(n-1, aux,from,to);
    }
}
    */
public class towerOfHonoi {
    static int count =0;
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number is :");
       int n = sc.nextInt();
     toh(n,'A','B','C');
     System.out.println("Total Number of Steps: "+count);
    }
    public static void toh(int n, char from, char aux, char to){
        count++;
        if(n==1){
            System.out.println("Move to disk from "+from+" to "+ to);
        return ;
        }
        toh(n-1,from,aux,to);
            System.out.println("Move to disk from "+from+" to "+ to);
        toh(n-1,aux,from,to);
    }

