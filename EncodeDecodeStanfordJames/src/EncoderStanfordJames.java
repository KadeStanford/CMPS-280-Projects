public class EncoderStanfordJames {

  private int offset;
  private String message;

  public EncoderStanfordJames(int offset, String message) {
    this.offset = offset; //sets offset to the given offset
    this.message = message; //sets message as the user's message
  }

  public char encode(char ch) { //Checks if the char is a letter, if it is not, then it will not be encoded
    if (!Character.isLetter(ch)) {
      return ch;
    } else { // if the char is a letter, then it will be encoded accordingly.
      char base = Character.isUpperCase(ch) ? 'A' : 'a'; //sets the base character to 'A' or 'a' depending on if the char is uppercase or lowercase.
      return (char) ((ch - base + offset + 26) % 26 + base); // this formula will return the encoded char with the offset applied
    }
  }

  public String getEncodedMessage() { //StringBuilder method to construct a string out of the encoded chars
    StringBuilder sb = new StringBuilder();
    for (char ch : message.toCharArray()) {
      sb.append(encode(ch));
    }
    return sb.toString();
  }
}
