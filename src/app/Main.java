package app;
import app.data.DataHandler;
import app.data.DataRepository;
import app.ui.Output;

public class Main {
    public static void main(String[] args) {
        Output output = new Output();
        output.getOutputData(new DataHandler().StreamData(new DataRepository().getBase()));
    }
}
