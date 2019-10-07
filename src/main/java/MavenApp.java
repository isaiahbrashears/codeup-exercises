import org.apache.commons.lang3.StringUtils;

public class MavenApp {

    public static void main(String[] args) {
        Input input = new Input();

        String userInput = input.getString("Enter Something: ");


        if (StringUtils.isNumeric(userInput)){
            System.out.println("\"" + userInput + "\" is a number");

        }else{
            System.out.println("\"" + userInput + "\" is not a number");
            System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
            System.out.println("Reversed: " + StringUtils.reverse(userInput));
        }


    }
}
