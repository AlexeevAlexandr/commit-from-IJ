import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class javaFX2 extends Application{
        private GraphicsContext gc;
        private Color[] colors = {Color.RED, Color.BLUE, Color. GREEN, Color.BLACK};
        private int colorIdx = 0;
        public static void main (String [] args) {
            launch(args);
        }
        public void start (Stage myStage){
            myStage.setTitle("Draw Directly to а Canvas");
            FlowPane rootNode = new FlowPane ();
            rootNode.setAlignment(Pos.CENTER);
            Scene myScene = new Scene (rootNode, 450, 450);
            myStage.setScene (myScene);
            Canvas myCanvas = new Canvas (400, 400);
            gc = myCanvas.getGraphicsContext2D();
            Button btnChangeColor = new Button ("Change Color");
            btnChangeColor.setOnAction (ae -> {
                gc.setStroke (colors [colorIdx]);
                gc.setFill (colors [colorIdx]);
                gc.strokeLine (0, 0, 200, 200);
                gc.fillText (" This is drawn on the canvas", 60, 50);
                gc.fillRect (100, 320, 300, 40);
                colorIdx ++;
                if (colorIdx == colors.length) colorIdx=0;
                });
            gc.strokeLine (0, 0, 200, 200);
            gc.strokeOval (100, 100, 200, 200);
            gc.strokeRect (0, 200, 50, 200);
            gc.fillOval (0, 0, 20, 20);
            gc.fillRect (100, 320, 300, 40);
            gc.setFont (new Font(20));//set size of text
            gc.fillText ( " This is drawn on the canvas", 60, 50);
            rootNode.getChildren().addAll (myCanvas, btnChangeColor);
            myStage.show ();
        }
    }
