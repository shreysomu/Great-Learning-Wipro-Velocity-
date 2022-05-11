import java.util.Scanner;
class SwitchDemo{
     public static void main(String[] args){
      Scanner in = new Scanner(System.in);
       System.out.println("Please Enter the Day Number :"); 
      int Day = in.nextInt();
      switch(Day){
                case 0: System.out.println("Sunday");
                        break;
                case 1: System.out.println("Monday");
                        break;
                case 2: System.out.println("Tuesday");
                        break;
                case 3: System.out.println("Wednesday");
                        break;
                case 4: System.out.println("Thursday");
                        break;
                case 5: System.out.println("Fridayday");
                        break;
                case 6: System.out.println("Saturday");
                        break;
                default: System.out.println("Wrong Number");
                }
              }
            }
