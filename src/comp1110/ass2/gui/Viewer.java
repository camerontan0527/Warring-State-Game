package comp1110.ass2.gui;

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

    private static final int VIEWER_WIDTH = 933;
    private static final int VIEWER_HEIGHT = 700;

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group controls = new Group();
    TextField textField;



    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement A valid placement string
     */
    private void assignCards() { //assigns the different cards in the game
        Rectangle a1= new Rectangle();
        a1.setHeight(100);//specifies the hieght
        a1.setWidth(100);//specifies the width
        a1.setFill(Color.RED);//specifies the colour
        Text texta1= new Text("Qin, Duke Xiao");
        StackPane stack = new StackPane();
        stack.getChildren().addAll(a1, texta1);



        Rectangle a2= new Rectangle();
        a2.setHeight(100);
        a2.setWidth(100);
        a2.setFill(Color.RED);
        Text texta2= new Text("Qin, Shang Yang");
        StackPane stack2 = new StackPane();
        stack.getChildren().addAll(a2, texta2);


        Rectangle a3= new Rectangle();
        a3.setHeight(100);
        a3.setWidth(100);
        a3.setFill(Color.RED);



        Rectangle a4= new Rectangle();
        a4.setHeight(100);
        a4.setWidth(100);
        a4.setFill(Color.RED);


        Rectangle a5= new Rectangle();
        a5.setHeight(100);
        a5.setWidth(100);
        a5.setFill(Color.RED);


        Rectangle a6= new Rectangle();
        a6.setHeight(100);
        a6.setWidth(100);
        a6.setFill(Color.RED);

        Rectangle a7= new Rectangle();
        a7.setHeight(100);
        a7.setWidth(100);
        a7.setFill(Color.RED);


        Rectangle a8= new Rectangle();
        a8.setHeight(100);
        a8.setWidth(100);
        a8.setFill(Color.RED);


        Rectangle b1= new Rectangle();
        b1.setHeight(100);
        b1.setWidth(100);
        b1.setFill(Color.PURPLE);


        Rectangle b2= new Rectangle();
        b2.setHeight(100);
        b2.setWidth(100);
        b2.setFill(Color.PURPLE);


        Rectangle b3= new Rectangle();
        b3.setHeight(100);
        b3.setWidth(100);
        b3.setFill(Color.PURPLE);


        Rectangle b4= new Rectangle();
        b4.setHeight(100);
        b4.setWidth(100);
        b4.setFill(Color.PURPLE);


        Rectangle b5= new Rectangle();
        b5.setHeight(100);
        b5.setWidth(100);
        b5.setFill(Color.PURPLE);


        Rectangle b6= new Rectangle();
        b6.setHeight(100);
        b6.setWidth(100);
        b6.setFill(Color.PURPLE);


        Rectangle b7= new Rectangle();
        b7.setHeight(100);
        b7.setWidth(100);
        b7.setFill(Color.PURPLE);


        Rectangle c1= new Rectangle();
        c1.setHeight(100);
        c1.setWidth(100);
        c1.setFill(Color.YELLOW);


        Rectangle c2= new Rectangle();
        c2.setHeight(100);
        c2.setWidth(100);
        c2.setFill(Color.YELLOW);


        Rectangle c3= new Rectangle();
        c3.setHeight(100);
        c3.setWidth(100);
        c3.setFill(Color.YELLOW);


        Rectangle c4= new Rectangle();
        c4.setHeight(100);
        c4.setWidth(100);
        c4.setFill(Color.YELLOW);


        Rectangle c5= new Rectangle();
        c5.setHeight(100);
        c5.setWidth(100);
        c5.setFill(Color.YELLOW);


        Rectangle c6= new Rectangle();
        c6.setHeight(100);
        c6.setWidth(100);
        c6.setFill(Color.YELLOW);


        Rectangle d1= new Rectangle();
        d1.setHeight(100);
        d1.setWidth(100);
        d1.setFill(Color.GREEN);


        Rectangle d2= new Rectangle();
        d2.setHeight(100);
        d2.setWidth(100);
        d2.setFill(Color.GREEN);


        Rectangle d3= new Rectangle();
        d3.setHeight(100);
        d3.setWidth(100);
        d3.setFill(Color.GREEN);


        Rectangle d4= new Rectangle();
        d4.setHeight(100);
        d4.setWidth(100);
        d4.setFill(Color.GREEN);

        Rectangle d5= new Rectangle();
        d5.setHeight(100);
        d5.setWidth(100);
        d5.setFill(Color.GREEN);

        Rectangle e1= new Rectangle();
        e1.setHeight(100);
        e1.setWidth(100);
        e1.setFill(Color.GRAY);

        Rectangle e2= new Rectangle();
        e2.setHeight(100);
        e2.setWidth(100);
        e2.setFill(Color.GRAY);

        Rectangle e3= new Rectangle();
        e3.setHeight(100);
        e3.setWidth(100);
        e3.setFill(Color.GRAY);

        Rectangle e4= new Rectangle();
        e4.setHeight(100);
        e4.setWidth(100);
        e4.setFill(Color.GRAY);

        Rectangle f1= new Rectangle();
        f1.setHeight(100);
        f1.setWidth(100);
        f1.setFill(Color.BLUE);


        Rectangle f2= new Rectangle();
        f2.setHeight(100);
        f2.setWidth(100);
        f2.setFill(Color.BLUE);

        Rectangle f3= new Rectangle();
        f3.setHeight(100);
        f3.setWidth(100);
        f3.setFill(Color.BLUE);

        Rectangle g1= new Rectangle();
        g1.setHeight(100);
        g1.setWidth(100);
        g1.setFill(Color.BEIGE);

        Rectangle g2= new Rectangle();
        g2.setHeight(100);
        g2.setWidth(100);
        g2.setFill(Color.BEIGE);

        Rectangle z9= new Rectangle();
        z9.setHeight(100);
        z9.setWidth(100);
        z9.setFill(Color.BLACK);

    }

    void makePlacement(String placement) {
        // FIXME Task 4: implement the simple placement viewer
        //need to first check if the placement string is valid using isPlacementWellFormed function
        //assign color to each kingdom and number to each card in kingdom
        //extract the individual card from the placement and its location
        //use matrix colum and row to specify the location

        String[] array = placement.split("(?<=\\G...)");
        for (int i=0; i<=array.length; i++) {
            if (array[i].charAt(2) == 'A') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }

            } else  if (array[i].charAt(2)=='B') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='C') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='D') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='E') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='F') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='G') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='H') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='I') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='J') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='K') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='L') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            }  if (array[i].charAt(2)=='M') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='N') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='O') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='P') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='Q') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='R') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='S') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='T') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='U') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='V') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='W') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='X') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='Y') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='Z') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='0') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='1') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='2') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='3') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='4') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='5') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='6') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='7') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='8') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            } else  if (array[i].charAt(2)=='9') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    return;
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    return;
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    return;
                }
            }
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
        Shape shape = new Rectangle(600,600);
        shape.setFill(Color.WHITE);
        shape.setStroke(Color.BLACK);
        //https://www.youtube.com/watch?v=u9XjA5eRUrE
        root.getChildren().add(shape);
//creating a matrix
        int SIZE = 6;
        int length = SIZE;
        int width = SIZE;

        GridPane root = new GridPane();
        Button [][] matrix; //names the matrix
        matrix = new Button[width][length];



        makeControls();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
