import java.util.Scanner;

public class FilingCabinetStanfordJames extends ContainerStanfordJames {

  public String material;
  public String size;
  public int drawerCount;
  public String response;
  public int response2;
  public int fileCount;

  Scanner input = new Scanner(System.in);

  public FilingCabinetStanfordJames(int storageLevel) {
    super(storageLevel);
    material = "metal";
  }

  public void makeCabinet() {
    System.out.println(
      "How many drawers does this cabinet have?:\n 1. 1 Drawer\n 2. 2 Drawers\n 3. 3 Drawers\n 4. 4 Drawers"
    );
    drawerCount = input.nextInt();

    System.out.println(
      "Would you like to put any folders in the drawer?: (y/n)"
    );
    if (response.equals("y")) {}
  }

  public void drawerManagement(int drawerCount) {
    for (int i = 0; i <= drawerCount; i++) {
      CabinetDrawersStanfordJames cabinet = new CabinetDrawersStanfordJames(i);
    }
  }

  public void addFolders() {
    System.out.println("How many files would you like to add?");
    response2 = input.nextInt();
  }
}
