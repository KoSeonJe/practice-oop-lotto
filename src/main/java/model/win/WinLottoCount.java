package model.win;

public enum WinLottoCount {
  THREECOUNT("3", 5000, "3개 일치 (5,000원) - "),
  FOURCOUNT("4", 50000, "4개 일치 (50,000원) - "),
  FIVECOUNT("5", 1500000, "5개 일치 (1,500,000원) - "),
  FIVEBONUSCOUNT("5.5", 30000000, "5개 일치, 보너스 볼 일치 (30,000,000원) - "),
  SIXCOUNT("6", 2000000000, "6개 일치 (2,000,000,000원) - ");

  private final String count;
  private final int lottoWinningPrice;
  private final String resultMessage;

  WinLottoCount(String count, int lottoWinningPrice, String resultMessage) {
    this.count = count;
    this.lottoWinningPrice = lottoWinningPrice;
    this.resultMessage = resultMessage;
  }

  public String getCount() {
    return this.count;
  }

  public int getLottoWinningPrice() {
    return this.lottoWinningPrice;
  }

  public String getResultMessage() {
    return resultMessage;
  }
}
