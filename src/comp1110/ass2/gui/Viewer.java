package comp1110.ass2.gui;

import gittest.A;
import gittest.C;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import comp1110.ass2.WarringStatesGame;

/**
 * A very simple viewer for card layouts in the Warring States game.
 * <p>
 * NOTE: This class is separate from your main game class.  This
 * class does not play a game, it just illustrates various card placements.
 */


public class Viewer extends Application {

    char[][] location = {
            {'4', 'Y', 'S', 'M', 'G', 'A'},
            {'5', 'Z', 'T', 'N', 'H', 'B'},
            {'6', '0', 'U', 'O', 'I', 'C'},
            {'7', '1', 'V', 'P', 'J', 'D'},
            {'8', '2', 'W', 'Q', 'K', 'E'},
            {'9', '3', 'X', 'R', 'L', 'F'}};


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
        //need to first check if the placement string is valid using isPlacementWellFormed function
        //assign color to each kingdom and number to each card in kingdom
        //extract the individual card from the placement and its location
        //use matrix colum and row to specify the location

//
        //TEST PLACEMENT STRING
//a0Aa1Ba2Ca3Da4Ea5Fa6Ga7Hb0Ib1Jb2Kb3Lb4Mb5Nb6Oc0Pc1Qc2Rc3Sc4Tc5Ud0Vd1Wd2Xd3Yd4Ze00e11e22e33f04f15f26g07g18z09

        String[] array = placement.split("(?<=\\G...)");

        for (int a = 0; a <= array.length; a++){//goes through the array placement string
         for ( int i = 0; i <location.length; ++i ) {//checks the row
                String s = ""+ array[a].charAt(2);//converts char to string
                if (location[i].toString().contains(s)) {
                    for ( int j = 0; j <location[i].length; ++j ) {//checks the column
                    if (location[i].toString().indexOf(array[a].charAt(2))==j) {// first checks what row the location is in then checks the column using the row
                        if (array[a].charAt(0) == 'a') {
                            Card cardA = new Card(i, j);
                            Rectangle Ac = new Rectangle(100, 100);
                            Ac.setFill(Color.RED);
                            grid[i][j] = cardA;
                            root.getChildren().addAll(cardA, Ac);
                        } else if (array[a].charAt(0) == 'b') {
                            Card cardB = new Card(i, j);
                            Rectangle Bc = new Rectangle(100, 100);
                            Bc.setFill(Color.GREEN);
                            grid[i][j] = cardB;
                            root.getChildren().addAll(cardB, Bc);
                        } else if (array[a].charAt(0) == 'c') {
                            Card cardC = new Card(i, j);
                            Rectangle Cc = new Rectangle(100, 100);
                            Cc.setFill(Color.BEIGE);
                            grid[i][j] = cardC;
                            root.getChildren().addAll(cardC, Cc);
                        } else if (array[a].charAt(0) == 'd') {
                            Card cardD = new Card(i, j);
                            Rectangle Dc = new Rectangle(100, 100);
                            Dc.setFill(Color.PINK);
                            grid[i][j] = cardD;
                            root.getChildren().addAll(cardD, Dc);
                        } else if (array[a].charAt(0) == 'e') {
                            Card cardE = new Card(i, j);
                            Rectangle Ec = new Rectangle(100, 100);
                            Ec.setFill(Color.PURPLE);
                            grid[i][j] = cardE;
                            root.getChildren().addAll(cardE, Ec);
                        } else if (array[a].charAt(0) == 'f') {
                            Card cardF = new Card(i, j);
                            Rectangle Fc = new Rectangle(100, 100);
                            Fc.setFill(Color.YELLOW);
                            grid[i][j] = cardF;
                            root.getChildren().addAll(cardF, Fc);
                        } else if (array[a].charAt(0) == 'g') {
                            Card cardG = new Card(i, j);
                            Rectangle Gc = new Rectangle(100, 100);
                            Gc.setFill(Color.RED);
                            grid[i][j] = cardG;
                            root.getChildren().addAll(cardG, Gc);
                        } else if (array[a].charAt(0) == 'z') {
                            Card cardZ = new Card(i, j);
                            Rectangle Zc = new Rectangle(100, 100);
                            Zc.setFill(Color.RED);
                            grid[i][j] = cardZ;
                            root.getChildren().addAll(cardZ, Zc);
                        }
                    }

                }

            }
        }
         //   https://stackoverflow.com/questions/8408316/return-position-of-value-in-a-2d-array-java


        }
    }

private class Card extends StackPane {
        private int x;
        private int y;
        private Rectangle border = new Rectangle(CARD_SIZE-2, CARD_SIZE-2);

        public Card(int x, int y){
        this.x=x;
        this.y=y;
        setTranslateX(x*CARD_SIZE); //number of cards in the x direction
        setTranslateY(y*CARD_SIZE);//number of cards in the y direction
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
        for (int y= 0; y <Y_CARDS; y++){
            for (int x=0; x<X_CARDS; x++){
                Card card = new Card(x, y);
                grid [x][y]=card;
                root.getChildren().add(card);
            }
        }

//https://www.youtube.com/watch?v=JwcyxuKko_M

        makeControls();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
