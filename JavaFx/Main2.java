package JavaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author HuXianshen
 * @creat 2022-03-11:23
 */
public class Main2 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button0 = new Button("窗口0");
        Button button1 = new Button("窗口1");
        button0.setLayoutX(200);
        button0.setLayoutY(200);
        button1.setLayoutX(200);
        button1.setLayoutY(250);
        AnchorPane pane = new AnchorPane();
        pane.getChildren().addAll(button0,button1);
        button0.setOnAction(event -> {
            Stage stage = new Stage();
            stage.setHeight(200);
            stage.setWidth(300);
            stage.initModality(Modality.NONE);
            stage.show();
        });

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("hello");
        //设置窗口图标
        primaryStage.getIcons().add(new Image("image/logo.png"));
        //让窗口大小不可变
        primaryStage.setResizable(false);
        //设置窗口样式
        //默认
        //primaryStage.initStyle(StageStyle.DECORATED);
        //无窗口
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        //简单装饰，只有标题和关闭
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.show();
    }
}
