package com.shenghail.arithmetic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {

    /**
     * 查找字母组合
     * @param digits
     * @return
     */
    public String letterCombinations(int[] digits) {
        boolean flag = checkPram(digits);
        if (!flag) {
            return "";
        }
        digits = handleParam(digits);
        List<String> result = new LinkedList<>();
        String[] letterArr = new String[digits.length];
        for (int i = 0; i < digits.length; i++) {
            switch (digits[i]) {
                case 2 : letterArr[i] = "abc"; break;
                case 3 : letterArr[i] = "def"; break;
                case 4 : letterArr[i] = "ghi"; break;
                case 5 : letterArr[i] = "jkl"; break;
                case 6 : letterArr[i] = "mno"; break;
                case 7 : letterArr[i] = "pqrs"; break;
                case 8 : letterArr[i] = "tuv"; break;
                case 9 : letterArr[i] = "wxyz"; break;
                default: break;
            }
        }
        permute(result, letterArr, 0, "");

        String resultStr = listToString(result);

        return resultStr;
    }

    /**
     * 处理输入参数
     * @param param
     * @return
     */
    private int[] handleParam(int[] param) {
        int count = 0;
        for (int i = 0; i < param.length; i++) {
            if (param[i] == 0 || param[i] == 1) {
                ++count;
                for (int j = i; j < param.length-1; j++) {
                    param[j] = param[j+1];
                }
                i--;
            }
        }
        int[] result = Arrays.copyOfRange(param, 0, param.length-count);
        return result;
    }

    /**
     * 递归查找字母组合
     * @param result
     * @param letterArr
     * @param index
     * @param temp
     */
    private void permute(List<String> result, String[] letterArr, int index, String temp) {
        if (index >= letterArr.length) {
            result.add(temp);
            return;
        }
        String indexStr = letterArr[index];
        for (int i=0; i<indexStr.length(); i++) {
            permute(result, letterArr , index+1, temp+indexStr.charAt(i));
        }
    }

    /**
     * 检查输入参数合法性
     * @param param
     * @return
     */
    private boolean checkPram(int[] param) {
        if (param == null || param.length <= 0) {
            return false;
        }
        for (int i = 0; i < param.length; i++) {
            if (param[i] < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 将集合转换成字符串类型
     * @param obj
     * @return
     */
    private String listToString(List<String> obj){
        StringBuilder resultStr = new StringBuilder();
        for (String s : obj) {
            resultStr.append(s);
            resultStr.append(" ");
        }
        return resultStr.toString().trim();
    }
}
