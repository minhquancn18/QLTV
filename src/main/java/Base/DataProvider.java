/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class give method to connect to the database
 *
 * @author Nguyễn Duy Phúc
 */
public class DataProvider {

    //String connection
    private static final String URL = "jdbc:postgresql://localhost:5432/QLTV";
    private static final String USERNAMEDB = "postgres";
    private static final String PASSDB = "admin";

    private static DataProvider instance;

    /**
     * Empty constructor
     */
    private DataProvider() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    /**
     * Get Connection to Database
     *
     * @return Connection to database
     */
    private static Connection getConnection() {
        if (instance == null) {
            instance = new DataProvider();
        }
        //Get connection
        try {
            return DriverManager.getConnection(URL, USERNAMEDB, PASSDB);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            return null;
        }
    }

    /**
     * Close Connection from Database
     *
     * @param connection Connection want to close
     */
    private static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    /**
     * Get list of row.Often use for (select) query
     *
     * @param query String query
     * @param parameter list parameter
     * @return list of row
     */
    public static ResultSet ExecuteQuery(String query, Object[] parameter) {
        //Declare variables
        ResultSet result = null;
        Connection connection;

        connection = getConnection();
        if (connection == null) {
            return result;
        }

        //Execute Query
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            int index = 1;
            // Insert parameter
            if (null != parameter && parameter.length != 0) {
                for (Object para : parameter) {
                    pstmt.setObject(index++, para);
                }
            }
            result = pstmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            closeConnection(connection);
        }
        return result;
    }

    /**
     * Get the number of row. Often use for (insert, update, delete,...) query
     *
     * @param query String query
     * @param parameter list parameter
     * @return Number of row
     */
    public static boolean ExecuteNonQuery(String query, Object[] parameter) {
        //Declare variables
        boolean result = false;
        Connection connection;
        connection = getConnection();
        if (connection == null) {
            return result;
        }

        //Execute Query
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            int index = 1;
            // Insert parameter
            if (null != parameter && parameter.length != 0) {
                for (Object para : parameter) {
                    pstmt.setObject(index++, para);
                }
            }
            result = pstmt.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            closeConnection(connection);
        }
        return result;
    }

    /**
     * Get the first data. Often use for (count, sum, average...) query
     *
     * @param query String query
     * @param parameter list parameter
     * @return first data
     */
    public static String ExecuteScalar(String query, Object[] parameter) {
        //Declare variables
        String result = null;
        Connection connection;
        connection = getConnection();
        if (connection == null) {
            return result;
        }

        //Execute Query
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            int index = 1;
            // Insert parameter
            if (null != parameter && parameter.length != 0) {
                for (Object para : parameter) {
                    pstmt.setObject(index++, para);
                }
            }
            ResultSet resultSet = pstmt.executeQuery();
            resultSet.next();
            result = resultSet.getString(1);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return result;
    }
}
