import controller.LottoController;
import controller.LottoWinChecked;
import profitcalculator.profitCalculator;
import model.lotto.LottoStore;
import view.input.Input;
import view.input.InputImpl;
import view.output.OutPutImpl;
import view.output.Output;

public class LottoAppConfig {
  public LottoController LottoController(){
    return new LottoController(Output(), Input(), LottoStore(), LottoWinChecked(),LottoWinResult());
  }
  public Output Output(){
    return new OutPutImpl();
  }
  public Input Input(){
    return new InputImpl();
  }
  public LottoStore LottoStore(){
    return new LottoStore();
  }
  public LottoWinChecked LottoWinChecked(){
    return new LottoWinChecked();
  }

  public profitCalculator LottoWinResult(){
    return new profitCalculator();
  }
}