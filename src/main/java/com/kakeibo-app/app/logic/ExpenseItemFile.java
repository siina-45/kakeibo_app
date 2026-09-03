package com.kakeiboapp.app.logic;
import java.time.LocalDate;
public class ExpenseItemFile{
    private LocalDate date;
    private String category;
    private int amount;

    public ExpenseItemFile(LocalDate date,String category, int amount){
        this.date = date;
        this.category = category;
        this.amount = amount;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getCategory(){
        return category;
    }
    public int getAmount(){
        return amount;
    }
    
 }

    
    
