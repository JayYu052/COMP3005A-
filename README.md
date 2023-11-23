# COMP3005 Assignment 4
Student name: YUNTAO YU  Student id: 101126774

Youtube video link: https://youtu.be/5anyiQYJWBg

how to run my program
1. open pgAdmin4     Create a new dataBase, name it "students"
2. open Query tool insert the pg_table.sql or copy and paste it.    this is the type of values of my table
3. open query tool insertthe pg_data.sql or copy and paste it.    this is inserting the content of the table
4. download the COMP3005_AS4 java files on InteliJ
5. go back to pgadmin 4    find the properties-> connection   find the host name and Port and username
6. figure out the password of the database.
7. fill all the information and replace it with
8.
9. //public class DBStudentConnection {

    private static final String url = "jdbc:postgresql://localhost:5432/students";
    private static final String user = "postgres";
    private static final String password = "newpassword";
   //

10. in main.java   testing if each funtion is running correctly. 
