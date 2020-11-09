package com.uditkumawat.lld.splitwise.models;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public abstract class Expense {

    private String expenseId;
    private String expenseDescription;
    private double amount;
    private User paidBy;
    private User addedBy;
    private Date createdOn;
    private Date modifiedOn;
    private CurrencyType currencyType;
    private ExpenseMetadata expenseMetadata;
    private List<Split> splits;
    
    public Expense(String expenseDescription,double amount,User paidByUserId,CurrencyType currencyType,User addedBy,List<Split> splits) {
        this.expenseId = UUID.randomUUID().toString();
        this.expenseDescription = expenseDescription;
        this.amount = amount;
        this.paidBy = paidByUserId;
        this.currencyType = currencyType;
        this.addedBy = addedBy;
        this.splits = splits;
    }
    
    public String getExpenseDescription() {
        return expenseDescription;
    }
    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public User getPaidBy() {
        return paidBy;
    }
    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }
    
    public Date getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    public Date getModifiedOn() {
        return modifiedOn;
    }
    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
    public CurrencyType getCurrencyType() {
        return currencyType;
    }
    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }
   
    public ExpenseMetadata getExpenseMetadata() {
        return expenseMetadata;
    }
    public void setExpenseMetadata(ExpenseMetadata expenseMetadata) {
        this.expenseMetadata = expenseMetadata;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }

    public User getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }
    
    boolean validate() {
        
        double sum = 0;
        for(Split split:splits) {
            sum+=split.getAmount();
        }
        
        if(sum==amount) {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return "Expense [expenseId=" + expenseId + ", expenseDescription=" + expenseDescription + ", amount=" + amount + ", paidBy=" + paidBy + ", addedBy="
                + addedBy + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", currencyType=" + currencyType + ", expenseMetadata="
                + expenseMetadata + ", splits=" + splits + "]";
    }
}
