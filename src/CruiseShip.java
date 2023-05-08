import java.util.ArrayList;
import java.util.Scanner;

public class CruiseShip {
	public int total;
    private String shipName;
    private int numberOfCabins;
    private ArrayList<Cabin> cabinList;

    public CruiseShip(String shipName, int numberOfCabins) {
        this.shipName = shipName;
        this.total= total;
        this.numberOfCabins = numberOfCabins;
        this.cabinList = new ArrayList<Cabin>();
    }

    public void initializeCabins() {
        for (int i = 1; i <= numberOfCabins; i++) {
            String category = (i % 2 == 0) ? "Economy" : "Luxury";
            int rate = (category.equals("Luxury")) ? 1000 : 2000; // change rate based on category
            cabinList.add(new Cabin(i, category, rate));
        }
    }
    
    public void bookCabin(String guestName, int cabinNumber) {
        for (Cabin cabin : cabinList) {
            if (cabin.getCabinNumber() == cabinNumber) {
                if (cabin.isAvailable()) {
                    cabin.bookCabin(guestName);
                    System.out.println("Cabin " + cabinNumber + " has been booked by " + guestName);
                } else {
                    System.out.println("Sorry, cabin " + cabinNumber + " is not available");
                }
                return;
            }
        }
        System.out.println("Invalid cabin number");
    }

    public void displayAvailableCabins() {
        System.out.println("Available cabins:");
        for (Cabin cabin : cabinList) {
            if (cabin.isAvailable()) {
                System.out.println("Cabin " + cabin.getCabinNumber() + " - " + cabin.getCategory());
            }
        }
    }
    public void generateBill(int cabinNumber) {    	
    	total = 0; 
        for (Cabin cabin : cabinList) {
            if (cabin.getCabinNumber() == cabinNumber && !cabin.isAvailable()) {
                int rate = cabin.getRate();
                int days = 7; // assume a week-long cruise
                total = (rate * days);       
        System.out.println("Cabin " + cabinNumber + " - " + cabin.getCategory());
        System.out.println("Guest Name: " + cabin.getGuestName());
        System.out.println("Rate per day: $" + rate);
        System.out.println("Days: " + days);
        System.out.println("Total: $" + total);
        return;}
        }
    }
    public void SelectFood(){
    	System.out.println("There are 3 different Food Packages::");
    	System.out.println("1.Premium Food Package = Rs. 400 / day");
    	System.out.println("2.Silver Food Package = Rs. 300 / day");
    	System.out.println("3.Platinum Food Package = Rs. 200 / day");
    	System.out.println("Enter Your Choice (1/2/3)::"); 
    	Scanner sc=new Scanner(System.in);
    	int ch = sc.nextInt();    	
    	Food premiumfood= new Food(1,400,"Premium Food");
    	Food silverfood = new Food(2,300,"Silver Food");
    	Food platinumfood=new Food(3,200,"Platinum Food");
    	int FoodBill=0;
    	if(ch==1)
    	{	FoodBill=premiumfood.getFoodrate() * 7;
    		System.out.println("Your Total Food Bill would be::"+FoodBill);	}
    	else if(ch==1)
    	{	FoodBill=silverfood.getFoodrate() * 7;
	     	System.out.println("Your Total Food Bill would be::"+FoodBill);	}
    	else if(ch==1)
    	{	FoodBill=platinumfood.getFoodrate() * 7;
    		System.out.println("Your Total Food Bill would be::"+FoodBill);	}
    	else
    	{	System.out.println("Wrong Choice!!!");}
    	int TotalBill = FoodBill + total;
    	System.out.println("Your Total Bill is ::"+TotalBill);
    }    
    public static void main(String[] args){
    	  Scanner scanner = new Scanner(System.in);
          CruiseShip cruiseShip = new CruiseShip("Awesome Ship", 3); // create a new cruise ship with 10 cabins
          cruiseShip.initializeCabins(); // initialize the cabins
          boolean ch=true ;
          while (ch = true) {
              System.out.println("\n=== Cabin Booking System ===");
              System.out.println("1. Book a cabin");
              System.out.println("2. Display available cabins");
              System.out.println("3. Generate bill for cabin");
              System.out.println("4. Select Food Package & Check Out");
              System.out.println("5. Exit");
              System.out.print("Enter your choice: ");
              int choice = scanner.nextInt();
              
              switch (choice) {
                  case 1:
                      System.out.print("Enter guest name: ");
                      scanner.nextLine(); // consume newline character
                      String guestName = scanner.nextLine();
                      System.out.print("Enter cabin number: ");
                      int cabinNumber = scanner.nextInt();
                      cruiseShip.bookCabin(guestName, cabinNumber);
                      break;
                      
                  case 2:
                      cruiseShip.displayAvailableCabins();
                      break;
                      
                  case 3:
                      System.out.print("Enter cabin number: ");
                      int cabinNumber2 = scanner.nextInt();
                      cruiseShip.generateBill(cabinNumber2);
                      break;
                      
                  case 4:
                	  System.out.println("Enter Food Package");
                	  cruiseShip.SelectFood();
                      
                  case 5:
                	   System.out.println("Thank you for using the Cabin Booking System!");
                	   ch = false ;
                	   break;
		
              }   }
    }    }