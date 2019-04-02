
package jeeproject.domain.model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginDAO 
{
    public boolean authenticateUser(LoginBean loginBean)
    {
        String userName = loginBean.getName(); //Keeping user entered values in temporary variables.
        String password = loginBean.getPassword();
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String userNameDB = "";
        String passwordDB = "";
        try {
            //con = DBConnection.createConnection(); //establishing connection
            statement = con.createStatement(); //Statement is used to write queries. Read more about it.
            resultSet = statement.executeQuery("select name,password from useraccounts"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
            while(resultSet.next()) // Until next row is present otherwise it return false
            {
                userNameDB = resultSet.getString("userName"); //fetch the values present in database
                passwordDB = resultSet.getString("password");
                if(userName.equals(userNameDB) && password.equals(passwordDB))
                    {
                    return true; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
                    }
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false; // Just returning appropriate message otherwise
    }
}