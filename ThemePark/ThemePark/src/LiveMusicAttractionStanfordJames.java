public class LiveMusicAttractionStanfordJames extends AttractionStanfordJames {

  String genre;
  String topSong1;
  String topSong2;
  String topSong3;

  public LiveMusicAttractionStanfordJames(
    String name,
    String inPark,
    String description,
    String genre,
    String topSong1,
    String topSong2,
    String topSong3
  ) {
    super(name, inPark, description);
    this.genre = genre;
    this.topSong1 = topSong1;
    this.topSong2 = topSong2;
    this.topSong3 = topSong3;
  }

  public String getGenre() {
    return genre;
  }

  public String getTopSong1() {
    return topSong1;
  }

  public String getTopSong2() {
    return topSong2;
  }

  public String getTopSong3() {
    return topSong3;
  }
}
