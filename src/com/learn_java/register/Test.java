//package com.learn_java.register;
//import java.lang.Character;
//public class Test {
//    public static void main(String[] args) {
//
//    }
//
//    static boolean CheckRegister(String name, String password, String email) {
//        if(!(name.length() == 2 && name.length() == 3 && name.length() == 4 )) {
//            throw new RuntimeException("用户名长度异常");
//        }if(!(password.length() == 6) && checkNumber(password)){
//            throw new RuntimeException("密码异常");
//        }if(checkNumber(password) && ){
////
//        }
//
//        return false;
//    }
//
//    private static boolean checkNumber(String password) {
//        char[] charArray = password.toCharArray();
//        boolean flag = true;
//        for (int i = 0; i < password.length(); i++) {
//            flag = Character.isDigit(charArray[i]);
//            if(flag == false){
//                return false;
//            }
//        }
//        return flag;
//    }
//}