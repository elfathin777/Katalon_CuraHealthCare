# 📌 Katalon Automation Project – Cura Healthcare Service

This project is an **automation testing portfolio** built using **Katalon Studio** for the CURA Healthcare Service demo website.

The goal of this project is to demonstrate:
- Web automation testing skills
- Test case design & structuring
- Data-Driven Testing (DDT)
- End-to-end test flow
- Reusable and maintainable test scripts

---

## 🌐 Application Under Test
**CURA Healthcare Service Demo**  
URL: https://katalon-demo-cura.herokuapp.com/

---

## 🧱 Tech Stack

- **Katalon Studio**
- **Groovy**
- **Data-Driven Testing (CSV / Test Data)**
- **Git & GitHub**

---

## 🧪 Testing Approach

### Data-Driven Testing (DDT)

- One test case is executed with multiple sets of test data
- Test data is stored in Katalon **Test Data (CSV)**
- Supports various scenarios:
  - Valid login
  - Invalid login
  - Empty field validation
  - Negative test scenarios

---

## 🔄 Current Progress

- ✅ Project setup completed
- ✅ Login automation implemented
- ✅ Data-driven test structure applied
- 🔄 Additional test scenarios in progress
- 🔄 Test listeners and optimization ongoing

📈 This repository will be **updated regularly** with:
- New test cases
- Improved test logic
- Better test data coverage
- Code refactoring and best practices

---

## ▶️ How to Run the Test

### Option 1: Run via Katalon Studio
1. Open **Katalon Studio**
2. Open this project
3. Select **Test Suite → CuraTestSuite**
4. Click **Run**

### Option 2: Run via Command Line (CI/CD Ready)
```bash
katalon -noSplash -runMode=console \
-projectPath="Katalon_CuraHealthCare.prj" \
-testSuitePath="Test Suites/CuraTestSuite" \
-browserType="Chrome" \
-executionProfile="default"

---

## 📌 Notes

- This project focuses on **learning, consistency, and clean automation logic**
- No Page Object Model (POM) is used at this stage
- Test design prioritizes **clarity and maintainability**

---

## 👤 Author

**Haruna Elfathin**   

---

## 📄 License

This project is created for **learning and educational purposes**.
