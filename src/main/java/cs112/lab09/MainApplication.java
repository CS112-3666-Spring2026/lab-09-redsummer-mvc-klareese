
package cs112.lab09;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {

        primaryStage = stage;

        FXMLLoader loader = new FXMLLoader(
                MainApplication.class.getResource("/cs112/lab09/main-view.fxml")
        );

        Scene scene = new Scene(loader.load());

        stage.setTitle("Red Summer MVC");
        stage.setScene(scene);
        stage.show();
    }

    public static void changeScene(String fxml) {

        try {

            FXMLLoader loader = new FXMLLoader(
                    MainApplication.class.getResource(fxml)
            );

            Scene scene = new Scene(loader.load());

            primaryStage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}