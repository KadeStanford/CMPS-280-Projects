import java.util.Scanner;

public class ContainerStanfordJames {

  public int storageLevel;
  public int response;
  public int soda = 100;
  public int folder = 1;
  public int money = 0;
  Scanner input = new Scanner(System.in);

  public ContainerStanfordJames(int storageLevel) {
    this.storageLevel = storageLevel;
  }

  public void getProperties() {
    System.out.println("Storage Level: " + storageLevel);
  }

  public void makeContainer() {
    System.out.println(
      "What Container would you like to create?:\n 1. McDonald's Cup\n 2. Filing Cabinet\n 3. Money Safe"
    );
    response = input.nextInt();
    if (response == 1) {
      McDonaldsCupStanfordJames cup = new McDonaldsCupStanfordJames(0);

      cup.makeCup();
      System.out.println("\n Your container has been created!: \n");
      cup.getProperties();
    }
  }
}
