package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import comp1110.ass2.gui.Viewer;
import comp1110.ass2.WarringStatesGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game extends Application {
    private static final int BOARD_WIDTH = 933;
    private static final int BOARD_HEIGHT = 700;
    private static final int CARD_SIZE = 100;
    private static final int X_CARDS = 6;
    private static final int Y_CARDS = 6;
    private Card[][] grid = new Card[X_CARDS][Y_CARDS];

    // FIXME Task 9: Implement a basic playable Warring States game in JavaFX
    //two to four player game
    //player can make a valid move
    //show error in new window if invalid move
    //collect all cards in the same kingdom
    //update flag
    //end game when there are no valid moves
    private final Group root = new Group();
    private final Group controls = new Group();
    private String moveSequence = "";
    private String placement = "";
    private String setup_global = "";

    public void boardGenerator(String setup){
        placement = setup;
        setup_global = setup;
        String[] array = setup.split("(?<=\\G...)");
        List<Integer> rowlst = new ArrayList<>();
        List<Integer> columnlst = new ArrayList<>();
        for (String elem : array) {
            int rowIndex = 0;  // return the row where zhang is
            for (char[] r : Viewer.row) {
                if (new String(r).contains(String.valueOf(elem.charAt(2)))) {
                    rowIndex = Arrays.asList(Viewer.row).indexOf(r);
                    rowlst.add(rowIndex);
                }
            }
            int columnIndex = 0;  // return the column where zhang is
            for (char[] c : Viewer.column) {
                if (new String(c).contains(String.valueOf(elem.charAt(2)))) {
                    columnIndex = Arrays.asList(Viewer.column).indexOf(c);
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

    private String updatePlacement(String pl, char location){
        String[] array = pl.split("(?<=\\G...)");
        String target_loc = "";
        String new_loc = "";
        String z_loc = "";
        for (String elem : array) {
            if (elem.charAt(2) == location)
                target_loc = elem;
            if (elem.substring(0, 2) == "z9")
                z_loc = elem;
        }
        new_loc = "z9" + location;
        placement.replace(z_loc, "");
        placement.replace(target_loc, new_loc);
        return placement;
    }

    private void makeControls(){
        Label label1 = new Label("Placement:");
        TextField textField1 = new TextField();
        textField1.setPrefWidth(300);
        Button button1 = new Button("Refresh");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                boardGenerator(textField1.getText());
                textField1.clear();
            }
        });
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField1, button1);
        hb.setSpacing(10);
        hb.setLayoutX(130);
        hb.setLayoutY(BOARD_HEIGHT - 50);
        controls.getChildren().add(hb);
    }

    private void makeMoves(){
        Label label2 = new Label("Next Move");
        TextField textField2 = new TextField();
        textField2.setPrefWidth(300);
        Button button2 = new Button("Enter");
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                char move = textField2.getText().charAt(0);
                moveSequence += move;
                if (WarringStatesGame.isMoveSequenceValid(setup_global, moveSequence)){
                    placement = updatePlacement(placement, move);
                }
                boardGenerator(placement);
                textField2.clear();
            }
        });
        HBox hb = new HBox();
        hb.getChildren().addAll(label2, textField2, button2);
        hb.setSpacing(10);
        hb.setLayoutX(130);
        hb.setLayoutY(BOARD_HEIGHT - 100);
        controls.getChildren().add(hb);
    }



    // FIXME Task 11: Allow players of your Warring States game to play against your simple agent

    // FIXME Task 12: Integrate a more advanced opponent into your game

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Warring States Game");
        Scene scene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
        root.getChildren().add(controls);
        for (int y = 0; y < Y_CARDS; y++) {
            for (int x = 0; x < X_CARDS; x++) {
                Card card = new Card(x, y);
                grid[x][y] = card;
                root.getChildren().add(card);
            }
        }
        makeControls();
        makeMoves();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

