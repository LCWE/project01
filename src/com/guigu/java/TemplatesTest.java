package com.guigu.java;



/**
 * @author shkstart
 * @data 2020/5/18 - 22:03
 */
public class TemplatesTest {
    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("哈hihi啊");
        //变形:soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        //模板三:fori
        String[] arr=new String[]{"tom","jeb","iou"};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
