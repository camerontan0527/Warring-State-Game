package comp1110.ass2.gui;


import gittest.C;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.StackPane;

import javafx.scene.text.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A very simple viewer for card layouts in the Warring States game.
 * <p>
 * NOTE: This class is separate from your main game class.  This
 * class does not play a game, it just illustrates various card placements.
 */


public class Viewer extends Application {

    static char[][] row = {
            {'4', 'Y', 'S', 'M', 'G', 'A'},
            {'5', 'Z', 'T', 'N', 'H', 'B'},
            {'6', '0', 'U', 'O', 'I', 'C'},
            {'7', '1', 'V', 'P', 'J', 'D'},
            {'8', '2', 'W', 'Q', 'K', 'E'},
            {'9', '3', 'X', 'R', 'L', 'F'}};
    static char[][] column =
            {{'4', '5', '6', '7', '8', '9'},
                    {'Y', 'Z', '0', '1', '2', '3'},
                    {'S', 'T', 'U', 'V', 'W', 'X'},
                    {'M', 'N', 'O', 'P', 'Q', 'R'},
                    {'G', 'H', 'I', 'J', 'K', 'L'},
                    {'A', 'B', 'C', 'D', 'E', 'F'}};


    private static final int VIEWER_WIDTH = 933;
    private static final int VIEWER_HEIGHT = 700;
    private static final int CARD_SIZE = 100;
    private static final int X_CARDS = 6;
    private static final int Y_CARDS = 6;
    private Card[][] grid = new Card[X_CARDS][Y_CARDS];
    private static final String URI_BASE = "assets/";
    private final Group root = new Group();
    private final Group controls = new Group();
    TextField textField;

    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement A valid placement string
     */


    void makePlacement(String placement) {
        // FIXME Task 4: implement the simple placement viewer
        //TEST PLACEMENT STRING: a0Aa1Ba2Ca3Da4Ea5Fa6Ga7Hb0Ib1Jb2Kb3Lb4Mb5Nb6Oc0Pc1Qc2Rc3Sc4Tc5Ud0Vd1Wd2Xd3Yd4Ze00e11e22e33f04f15f26g07g18z09
        //https://stackoverflow.com/questions/2297347/splitting-a-string-at-every-n-th-character (split string)
        String[] array = placement.split("(?<=\\G...)");
        List<Integer> rowlst = new ArrayList<>();
        List<Integer> columnlst = new ArrayList<>();
        for (String elem : array) {
            int rowIndex = 0;  // return the row where zhang is
            for (char[] r : row) {
                if (new String(r).contains(String.valueOf(elem.charAt(2)))) {
                    rowIndex = Arrays.asList(row).indexOf(r);
                    rowlst.add(rowIndex);
                }
            }
            int columnIndex = 0;  // return the column where zhang is
            for (char[] c : column) {
                if (new String(c).contains(String.valueOf(elem.charAt(2)))) {
                    columnIndex = Arrays.asList(column).indexOf(c);
                    columnlst.add(columnIndex);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == 'a') {
                Rectangle Ac = new Rectangle(100, 100);
                Ac.setFill(Color.RED);
                Ac.setTranslateX(columnlst.get(i) * 100);
                Ac.setTranslateY(rowlst.get(i) * 100);
                Ac.setStroke(Color.WHITE);
                root.getChildren().addAll(Ac);
            }else if(array[i].charAt(0)=='b'){
                Rectangle Bc=new Rectangle(100,100);
                Bc.setFill(Color.PINK);
                Bc.setTranslateX(columnlst.get(i)*100);
                Bc.setTranslateY(rowlst.get(i)*100);
                Bc.setStroke(Color.WHITE);
                root.getChildren().addAll(Bc);
            }else if(array[i].charAt(0)=='c'){
                Rectangle Cc=new Rectangle(100,100);
                Cc.setFill(Color.ORANGE);
                Cc.setStroke(Color.WHITE);
                Cc.setTranslateX(columnlst.get(i)*100);
                Cc.setTranslateY(rowlst.get(i)*100);
                root.getChildren().addAll(Cc);
            }else if(array[i].charAt(0)=='d'){
                Rectangle Dc=new Rectangle(100,100);
                Dc.setFill(Color.YELLOW);
                Dc.setStroke(Color.WHITE);
                Dc.setTranslateX(columnlst.get(i)*100);
                Dc.setTranslateY(rowlst.get(i)*100);
                root.getChildren().addAll(Dc);
            }else if(array[i].charAt(0)=='e'){
                Rectangle Ec=new Rectangle(100,100);
                Ec.setFill(Color.GREEN);
                Ec.setStroke(Color.WHITE);
                Ec.setTranslateX(columnlst.get(i)*100);
                Ec.setTranslateY(rowlst.get(i)*100);
                root.getChildren().addAll(Ec);
            }else if(array[i].charAt(0)=='f'){
                Rectangle Fc=new Rectangle(100,100);
                Fc.setFill(Color.BLUE);
                Fc.setStroke(Color.WHITE);
                Fc.setTranslateX(columnlst.get(i)*100);
                Fc.setTranslateY(rowlst.get(i)*100);
                root.getChildren().addAll(Fc);
            }else if(array[i].charAt(0)=='g'){
                Rectangle Gc=new Rectangle(100,100);
                Gc.setFill(Color.PURPLE);
                Gc.setStroke(Color.WHITE);
                Gc.setTranslateX(columnlst.get(i)*100);
                Gc.setTranslateY(rowlst.get(i)*100);
                root.getChildren().addAll(Gc);
            }else if(array[i].charAt(0)=='z'){
                Rectangle Zc=new Rectangle(100,100);
                Zc.setFill(Color.GRAY);
                Zc.setStroke(Color.WHITE);
                Zc.setTranslateX(columnlst.get(i)*100);
                Zc.setTranslateY(rowlst.get(i)*100);
                root.getChildren().addAll(Zc);
            }
        }
    }

    public class Card extends StackPane {
        int x;
        int y;
        private Rectangle border = new Rectangle(CARD_SIZE - 2, CARD_SIZE - 2);

        public Card(int x, int y) {
            this.x = x;
            this.y = y;
            setTranslateX(x * CARD_SIZE); //number of cards in the x direction
            setTranslateY(y * CARD_SIZE);//number of cards in the y direction
            border.setStroke(Color.LIGHTGRAY);
            getChildren().addAll(border);

        }
    }


    /**
     * Create a basic text field for input and a refresh button.
     */
    private void makeControls() {
        Label label1 = new Label("Placement:");
        textField = new TextField();
        textField.setPrefWidth(300);
        Button button = new Button("Refresh");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                makePlacement(textField.getText());
                textField.clear();
            }
        });
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField, button);
        hb.setSpacing(10);
        hb.setLayoutX(130);
        hb.setLayoutY(VIEWER_HEIGHT - 50);
        controls.getChildren().add(hb);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Warring States Viewer");
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        root.getChildren().add(controls);
        //   Shape shape = new Rectangle(600,600);
        //  shape.setFill(Color.WHITE);
        //  shape.setStroke(Color.BLACK);
        //  root.getChildren().add(shape);
//loop to generate a grid if the number of cards in the x and y direction are less then 6.
        //https://www.youtube.com/watch?v=JwcyxuKko_M
        for (int y = 0; y < Y_CARDS; y++) {
            for (int x = 0; x < X_CARDS; x++) {
                Card card = new Card(x, y);
                grid[x][y] = card;
                root.getChildren().add(card);
            }
        }



        makeControls();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
