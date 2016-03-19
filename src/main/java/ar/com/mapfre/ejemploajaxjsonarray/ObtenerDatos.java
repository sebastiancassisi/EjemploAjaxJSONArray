/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.mapfre.ejemploajaxjsonarray;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ObtenerDatos {

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {                
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/dbajax";
                String user = "root";
                String password = "root";
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }

    }
    
    public static ArrayList<Paises> getAllCountries() {
    	connection = ObtenerDatos.getConnection();
        ArrayList<Paises> countryList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from paises limit 10");
        
            while(rs.next()) {	
            	Paises pais=new Paises();
            	pais.setCodigo(rs.getString("Codigo"));
            	pais.setNombre(rs.getString("Nombre"));
                pais.setContinente(rs.getString("Continente"));
                pais.setRegion(rs.getString("Region"));
            	pais.setPoblacion(rs.getInt("Poblacion"));
            	pais.setCapital(rs.getString("Capital"));
            	countryList.add(pais);
            }
        } catch (SQLException e) {
        }

        return countryList;
    }
}
