package com.uditkumawat.lld.splitwise.models;

import java.util.List;

public class EqualExpense extends Expense {

    public EqualExpense(String expenseDescription,double amount,User paidBy,CurrencyType currencyType,User addedBy,List<Split> splits) {
        super(expenseDescription,amount,paidBy,currencyType,addedBy,splits);
    }
    
    boolean validate() {
        return super.validate();
    }
    
}
