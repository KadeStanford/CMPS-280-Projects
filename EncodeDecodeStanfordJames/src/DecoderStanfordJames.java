public class DecoderStanfordJames {

  private int offset;

  public DecoderStanfordJames(int offset) {
    this.offset = offset; //sets the given offset to offset
  }

  public char decode(char ch) {
    if (!Character.isLetter(ch)) { //checks to see if the char is a letter, if it is not, then it is not decoded.
      return ch;
    } else { // if the char is a letter, it is decoded accordingly
      char base = Character.isUpperCase(ch) ? 'A' : 'a';
      return (char) ((ch - base - offset + 26) % 26 + base); // This formula will return the decoded char with the offset applied
    }
  }
}
