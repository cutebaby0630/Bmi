package com.cutebaby.bmi;

public class Tester {
    Report report = new Report() {
        @Override
//        Report中的load只有規範，沒有方法內容，要new出，必須把內容補上
        public void load() {

        }
    };
}
