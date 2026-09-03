package com.kakeiboapp.app.logic;
import java.util.List;
import java.util.ArrayList;

import java.time.LocalDate;

public class ExpenseItem{
    private LocalDate date;
    private String category;
    private int amount;

    public ExpenseItem (LocalDate date, String category, int amount){
        this.date = date;
        this.category = category;
        this.amount = amount;
    }

    public LocalDate getDate(){
        return date;
    }

    public String getCategory(){
         return category;
    }

    public int getAmount(){
        return amount;
    }
}

   
        

    
