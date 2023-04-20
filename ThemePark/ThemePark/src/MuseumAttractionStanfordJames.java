public class MuseumAttractionStanfordJames extends AttractionStanfordJames {

  String notableRelics;

  public MuseumAttractionStanfordJames(
    String name,
    String inPark,
    String description,
    String notableRelics
  ) {
    super(name, inPark, description);
  }

  public String getNotableRelics() {
    return notableRelics;
  }
}
