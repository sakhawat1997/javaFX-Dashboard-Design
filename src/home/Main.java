package home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main  extends Application {

    private double x,y;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.UNDECORATED);

        root.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });

        root.setOnMousePressed(mouseEvent -> {
            primaryStage.setX(mouseEvent.getX()- x);
            primaryStage.setY(mouseEvent.getY()- y);
        });
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
