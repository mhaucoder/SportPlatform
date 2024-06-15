package com.sportplatform.util;

import java.util.ArrayList;
import java.util.List;

public class StringFormat {
    public static List<String> extractParamsFromErrorMessage(String errorMessage) {
        int startKey = errorMessage.indexOf("Key (");
        if (startKey == -1) {
            return null;
        }
        startKey += "Key (".length();
        int endKey = errorMessage.indexOf(")", startKey);
        if (endKey == -1) {
            return null;
        }
        String key = errorMessage.substring(startKey, endKey);
        int startValue = errorMessage.indexOf(")=(");
        if (startValue == -1) {
            return null;
        }
        startValue += ")=(".length();
        int endValue = errorMessage.indexOf(")", startValue);
        if (endValue == -1) {
            return null;
        }
        String value = errorMessage.substring(startValue, endValue);
        List<String> list = new ArrayList<String>();
        list.add(key);
        list.add(value);
        return list;
    }
}