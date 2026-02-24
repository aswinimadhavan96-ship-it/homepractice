package trafficsignalsystem;
import java.util.Scanner;

public class TrafficSignalSystem {
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int choice;
        do{
            System.out.println("*******TRAFFIC SIGNAL SYSTEM ********");
            System.out.println("1.Show Signal MEANING");
            System.out.println("2.check GO OR STOP");
            System.out.println("3.EXIT");
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            switch(choice){
                case 1: 
                    SignalActions.showMeaning();
                    break;
                case 2:
                    System.out.println("Enter signal(RED,YELLOW,GREEN): ");
                    String input=sc.nextLine();
                    try{
                        TraficSignal signal=TraficSignal.valueOf(input);
                        SignalActions.checkStopOrGo(signal);
                    }
                    catch(IllegalArgumentException e){
                                System.out.println("Invalid signal entered");
                                }
                              break;
                              case 3:
                              System.out.println("Exit.... STAY SAFE ");
                              break;
                              default:
                              System.out.println("Invalid input");
                           
                           
                              
                    }
            }while(choice!=3);
           
        
        }
    }
    

