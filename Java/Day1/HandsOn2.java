import java.util.Scanner;
class HandsOn2{
     public static void main(String[] args){
      Scanner in = new Scanner(System.in);
       System.out.println("Please Enter the Day :"); 
      String Day = in.nextLine();
      switch(Day){
                case"Sunday": System.out.println("Holiday");
                        break;
                case "Monday": System.out.println("Go For a Walk");
                        break;
                case "Tuesday": System.out.println("Do Homework");
                        break;
                case "Wednesday": System.out.println("Do Grocery Shopping");
                        break;
                case "Thursday": System.out.println("Go for work");
                        break;
                case "Friday": System.out.println("Do cleaning");
                        break;
                case "Saturday": System.out.println("Take classes");
                        break;
                default: System.out.println("Wrong Day !");
                }
              }
           }
