package com.kakeiboapp.app.logic;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.spi.ToolProvider;

public class AppPackager {
    public static void main(String[]args){

        Optional<ToolProvider>jpackageOpt = ToolProvider.findFirst("jpackage");

        if(jpackageOpt.isEmpty()){
            System.err.println("jpackageツールが見つかりません。JDK16以上であるか、モジュールが追加されているか確認して下さい");
            System.exit(1);

        }
        ToolProvider jpackage = jpackageOpt.get();

        String inputDir = Paths.get("target").toAbsolutePath().toString();
        String outputDir = Paths.get("target","installer").toAbsolutePath().toString();

         String[] jpackageArgs = {
            "--input", inputDir,                       // MavenがJARを出力したtargetフォルダ
            "--name", "Mykakeibo",                 // 生成されるアプリ・インストーラーの名前
            "--main-jar", "kakeibo_app-1.0-SNAPSHOT.jar",                 // あなたのアプリのメインJARファイル名
            "--main-class", "com.kakeibo-app.app.Main",        // あなたのアプリのメインクラス名
            "--dest", outputDir,                       // インストーラーの出力先 (target/installer)
            "--type", "msi",                           // 形式（Windows: msi または exe / Mac: dmg）
            "--app-version", "1.0.0",                  // アプリのバージョン
            "--vendor", "My Company"                   // 製造元名
        };
         System.out.println("--- jpackage API によるパッケージ化を開始します ---");
        
        // 4. APIを実行
        int exitCode = jpackage.run(System.out, System.err, jpackageArgs);

        if (exitCode == 0) {
            System.out.println("--- パッケージ化が成功しました！ 出力先: " + outputDir);
        } else {
            System.err.println("--- パッケージ化に失敗しました。終了コード: " + exitCode);
            System.exit(exitCode);
        }
    }

    
}
