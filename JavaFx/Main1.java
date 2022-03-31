package JavaFx;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author HuXianshen
 * @creat 2022-03-11:17
 */

public class Main1 extends Application {
    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("网站");
        BorderPane pane = new BorderPane(button);
        button.setOnAction(e -> {
            getHostServices().showDocument("www.baidu.com");
        });
        Scene scene = new Scene(pane, 300, 300);
        stage.setScene(scene);
        stage.setTitle("JavaFx");
        stage.show();
    }

    //@Override
    //public void init() throws Exception {
    //    super.init();
    //    System.out.println("init()...");
    //}
    //
    //@Override
    //public void stop() throws Exception {
    //    super.stop();
    //    //关闭程序时调用
    //    System.out.println("stop()...");
    //}
}
