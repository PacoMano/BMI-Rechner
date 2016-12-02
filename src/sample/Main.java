package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();

        Label label = new Label("BMI-Rechner");
        root.getChildren().add(label);

        HBox hBox = new HBox();
        HBox hBox2 = new HBox();

        Label Koerpergewichtlabel = new Label("Körpergewicht: ");
        hBox.getChildren().add(Koerpergewichtlabel);

        TextField Koerpergewicht = new TextField();
        hBox.getChildren().add(Koerpergewicht);


        Label Koerpergroeßelabel = new Label("Körpergröße: ");
        hBox2.getChildren().add(Koerpergroeßelabel);

        TextField Koerpergroeße = new TextField();
        hBox2.getChildren().add(Koerpergroeße);

        root.getChildren().add(hBox);
        root.getChildren().add(hBox2);


        //int Koerpergewichtint = Integer.parseInt(Koerpergewicht.getText());

        Button button = new Button("Hello Word");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(Integer.toString(Integer.parseInt(Koerpergewicht.getText())/Integer.parseInt(Koerpergroeße.getText())^2));
                //(Integer.toString(Integer.parseInt(Koerpergewicht.getText())/Integer.parseInt(Koerpergroeße.getText())));
            }
        });
        root.getChildren().add(button);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
