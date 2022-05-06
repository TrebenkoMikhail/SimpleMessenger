package geekbrains.simplemessenger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ClientChat extends Application {
    @Override
    public void start (Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("chat-template.fxml")));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Java Fx Application");
        primaryStage.setScene(scene);

        ClientController controller = fxmlLoader.getController();
        controller.userList.setItems().addAll("user1", "user2");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
