import java.util.Scanner;
//Assignment 1
/*public class Assignment {
   public static void main(String[] args){
   
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int i;
   for(i=1;i<=n;i++){
    if(i%2==0){
        System.out.println(i+"-> Even");
    }
    else{
        System.out.println(i+"-> Odd"); 
    }
   }
   } 
}*/

//Assignment 2
/*public class Assignment{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int k=1;
        while(k<=n){
        for(i=1;i<=10;i++){
         System.out.println(k+"x"+i+"="+k*i);
        }
        k++; 
        }
    }
}*/

//Assignment Number 3
/*public class Assignment{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int i,j;
        int isprime=0;
        for(i=start;i<=end;i++){
            isprime=1;
            if(i<2){
                continue;
            }
            for(j=2;j*j<=i;j++){
                if(i%j==0){
                    isprime=0;
                    break;
                }

            }
            if(isprime==1){
                System.out.println(i);
            }

        }
    }
}*/

//Assignment Number 4
/*public class Assignment{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=5;
    int i=1;
    while(i<=n){
        int input=sc.nextInt();
        if(input==27){
            System.out.println("Congratulation! You guessed it");
            return;
        }
        else if(input<27){
            System.out.println("Too Low");
        }
        else{
            System.out.println("Too High");
        }
        i++;
    }
    System.out.print("Better Luck Next Time");
    }
}*/

//Assignment Number 5
/*public class Assignment{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int start=sc.nextInt();
    int end=sc.nextInt();
    int i,j,temp;
    int digit;
    int pow;
    int sum;
    for(i=start;i<=end;i++){
        temp=i;
        pow=1;
        sum=0;
        while(temp>0){
            digit=temp%10;
            pow=1;
            for(j=1;j<=digit;j++){
                pow=pow*j;
            }
            sum=sum+pow;
            temp=temp/10;
        }

        if(sum==i){
            System.out.println(i);
        }
    }

   }
}*/

