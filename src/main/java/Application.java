import controller.LottoController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        LottoAppConfig lottoAppConfig = new LottoAppConfig();
        LottoController lottoController = lottoAppConfig.LottoController();
        lottoController.lottoRun();
    }
}