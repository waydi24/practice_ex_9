import java.util.*;
import java.util.Scanner;
public class Process {
    Queue<String> processLogs = new ArrayDeque<>();
    
    int choice;

    public void addOrderLog(String log){
        processLogs.add(log);
    }
    
    private void displayPizzasMaking(){
        for(String i:processLogs){
            System.out.println(i);
        }
    }
    private void theFirstPizza(){
        processLogs.peek();
    }

    private String thePizzaReady(){
        return processLogs.poll();
    }

    private void removeAllLogEntries(){
        processLogs.clear();
    }

    private boolean orderLogsEmpty(){
        return processLogs.isEmpty();
    }
    
    Scanner input = new Scanner(System.in);

    public void handleLogs(){
        do{
            System.out.println("The process is:\n");
            System.out.println("1. customers don't want it");
            System.out.println(" 2. the making pizza\r\n" + //
                               " 3. the pizza is ready\r\n" + //
                               " 4. Remove alllog entries\r\n" + //
                               " 5. Check if the log is completely empty\r\n" + //
                               " Enter your choice (1– 5)\r\n");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    displayPizzasMaking();
                    break;
                case 2:
                    if(orderLogsEmpty()){
                        System.out.println("no research");
                    }else{
                        theFirstPizza();
                    }
                    break;
                case 3:
                    if(orderLogsEmpty()){
                        System.out.println("no research");
                    }else{
                        thePizzaReady();
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
