package JavaFx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author HuXianshen
 * @creat 2022-03-15:49
 */
public class Main4 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("hello world");
        label.setLayoutX(200);
        label.setLayoutY(200);
        //背景和边框颜色
        label.setStyle("-fx-background-color:red; -fx-border-color:blue;");
        //文本居中显示
        label.setAlignment(Pos.CENTER);
        //设置不透明度
        label.setOpacity(0.5);
        //旋转
        label.setRotate(45);
        AnchorPane root = new AnchorPane();
        root.getChildren().add(label);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
