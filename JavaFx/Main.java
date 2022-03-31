package JavaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author HuXianshen
 * @creat 2022-03-11:01
 */

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label label = new Label("Hello World");
        //将标签放到布局里，默认放到中间
        BorderPane pane = new BorderPane(label);
        //创建一个场景，并设置长宽
        Scene scene = new Scene(pane, 300, 300);
        //场景设置到窗口里
        stage.setScene(scene);

        //设置标题
        stage.setTitle("我是窗口");
        //显示窗口
        stage.show();
    }
}
