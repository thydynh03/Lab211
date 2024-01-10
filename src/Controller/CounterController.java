package Controller;

import Common.AbstractMenu;
import Model.CounterModel;
import View.CounterView;
import java.util.Map;

public class CounterController {

    private CounterModel model;
    private CounterView view;

    public CounterController(CounterModel model, CounterView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        AbstractMenu menu = new CharacterWordCounterMenu(this);
        menu.displayMenu();
    }

    public void performCharacterCount() {
        String input = view.getInputString();
        model.analyze(input);
        Map<Character, Integer> charCounter = model.getCharCounter();
        view.displayResult(null, charCounter);
    }

    public void performWordCount() {
        String input = view.getInputString();
        model.analyze(input);
        Map<String, Integer> wordCounter = model.getWordCounter();
        view.displayResult(wordCounter, null);
    }
}
