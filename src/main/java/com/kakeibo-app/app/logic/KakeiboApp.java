package com.kakeiboapp.app.logic;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.time.LocalDate;

public class KakeiboApp extends Application {
    
    @Override
    public void start(Stage stage) {
        // 日付入力
        Label dateLabel = new Label("日付を選択");
        DatePicker datePicker = new DatePicker(LocalDate.now());

        // カテゴリ入力
        Label categoryLabel = new Label("カテゴリを選択：");
        ComboBox<String> categoryBox = new ComboBox<>();
        categoryBox.getItems().addAll("食費", "日用品", "交際費", "交通費", "そのほか");
        categoryBox.setValue("食費");

        // 金額入力
        Label amountLabel = new Label("金額を入力");
        TextField amountField = new TextField();
        amountField.setPromptText("金額を入力");

        // 保存ボタン
        Button saveButton = new Button("保存");
        saveButton.setPrefWidth(150);

        // ボタンを押したときの処理
        saveButton.setOnAction(e -> {
            LocalDate selectedDate = datePicker.getValue();
            String selectedCategory = categoryBox.getValue();
            String amountText = amountField.getText();

            System.out.println("---入力データ---");
            System.out.println("日付:" + selectedDate);
            System.out.println("カテゴリ:" + selectedCategory);
            System.out.println("金額:" + amountText + "円");
            System.out.println("----------------");

            amountField.clear();
        });

        // 画面のレイアウト配置
        VBox root = new VBox(12);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER_LEFT);

        root.getChildren().addAll(
            dateLabel, datePicker,
            categoryLabel, categoryBox,
            amountLabel, amountField,
            saveButton
        );

        // 画面の表示設定
        Scene scene = new Scene(root, 350, 400);
        stage.setTitle("マイ家計簿");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

        