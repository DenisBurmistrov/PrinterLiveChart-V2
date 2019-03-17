package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sample.SearchString.SearchString;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/view.fxml"));
        primaryStage.getIcons().add(new Image("/line-chart-icon.png"));
        primaryStage.setTitle("Printer Charts");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        SearchString.initPatterns();
        launch(args);
    }
}
