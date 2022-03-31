package JavaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author HuXianshen
 * @creat 2022-03-14:55
 */

public class Main9 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        AtomicInteger demo = new AtomicInteger(100);

        Button button = new Button("+100");
        Label label = new Label("100");
        label.setLayoutX(100);
        label.setLayoutY(100);
        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(label,button);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        button.setOnAction(event -> {
            demo.addAndGet(100);
            String aa = String.valueOf(demo);
            label.setText("");
            label.setText(aa);

        });
    }


}
