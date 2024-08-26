# JSP Servlet Registration Project

This is a practice project demonstrating how to create a user registration system using JSP (JavaServer Pages), Servlets, and a MySQL database. The project covers basic CRUD (Create, Read, Update, Delete) operations and user validation, making it a useful starting point for anyone learning Java web development.

## Features

- User registration with validation
- Secure password storage using hashing
- Connection to a MySQL database
- Error handling and form validation


## Technologies Used

- Java
- JSP (JavaServer Pages)
- Servlets
- MySQL Database
- Apache Tomcat (or any other compatible servlet container)

## Prerequisites

Before you begin, ensure you have the following software installed:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Apache Tomcat](http://tomcat.apache.org/) or any other servlet container
- [MySQL Database](https://www.mysql.com/downloads/)
- An IDE (Integrated Development Environment) like Eclipse or IntelliJ IDEA

## Setup Instructions

1. **Clone the repository:**

    ```bash
    git clone https://github.com/yourusername/jsp-servlet-registration.git
    ```

2. **Set up the MySQL Database:**

    - Create a database named `user_registration`.
    - Run the following SQL script to create the `users` table:

    ```sql
    CREATE DATABASE user_registration;

    USE user_registration;

    CREATE TABLE users (
        id INT AUTO_INCREMENT PRIMARY KEY,
        username VARCHAR(50) NOT NULL UNIQUE,
        email VARCHAR(100) NOT NULL UNIQUE,
        password VARCHAR(100) NOT NULL
    );
    ```

3. **Configure the database connection:**

    - Open the `db.properties` file (or wherever the database configuration is set up in your project).
    - Update the following properties with your MySQL configuration:

    ```properties
    db.url=jdbc:mysql://localhost:3306/user_registration
    db.username=your_mysql_username
    db.password=your_mysql_password
    ```

4. **Deploy the Project:**

    - Open your IDE and import the project.
    - Configure the Apache Tomcat server.
    - Build and run the project on the server.

5. **Access the Registration Page:**

    - Once the server is running, open your web browser and navigate to:

    ```
    http://localhost:8080/your_project_name/register.jsp
    ```

    - Fill in the registration form and submit to register a new user.

## Usage

- **Registration:** Users can register by filling out the form. The system will validate input fields (e.g., ensure the email is in the correct format) and store user information securely in the database.

- **Error Handling:** The system will provide feedback for incorrect form submissions, such as already registered emails or invalid usernames.

## Screenshots

![Screenshot (76)](https://github.com/user-attachments/assets/d02d53b6-1d38-48e4-aac4-d4d3046c156b)
![Screenshot (77)](https://github.com/user-attachments/assets/5b4c26d7-0d62-4ca9-950d-383ce9db105e)
![Screenshot (78)](https://github.com/user-attachments/assets/d510caab-c634-4298-9556-0d6f79884282)


## Contributing

Feel free to fork this project and make your own improvements. Contributions are welcome!

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a pull request



## Contact

Prabitra Sarkar - [Mail](sarkarprabitra2019@gmail.com)

Project Link: [here]( https://github.com/Yourpabi2002/Registration_servlet_jsp.git)




