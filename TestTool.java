import java.util.Scanner;
// IMPORT

public class TestTool
{
    public void doTest()
    {
        System.out.print("Java network tool\nEnter host:\n>");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        
        while(!input.equals("stop"))
        {
            try
            { 
                // GET NAME
                
                // PRINT HOST ADDRESS
                
                // CHECK REACHABILITY
            }
            catch(Exception e)
            {
                System.out.println("an error ocurred\n");
            }
            System.out.print("Enter host:\n>");
            input = reader.nextLine();
        }
        System.out.println("Finished!\n");
    }
    
    public static void main(String[] args)
    {
        TestTool tester = new TestTool();
        tester.doTest();
    }
}
