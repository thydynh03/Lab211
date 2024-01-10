
import Controller.CounterController;
import Model.CounterModel;
import View.CounterView;

public class CounterMain {

    public static void main(String[] args) {
        CounterModel model = new CounterModel();
        CounterView view = new CounterView();
        CounterController controller = new CounterController(model, view);

        controller.run();
    }
}
