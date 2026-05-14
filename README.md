# ☕ Java Cafe Ordering System (SSAMS)

## 📌 1.0 Introduction
**Java Cafe** is a popular aesthetic cafe known for its delicious menu. However, high foot traffic led to long waiting times and manual order errors. To solve this, we developed a self-service **Ordering System** that allows customers to browse the menu and order independently. This enables staff to focus on food preparation and ensures a smoother workflow.

---

## ⚠️ 2.0 Problem Statement
* **Manual Bottleneck:** High risk of human error and misheard orders during peak hours.
* **Delayed Service:** Significant time gap between customer arrival and order placement.
* **Staff Overload:** Employees struggling to manage both customer service and kitchen duties simultaneously.

---

## 🎯 3.0 Objectives
* **Digital Menu:** To display all food and drinks provided by the cafe systematically.
* **Automated Billing:** To calculate total payments accurately, including membership discounts.
* **Order Tracking:** To print dual-copy receipts (Customer & Staff) for better order management.

---

## 🛠️ 4.0 Technical Scope (OOP Approach)
This system is built using **Java** with a focus on **Object-Oriented Programming (OOP)** principles to ensure code reusability and modularity.

### 📊 System Architecture
* **Inheritance & Abstraction:** * `MenuItem`: An **Abstract Class** acting as the base for all products.
    * `FoodItem` & `DrinkItem`: Subclasses that inherit and extend the `MenuItem` attributes.
* **Core Logic (`Order` Class):** Manages queue numbers, time-stamping, and receipt generation.
* **Main Controller (`CafeOrderSystem`):** Handles user input, output displays, and array management.

### 🔢 Core Formulas
| Feature | Formula |
| :--- | :--- |
| **Total Price** | $total = \sum (item.price)$ |
| **Member Discount** | $total = total \times 0.97$ (3% Off) |

---

## 🚀 5.0 Key Features
* **✅ Automated Ordering:** Reduces dependency on manual staff taking orders.
* **💳 Integrated Payment:** Supports multiple payment types for customer convenience.
* **🎟️ Membership System:** Auto-validates Membership IDs to apply a **3% discount**.
* **🧾 Dual-Receipt Output:** Generates one copy for the customer and one for the kitchen staff.

---
---
## 🛠 Project Info
* **Course:** CSC186 (Object Oriented Programming)
* **Project Type:** Group Project (Semester 2)

## 💻 How to Run
1. Clone this repository.
2. Open the project in your preferred IDE (NetBeans/IntelliJ/Eclipse).
3. Run `CafeOrderSystem.java`.
