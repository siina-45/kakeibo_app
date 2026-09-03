package com.kakeiboapp.app.logic;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager{
    private List<ExpenseItem>items = new ArrayList<>();
    public void addItem(ExpenseItem item){
          items.add(item); 
    }
public void showAllItems(){
    for(ExpenseItem item:items){
        System.out.println(item.getDate() + "|" + item.getCategory() +"|" + item.getAmount() + "円");
    
    }
 }
public int calculateTotal(){
    int total = 0;
    for(ExpenseItem item: items){
        total += item.getAmount();
    }
        return total;

 }

}