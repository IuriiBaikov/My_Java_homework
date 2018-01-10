package Educatioin.Education_for_GIT;

import java.util.Random;


public class CRandomString {

    // Набор символов, из которого формируется случайная строка
    private String stringData = "abcdefghijklmnopqrstuvwxyz1234567890!№;%:?*-_$+@#%^&*";
    private String resultRandom = "";

    // Конструктор, использующий строку по умолчанию
    public CRandomString (int length) {
       resultRandom = SetResultString(length);
    }

    // Констуктор, использующий заданную строку
    public CRandomString (int length, String stringdata) {
        this.stringData = stringdata;
        resultRandom = SetResultString(length);
    }

    // метод, делающий рандомную строку
    private String SetResultString(int length) {
        if (length<0) {
            length*=-1;
        }
        char[] charArray = stringData.toCharArray();
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i=0; i<length; i++) {
            int indexNum = random.nextInt(charArray.length);
            result.append(charArray[indexNum]);
        }
        return result.toString();
    }

public String getStringResult() {
        return resultRandom;
}
}
