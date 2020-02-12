package com.kodilla.jdbc;

import com.kodilla.jbdc.DbManager;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL =\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS how_many FROM readers WHERE vip_level=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("how_many");
        }
        assertEquals(0, howMany);
    }
    @Test
    public void testUpdateBestsellers() throws SQLException{
        //Given
        DbManager dbManager=DbManager.getInstance();
        String sqlUpdate="UPDATE BOOKS SET BESTSELLER=null";
        Statement statement=dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall="CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);
        //Test
        String sqlCheckTable="SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER IS NULL";
        ResultSet rs=statement.executeQuery(sqlCheckTable);
        int howMany=-1;
        if(rs.next()){
            howMany=rs.getInt("HOW_MANY");
        }
        Assert.assertEquals(6,howMany);

    }
}
