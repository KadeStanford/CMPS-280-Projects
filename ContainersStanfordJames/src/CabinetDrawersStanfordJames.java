import javax.swing.border.StrokeBorder;

public class CabinetDrawersStanfordJames extends FilingCabinetStanfordJames {

  public int folders;
  public int storageOverflow;
  public int drawerAmount;

  public CabinetDrawersStanfordJames(int storageLevel, int drawerAmount) {
    super(storageLevel);
    this.drawerAmount = drawerAmount;
  }

  public void folderStorage(int folders) {
    folders += storageOverflow;
    storageLevel += storageOverflow;
    if (storageLevel > 100) {}
  }
}
