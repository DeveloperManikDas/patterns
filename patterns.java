import java.util.*; 

class patterns{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Please enter the line: "); 
        // int n = sc.nextInt(); 
        int n = 4; 
        System.out.println("I need to print "+ n + " lines."); 

        for(int line = 1; line<= n; line++){
            for(int star=1; star <= line; star++){
                System.out.print("*"); 
            }
            System.out.println(""); 
        }
        sc.close(); 
    }
}