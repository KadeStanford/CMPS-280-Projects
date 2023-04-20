public class GiftShopAttractionStanfordJames extends AttractionStanfordJames {

  public String collectable;

  public GiftShopAttractionStanfordJames(
    String name,
    String inPark,
    String description,
    String collectable
  ) {
    super(name, inPark, description);
  }

  public String getCollectable() {
    return collectable;
  }
}
