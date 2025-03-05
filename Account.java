package task;
import java.util.ArrayList;
import java.util.Scanner;

   // Julie's part

   public class Account { 

	   	static ArrayList<String> accountID = new ArrayList<>();
        static ArrayList<String> accountHolderName = new ArrayList<>();
        static ArrayList<Double> Balance = new ArrayList <>();
        static ArrayList<String> accountType = new ArrayList <>();

        static Scanner sc = new Scanner(System.in);

       
         void createAccount() {
        	System.out.println("Please enter the account ID: ");
        	String newid = sc.next();
        	accountID.add(newid);
        	System.out.println("Enter the account holder name: ");
        	String newname = sc.next();
        	accountHolderName.add(newname);
     		System.out.println("Enter the balance: ");
     		double newbalance = sc.nextDouble();
     		Balance.add(newbalance);
     		System.out.println("Enter the account Type: ");
     		String newtype = sc.next();
	     	accountType.add(newtype);
        }
    
        void viewBalance(String id) {
        	int index = accountID.indexOf(id);
        	System.out.println("User " + id + "'s current balance is: " + Balance.get(index));
        }

        public void deposit() {
        	System.out.println("Enter the account id:" );
        	String id = sc.next();
        	int index = accountID.indexOf(id);
        	
        	if (Admin.blockedAccount.contains(id)) {
                System.out.println("This account is blocked and cannot perform transactions.");
                return; 
            }
        	
        	double balance = Balance.get(index);
        	System.out.println("Enter the amount that you want to deposit: ");
        	double amount = sc.nextDouble();

        	if (amount > 0) {
        		balance += amount;
        		Balance.set(index, balance);
        		System.out.println("$" + amount + "is deposited.");
        	} else {
        		System.out.println("Invalid Amount!");
        	} }

 

        void withdraw() {
        	System.out.println("Enter the account id:" );
        	String id = sc.next();
        	int index = accountID.indexOf(id);
        	
        	if (Admin.blockedAccount.contains(id)) {
                System.out.println("This account is blocked and cannot perform transactions.");
                return; 
            }
        	
        	double balance = Balance.get(index);

        	System.out.println("Enter the amount that you want to deposit: ");
        	double amount = sc.nextDouble();
        		
        	if (amount > balance) {
        		System.out.print("Insufficient Balance!");
        	} else {
        		balance -= amount;
        		Balance.set(index, balance);
        		System.out.println("$" + amount + " is withdrawed.");

        	} }

        void transferFunds() {
        	System.out.println("From account(ID): ");
        	String fromaccount = sc.next();
        	int from = accountID.indexOf(fromaccount);
        	
        	if (Admin.blockedAccount.contains(fromaccount)) {
                System.out.println("This account is blocked and cannot perform transactions.");
                return; 
            }
        	
        	System.out.println("Enter the transfer funds:");
        	double funds = sc.nextDouble();
        	if (funds > Balance.get(from)) {
        		System.out.println("Insufficient Balance!");
        	} else {  
        		System.out.println("To account(ID): ");
        		String toaccount = sc.next();
        		int to = accountID.indexOf(toaccount);
        		
        		if (Admin.blockedAccount.contains(toaccount)) {
                    System.out.println("This account is blocked and cannot perform transactions.");
                    return; 
                }

     
        		Balance.set(to, (Balance.get(to) + funds));
        		Balance.set(from, (Balance.get(from) - funds));
        		System.out.println("$" + funds + "has been transfered from " + fromaccount + " to " + toaccount);
        	}}
        
	 		   //Shuhan's part
        		public class User {		    
        			    static ArrayList<String> USERID = new ArrayList<>();
        			    static ArrayList<String> NAME = new ArrayList<>();
        			    static ArrayList<String> PASSWORD = new ArrayList<>();
        			    static ArrayList<String> EMAIL = new ArrayList<>();
        			    static ArrayList<String> addresses = new ArrayList<>();
        			    static ArrayList<String> contacts = new ArrayList<>();
        	    
        	    public void registerUser() {  
        	        System.out.print("Enter User ID: ");
        	        String userId = sc.nextLine();
        	        System.out.print("Username: ");
        	        String username = sc.nextLine();
        	        System.out.print("Password: ");
        	        String password = sc.nextLine();
        	        System.out.print("Email: ");
        	        String email = sc.nextLine();
        	       
        	        USERID.add(userId);
        	        NAME.add(username);
        	        PASSWORD.add(password);
        	        EMAIL.add(email);
        	        
        	        System.out.println( "user" + username + "register successfully " + userId);
        	        } 
        	    
        	     public void login() {
        	    	 System.out.println("Enter the user name: ");
        	    	 String username = sc.next();
        	    	 System.out.println("Enterh the password: ");
        	    	 String password = sc.next();
        	            for (int i = 0; i < USERID.size();i++) {
        	            	String storedUsername = NAME.get(i);
        	                String storedPassword = PASSWORD.get(i);
        	       
        	                if (username.equals(storedUsername)) {
        	                	if(password.equals(storedPassword)) {
        	                    System.out.println("Login successful");
        	                    break; 
        	                	}else {
        	                		System.out.println("The password is wrong");
        	                	}
        	                }else {
        	                	System.out.println("The username or the password is wrong.");
        	                }}}
        	    
        	        public void viewAccountDetails() {
        	        	System.out.println("Enter the user id: ");
        	        	String id = sc.next();
        	        	for (String find: USERID) {
        	        		if (id.equals(find)) {
        	        			int index = USERID.indexOf(find);
        	        			System.out.println("UserId: " + id);
        	        			System.out.println("Username: " + NAME.get(index));
        	        			System.out.println("Email: " + EMAIL.get(index));
        	        			System.out.print("Address: " + addresses.get(index)) ;
        	        			System.out.println("Contact information: " + contacts.get(index));
        	        			return;
        	        	}}}
        	    	
        	       public void updateAccountInfo() {
        	    	   System.out.println("Enter the user ID: ");
        	    	   
        	    	   String id = sc.nextLine();
        	    	   
        	    	   for (int i = 0; i < USERID.size(); i++) {
        	    		   if (id.equals(USERID.get(i))) {
        	            	   System.out.print("Enter new address: ");
        	                   String newAddress = sc.nextLine();
        	                   addresses.set(i, newAddress);
        	                   
        	                   System.out.print("Enter new contact info: ");
        	                   String newContactInfo = sc.nextLine();
        	                   contacts.set(i, newContactInfo);
        	       }}}
		     
		    //Sienna's part
		     class Transaction {
		    	    private int transactionid;
		    	    private String accountid;
		    	    private String transactiontype;
		    	    private double total;
		    	    private String date;

		    	    static ArrayList<Integer> transactionIds = new ArrayList<>();
		    	    static ArrayList<String> accountIds = new ArrayList<>();
		    	    static ArrayList<String> transactionTypes = new ArrayList<>();
		    	    static ArrayList<Double> amounts = new ArrayList<>();
		    	    static ArrayList<String> transactionDates = new ArrayList<>();

		    	    public Transaction(int transactionId, String accountId, String transactionType, double amount, String transactionDate) {
		    	        this.transactionid = transactionId;
		    	        this.accountid = accountId;
		    	        this.transactiontype = transactionType;
		    	        this.total = amount;
		    	        this.date = transactionDate;
		    	    }

		    	    public void addTransaction() {
		    	        System.out.print("Enter Account ID: ");
		    	        String id = Account.sc.next();
		    	       
		    	        for (int i = 0; i < Account.accountID.size(); i++) {
		    	            if (Account.accountID.get(i).equals(id)) {
		    	                System.out.print("Enter Transaction Type (Deposit or Withdrawal): ");
		    	                String transactionType = sc.next();
		    	                System.out.print("Enter Transaction Date (YYYY-MM-DD): ");
		    	                String transactionDate = sc.next();
		    	                System.out.print("Enter Amount: ");
		    	                double amount = sc.nextDouble();

		    	                int transactionId = transactionIds.size() + 1;
		    	                transactionIds.add(transactionId);
		    	                accountIds.add(id);
		    	                transactionTypes.add(transactionType);
		    	                amounts.add(amount);
		    	                transactionDates.add(transactionDate);

		    	                System.out.println("Transaction added successfully!");
		    	                return; 
		    	            }}

		    	        System.out.println("Account not found!");
		    	    }

		    	    public void viewTransactionHistory() {
		    	        System.out.print("Enter your account ID: ");
		    	        String id = Account.sc.next();

		    	        for (int i = 0; i < accountIds.size(); i++) {
		    	            if (accountIds.get(i).equals(id)) {
		    	                System.out.println("Transaction ID: " + transactionIds.get(i));
		    	                System.out.println("Transaction Type: " + transactionTypes.get(i));
		    	                System.out.println("Amount: " + amounts.get(i));
		    	                System.out.println("Date: " + transactionDates.get(i));
		    	            }}}

		    	    public void generateReport() {
		    	        System.out.print("Enter your account ID: ");
		    	        String checkId = Account.sc.next();

		    	        double totalDeposit = 0;
		    	        double totalWithdraw = 0;

		    	        for (int i = 0; i < accountIds.size(); i++) {
		    	            if (accountIds.get(i).equals(checkId)) {
		    	                if (transactionTypes.get(i).equalsIgnoreCase("Deposit")) {
		    	                    totalDeposit += amounts.get(i);
		    	                } else if (transactionTypes.get(i).equalsIgnoreCase("Withdrawal")) {
		    	                    totalWithdraw += amounts.get(i);
		    	                }}}

		    	        System.out.println("Total Deposits: " + totalDeposit);
		    	        System.out.println("Total Withdrawals: " + totalWithdraw);
		    	    }}


		    // Debbie's part
		     	class Admin extends User {
		
		     		ArrayList <String> blockedAccount= new ArrayList <>();
		     		
		     		public void viewAllAccounts() {
		     			for (int i = 0; i < accountID.size(); i ++) {
		     				System.out.println(accountID.get(i) + " " + accountHolderName.get(i) + " " + " Balance: " + Balance.get(i));
		     			}}
		    	
		     		public void blockUser() {
		     			System.out.println("Please enter the account ID that you want to blocked: ");
		     			String Block = sc.next();
		     			System.out.println("Account" + accountID + " is blocked.");
		     		}
		    	
		     		public void viewTransactions() {
		     			System.out.print("Enter Account ID to view transactions: ");
		     			String accountId = sc.next();
		     			System.out.println("Transactions for Account ID " + accountId + ":");
		     			for (int i = 0; i < Transaction.accountIds.size() ; i ++) {	   
		     				if (Transaction.accountIds.get(i).equals(accountId)){
		     					System.out.println(Transaction.transactionIds.get(i) + " " + Transaction.transactionTypes + " $" + Transaction.amounts.get(i) + " " + Transaction.transactionDates);
		     				}}}
		               	 
            	public class Main {
            	public static void main(String[] args) {
            	        Scanner sc = new Scanner(System.in);

            	        Account account = new Account();
            	        User user = new User();
            	        Admin admin = new Admin();
            	        Transaction transaction = new Transaction(0, null, null, 0, null);

            	        while (true) {
            	            System.out.println("---------MENU--------");
            	            System.out.println("Which service do you want?");
            	            System.out.println("1. Bank Account Management");
            	            System.out.println("2. User Management");
            	            System.out.println("3. Transaction History & Report Management");
            	            System.out.println("4. Admin Management");
            	            System.out.println("Exit.");           	        
            	            System.out.println("Enter your choice: ");
            	            int choice = sc.nextInt();

            	            if (choice == 1) {
            	                System.out.println("------Bank Account Management------");
            	                System.out.println("1. Create a new account");
            	                System.out.println("2. View Balance");
            	                System.out.println("3. Deposit");
            	                System.out.println("4. Withdraw");
            	                System.out.println("5. Transfer funds");
            	                System.out.print("Enter your choice: ");
            	                int option = sc.nextInt();

            	                if (option == 1) {
            	                    account.createAccount();
            	                } else if (option == 2) {
            	                    System.out.print("Enter account ID: ");
            	                    String id = sc.next();
            	                    account.viewBalance(id);
            	                } else if (option == 3) {
            	                    account.deposit();
            	                } else if (option == 4) {
            	                    account.withdraw();
            	                } else if (option == 5) {
            	                    account.transferFunds();
            	                }
            	            } else if (choice == 2) {
            	                System.out.println("------User Management------");
            	                System.out.println("1. Register User");
            	                System.out.println("2. Login");
            	                System.out.println("3. View Account Details");
            	                System.out.println("4. Update Account Info");
            	                System.out.print("Enter your choice: ");
            	                int option = sc.nextInt();

            	                if (option == 1) {
            	                    user.registerUser();
            	                } else if (option == 2) {
            	                    user.login();
            	                } else if (option == 3) {
            	                    user.viewAccountDetails();
            	                } else if (option == 4) {
            	                 user.updateAccountInfo();
            	                }
            	            } else if (choice == 3) {
            	                System.out.println("------Transaction History & Report Management------");
            	                System.out.println("1. Add Transaction");
            	                System.out.println("2. View Transaction History");
            	                System.out.println("3. Generate Report");
            	                System.out.print("Enter your choice: ");
            	                int option = sc.nextInt();

            	                if (option == 1) {
            	                    transaction.addTransaction();
            	                } else if (option == 2) {
            	                    transaction.viewTransactionHistory();
            	                } else if (option == 3) {
            	                    transaction.generateReport();
            	                }
            	            } else if (choice == 4) {
            	                System.out.println("------Admin Management------");
            	                System.out.println("1. View All Accounts");
            	                System.out.println("2. Block User");
            	                System.out.println("3. View Transactions");
            	                System.out.print("Enter your choice: ");
            	                int option = sc.nextInt();

            	                if (option == 1) {
            	                    admin.viewAllAccounts();
            	                } else if (option == 2) {
            	                    admin.blockUser();
            	                } else if (option == 3) {
            	                    admin.viewTransactions();
            	                }
            	            } else if (choice == 5) {
            	            	System.out.println("It's exiting...");
            	            	sc.close();
            	            	break;
            	            }
            	        }
            	    }
            	}}}}
            	

