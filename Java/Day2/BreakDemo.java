import java.util.Scanner;
class BreakDemo{
    public static void main(String[] args){
      int[] arr = {23,45,59,64,73,82,91};
    Scanner in = new Scanner(System.in);
  System.out.println("Enter The number to be searched");
     int target = in.nextInt();
      for(int i=0;i<7;i++){
        if(arr[i]==target){
          System.out.println("Target is found");
               break;
              }
            }
          }
        }
