package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class ComputerNumber {
    private static final int NUMBER_LENGTH = 3;
    private static final int NUMBER_MIN = 1;
    private static final int NUMBER_MAX = 9;
    private String number;

    public void setNumber() {
        StringBuilder select = new StringBuilder();

        while (select.length() < NUMBER_LENGTH) {
            String inputNumber = String.valueOf(Randoms.pickNumberInRange(NUMBER_MIN, NUMBER_MAX));

            if (!select.toString().contains(inputNumber)) {
                select.append(inputNumber);
            }
        }

        this.number = select.toString();
    }

    public String getNumber() {
        return this.number;
    }
}
