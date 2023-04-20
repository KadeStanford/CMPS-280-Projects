public abstract class AttractionStanfordJames {

  String name;
  String inPark;
  String description;

  public AttractionStanfordJames(
    String name,
    String inPark,
    String description
  ) {
    this.name = name;
    this.inPark = inPark;
    this.description = description;
  }

  //make get methods for every variable
  public String getName() {
    return name;
  }

  public String getInPark() {
    return inPark;
  }

  public String getDescription() {
    return description;
  }
}
