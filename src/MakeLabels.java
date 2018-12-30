import java.util.*;

public class MakeLabels {
	
    static int count;
        /**
         * Contains a switch case to make labels. It also can determine if a user is going over or under the amount of labels they said they were going to make. It also prints out the labels.
         * @param args 
         */
	public static void main(String[] args){
            
            
            Scanner console = new Scanner(System.in);
            
            System.out.println("How many labels do you want to make?");
            int howMany = console.nextInt();
            AddrLabelInterface [] labels = new AddrLabelInterface [howMany];
            
            int choice;
            
            do{
                choice = menu();
                switch(choice){
                    case 1:
                        if (count < howMany)
                        {
                        FriendAddrLabel label1 = makeFriendAddrLabel();
                        labels[count] = label1;
                        countUp();
                        }
                        else{
                            System.out.println("You have made enough labels.");
                        }
                        break;
                    case 2:
                        if (count < howMany)
                        {
                        CompanyAddrLabel label2 = makeCompAddrLabel();
                        labels[count] = label2;
                        countUp();
                        }else{
                            System.out.println("You have made enough labels.");
                        }
                        break;
                    case 3:
                        if (count < howMany)
                        {
                        ProfessionalAddrLabel label3 = makeProfAddrLabel();
                        labels[count] = label3;
                        countUp();
                        }else{
                            System.out.println("You have made enough labels.");
                        }
                        break;
                    case 4:
                        if (howMany > count)
                        {
                            System.out.println("You still have some more labels to make");
                        }
                        else
                        {
                            LabelGenerator gen = new LabelGenerator (labels);
                            gen.printLabels();
                        }
                        break;
                    case 5:
                        System.out.println("Good bye!");

                }
            }while (choice != 5);  
        }
        
        /**
         * Increments whenever a label has been completed.
         */
        public static void countUp()
        {
            count++; 
        }
        /**
         * This collects the data to make a company address label and then returns the label.
         * @return the friend address label
         */
        public static FriendAddrLabel makeFriendAddrLabel()
        {
            String name, street, city, state, zip;
            Scanner console = new Scanner(System.in);
            
            System.out.print("Name: ");
            name = console.nextLine();
            
            System.out.print("Street: ");
            street = console.nextLine(); 
         
            System.out.print("City: ");
            city = console.nextLine();
            
            System.out.print("State: ");
            state = console.nextLine();
            
            System.out.print("Zip Code: ");
            zip = console.nextLine();
                        
            FriendAddrLabel label = new FriendAddrLabel (name, street, city, state, zip);
                    
            return label;
        }
        /**
         * This collects the data to make a company address label and then returns the label.
         * @return the company label.
         */
        public static CompanyAddrLabel makeCompAddrLabel()
        {
            Scanner console = new Scanner(System.in);
            
            System.out.print("AttnName: ");
            String name = console.nextLine();
            System.out.print("Title: ");
            String title = console.nextLine();
            System.out.print("Company: ");
            String company = console.nextLine();
            System.out.print("Street: ");
            String street = console.nextLine();
            System.out.print("City: ");
            String city = console.nextLine();
            System.out.print("State: ");
            String state = console.nextLine();
            System.out.print("Zip: ");
            String zip = console.nextLine();
                        
            CompanyAddrLabel label = new CompanyAddrLabel (name, title, company, street, city, state, zip);
                    
            return label;
        }
        
        /**
         * Uses the input from the user and creates a professional address label
         * @return Returns the label
         */
        public static ProfessionalAddrLabel makeProfAddrLabel()
        {
            Scanner console = new Scanner(System.in);
            
            System.out.print("Name: ");
            String name = console.nextLine();
            System.out.print("Suffix: ");
            String suffix = console.nextLine();
            System.out.print("Street: ");
            String street = console.nextLine();
            System.out.print("Suite: ");
            String suite = console.nextLine();
            System.out.print("City: ");
            String city = console.nextLine();
            System.out.print("State: ");
            String state = console.nextLine();
            System.out.print("Zip: ");
            String zip = console.nextLine();
            
            ProfessionalAddrLabel label = new ProfessionalAddrLabel(name, suffix, street, suite, city, state, zip);
            
            return label;
        }
        
        /**
         * Displays menu for user and returns their choice.
         * @return the user's choice
         */
        public static int menu()
        {
            Scanner console = new Scanner(System.in);
            int choice = 0;
            System.out.println("Make your labels");
            System.out.println("1: Friend Address Label");
            System.out.println("2: Company Address Label");
            System.out.println("3. Professional Address Label");
            System.out.println("4: Generate Labels");
            System.out.println("5. Exit");
            
            do{
            try{
                choice = console.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("That is the incorrect input. Choose your option by the correct number"); 
            }
            console.nextLine();
            }while (choice <= 0);
            
            return choice;
        }
}
   