package com.kakeiboapp.app.logic;

import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        // パッケージ名を頭につけて、強制的にファイルを指定する
        Application.launch(com.kakeiboapp.app.logic.KakeiboApp.class, args);
    }
}
 