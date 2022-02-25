package com.dara.data;

import com.dara.model.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class MasterData {

    @Autowired
    private DataSource dataSource;

    public static void getKonek(){
       // Connection con = null;
        try {
           /* con = DriverManager
                    .getConnection("jdbc:postgresql://localhost/ol_shop",
                            "postgres","D0302");*/
            PreparedStatement ps = dataSource.getConnection()
            .prepareStatement("SELECT department_id, name, description\n" +
                    "\tFROM public.department;");

            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("department_id")+" : "+rs.getString("name"));
            }
            rs.close();
             ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        public List<Departement> getDeptList(){
            PreparedStatement ps = null;
            List<Departement> departementList = null;
            try{
                ps = dataSource.getConnection()
                        .prepareStatement(("SELECT department_id, name, description\n" +
                                "\tFROM public.department;");
                 ResultSet rs = ps.executeQuery();
                 departementList = new ArrayList<>();
                 while (rs.next());
                    Departement departement = new Departement();
                    departement.setDeskripsi(rs.getString("description"));
                    departement.setId(rs.getInt("department_id"));
                    departement.setName(rs.getString("name"));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
    }
}
