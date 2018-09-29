package com.example.client;

import com.sun.org.apache.xml.internal.security.c14n.implementations.UtfHelpper;
import com.vdurmont.emoji.EmojiParser;
import org.apache.commons.lang.CharUtils;
import org.springframework.web.util.HtmlUtils;

import java.io.UnsupportedEncodingException;

/**
 * class functional description
 *
 * @author Feng Guicheng
 * @version 1.0.0
 * @since 2018-09-28
 */
public class tt {
    public static void main(String[] args) throws  Exception {
        String s = "sfdf\uD835\uDC65sfdf";
        String s2 = EmojiParser.parseToHtmlDecimal(s);

        System.out.println("====================");
        byte[] t1 =s .getBytes("UTF-8");
        for (int i = 0; i < t1.length;) {
            byte tt = t1[i];
            if (CharUtils.isAscii((char) tt)) {
                byte[] ba = new byte[1];
                ba[0] = tt;
                i++;
            }
            if ((tt & 0xE0) == 0xC0) {
                byte[] ba = new byte[2];
                ba[0] = tt;
                ba[1] = t1[i+1];
                i++;
                i++;
            }
            if ((tt & 0xF0) == 0xE0) {
                byte[] ba = new byte[3];
                ba[0] = tt;
                ba[1] = t1[i+1];
                ba[2] = t1[i+2];
                i++;
                i++;
                i++;
            }
            if ((tt & 0xF8) == 0xF0) {
                byte[] ba = new byte[4];
                ba[0] = tt;
                ba[1] = t1[i+1];
                ba[2] = t1[i+2];
                ba[3] = t1[i+3];
                i++;
                i++;
                i++;
                i++;
                String result = new String(ba);
                System.out.println("4个字节的字符");
                System.out.println("字符为：" + result);
            }
        }

        byte[] stringInUtf8 = UtfHelpper.getStringInUtf8(s);

        String string = new String(stringInUtf8);
    //    String s1 = ss.replaceAll("[\\ud800\\udc00-\\udbff\\udfff\\ud800-\\udfff]", "*");
    //    System.out.println(s1);
    }
}
