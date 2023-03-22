import java.util.Scanner;

public class EncodeDecodeStanfordJames {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //set up scanner
    System.out.print("Enter message: "); //prompt user to enter their message
    String message = scanner.nextLine();

    int offset = 9; // change this to your desired offset

    EncoderStanfordJames encoder = new EncoderStanfordJames(offset, message); //encoder that takes in (int offset, and the user's message)
    DecoderStanfordJames decoder = new DecoderStanfordJames(offset); //decoder that takes in the same offset to decode the encoded message

    System.out.print("Encoded message: "); // displays the users message encoded
    for (char ch : message.toCharArray()) { //for loop that prints off the encoded message
      System.out.print(encoder.encode(ch));
    }
    System.out.println();

    System.out.print("Decoded message: "); //displays user's message decoded
    for (char ch : encoder.getEncodedMessage().toCharArray()) { //for loop that prints off the decoded message
      System.out.print(decoder.decode(ch));
    }
    System.out.println();
  }
}
