package com.uditkumawat.lld.splitwise.models;

import java.util.List;

public class PercentageExpense extends Expense{

    public PercentageExpense(String expenseDescription,double amount,User paidBy,CurrencyType currencyType,User addedBy,List<Split> splits) {
        super(expenseDescription,amount,paidBy,currencyType,addedBy,splits);
    }
    
}
