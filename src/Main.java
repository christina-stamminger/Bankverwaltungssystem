import java.util.HashMap;
//import java.util.Scanner;

public class Main {

    //class Bankverwaltungssystem - for what? should all the code be in there?
    class Bankverwaltungssystem {
        //class Bankverwaltungssystem
    }

    public static void main(String[] args) {
   /*     Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        Account account = new Account();


        System.out.println("Please enter your name: ");
        String nameOfClient = scanner.nextLine();

        System.out.println("Please enter your address: ");
        String addressOfClient = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int ageOfClient = scanner.nextInt();

        client.newClient(nameOfClient, ageOfClient, addressOfClient);

        System.out.println("There is a new client in the system: ");
        System.out.println("Name: " + client.getName() + " Age: " + client.getAge() + " Address: " + client.getAddress());

       // System.out.println("Please enter your account");
*/

        //------- Hashmaps for client and account, key: accountNumber ---------
        HashMap<Integer,Client> myClientMap = new HashMap<>();
        HashMap<Integer,Account> myAccountMap = new HashMap<>();

        //------- Examples of 3 diff. clients ----------------
        Client client1 = new Client();
        Account account1 = new Account();
        client1.newClient("John Smith",22,"Park Street 4, Toronto");
        account1.newAccount(99001,true,300);

        Client client2 = new Client();
        Account account2 = new Account();
        client2.newClient("Sarah Riley",43,"Baker Street 43, London");
        account2.newAccount(99002,true,9800);

         Client client3 = new Client();
         Account account3 = new Account();
         client3.newClient("Simone Müller",52,"Stadionstraße 112, Linz");
         account3.newAccount(99003,true,-87);

         myClientMap.put(account1.getAccountNumber(),client1);
         myClientMap.put(account2.getAccountNumber(),client2);
         myClientMap.put(account3.getAccountNumber(),client3);

        myAccountMap.put(account1.getAccountNumber(),account1);
        myAccountMap.put(account2.getAccountNumber(),account2);
        myAccountMap.put(account3.getAccountNumber(),account3);

        // --- Show me specific account details ----------------
        Client retClient = new Client();
        Account retAccount = new Account();
        int whichAccount = 99002;
        double amountOfDeposit = 300;
        double amountOfWithdraw = 10200;

        retClient = myClientMap.get(whichAccount);
        retAccount = myAccountMap.get(whichAccount);

        System.out.println("Client: "+retClient.getName()+ "\nAge: "+retClient.getAge() + "\nAddress: "+ retClient.getAddress());
        System.out.println("Account: "+retAccount.getAccountNumber()+ " "+ retAccount.getPrivatClient() + " "+ retAccount.getBalance());

        //---------Deposit------------------
        retAccount.doDeposit(amountOfDeposit);
        System.out.println("Amount of deposit: "+ amountOfDeposit);
        myAccountMap.put(retAccount.getAccountNumber(),retAccount);     // changed amount is saved in hashmap

        System.out.println("Accountnumber: "+retAccount.getAccountNumber() + " "+ "\nPrivate client: " +retAccount.getPrivatClient() + "\nBalance: "+ retAccount.getBalance());

        //--------Number of clients in system-----------
        System.out.println(myClientMap.size() +" clients are saved in our system.");

        //---------Withdraw------------------
        retAccount.doWithdraw(amountOfWithdraw);
        System.out.println("Amount of withdraw: " + amountOfWithdraw);
        System.out.println("Your new balance is: "+ retAccount.getBalance());

        //--------Remove a client using.remove method by key(accountNumber) ------------
        myClientMap.remove(99001);
        myAccountMap.remove(99001);
        System.out.println("Updated List of clients: " + myClientMap.size() +" clients are saved in our system.");
    }
}