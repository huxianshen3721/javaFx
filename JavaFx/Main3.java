package JavaFx;

import javafx.application.Application;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author HuXianshen
 * @creat 2022-03-15:07
 */
public class Main3 extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button0 = new Button("hello world");
        button0.setLayoutX(200);
        button0.setLayoutY(200);

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(button0);

        Scene scene = new Scene(root, 500, 500);

        Label label = new Label("你好javafx");
        label.setLayoutX(200);
        label.setLayoutY(200);
        Button button1 = new Button("返回");
        button1.setLayoutX(200);
        button1.setLayoutY(250);

        AnchorPane root1 = new AnchorPane();
        root1.getChildren().addAll(label,button1);
        Scene scene1 = new Scene(root1, 500, 500);
        //鼠标图片
        scene1.setCursor(new ImageCursor(new Image("image/love.png")));
        scene.setCursor(new ImageCursor(new Image("image/p2.png")));

        button0.setOnAction(event -> {
            primaryStage.setScene(scene1);
        });
        button1.setOnAction(event -> {
            primaryStage.setScene(scene);
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("hello");
        primaryStage.getIcons().add(new Image("image/logo.png"));
        primaryStage.show();
    }
}
