package com.uditkumawat.lld.splitwise.services;

import java.util.List;
import com.uditkumawat.lld.splitwise.models.CurrencyType;
import com.uditkumawat.lld.splitwise.models.EqualExpense;
import com.uditkumawat.lld.splitwise.models.ExactExpense;
import com.uditkumawat.lld.splitwise.models.Expense;
import com.uditkumawat.lld.splitwise.models.ExpenseType;
import com.uditkumawat.lld.splitwise.models.PercentageExpense;
import com.uditkumawat.lld.splitwise.models.PercentageSplit;
import com.uditkumawat.lld.splitwise.models.Split;
import com.uditkumawat.lld.splitwise.models.User;

public class ExpenseService {

    public static Expense createExpense(String expenseDescriiption,ExpenseType expenseType, double amount, User paidBy, List<Split> splits, CurrencyType currencyType,User addedBy) {
        
        switch (expenseType) {
            case EXACT:
                return new ExactExpense(expenseDescriiption,amount, paidBy, currencyType ,addedBy,splits);
            case PERCENTAGE:
                for (Split split : splits) {
                    PercentageSplit percentSplit = (PercentageSplit) split;
                    split.setAmount((amount*percentSplit.getPercentage())/100.0);
                }
                return new PercentageExpense(expenseDescriiption,amount, paidBy, currencyType ,addedBy,splits);
            case EQUAL:
                int totalSplits = splits.size();
                double splitAmount = ((double) Math.round(amount*100/totalSplits))/100.0;
                for (Split split : splits) {
                    split.setAmount(splitAmount);
                }
                splits.get(0).setAmount(splitAmount + (amount - splitAmount*totalSplits));
                return new EqualExpense(expenseDescriiption,amount, paidBy, currencyType ,addedBy,splits);
            default:
                return null;
        }
    }
}
