package com.kakeiboapp.app.logic;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv{
    public static void main(String[]args){
        String filePath = "Sample.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;


            while ((line = br.readLine())!= null){

                String[]date = line.split(",");
                for(String field:date){
                    System.out.print(field+" ");
                }
                System.out.println();

        }
        }catch(IOException e){
            e.printStackTrace();

        }

    }
    

}

