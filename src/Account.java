class Account {
    //Erstellen Sie eine Klasse namens "Konto" mit Feldern für die Kontonummer, den Kunden
    //(vom Typ Kunde) und den Kontostand


    int accountNumber;
    boolean isPrivat;
    double balance;

    //Implementieren Sie Methoden in der Klasse Konto, um Geld einzuzahlen und abzuheben,
    //den Kontostand abzufragen und die Kontoinformationen anzuzeigen (einschließlich
    //Kundendetails)

    public void newAccount (int accountNumberOfClient, boolean privateClient, double balanceOfClient ) {
        accountNumber = accountNumberOfClient;
        isPrivat = privateClient;
        balance = balanceOfClient;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public boolean getPrivatClient() {
        return isPrivat;
    }
    public double getBalance() {
        return balance;
    }

    public void doDeposit(double amountOfDeposit) {
        balance = balance + amountOfDeposit;
    }

    public void doWithdraw(double amountOfWithdraw) {
        if (balance-amountOfWithdraw >= 0) {
            balance = balance - amountOfWithdraw;
        }
        else {
            System.out.println("You cannot withdraw your desired amount. Your balance is " + balance);
        }

    }



}
