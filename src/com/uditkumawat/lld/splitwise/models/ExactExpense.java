package com.uditkumawat.lld.splitwise.models;

import java.util.List;

public class ExactExpense extends Expense{

    public ExactExpense(String expenseDescription,double amount,User paidBy,CurrencyType currencyType,User addedBy,List<Split> splits) {
        super(expenseDescription,amount,paidBy,currencyType,addedBy,splits);
    }
    
    boolean validate() {
        return super.validate();
    }
}
