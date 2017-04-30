package com.yinom.pdd.struts.test;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by yindp on 4/30/17.
 */
public class TestI18n {
    @Test
    public void testZH() {
        ResourceBundle rb = ResourceBundle.getBundle("Employee", Locale.CHINESE);
        System.out.println(rb.getObject("file"));
    }
    @Test
    public void testEN() {
        ResourceBundle rb = ResourceBundle.getBundle("Employee", Locale.ENGLISH);
        System.out.println(rb.getObject("file"));
    }
}
