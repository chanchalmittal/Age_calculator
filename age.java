import java.util.Scanner;
public class AgeCalculator
{
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       System.out.println("WELCOME TO AGE CALCULATOR");
       System.out.println("Well, if you want to know that how old are you then answer some following questions");
       
//birth year 
System.out.println("BIRTH YEAR(in number)--");
int birthyear = input.nextInt();


//birth month 
System.out.println("BIRTH MONTH(in number)--");
int birthmonth = input.nextInt();


//current year
System.out.println("CURRENT YEAR--");
int currentyear = input.nextInt();


//current month
System.out.println("CURRENT MONTH(in number)--");
int currentmonth = input.nextInt();

int year = currentyear - birthyear;
int age = year;
int mth = currentmonth - birthmonth; 

int month;
if ( currentmonth > birthmonth ) { 
            month = currentmonth - birthmonth ; }
     else { month = birthmonth - currentmonth ; }
if ( currentmonth < birthmonth ) { age = age - 1; }
       System.out.print("Your age is ");
       System.out.println(age);
       System.out.print("You were born in ");
       System.out.print(birthmonth);
       System.out.print(" ");
       System.out.println(birthyear);
       System.out.print("You are actually ");
       System.out.print(age);
       System.out.print(" years and ");
       System.out.print(month);
       System.out.println(" months old.");
       System.out.println("THANK FOR USING THIS AGE CALCULATOR, WELL THIS IS MADE BY CHANCHAL MITTAL");


if ( currentmonth < birthmonth ) { System.out.print(" to go til your birthday"); }
    }
}
