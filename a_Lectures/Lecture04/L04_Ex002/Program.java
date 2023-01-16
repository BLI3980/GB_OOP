package L04_Ex002;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {

        Worker w = new Worker(28, "firstName", "lastName", 25, 1000);

        // #region ParametrizedWorker

        ParametrizedWorker<Integer> w1 = new ParametrizedWorker<Integer>(
                1990,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w1.getId());

        String uid = UUID.randomUUID().toString();
        ParametrizedWorker<String> w2 = new ParametrizedWorker<>(
                uid,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w2.getId());

        // #engregion
    }
}
