package JavaFx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * @author HuXianshen
 * @creat 2022-03-10:15
 */
public class DemoController {
    @FXML
    Label la;

    @FXML
    Button bu;

    public void onUp() {

        la.setLayoutY(la.getLayoutY() - 5);
    }
}
