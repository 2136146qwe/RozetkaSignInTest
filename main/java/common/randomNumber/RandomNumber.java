package common.randomNumber;

import java.util.Random;

public interface RandomNumber {
    Random random = new Random();
    int n = random.nextInt(100) + 1;
    }




