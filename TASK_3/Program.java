package TASK_3;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Presenter presenter = new Presenter(new View(), new CheckModel());
        presenter.buttonClick();
    }
}
