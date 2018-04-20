import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class javaFX extends Application {
    private Label myLabel;
    public static void main(String[] args) {
        launch(args);
    }
    public void init (){
    }
    public void start (Stage myStage){
        myStage.setTitle("JavaFX");
        myLabel = new Label();//her can will set default text
        //create group
        ToggleGroup tg = new ToggleGroup();
        //adding buttons
        RadioButton a = new RadioButton("A");
        RadioButton b = new RadioButton("B");
        //set button in group
        a.setToggleGroup(tg);
        b.setToggleGroup(tg);
        //set as default
        a.setSelected(true);
        //set generation event for button, it need if button selected by default
        a.fire();
        //adding events for buttons
        a.setOnAction(event -> myLabel.setText("A"));
        b.setOnAction(event -> myLabel.setText("B"));

        FlowPane rootNode = new FlowPane(10,10);//values set space between the buttons
        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);
        //set position for buttons
        rootNode.setAlignment(Pos.CENTER);
        //add on scene
        rootNode.getChildren().addAll(myLabel, a, b);
        myStage.show();
    }
    public void stop () {
    }
}
