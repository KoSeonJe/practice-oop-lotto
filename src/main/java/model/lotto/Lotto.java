package model.lotto;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import message.ErrorMessage;

public class Lotto {

  private final List<Integer> numbers;

  public Lotto(List<Integer> numbers) {
    validate(numbers);
    this.numbers = numbers;
  }

  private void validate(List<Integer> numbers) {
    if (numbers.size() != LottoData.COUNT_OF_LOTTO_NUMBER) {
      throw new IllegalArgumentException(ErrorMessage.NOT_EXACT_COUNT_NUMBER);
    }
  }

  @Override
  public String toString() {
    return numbers.toString();
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public boolean checkEqualNumber(int checkNumber) {
    return numbers.stream()
        .anyMatch(number -> number.equals(checkNumber));
  }

  public int checkEqualNumbersCount(List<Integer> compareNumbers) {
    List<Integer> equalNumbers = compareNumbers.stream()
        .filter(number -> this.numbers.stream()
            .anyMatch(Predicate.isEqual(number)))
        .collect(Collectors.toList());
    return equalNumbers.size();
  }
}
