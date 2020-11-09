package com.uditkumawat.lld.splitwise.driver;

import java.util.ArrayList;
import java.util.List;
import com.uditkumawat.lld.splitwise.models.CurrencyType;
import com.uditkumawat.lld.splitwise.models.EqualSplit;
import com.uditkumawat.lld.splitwise.models.ExpenseType;
import com.uditkumawat.lld.splitwise.models.Split;
import com.uditkumawat.lld.splitwise.models.User;
import com.uditkumawat.lld.splitwise.services.ExpenseManager;

public class SplitWiseManager {

    public static void main(String[] args) {
        
        ExpenseManager expenseManager = new ExpenseManager();
        
        User user1 = new User("user1","email1@gmail.com","9876543210");
        User user2 = new User("user2","email2@gmail.com","9876543211");
        User user3 = new User("user3","email3@gmail.com","9876543212");
        User user4 = new User("user4","email4@gmail.com","9876543213");
        
        expenseManager.addUser(user1);
        expenseManager.addUser(user2);
        expenseManager.addUser(user3);
        expenseManager.addUser(user4);
        
        List<Split> splits = new ArrayList<>();
        String expenseType = "EQUAL";
        double amount = 1000;
        switch(expenseType) {
            case "EQUAL":  
                  splits.add(new EqualSplit(user1));
                  splits.add(new EqualSplit(user1));
                  expenseManager.addExpense("expense",ExpenseType.EQUAL, amount,user1.getUserId(),CurrencyType.INR, splits, user1.getUserId());
                
        }
    }

}
