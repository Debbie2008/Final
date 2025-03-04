package task;
import java.util.ArrayList;
import java.util.Scanner;

			// Julie's part
			public class Account { 
			
				 static ArrayList<String> USERID = new ArrayList<>();
		    	 static ArrayList<String> NAME = new ArrayList<>();
		    	 static ArrayList<String> PASSWORD = new ArrayList<>();
		    	 static ArrayList<String> EMAIL = new ArrayList<>();
		    	 static ArrayList<Double> Balance = new ArrayList <>();
		    	 static ArrayList<String> accountType = new ArrayList <>();
		    	
	
		    	 static Scanner sc = new Scanner(System.in);
		    	 
				void createAccount() {
					System.out.println("Please enter the account ID: ");
					String newid = sc.next();
					USERID.add(newid);
					System.out.println("Enter the account holder name: ");
					String newname = sc.next();
					NAME.add(newname);
					System.out.println("Enter the balance: ");
					double newbalance = sc.nextDouble();
					Balance.add(newbalance);
					System.out.println("Enter the account Type: ");
					String newtype = sc.next();
					accountType.add(newtype);
				}
				
				void viewBalance(String id) {
					int index = USERID.indexOf(id);
					System.out.println("User " + id + "'s current balance is: " + Balance.get(index));
				}
				
				public void deposit() {
					System.out.println("Enter the account id:" );
					String id = sc.next();
					int index = USERID.indexOf(id);
					double balance = Balance.get(index);
					
					System.out.println("Enter the amount that you want to deposit: ");
					double amount = sc.nextDouble();

					if (amount > 0) {
						balance += amount;
						Balance.set(index, balance);
						System.out.println("$" + amount + "is deposited.");
					} else {
						System.out.println("Invalid Amount!");
					}
				}
	
				void withdraw() {
					System.out.println("Enter the account id:" );
					String id = sc.next();
					int index = USERID.indexOf(id);
					double balance = Balance.get(index);
				
					System.out.println("Enter the amount that you want to deposit: ");
					double amount = sc.nextDouble();
					
					if (amount > balance) {
						System.out.print("Insufficient Balance!");
					} else {
						balance -= amount;
						Balance.set(index, balance);
						System.out.println("$" + amount + " is withdrawed.");
					}	
				}
				
				void transferFunds() {
					System.out.println("From account(ID): ");
					String fromaccount = sc.next();
					int from = USERID.indexOf(fromaccount);
					
					System.out.println("Enter the transfer funds:");
					double funds = sc.nextDouble();
					
					if (funds > Balance.get(from)) {
						System.out.println("Insufficient Balance!");
					} else {		
					System.out.println("To account(ID): ");
					String toaccount = sc.next();
					int to = USERID.indexOf(toaccount);
					
					
					Balance.set(to, (Balance.get(to) + funds));
					Balance.set(from, (Balance.get(from) - funds));
					
					System.out.println("$" + funds + "has been transfered from " + fromaccount + " to " + toaccount);
				}}
				
				
	 		   //Shuhan's part
		    
		     class User {
		        Scanner scanner = new Scanner(System.in);
		    	
		    	    public String userId;
		    	    public String username;
		    	    private String password;
		    	    private String email;
		    	   
		    	    
		    	    private String address;
		    	    private Integer contact;


		    	    public User(String userId, String username, String password, String email) {
		    	        this.userId = userId;
		    	        this.username = username;
		    	        this.password = password;
		    	        this.email = email;
		    	    }
		    	    
		    	    
		    	    public String getUserId() {
		    	        return userId;
		    	    }

		    	    public String getUsername() {
		    	        return username;
		    	    }
		    	    public String getEmail() {
		    	    	return email;
		    	    }
		    	    
		    	    
		    	    public void registerUser() {
		    	        System.out.print("Enter User ID: ");
		    	        String userId = scanner.nextLine();
		    	        System.out.print("Username: ");
		    	        String username = scanner.nextLine();
		    	        System.out.print("Password: ");
		    	        String password = scanner.nextLine();
		    	        System.out.print("Email: ");
		    	        String email = scanner.nextLine();
		    	        
		    	       
		    	        USERID.add(userId);
		    	        NAME.add(username);
		    	        PASSWORD.add(password);
		    	        EMAIL.add(email);
		    	        
		    	        System.out.println( "user" + username + "register successfully " + userId);
		    	        }

		    	        public void login(String username, String password) {
		    	            for (int i=0; i<USERID.size();i++) {
		    	                if (username.equals(username) && password.equals(password)) {
		    	                    System.out.println("Login successful");
		    	                }else {
		    	                	System.out.println("The username or the password is wrong");
		    	                }}}
		    	        
		    	    	public void viewAccountDetails() {
		    	    	     System.out.println("UserId: " + userId);
		    	    	     System.out.println("Username: " + username);
		    	    	     System.out.println("Email: " + email);
		    	    	 }
		    	    	
		    	        public void updateAddress() {
		    	        	System.out.print("Enter your address: ");
		    		        String address = scanner.nextLine();
		    	            this.address = address;
		    	            System.out.println("The user address is:" + address);
		    	        }
		    	        
		    	        public void updateContact() {
		    	        	System.out.print("Enter your telephone number: ");
		    		        Integer contact = scanner.nextInt();
		    	            this.contact = contact;
		    	            System.out.println("The user contact is :" + contact);
		    	        }	
		    	}
		    //Sienna
		    
		    class BankAccount{

		    	private int transactionId; 
		        private String accountId;    
		        private String transactionType; 
		        private double amount;      
		        private String transactionDate;

		         BankAccount(int transactionId, String accountId, String transactionType, double amount, String transactionDate) {
		    		this.transactionId = transactionId;
		            this.accountId = accountId;
		            this.transactionType = transactionType;
		            this.amount = amount;
		            this.transactionDate = transactionDate; 
		    }

		        public int gettransactionId() {
		        	return  transactionId;
		        }

		        public String getaccountId() {
		        	return  accountId;
		        }

		        public String gettransactionType() {
		        	return  transactionType;
		        }

		        public double getamount() {
		        	return  amount;
		        }

		        public String gettransactionDate() {
		        	return  transactionDate;
		        }}

		    public class Transaction {
		    	private ArrayList<BankAccount>transactionsstore;
		    	Scanner b = new Scanner(System.in);


		    	public Transaction() {
		    		 transactionsstore = new ArrayList<>();
		    	}

		    	

		    	public void addTransaction() {
		    		 System.out.print("Enter Account ID: ");
		    		    String aI = b.nextLine();
		    		    System.out.print("Enter Transaction Type (Deposit/Withdraw): ");
		    		    String tT = b.nextLine();
		    		    System.out.print("Enter Transaction Date (YYYY-MM-DD): ");
		    		    String tD = b.nextLine();
		    		    System.out.print("Enter Amount: ");
		    		    double a = b.nextDouble();
		    		    int tI = transactionsstore.size() + 1;
		    		    transactionsstore.add(new BankAccount(tI, aI, tT, a, tD));
		    	}

		    	

		    	public void viewTransactionHistory() {
		    		System.out.print("Please inter your account ID:");
		    		String checkId = b.nextLine();
		    		for(BankAccount obj : transactionsstore) {
		    			if (obj.getaccountId().equals(checkId)) {
		    				 System.out.println("Transaction ID: " + obj.gettransactionId());
		    		            System.out.println("Type: " + obj.gettransactionType());
		    		            System.out.println("Amount: " + obj.getamount());
		    		            System.out.println("Date: " + obj.gettransactionDate());
		    			}
		    		}}

		    	

		    	public void generateReport() {
		    		double totalDeposit = 0;
		    		double totalWithdraw = 0;
		    		System.out.print("Please inter your account ID:");
		    		String chackId = b.nextLine();
		    		for(BankAccount obj : transactionsstore) {
		    			if(obj.getaccountId().equals(chackId)) {
		    			if (obj.gettransactionType().equalsIgnoreCase("Deposit")) {
		    				totalDeposit =  totalDeposit + obj.getamount();
		    				System.out.println("Total Deposits: " + totalDeposit);
		    		     }else if (obj.gettransactionType().equalsIgnoreCase("Withdraw")) {
		    				totalWithdraw = totalWithdraw - obj.getamount();
		    				System.out.println("Total Withdrawals: " + totalWithdraw);
		    			}}}

		    // Debbie's part
		        class Admin extends User{
		    	
		    	Admin(String username, String password){
		    		super (username, password);
		    	}
		    	
		    	public void viewAllAccounts() {
		    		for (int i = 0; i < accountID.size(); i ++) {
		    			System.out.println(accountID.get(i) + " " + accountHolderName.get(i) + " " + balance);
		    		}
		    	}
		    	
		    	public void blockUser() {
		    		Scanner sc = new Scanner(System.in);
		    		System.out.println("Please enter the account ID that you want to blocked: ");
		    		String block = sc.nextLine();
		    		System.out.println("Account" + accountID + " is blocked.");
		    	}
		    	
		    	public void viewTransactions(ArrayList<Transaction> transactions, int accountId) {
		    		        System.out.println("Transactions for Account ID " + accountId + ":");
		    		        for ()
		    		
		    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}}}
