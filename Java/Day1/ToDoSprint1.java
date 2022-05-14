import java.util.*;

 public class ToDoSprint1{

          public static void main(String[] args){
            Scanner in = new Scanner(System.in);
          
            System.out.println("Welcome to your Todo Manager!\n");
            System.out.println("Enter Your Name");
            String name = in.nextLine();
            System.out.println("Welcome " + name);


           System.out.println("Enter The Number Of Tasks");
           int NumberOfTasks = in.nextInt();
           in.nextLine();
           String task[] = new String[NumberOfTasks];

           System.out.println("Enter The Tasks");
            for(int i=0;i<NumberOfTasks;i++)
              task[i] = in.nextLine();
          
          System.out.println("##############MENU#############");
          System.out.println("1. Tasks in Ascending order");
          System.out.println("2. Tasks in Descending order");
          System.out.println("3. List atleast 5 Tasks");
          System.out.println("4. List repeated Tasks");

        System.out.println("Enter The Option");
        int option = in.nextInt();

    
        switch(option){
                      case 1: 
                             System.out.println("Tasks in Ascending order");
                             Arrays.sort(task);
                              for(int i =0; i<task.length;i++){
                                System.out.println(task[i]);
                              }
                              break;

                       case 2: 
                             System.out.println("Tasks in Descending order");
                             Arrays.sort(task);
                              for(int i =task.length-1;i>=0;i--){
                                System.out.println(task[i]);
                              }
                              break;
                      case 3: 
                             System.out.println("List atleast 5 tasks");
                             if(task.length<5){
                                   System.out.println("Not Enough Tasks to Display !");
                                   return;
                             }
                              for(int i =0; i<5;i++){
                                System.out.println(task[i]);
                              }
                              break;

                      case 4: 
                             System.out.println("Repeated Tasks");
                            Arrays.sort(task);
                              for(int i =0; i<task.length-1;i++){
                                  for(int j= i+1;j<task.length;j++){
                                     if(task[i].equals(task[j])){
                                System.out.println(task[i]);
                               }
                             }
                          }

                              break;
       }
     }
  }
