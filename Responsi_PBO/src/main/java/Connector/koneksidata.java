/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;
/**
 *
 * @author Lab Informatika
 */
public class koneksidata {
    static Connection con;
    
    public static Connection connection() {
        if(con==null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("zoo");
            data.setUser("root");
            data.setPassword(" ");
            try{
                con = data.getConnection();
                System.out.printIn("Koneksi Berhasil");
            }catch(SQLException ex){
                ex.printStackTrace();
                System.out.printIn("Koneksi Gagal");
            }
        }
        return con;
    }
}

