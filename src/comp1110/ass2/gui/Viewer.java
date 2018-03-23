package comp1110.ass2.gui;

import gittest.A;
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

//


        String[] array = placement.split("(?<=\\G...)");

        for (int i = 0; i <= array.length; i++) {
            if (array[i].charAt(2) == 'A') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    Card A1 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Duke Xiao");
                    grid[5][0] = A1;
                    root.getChildren().addAll(A1, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    Card A2 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Shang Yang");
                    grid[5][0] = A2;
                    root.getChildren().addAll(A2, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    Card A3 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Hui");
                    grid[5][0] = A3;
                    root.getChildren().addAll(A3, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    Card A4 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Zhaoxiang");
                    grid[5][0] = A4;
                    root.getChildren().addAll(A4, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    Card A5 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Lady Mi");
                    grid[5][0] = A5;
                    root.getChildren().addAll(A5, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    Card A6 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Bai Qi");
                    grid[5][0] = A6;
                    root.getChildren().addAll(A6, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    Card A7 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Lady Zhao");
                    grid[5][0] = A7;
                    root.getChildren().addAll(A7, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    Card A8 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Zheng");
                    grid[5][0] = A8;
                    root.getChildren().addAll(A8, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    Card B1 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Xuan");
                    grid[5][0] = B1;
                    root.getChildren().addAll(B1, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    Card B2 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Zhong Wuyan");
                    grid[5][0] = B2;
                    root.getChildren().addAll(B2, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    Card B3 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Lord Menchang");
                    grid[5][0] = B3;
                    root.getChildren().addAll(B3, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    Card B4 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Xiang");
                    grid[5][0] = B4;
                    root.getChildren().addAll(B4, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    Card B5 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Queen Junwang");
                    grid[5][0] = B5;
                    root.getChildren().addAll(B5, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    Card B6 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Jian");
                    grid[5][0] = B6;
                    root.getChildren().addAll(B6, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    Card B7 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Sun Bin");
                    grid[5][0] = B7;
                    root.getChildren().addAll(B7, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    Card C1 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Wu Qi");
                    grid[5][0] = C1;
                    root.getChildren().addAll(C1, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    Card C2 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, King Kaolie");
                    grid[5][0] = C2;
                    root.getChildren().addAll(C2, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    Card C3 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, King You");
                    grid[5][0] = C3;
                    root.getChildren().addAll(C3, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    Card C3 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Qu Yuan");
                    grid[5][0] = C3;
                    root.getChildren().addAll(C3, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    Card C4 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Fuchu");
                    grid[5][0] = C4;
                    root.getChildren().addAll(C4, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    Card C5 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Lord Chunshen");
                    grid[5][0] = C5;
                    root.getChildren().addAll(C5, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    Card D1 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, King Wuling");
                    grid[5][0] = D1;
                    root.getChildren().addAll(D1, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    Card D2 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Lord Pingyuan");
                    grid[5][0] = D2;
                    root.getChildren().addAll(D2, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    Card D3 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, King Xiaocheng");
                    grid[5][0] = D3;
                    root.getChildren().addAll(D3, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    Card D4 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Li Mu");
                    grid[5][0] = D4;
                    root.getChildren().addAll(D4, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    Card D5 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Lian Po");
                    grid[5][0] = D5;
                    root.getChildren().addAll(D5, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    Card E1 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, Marquess Ai");
                    grid[5][0] = E1;
                    root.getChildren().addAll(E1, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    Card E2 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, King Huanhui");
                    grid[5][0] = E2;
                    root.getChildren().addAll(E2, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    Card E3 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, King An");
                    grid[5][0] = E3;
                    root.getChildren().addAll(E3, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    Card E4 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, Han Fei");
                    grid[5][0] = E4;
                    root.getChildren().addAll(E4, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    Card F1 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, Marquess Wen");
                    grid[5][0] = F1;
                    root.getChildren().addAll(F1, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    Card F2 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, Lord Xinling");
                    grid[5][0] = F2;
                    root.getChildren().addAll(F2, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    Card F3 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, King Anxi");
                    grid[5][0] = F3;
                    root.getChildren().addAll(F3, border, t1);
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    Card G1 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PURPLE);
                    Text t1 = new Text("Yan, King Xi");
                    grid[5][0] = G1;
                    root.getChildren().addAll(G1, border, t1);
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    Card G2 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PURPLE);
                    Text t1 = new Text("Yan, Prince Dan");
                    grid[5][0] = G2;
                    root.getChildren().addAll(G2, border, t1);
                } else if (array[i].charAt(0) == 'z' && array[i].charAt(1) == '9') {
                    Card Z9 = new Card(5, 0);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLACK);
                    Text t1 = new Text("Zhang Yi");
                    grid[5][0] = Z9;
                    root.getChildren().addAll(Z9, border, t1);
                }

            } else if (array[i].charAt(2) == 'B') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    Card A1 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Duke Xiao");
                    grid[5][1] = A1;
                    root.getChildren().addAll(A1, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    Card A2 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Shang Yang");
                    grid[5][1] = A2;
                    root.getChildren().addAll(A2, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    Card A3 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Hui");
                    grid[5][1] = A3;
                    root.getChildren().addAll(A3, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    Card A4 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Zhaoxiang");
                    grid[5][1] = A4;
                    root.getChildren().addAll(A4, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    Card A5 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Lady Mi");
                    grid[5][1] = A5;
                    root.getChildren().addAll(A5, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    Card A6 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Bai Qi");
                    grid[5][1] = A6;
                    root.getChildren().addAll(A6, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    Card A7 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Lady Zhao");
                    grid[5][1] = A7;
                    root.getChildren().addAll(A7, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    Card A8 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Zheng");
                    grid[5][1] = A8;
                    root.getChildren().addAll(A8, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    Card B1 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Xuan");
                    grid[5][1] = B1;
                    root.getChildren().addAll(B1, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    Card B2 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Zhong Wuyan");
                    grid[5][1] = B2;
                    root.getChildren().addAll(B2, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    Card B3 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Lord Menchang");
                    grid[5][1] = B3;
                    root.getChildren().addAll(B3, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    Card B4 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Xiang");
                    grid[5][1] = B4;
                    root.getChildren().addAll(B4, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    Card B5 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Queen Junwang");
                    grid[5][1] = B5;
                    root.getChildren().addAll(B5, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    Card B6 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Jian");
                    grid[5][1] = B6;
                    root.getChildren().addAll(B6, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    Card B7 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Sun Bin");
                    grid[5][1] = B7;
                    root.getChildren().addAll(B7, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    Card C1 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Wu Qi");
                    grid[5][1] = C1;
                    root.getChildren().addAll(C1, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    Card C2 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, King Kaolie");
                    grid[5][1] = C2;
                    root.getChildren().addAll(C2, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    Card C3 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, King You");
                    grid[5][1] = C3;
                    root.getChildren().addAll(C3, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    Card C3 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Qu Yuan");
                    grid[5][1] = C3;
                    root.getChildren().addAll(C3, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    Card C4 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Fuchu");
                    grid[5][1] = C4;
                    root.getChildren().addAll(C4, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    Card C5 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Lord Chunshen");
                    grid[5][1] = C5;
                    root.getChildren().addAll(C5, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    Card D1 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, King Wuling");
                    grid[5][1] = D1;
                    root.getChildren().addAll(D1, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    Card D2 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Lord Pingyuan");
                    grid[5][1] = D2;
                    root.getChildren().addAll(D2, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    Card D3 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, King Xiaocheng");
                    grid[5][1] = D3;
                    root.getChildren().addAll(D3, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    Card D4 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Li Mu");
                    grid[5][1] = D4;
                    root.getChildren().addAll(D4, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    Card D5 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Lian Po");
                    grid[5][1] = D5;
                    root.getChildren().addAll(D5, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    Card E1 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, Marquess Ai");
                    grid[5][1] = E1;
                    root.getChildren().addAll(E1, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    Card E2 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, King Huanhui");
                    grid[5][1] = E2;
                    root.getChildren().addAll(E2, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    Card E3 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, King An");
                    grid[5][1] = E3;
                    root.getChildren().addAll(E3, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    Card E4 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, Han Fei");
                    grid[5][1] = E4;
                    root.getChildren().addAll(E4, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    Card F1 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, Marquess Wen");
                    grid[5][1] = F1;
                    root.getChildren().addAll(F1, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    Card F2 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, Lord Xinling");
                    grid[5][1] = F2;
                    root.getChildren().addAll(F2, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    Card F3 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, King Anxi");
                    grid[5][1] = F3;
                    root.getChildren().addAll(F3, border, t1);
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    Card G1 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PURPLE);
                    Text t1 = new Text("Yan, King Xi");
                    grid[5][1] = G1;
                    root.getChildren().addAll(G1, border, t1);
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    Card G2 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PURPLE);
                    Text t1 = new Text("Yan, Prince Dan");
                    grid[5][1] = G2;
                    root.getChildren().addAll(G2, border, t1);
                } else if (array[i].charAt(0) == 'z' && array[i].charAt(1) == '9') {
                    Card Z9 = new Card(5, 1);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLACK);
                    Text t1 = new Text("Zhang Yi");
                    grid[5][1] = Z9;
                    root.getChildren().addAll(Z9, border, t1);
                }

            }else if (array[i].charAt(2) == 'C') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    Card A1 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Duke Xiao");
                    grid[5][2] = A1;
                    root.getChildren().addAll(A1, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    Card A2 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Shang Yang");
                    grid[5][2] = A2;
                    root.getChildren().addAll(A2, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    Card A3 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Hui");
                    grid[5][2] = A3;
                    root.getChildren().addAll(A3, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    Card A4 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Zhaoxiang");
                    grid[5][2] = A4;
                    root.getChildren().addAll(A4, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    Card A5 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Lady Mi");
                    grid[5][2] = A5;
                    root.getChildren().addAll(A5, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    Card A6 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Bai Qi");
                    grid[5][2] = A6;
                    root.getChildren().addAll(A6, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    Card A7 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Lady Zhao");
                    grid[5][2] = A7;
                    root.getChildren().addAll(A7, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    Card A8 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Zheng");
                    grid[5][2] = A8;
                    root.getChildren().addAll(A8, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    Card B1 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Xuan");
                    grid[5][2] = B1;
                    root.getChildren().addAll(B1, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    Card B2 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Zhong Wuyan");
                    grid[5][2] = B2;
                    root.getChildren().addAll(B2, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    Card B3 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Lord Menchang");
                    grid[5][2] = B3;
                    root.getChildren().addAll(B3, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    Card B4 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Xiang");
                    grid[5][2] = B4;
                    root.getChildren().addAll(B4, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    Card B5 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Queen Junwang");
                    grid[5][2] = B5;
                    root.getChildren().addAll(B5, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    Card B6 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Jian");
                    grid[5][2] = B6;
                    root.getChildren().addAll(B6, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    Card B7 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Sun Bin");
                    grid[5][2] = B7;
                    root.getChildren().addAll(B7, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    Card C1 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Wu Qi");
                    grid[5][2] = C1;
                    root.getChildren().addAll(C1, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    Card C2 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, King Kaolie");
                    grid[5][2] = C2;
                    root.getChildren().addAll(C2, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    Card C3 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, King You");
                    grid[5][2] = C3;
                    root.getChildren().addAll(C3, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    Card C3 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Qu Yuan");
                    grid[5][2] = C3;
                    root.getChildren().addAll(C3, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    Card C4 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Fuchu");
                    grid[5][2] = C4;
                    root.getChildren().addAll(C4, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    Card C5 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Lord Chunshen");
                    grid[5][2] = C5;
                    root.getChildren().addAll(C5, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    Card D1 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, King Wuling");
                    grid[5][2] = D1;
                    root.getChildren().addAll(D1, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    Card D2 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Lord Pingyuan");
                    grid[5][2] = D2;
                    root.getChildren().addAll(D2, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    Card D3 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, King Xiaocheng");
                    grid[5][2] = D3;
                    root.getChildren().addAll(D3, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    Card D4 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Li Mu");
                    grid[5][2] = D4;
                    root.getChildren().addAll(D4, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    Card D5 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Lian Po");
                    grid[5][2] = D5;
                    root.getChildren().addAll(D5, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    Card E1 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, Marquess Ai");
                    grid[5][2] = E1;
                    root.getChildren().addAll(E1, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    Card E2 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, King Huanhui");
                    grid[5][2] = E2;
                    root.getChildren().addAll(E2, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    Card E3 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, King An");
                    grid[5][2] = E3;
                    root.getChildren().addAll(E3, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    Card E4 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, Han Fei");
                    grid[5][2] = E4;
                    root.getChildren().addAll(E4, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    Card F1 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, Marquess Wen");
                    grid[5][2] = F1;
                    root.getChildren().addAll(F1, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    Card F2 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, Lord Xinling");
                    grid[5][2] = F2;
                    root.getChildren().addAll(F2, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    Card F3 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, King Anxi");
                    grid[5][2] = F3;
                    root.getChildren().addAll(F3, border, t1);
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    Card G1 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PURPLE);
                    Text t1 = new Text("Yan, King Xi");
                    grid[5][2] = G1;
                    root.getChildren().addAll(G1, border, t1);
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    Card G2 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PURPLE);
                    Text t1 = new Text("Yan, Prince Dan");
                    grid[5][2] = G2;
                    root.getChildren().addAll(G2, border, t1);
                } else if (array[i].charAt(0) == 'z' && array[i].charAt(1) == '9') {
                    Card Z9 = new Card(5, 2);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLACK);
                    Text t1 = new Text("Zhang Yi");
                    grid[5][2] = Z9;
                    root.getChildren().addAll(Z9, border, t1);
                }

            }else if (array[i].charAt(2) == 'D') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    Card A1 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Duke Xiao");
                    grid[5][3] = A1;
                    root.getChildren().addAll(A1, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    Card A2 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Shang Yang");
                    grid[5][3] = A2;
                    root.getChildren().addAll(A2, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    Card A3 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Hui");
                    grid[5][3] = A3;
                    root.getChildren().addAll(A3, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    Card A4 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Zhaoxiang");
                    grid[5][3] = A4;
                    root.getChildren().addAll(A4, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    Card A5 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Lady Mi");
                    grid[5][3] = A5;
                    root.getChildren().addAll(A5, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    Card A6 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Bai Qi");
                    grid[5][3] = A6;
                    root.getChildren().addAll(A6, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    Card A7 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Lady Zhao");
                    grid[5][3] = A7;
                    root.getChildren().addAll(A7, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    Card A8 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Zheng");
                    grid[5][3] = A8;
                    root.getChildren().addAll(A8, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    Card B1 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Xuan");
                    grid[5][3] = B1;
                    root.getChildren().addAll(B1, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    Card B2 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Zhong Wuyan");
                    grid[5][3] = B2;
                    root.getChildren().addAll(B2, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    Card B3 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Lord Menchang");
                    grid[5][3] = B3;
                    root.getChildren().addAll(B3, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    Card B4 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Xiang");
                    grid[5][3] = B4;
                    root.getChildren().addAll(B4, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    Card B5 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Queen Junwang");
                    grid[5][3] = B5;
                    root.getChildren().addAll(B5, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    Card B6 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Jian");
                    grid[5][3] = B6;
                    root.getChildren().addAll(B6, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    Card B7 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Sun Bin");
                    grid[5][3] = B7;
                    root.getChildren().addAll(B7, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    Card C1 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Wu Qi");
                    grid[5][3] = C1;
                    root.getChildren().addAll(C1, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    Card C2 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, King Kaolie");
                    grid[5][3] = C2;
                    root.getChildren().addAll(C2, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    Card C3 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, King You");
                    grid[5][3] = C3;
                    root.getChildren().addAll(C3, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    Card C3 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Qu Yuan");
                    grid[5][3] = C3;
                    root.getChildren().addAll(C3, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    Card C4 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Fuchu");
                    grid[5][3] = C4;
                    root.getChildren().addAll(C4, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    Card C5 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Lord Chunshen");
                    grid[5][3] = C5;
                    root.getChildren().addAll(C5, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    Card D1 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, King Wuling");
                    grid[5][3] = D1;
                    root.getChildren().addAll(D1, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    Card D2 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Lord Pingyuan");
                    grid[5][3] = D2;
                    root.getChildren().addAll(D2, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    Card D3 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, King Xiaocheng");
                    grid[5][3] = D3;
                    root.getChildren().addAll(D3, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    Card D4 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Li Mu");
                    grid[5][3] = D4;
                    root.getChildren().addAll(D4, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    Card D5 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Lian Po");
                    grid[5][3] = D5;
                    root.getChildren().addAll(D5, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    Card E1 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, Marquess Ai");
                    grid[5][3] = E1;
                    root.getChildren().addAll(E1, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    Card E2 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, King Huanhui");
                    grid[5][3] = E2;
                    root.getChildren().addAll(E2, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    Card E3 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, King An");
                    grid[5][3] = E3;
                    root.getChildren().addAll(E3, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    Card E4 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, Han Fei");
                    grid[5][3] = E4;
                    root.getChildren().addAll(E4, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    Card F1 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, Marquess Wen");
                    grid[5][3] = F1;
                    root.getChildren().addAll(F1, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    Card F2 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, Lord Xinling");
                    grid[5][3] = F2;
                    root.getChildren().addAll(F2, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    Card F3 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, King Anxi");
                    grid[5][3] = F3;
                    root.getChildren().addAll(F3, border, t1);
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    Card G1 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PURPLE);
                    Text t1 = new Text("Yan, King Xi");
                    grid[5][3] = G1;
                    root.getChildren().addAll(G1, border, t1);
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    Card G2 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PURPLE);
                    Text t1 = new Text("Yan, Prince Dan");
                    grid[5][3] = G2;
                    root.getChildren().addAll(G2, border, t1);
                } else if (array[i].charAt(0) == 'z' && array[i].charAt(1) == '9') {
                    Card Z9 = new Card(5, 3);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLACK);
                    Text t1 = new Text("Zhang Yi");
                    grid[5][3] = Z9;
                    root.getChildren().addAll(Z9, border, t1);
                }
            }else if (array[i].charAt(2) == 'E') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    Card A1 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Duke Xiao");
                    grid[5][4] = A1;
                    root.getChildren().addAll(A1, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    Card A2 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Shang Yang");
                    grid[5][4] = A2;
                    root.getChildren().addAll(A2, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    Card A3 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Hui");
                    grid[5][4] = A3;
                    root.getChildren().addAll(A3, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    Card A4 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Zhaoxiang");
                    grid[5][4] = A4;
                    root.getChildren().addAll(A4, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    Card A5 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Lady Mi");
                    grid[5][4] = A5;
                    root.getChildren().addAll(A5, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    Card A6 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Bai Qi");
                    grid[5][4] = A6;
                    root.getChildren().addAll(A6, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    Card A7 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Lady Zhao");
                    grid[5][4] = A7;
                    root.getChildren().addAll(A7, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    Card A8 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Zheng");
                    grid[5][4] = A8;
                    root.getChildren().addAll(A8, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    Card B1 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Xuan");
                    grid[5][4] = B1;
                    root.getChildren().addAll(B1, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    Card B2 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Zhong Wuyan");
                    grid[5][4] = B2;
                    root.getChildren().addAll(B2, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    Card B3 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Lord Menchang");
                    grid[5][4] = B3;
                    root.getChildren().addAll(B3, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    Card B4 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Xiang");
                    grid[5][4] = B4;
                    root.getChildren().addAll(B4, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    Card B5 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Queen Junwang");
                    grid[5][4] = B5;
                    root.getChildren().addAll(B5, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    Card B6 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Jian");
                    grid[5][4] = B6;
                    root.getChildren().addAll(B6, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    Card B7 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Sun Bin");
                    grid[5][4] = B7;
                    root.getChildren().addAll(B7, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    Card C1 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Wu Qi");
                    grid[5][4] = C1;
                    root.getChildren().addAll(C1, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    Card C2 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, King Kaolie");
                    grid[5][4] = C2;
                    root.getChildren().addAll(C2, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    Card C3 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, King You");
                    grid[5][4] = C3;
                    root.getChildren().addAll(C3, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    Card C3 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Qu Yuan");
                    grid[5][4] = C3;
                    root.getChildren().addAll(C3, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    Card C4 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Fuchu");
                    grid[5][4] = C4;
                    root.getChildren().addAll(C4, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    Card C5 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Lord Chunshen");
                    grid[5][4] = C5;
                    root.getChildren().addAll(C5, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    Card D1 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, King Wuling");
                    grid[5][4] = D1;
                    root.getChildren().addAll(D1, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    Card D2 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Lord Pingyuan");
                    grid[5][4] = D2;
                    root.getChildren().addAll(D2, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    Card D3 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, King Xiaocheng");
                    grid[5][4] = D3;
                    root.getChildren().addAll(D3, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    Card D4 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Li Mu");
                    grid[5][4] = D4;
                    root.getChildren().addAll(D4, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    Card D5 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Lian Po");
                    grid[5][4] = D5;
                    root.getChildren().addAll(D5, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    Card E1 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, Marquess Ai");
                    grid[5][4] = E1;
                    root.getChildren().addAll(E1, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    Card E2 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, King Huanhui");
                    grid[5][4] = E2;
                    root.getChildren().addAll(E2, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    Card E3 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, King An");
                    grid[5][4] = E3;
                    root.getChildren().addAll(E3, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    Card E4 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, Han Fei");
                    grid[5][4] = E4;
                    root.getChildren().addAll(E4, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    Card F1 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, Marquess Wen");
                    grid[5][4] = F1;
                    root.getChildren().addAll(F1, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    Card F2 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, Lord Xinling");
                    grid[5][4] = F2;
                    root.getChildren().addAll(F2, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    Card F3 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, King Anxi");
                    grid[5][4] = F3;
                    root.getChildren().addAll(F3, border, t1);
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    Card G1 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PURPLE);
                    Text t1 = new Text("Yan, King Xi");
                    grid[5][4] = G1;
                    root.getChildren().addAll(G1, border, t1);
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    Card G2 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PURPLE);
                    Text t1 = new Text("Yan, Prince Dan");
                    grid[5][4] = G2;
                    root.getChildren().addAll(G2, border, t1);
                } else if (array[i].charAt(0) == 'z' && array[i].charAt(1) == '9') {
                    Card Z9 = new Card(5, 4);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLACK);
                    Text t1 = new Text("Zhang Yi");
                    grid[5][4] = Z9;
                    root.getChildren().addAll(Z9, border, t1);
                }
            }else if (array[i].charAt(2) == 'F') {
                if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '0') {
                    Card A1 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Duke Xiao");
                    grid[5][5] = A1;
                    root.getChildren().addAll(A1, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '1') {
                    Card A2 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Shang Yang");
                    grid[5][5] = A2;
                    root.getChildren().addAll(A2, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '2') {
                    Card A3 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Hui");
                    grid[5][5] = A3;
                    root.getChildren().addAll(A3, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '3') {
                    Card A4 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Zhaoxiang");
                    grid[5][5] = A4;
                    root.getChildren().addAll(A4, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '4') {
                    Card A5 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Lady Mi");
                    grid[5][5] = A5;
                    root.getChildren().addAll(A5, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '5') {
                    Card A6 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Bai Qi");
                    grid[5][5] = A6;
                    root.getChildren().addAll(A6, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '6') {
                    Card A7 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, Lady Zhao");
                    grid[5][5] = A7;
                    root.getChildren().addAll(A7, border, t1);
                } else if (array[i].charAt(0) == 'a' && array[i].charAt(1) == '7') {
                    Card A8 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.RED);
                    Text t1 = new Text("Qin, King Zheng");
                    grid[5][5] = A8;
                    root.getChildren().addAll(A8, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '0') {
                    Card B1 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Xuan");
                    grid[5][5] = B1;
                    root.getChildren().addAll(B1, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '1') {
                    Card B2 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Zhong Wuyan");
                    grid[5][5] = B2;
                    root.getChildren().addAll(B2, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '2') {
                    Card B3 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Lord Menchang");
                    grid[5][5] = B3;
                    root.getChildren().addAll(B3, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '3') {
                    Card B4 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Xiang");
                    grid[5][5] = B4;
                    root.getChildren().addAll(B4, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '4') {
                    Card B5 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Queen Junwang");
                    grid[5][5] = B5;
                    root.getChildren().addAll(B5, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '5') {
                    Card B6 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, King Jian");
                    grid[5][5] = B6;
                    root.getChildren().addAll(B6, border, t1);
                } else if (array[i].charAt(0) == 'b' && array[i].charAt(1) == '6') {
                    Card B7 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.GREEN);
                    Text t1 = new Text("Qi, Sun Bin");
                    grid[5][5] = B7;
                    root.getChildren().addAll(B7, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '0') {
                    Card C1 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Wu Qi");
                    grid[5][5] = C1;
                    root.getChildren().addAll(C1, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '1') {
                    Card C2 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, King Kaolie");
                    grid[5][5] = C2;
                    root.getChildren().addAll(C2, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '2') {
                    Card C3 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, King You");
                    grid[5][5] = C3;
                    root.getChildren().addAll(C3, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '3') {
                    Card C3 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Qu Yuan");
                    grid[5][5] = C3;
                    root.getChildren().addAll(C3, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '4') {
                    Card C4 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Fuchu");
                    grid[5][5] = C4;
                    root.getChildren().addAll(C4, border, t1);
                } else if (array[i].charAt(0) == 'c' && array[i].charAt(1) == '5') {
                    Card C5 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.YELLOW);
                    Text t1 = new Text("Chu, Lord Chunshen");
                    grid[5][5] = C5;
                    root.getChildren().addAll(C5, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '0') {
                    Card D1 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, King Wuling");
                    grid[5][5] = D1;
                    root.getChildren().addAll(D1, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '1') {
                    Card D2 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Lord Pingyuan");
                    grid[5][5] = D2;
                    root.getChildren().addAll(D2, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '2') {
                    Card D3 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, King Xiaocheng");
                    grid[5][5] = D3;
                    root.getChildren().addAll(D3, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '3') {
                    Card D4 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Li Mu");
                    grid[5][5] = D4;
                    root.getChildren().addAll(D4, border, t1);
                } else if (array[i].charAt(0) == 'd' && array[i].charAt(1) == '4') {
                    Card D5 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLUE);
                    Text t1 = new Text("Zhao, Lian Po");
                    grid[5][5] = D5;
                    root.getChildren().addAll(D5, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '0') {
                    Card E1 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, Marquess Ai");
                    grid[5][5] = E1;
                    root.getChildren().addAll(E1, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '1') {
                    Card E2 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, King Huanhui");
                    grid[5][5] = E2;
                    root.getChildren().addAll(E2, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '2') {
                    Card E3 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, King An");
                    grid[5][5] = E3;
                    root.getChildren().addAll(E3, border, t1);
                } else if (array[i].charAt(0) == 'e' && array[i].charAt(1) == '3') {
                    Card E4 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BEIGE);
                    Text t1 = new Text("Han, Han Fei");
                    grid[5][5] = E4;
                    root.getChildren().addAll(E4, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '0') {
                    Card F1 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, Marquess Wen");
                    grid[5][5] = F1;
                    root.getChildren().addAll(F1, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '1') {
                    Card F2 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, Lord Xinling");
                    grid[5][5] = F2;
                    root.getChildren().addAll(F2, border, t1);
                } else if (array[i].charAt(0) == 'f' && array[i].charAt(1) == '2') {
                    Card F3 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PINK);
                    Text t1 = new Text("Wei, King Anxi");
                    grid[5][5] = F3;
                    root.getChildren().addAll(F3, border, t1);
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '0') {
                    Card G1 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PURPLE);
                    Text t1 = new Text("Yan, King Xi");
                    grid[5][5] = G1;
                    root.getChildren().addAll(G1, border, t1);
                } else if (array[i].charAt(0) == 'g' && array[i].charAt(1) == '1') {
                    Card G2 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.PURPLE);
                    Text t1 = new Text("Yan, Prince Dan");
                    grid[5][5] = G2;
                    root.getChildren().addAll(G2, border, t1);
                } else if (array[i].charAt(0) == 'z' && array[i].charAt(1) == '9') {
                    Card Z9 = new Card(5, 5);
                    Rectangle border = new Rectangle();
                    border.setStroke(Color.BLACK);
                    Text t1 = new Text("Zhang Yi");
                    grid[5][5] = Z9;
                    root.getChildren().addAll(Z9, border, t1);
                }
            }

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
        Shape shape = new Rectangle(600,600);
        shape.setFill(Color.WHITE);
        shape.setStroke(Color.BLACK);
        root.getChildren().add(shape);
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
