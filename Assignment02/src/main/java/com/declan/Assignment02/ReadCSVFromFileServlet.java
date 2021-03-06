package com.declan.Assignment02;


import com.declan.Assignment02.bean.FacilitiesBean;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFromFileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        out.println("Do Get Method of Part 4");

        ServletContext servletContext = getServletContext();
        String contextPath = servletContext.getRealPath("/");
        String directory=contextPath+"WEB-INF\\file";
        try {
            Class.forName("org.relique.jdbc.csv.CsvDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:relique:csv:" + directory;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM parking_facilities");
            System.out.println(results);
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        out.println("Do Get Method of Part 4");
        String tablename=req.getParameter("file_name");

        ServletContext servletContext = getServletContext();
        String contextPath = servletContext.getRealPath("/");
        String directory=contextPath+"WEB-INF\\file";
        try {
            Class.forName("org.relique.jdbc.csv.CsvDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:relique:csv:" + directory;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM "+ tablename+";");
            List<FacilitiesBean> list=new ArrayList<FacilitiesBean>();
            while(results.next()){
                String Facility = results.getString("Facility Type");
                String License = results.getString("License Number");
                String Entity_Name = results.getString("Entity Name");
                String Camis_Trade_Name = results.getString("Camis Trade Name");
                String Address_Bldg = results.getString("Address Bldg");
                String Address_Street_Name = results.getString("Address Street Name");
                String Address_Location = results.getString("Address Location");
                String Address_City = results.getString("Address City");
                String Address_State = results.getString("Address State");
                String Address_Zip_Code = results.getString("Address Zip Code");
                String Telephone_Number = results.getString("Telephone Number");
                String Number_of_Spaces = results.getString("Number of Spaces");
                FacilitiesBean facilitiesBean=new FacilitiesBean();
                facilitiesBean.setFacility_Type(Facility);
                facilitiesBean.setLicense_Number(License);
                facilitiesBean.setEntity_Name(Entity_Name);
                facilitiesBean.setCamis_Trade_Name(Camis_Trade_Name);
                facilitiesBean.setAddress_Bldg(Address_Bldg);
                facilitiesBean.setAddress_Street_Name(Address_Street_Name);
                facilitiesBean.setAddress_Location(Address_Location);
                facilitiesBean.setAddress_City(Address_City);
                facilitiesBean.setAddress_State(Address_State);
                facilitiesBean.setAddress_Zip_Code(Address_Zip_Code);
                facilitiesBean.setTelephone_Number(Telephone_Number);
                facilitiesBean.setNumber_of_Spaces(Number_of_Spaces);
                list.add(facilitiesBean);
            }
            req.setAttribute("data", list);
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        req.getRequestDispatcher("part4.jsp").forward(req, resp);
    }
}
