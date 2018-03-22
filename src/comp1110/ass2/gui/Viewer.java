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
    private void assignCards() { //assigns the different cards in the game

    }

    void makePlacement(String placement) {
        // FIXME Task 4: implement the simple placement viewer
        //need to first check if the placement string is valid using isPlacementWellFormed function
        //assign color to each kingdom and number to each card in kingdom
        //extract the individual card from the placement and its location
        //use matrix colum and row to specify the location
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

   //     GridPane gridPane = new GridPane();
//**
        String[] array = placement.split("(?<=\\G...)");

    }
  //  private void RectangleDisplay() {
         //display 36 rectangles inside big rectangle

    //        int rectSideLength = 10;
         //   var graphics: any;
      //      for (int x =0; x<6; ++x)
        //{
          //      for (int y = 0; y <6; y++){
            //        DrawRect(graphics, x * rectSideLength, y * rectSideLength, rectSideLength, rectSideLength);
              //  }
            //}}
          //  public void DrawRect (graphics:any, int x, int y, int length, int hieght){
            //    graphics.drawRect (x, y, length, hieght);
           // }
private class Card extends StackPane {
        private int x;
        private int y;
        public Card(int x, int y){
        this.x=x;
        this.y=y;
        setTranslateX(x*CARD_SIZE);
        setTranslateY(y*CARD_SIZE);
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
        root.getChildren().add(shape);

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
