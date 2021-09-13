import com.tms.factory.accoundant.Accountant;
import com.tms.factory.director.Director;
import com.tms.factory.worker.Worker;

public class Task_01 {
    public static void main(String[] args) {

        Director director1 = new Director();
        Accountant accountant = new Accountant();
        Worker worker = new Worker();

        director1.printPosition();
        accountant.printPosition();
        worker.printPosition();










    }

}
