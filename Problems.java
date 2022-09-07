public class Problems {
    public static void main(String[] args) {
System.out.println("***************************************");
        System.out.println("calculate power");
        int x=25;
        int y=3;
          int z=1;
         for(int i=1;i<=3;i++){
                z=z*x;
         }
         System.out.println(z);
System.out.println("***************************************");
         System.out.println("Count digits in a given number.");
          int count=0;
         while(x!=0){
            count=count+1;
            x=x/10;

         }
        System.out.println("Number of digits is :"+count);
System.out.println("***************************************");
        System.out.println(" calculate sum of the digits of a given number");

        int num=325;
        int temp;
        int sum=0;
          while(num!=0){
            temp=num%10;
            sum=sum+temp;
            num=num/10;
          }
          System.out.println("Sum of the given is:"+sum);
 System.out.println("***************************************");
          System.out.println(" reverse a number");
          int n=4123;
          int r=0,y1;
          while(n!=0){
            y1=n%10;
            r=r*10+y1;
            n=n/10;

          }
     System.out.println("The Reverse of the number is:"+r);
System.out.println("**************************************");  
System.out.println("program to print all Armstrong numbers under 1000");
     int n1=153;
     int temp1=n1;
    while(n1!=0){
      y1=n1%10;
      r=r+y1*y1*y1;
      n1=n1/10;
    }
    System.out.println(temp1);
    System.out.println(r);
     if(temp1==r){
      System.out.println("It is ArmStrong");
     }else{
      System.out.println("It is not ArmStrong");
     }

    } 
}



