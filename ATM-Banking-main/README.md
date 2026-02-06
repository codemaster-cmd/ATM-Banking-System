# 🏦 ATM Banking 

## 📘 Project Overview
The **ATM Banking System** is a Java console-based application that simulates the core operations of an Automated Teller Machine (ATM).  
It allows users to perform essential banking transactions such as balance inquiry, deposit, withdrawal, and transaction history — all through a simple text-based interface.

---

## ⚙️ Features
- ✅ **User Authentication** – Login using account number and PIN  
- ✅ **Balance Inquiry** – Check your current account balance instantly  
- ✅ **Cash Deposit** – Deposit money into your account  
- ✅ **Cash Withdrawal** – Withdraw funds if sufficient balance exists  
- ✅ **Transaction History** – View your recent transactions  
- ✅ **Exit Option** – Safely terminate the session  

---

## 🧱 Technologies Used
- **Language:** Java  
- **Concepts:** Object-Oriented Programming (OOP), File Handling  
- **Tools:** Terminal / Command Prompt  
- **Version Control:** Git & GitHub  

---

## 📂 Project Structure
```
ATM-Banking/
│
├── ATM.java
├── Account.java
├── Transaction.java
├── transactions_123.txt       # Stores transaction logs
└── README.md
```

---

## ▶️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/ShreeKumbhar/ATM-Banking.git
   ```

2. **Navigate to the project folder**
   ```bash
   cd ATM-Banking
   ```

3. **Compile the program**
   ```bash
   javac ATM.java
   ```

4. **Run the application**
   ```bash
   java ATM
   ```

---

## 💾 Data Storage
- User transaction details are stored in a text file (`transactions_123.txt`) using **Java File Handling**.  
- Each transaction record includes:
  - Transaction Type (Deposit / Withdrawal)
  - Amount
  - Date & Time

---

## 🧠 Concepts Used
- Encapsulation and Classes  
- Exception Handling  
- File Input/Output  
- Loops and Conditional Statements  

---

## 📸 Sample Output
```
=========================
     ATM BANKING SYSTEM
=========================
1. Deposit
2. Withdraw
3. Check Balance
4. Transaction History
5. Exit
Enter your choice:
```

---

## 👨‍💻 Author
**Shree Kumbhar**  
📧 [GitHub Profile](https://github.com/ShreeKumbhar)

---

## 🏁 Future Enhancements
- Add multiple account support  
- Integrate database (MySQL / MongoDB)  
- GUI-based version using JavaFX or Swing  
