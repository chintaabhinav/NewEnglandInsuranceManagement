# **Insurance Management System**

## **Project Overview**

The **Insurance Management System** is a unified platform designed to streamline policy management, claims processing, customer support, and payment workflows in the insurance domain. The system enables centralized data management, role-based access, and cross-departmental collaboration to improve operational efficiency and customer satisfaction.

---

## **Features**

1. **Role-Based Access**: Secure access to platform resources based on user roles (Admin, Agent, Customer, etc.).
2. **Policy Management**: Agents and Policy Admins can create, update, and renew policies.
3. **Claims Processing**: Customers submit claims that are verified by the Claims Processor.
4. **Payment Processing**: Customers can pay premiums online, and transactions are validated by the Payment Processor.
5. **VIN Verification**: The VIN Database Manager ensures vehicle data accuracy.
6. **Customer Support**: IT Support and Sales Personnel assist customers with queries and onboarding.
7. **Email Notifications**: Integration with Oracle Mail for customer notifications.

---

## **Technical Components**

### **1. MySQL Connector**

- **Purpose**: Used to connect the Java application to the MySQL database for storing and retrieving data.
- **Setup**:
  - Add the `mysql-connector-java-X.X.X.jar` file to your project’s library.
  - Configure the database connection URL, username, and password.
- **Key Tables**:
  - `customers`: Stores customer information.
  - `policies`: Stores policy details.
  - `payments`: Logs payment transactions.
  - `vehicles`: Maintains vehicle information and VIN records.

### **2. Oracle Mail JAR**

- **Purpose**: Used to send emails to customers for notifications, updates, and confirmations.
- **Setup**:
  - Include the `oracle-mail.jar` file in your project’s library.
  - Configure email properties (SMTP server, port, etc.) in the Java code.
  - Utilize Oracle Mail APIs to compose and send emails.

### **3. Oracle Mail Authenticator JAR**

- **Purpose**: Provides secure authentication for sending emails through Oracle Mail.
- **Setup**:
  - Add the `oracle-mail-auth.jar` file to your project’s library.
  - Use it in combination with the Oracle Mail JAR to authenticate the sender's email credentials securely.
- **Example**: Ensures emails sent by the Agent are authenticated before reaching the customer.

### **4. Java Swing UI**

- **Purpose**: Provides a graphical user interface (GUI) for users to interact with the system.
- **Key Features**:
  - Login screens for Admin, Agent, and other roles.
  - Dashboards for Policy Management, Claims Processing, and Customer Support.
  - Forms for policy creation, claims submission, and payment processing.
- **Implementation**:
  - Designed using Java Swing components such as `JFrame`, `JPanel`, `JTable`, and `JTextField`.
  - Interactive buttons for navigation between different workflows.

---

## **How to Run the Project**

### **1. Prerequisites**

- **Java Development Kit (JDK)** 8 or above.
- **MySQL Server** (version 8.0 or above).
- Required JAR files:
  - `mysql-connector-java-X.X.X.jar`
  - `oracle-mail.jar`
  - `oracle-mail-auth.jar`

### **2. Setting Up the Database**

1. Create a new MySQL database, e.g., `insurance_management`.
2. Execute the provided SQL script (`schema.sql`) to create tables and seed initial data.
3. Update the database connection details in the Java code:
   ```java
   String url = "jdbc:mysql://localhost:3306/insurance_management";
   String username = "your_username";
   String password = "your_password";
   ```

### **3. Configuring Email Notifications**

1. Add the Oracle Mail JAR and Authenticator JAR to your project’s classpath.
2. Update the email configuration in the code:
   ```java
   Properties props = new Properties();
   props.put("mail.smtp.host", "smtp.oracle.com");
   props.put("mail.smtp.port", "587");
   props.put("mail.smtp.auth", "true");
   ```

### **4. Running the Application**

1. Compile the project using your preferred IDE (e.g., NetBeans, IntelliJ IDEA).
2. Start the application by running the `Main` class.
3. Use the provided login credentials for each role to explore the system.

---

## **Directory Structure**

```
src/
├── UI/
│   ├── Admin/
│   ├── Agent/
│   ├── Customer/
│   ├── PolicyAdmin/
│   ├── ITSupport/
├── Model/
│   ├── DatabaseConnection/
│   ├── Customer/
│   ├── Policy/
│   ├── Payment/
│   ├── Vehicle/
├── Main/
│   ├── InsuranceModel.java
│   ├── Main.java
lib/
├── mysql-connector-java-X.X.X.jar
├── oracle-mail.jar
├── oracle-mail-auth.jar
resources/
├── schema.sql
```

---

## **Future Enhancements**

1. Integration with external APIs for real-time VIN validation.
2. Advanced reporting module for better insights into policies and claims.
3. Adding document upload functionality for policy applications and claims.

---


