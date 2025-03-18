import java.util.*;
import java.util.Scanner;
public class OrderLogs {
    Deque<String> orderLogs = new ArrayDeque<>();
    
    int choice;

    public void addOrderLog(String log){
        orderLogs.push(log);
    }
    
    private void displayOrderLogs(){
        for(String i:orderLogs){
            System.out.println(i);
        }
    }

    private void mostRecentLogEntry(){
        orderLogs.peek();
    }

    private String getOrderLog(){
        return orderLogs.pop();
    }

    private void removeAllLogEntries(){
        orderLogs.clear();
    }

    private boolean orderLogsEmpty(){
        return orderLogs.isEmpty();
    }
    
    Scanner input = new Scanner(System.in);

    public void handleLogs(){
        do{
            System.out.println("Choose what you wantto do with order logs:\n");
            System.out.println("1. Display all the logs");
            System.out.println(" 2. Display the most recent logs\r\n" + //
                               " 3. Remove a log entry\r\n" + //
                               " 4. Remove alllog entries\r\n" + //
                               " 5. Check if the log is completely empty\r\n" + //
                               " Enter your choice (1– 5)\r\n");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    displayOrderLogs();
                    break;
                case 2:
                    if(orderLogsEmpty()){
                        System.out.println("no research");
                    }else{
                        mostRecentLogEntry();
                    }
                    break;
                case 3:
                    if(orderLogsEmpty()){
                        System.out.println("no research");
                    }else{
                        getOrderLog();
                    }
                    break; 
                case 4:
                    removeAllLogEntries();;
                    break;
                case 5:
                    if(orderLogsEmpty()){
                        System.out.println("The log is completely empty");
                    }
                    else{
                        System.out.println("The log is noe completely empty");
                    }
                    break;
            }
            if(choice<=0||choice>=6){
                System.out.println("wrong number, try again");
            }
        }while(choice<=0||choice>=6);
    }
}
