import java.util.Scanner;

public class McDonaldsCupStanfordJames extends ContainerStanfordJames {

  public String size;
  public String material;
  public String sodaType;
  public int sodaAmount;
  public int iceAmount;
  Scanner input = new Scanner(System.in);

  public McDonaldsCupStanfordJames(int storageLevel) {
    super(storageLevel);
    material = "Plastic";
  }

  public void makeCup() {
    System.out.println(
      "What size cup would you like?:\n 1. 8oz \n 2. 16oz\n 3. 32oz"
    );
    size = input.nextLine();
    if (size.equals("1")) {
      size = "8oz";
    }
    if (size.equals("2")) {
      size = "16oz";
    }
    if (size.equals("3")) {
      size = "32oz";
    }

    System.out.println(
      "What soda would you like? :\n 1. Coke\n 2. Dr. Pepper\n 3. Sprite\n 4. Fanta\n 5. Root Beer"
    );
    sodaType = input.nextLine();
    if (sodaType.equals("1")) {
      sodaType = "Coke";
    }
    if (sodaType.equals("2")) {
      sodaType = "Dr. Pepper";
    }
    if (sodaType.equals("3")) {
      sodaType = "Sprite";
    }
    if (sodaType.equals("4")) {
      sodaType = "Fanta";
    }
    if (sodaType.equals("5")) {
      sodaType = "Root Beer";
    }

    System.out.println(
      "How much ice would you like?:\n 1. 1/3 ice \n 2. half ice\n 3. 2/3 ice"
    );
    iceAmount = input.nextInt();
    if (iceAmount == 1) {
      iceAmount = 25;
      sodaAmount = 75;
      storageLevel = 100;
    }
    if (iceAmount == 2) {
      iceAmount = 50;
      sodaAmount = 50;
      storageLevel = 100;
    }
    if (iceAmount == 3) {
      iceAmount = 75;
      sodaAmount = 25;
      storageLevel = 100;
    }
  }

  public void getProperties() {
    System.out.println(
      "Size: " +
      size +
      "\n" +
      "Free Space: " +
      storageLevel +
      "\n" +
      "Soda Type: " +
      sodaType +
      "\n" +
      "Ice Amount: " +
      iceAmount +
      "\n"
    );
  }
}
