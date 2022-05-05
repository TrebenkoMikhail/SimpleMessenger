module geekbrains.simplemessenger {
    requires javafx.controls;
    requires javafx.fxml;


    opens geekbrains.simplemessenger to javafx.fxml;
    exports geekbrains.simplemessenger;
}