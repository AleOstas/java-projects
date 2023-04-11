package com.aleostas;

public class Account {

        private String accountNumber;
        private double accountBalance;
        private String customerName;
        private String emailAddress;
        private String phoneNumber;

        public Account() {
            this("123456", 0.00, "Default", "default@d.com", "12345678910");
            System.out.println("Default constructor called");
        }
        public Account(String accountNumber, double accountBalance, String customerName, String emailAddress, String phoneNumber) {
            this.accountNumber = accountNumber;
            this.accountBalance = accountBalance;
            this.customerName = customerName;
            this.emailAddress = emailAddress;
            this.phoneNumber = phoneNumber;
        }

        public void deposit(double depositAmount) {
            this.accountBalance += depositAmount;
            System.out.println("The amount of " + depositAmount + " was successfully deposited into you account ");
        }
        public void withdrawal(double withdrawnAmount) {
            if(this.accountBalance - withdrawnAmount < 0) {
                System.out.println("Only " + this.accountBalance + " available." + " Withdrawal not processed.");
            }
            else {
                this.accountBalance -= withdrawnAmount;
                System.out.println("Withdrawal of " + withdrawnAmount + " processed successfully." + " Remaining balance: " + this.accountBalance );

            }
        }

        public String getAccountNumber() {

            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {

            this.accountNumber = accountNumber;
        }

        public double getAccountBalance() {

            return accountBalance;
        }

        public void setAccountBalance(double accountBalance) {

            this.accountBalance = accountBalance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {

            this.customerName = customerName;
        }

        public String getEmailAddress() {

            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {

            this.emailAddress = emailAddress;
        }

        public String getPhoneNumber() {

            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {

            this.phoneNumber = phoneNumber;
        }
    }



