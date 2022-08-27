package Collections36;

public class LottoManager {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.generate();
        lotto.randomize();
        lotto.checkResult();

    }

}

