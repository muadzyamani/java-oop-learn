import java.awt.Color;

public class Main {

    public static void main(String[] args) {

        Color myTrunkColor = Tree.TRUNK_COLOR;
        Color myDefaultWhite = Color.WHITE;
        Color myDefaultBlue = Color.BLUE;
        Color myDefaultDarkGray = Color.DARK_GRAY;

        Color brighterBlue = myDefaultBlue.brighter();
        Color brighterDarkGray = myDefaultDarkGray.brighter();

        System.out.println(myDefaultDarkGray);
        System.out.println(brighterDarkGray);
    }
}
