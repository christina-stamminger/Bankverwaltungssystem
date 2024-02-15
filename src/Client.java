class Client {
    // Erstellen Sie eine Klasse namens "Kunde" mit Feldern für den Namen, das Alter und die
    //Adresse des Kunden
    String name;
    int age;
    String address;
    //constructor
    public void newClient (String nameOfClient, int ageOfClient, String addressOfClient) {
        name = nameOfClient;
        age = ageOfClient;
        address = addressOfClient;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
}
