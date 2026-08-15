import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class lab2 {

    public static void main(String[] args){
        Scanner s =new Scanner(System.in);


//        // Q1:
//
//        System.out.println("Enter the first number : ");
//        int firstnum=s.nextInt();
//        System.out.println("Enter the secend number :");
//        int secandnum=s.nextInt();
//        int sum=(firstnum+secandnum);
//        int multiply=(firstnum*secandnum);
//        int sub=(firstnum-secandnum);
//        int dvid=(firstnum/secandnum);
//        int mod =(firstnum%secandnum);
//
//        System.out.println(firstnum+"+"+secandnum+"= "+sum);
//        System.out.println(firstnum+"-"+secandnum+"= "+sub);
//        System.out.println(firstnum+"*"+secandnum+"= "+multiply);
//        System.out.println(firstnum+"/"+secandnum+"= "+dvid);
//        System.out.println(firstnum+"%"+secandnum+"= "+mod);
//
//        //Q2
//
//        System.out.println("Enter the number that you want to multi : ");
//        int num=s.nextInt();
//
//        for(int i=1;i<=10;i++){
//            System.out.println(num+" * "+i+" = "+num*i);
//        }
//
//        //Q3
//        System.out.println("print the r ");
//        double r2= s.nextDouble();
//        double area2=((r2*r2)*3.14);
//        System.out.println("area of the circle is "+area2);
//        double permeter=(2*3.14*r2);
//        System.out.println("permeter of the circle "+permeter);
//
//
//        //Q4
//        System.out.println("to find the avrage enter the count of the numbers:");
//       int count=s.nextInt();
//        double sum=0;
//        for(int i=1;i<=count;i++){
//            System.out.println("enter an integer:");
//            int num=s.nextInt();
//            sum+=num;
//        }
//
//        double avrg=sum/count;
//        System.out.println("the avrg is : "+avrg);
//
//
//      //Q5
//        System.out.println("enter the first");
//       int num1=s.nextInt();
//       System.out.println("enter the secend");
//       int num2=s.nextInt();
//       System.out.println("enter the thired");
//       int num3=s.nextInt();
//       int sum=num1+num2;
//
//       if(sum==num3){
//           System.out.println("the result is: true");
//       }else{
//           System.out.println("false");
//       }
//
//        //Q6
//
//        System.out.println("enter the word :");
//        String word=s.nextLine();
//        String revarce="";
//        for(int i =word.length()-1;i>=0;i--){
//            revarce+=word.charAt(i);
//        }
//        System.out.println("the revarce word is: "+revarce);
//
//        //Q7
//
//        System.out.println("enter a count of numbers for loops: ");
//        int count=s.nextInt();
//        for(int i = 1;i<=count;i++){
//            System.out.println("enter a numbers :");
//            int num=s.nextInt();
//            if(num%2==0){
//                System.out.println("the number is even");
//            }else{
//                System.out.println("the number is odd");
//            }
//
//        }
//
//        //Q8
//
//        System.out.println("enter the value in centigrade that you want to convert it to Fahrenheit : ");
//        int centigrade=s.nextInt();
//        Double f = (centigrade*1.8)+32;
//        System.out.println("your temperature is "+f);
//
//        //Q9
//
//        System.out.println("the word is : ");
//        String word=s.nextLine();
//        System.out.println("the number is :");
//        int number=s.nextInt();
//        System.out.println(word.charAt(number));
//
//        //Q10
//
//        System.out.println("write a number of width : ");
//        double width= s.nextDouble();
//        System.out.println("enter the height : ");
//        double height=s.nextDouble();
//        double area=width*height;
//        System.out.println("the are is "+area);
//        double perim=2*(width+height);
//        System.out.println("the perimeter "+perim);
//
//
//        //Q11
//        System.out.println("enter the first number : ");
//        int f=s.nextInt();
//        System.out.println("enter the second number: ");
//        int ss=s.nextInt();
//
//        if(f!=ss){
//            System.out.println(f+"!="+ss);
//        }
//        if(f<ss){
//            System.out.println(f+"<"+ss);
//        } if (f<=ss){
//            System.out.println(f+"<="+ss);
//        }
//
//
//        //Q12
//        System.out.println("enter the secands");
//        int secand=s.nextInt();
//        int hours=secand/3600;
//        int mints=secand%3600/60;
//        int secand1=secand%60;
//
//        System.out.println("the convert is "+hours+":"+mints+":"+secand1);
//
//
//        //Q13
//        System.out.println("enter the first num");
//        int num1=s.nextInt();
//        System.out.println("enter the second  num");
//        int num2=s.nextInt();
//        System.out.println("enter the third num");
//        int num3=s.nextInt();
//        System.out.println("enter the fourth num");
//        int num4=s.nextInt();
//        if ((num1==num2)&&(num3==num4)) {
//            if ((num1==num3) && (num2==num4)) {
//                System.out.println("equal");
//            }else {
//                System.out.println("not equal");
//            }
//        }else {
//            System.out.println("not equal");
//        }
//
//
//
//        //Q14
//
//        System.out.println("enter a number:");
//        int num=s.nextInt();
//        if(num<0){
//            System.out.println("negative number");
//        }else if (num>0){
//            System.out.println("postive number ");
//        }else{
//            System.out.println("the number is zero");
//        }


        //Q15

//        int countpos=0;
//        int countneg=0;
//        int countzer=0;
//        int numbers;
//        do {
//            System.out.println("enter the numbers if you want to stopenter -1 :");
//            numbers = s.nextInt();
//            if (numbers > 0) {
//                countpos++;
//            } else if (numbers < 0) {
//                countneg++;
//            } else {
//                countzer++;
//            }
//        }while (numbers!=-1);
//        System.out.println(countpos+" positives ");
//        System.out.println(countzer+" zero ");
//        System.out.println(countneg+" negative ");
//

        //Q16

//        System.out.println("enter the numbers : ");
//        int numbers=s.nextInt();
//        int revarcenumber=0;
//
//        while (numbers>0){
//            int lastdigit=numbers%10;
//            revarcenumber=revarcenumber*10+lastdigit;
//            numbers=numbers/10;
//        }
//        System.out.println("the revarce digte are :"+revarcenumber);

     //Q17

//        System.out.println("enter a number : ");
//        int number=s.nextInt();
//        int largest=number;
//        int smallest=number;
//        char stop;
//        do{
//            System.out.println("if you want to stop enter y : ");
//            stop=s.next().charAt(0);
//            if(stop!='y') {
//                System.out.println("enter a number : ");
//                int num = s.nextInt();
//                if (num > largest) {
//                    largest = num;
//                } else if (num < smallest) {
//                    smallest = number;
//                }
//            }
//        }while(stop!='y');

//        System.out.println("the largest number is:"+largest);
//        System.out.println("the smallest number is: "+smallest);


        //Q18

//        System.out.println("enter the word: ");
//        String word=s.nextLine();
//
//        System.out.println("enter the char : ");
//        char thewanted=s.next().charAt(0);
//        int count=0;
//
//        for(int i = 0;i<word.length();i++){
//           if(word.charAt(i)==thewanted){
//              count++;
//           }
//        }
//        System.out.println("the number of "+thewanted+":"+count);
//








































    }
}
