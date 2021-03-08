package com.csye6220.Assignment03.controller;

import com.csye6220.Assignment03.entity.Items;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StoreController extends HttpServlet {

    private List<Items> createCheckedList(HttpSession session){
        List<Items> list=new ArrayList<>();
        Items book1=new Items("book1","Java Servlet Programming",29.95f,false);
        Items book2=new Items("book2","Oracle Database Programming",48.95f,false);
        Items book3=new Items("book3","System Analysis and Design",14.95f,false);
        Items book4=new Items("book4","Object Oriented Software Engineering",35.99f,false);
        Items book5=new Items("book5","Java Web Services",27.99f,false);
        Items music1=new Items("music1","I'm Going to Tell You a Secret by Madonna",26.99f,false);
        Items music2=new Items("music2","Baby One More Time by Bntney Spears",10.95f,false);
        Items music3=new Items("music3","Justified by justin timberlake",9.97f,false);
        Items music4=new Items("music4","Loose by Nelly Furtado",13.98f,false);
        Items music5=new Items("music5","Gold Digger by Kanye West",27.99f,false);
        Items computer1=new Items("computer1","Apple MacBook Pro with 13.3\" Display",1299.99f,false);
        Items computer2=new Items("computer2","Asus Laptop",949.95f,false);
        Items computer3=new Items("computer3","HP Pavhon Laptop with Centrino 2 DV7",1199.95f,false);
        Items computer4=new Items("computer4","Tochba Satelite Laptop with Centriono 2 - Copper",899.99f,false);
        Items computer5=new Items("computer5","Sony VAIO Laptop with Core 2 Duo Comopotan Pink",779.99f,false);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(computer1);
        list.add(computer2);
        list.add(computer3);
        list.add(computer4);
        list.add(computer5);
        list.add(music1);
        list.add(music2);
        list.add(music3);
        list.add(music4);
        list.add(music5);
        setCheckedBySession(list,session);
        List<Items> listOut=new ArrayList<>();
        for (Items items:list){
            if(items.isChoose()){
                listOut.add(items);
            }
        }
        return listOut;
    }

    private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        String page=req.getParameter("page");
        if(page!=null&&req.getMethod().equals("GET")){
            session.setAttribute("page",page);
            resp.sendRedirect(".");
            return;
        }
        page=(String) session.getAttribute("page");
        String action=req.getParameter("action");
        if(page!=null){
            if(page.equals("books")){
                List<Items> list=createBooks();
                setCheckedBySession(list,session);

                if(action!=null&&action.equals("input")){
                    addIntoSession(req,resp,list);
                    req.setAttribute("checkedItems",createCheckedList(session));
                    RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/jsp/store/cart.jsp");
                    requestDispatcher.forward(req,resp);
                }else {
                    req.setAttribute("items",list);
                    RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/jsp/store/books.jsp");
                    requestDispatcher.forward(req,resp);
                }

            }else if(page.equals("music")){
                List<Items> list=createMusic();
                setCheckedBySession(list,session);
                if(action!=null&&action.equals("input")){
                    addIntoSession(req,resp,list);
                    req.setAttribute("checkedItems",createCheckedList(session));
                    RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/jsp/store/cart.jsp");
                    requestDispatcher.forward(req,resp);

                }else {
                    req.setAttribute("items",list);
                    RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/jsp/store/music.jsp");
                    requestDispatcher.forward(req,resp);
                }

            }else if(page.equals("computers")){
                List<Items> list=createComputers();
                setCheckedBySession(list,session);
                if(action!=null&&action.equals("input")){
                    addIntoSession(req,resp,list);
                    req.setAttribute("checkedItems",createCheckedList(session));
                    RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/jsp/store/cart.jsp");
                    requestDispatcher.forward(req,resp);
                }else {
                    req.setAttribute("items",list);
                    RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/jsp/store/computers.jsp");
                    requestDispatcher.forward(req,resp);
                }

            }else if(page.equals("cart")){
                req.setAttribute("checkedItems",createCheckedList(session));
                RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/jsp/store/cart.jsp");
                requestDispatcher.forward(req,resp);
            }

        }else {
            List<Items> list=createBooks();
            setCheckedBySession(list,session);
            req.setAttribute("items",list);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/jsp/store/books.jsp");
            requestDispatcher.forward(req,resp);

        }
    }
    private List<Items> createMusic(){
        List<Items> list=new ArrayList<>();
        Items music1=new Items("music1","I'm Going to Tell You a Secret by Madonna",26.99f,false);
        Items music2=new Items("music2","Baby One More Time by Bntney Spears",10.95f,false);
        Items music3=new Items("music3","Justified by justin timberlake",9.97f,false);
        Items music4=new Items("music4","Loose by Nelly Furtado",13.98f,false);
        Items music5=new Items("music5","Gold Digger by Kanye West",27.99f,false);
        list.add(music1);
        list.add(music2);
        list.add(music3);
        list.add(music4);
        list.add(music5);
        return list;
    }
    private List<Items> createComputers(){
        List<Items> list=new ArrayList<>();
        Items computer1=new Items("computer1","Apple MacBook Pro with 13.3\" Display",1299.99f,false);
        Items computer2=new Items("computer2","Asus Laptop",949.95f,false);
        Items computer3=new Items("computer3","HP Pavhon Laptop with Centrino 2 DV7",1199.95f,false);
        Items computer4=new Items("computer4","Tochba Satelite Laptop with Centriono 2 - Copper",899.99f,false);
        Items computer5=new Items("computer5","Sony VAIO Laptop with Core 2 Duo Comopotan Pink",779.99f,false);
        list.add(computer1);
        list.add(computer2);
        list.add(computer3);
        list.add(computer4);
        list.add(computer5);
        return list;
    }

    private List<Items> createBooks(){
        List<Items> list=new ArrayList<>();
        Items book1=new Items("book1","Java Servlet Programming",29.95f,false);
        Items book2=new Items("book2","Oracle Database Programming",48.95f,false);
        Items book3=new Items("book3","System Analysis and Design",14.95f,false);
        Items book4=new Items("book4","Object Oriented Software Engineering",35.99f,false);
        Items book5=new Items("book5","Java Web Services",27.99f,false);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        return list;
    }
    private void setCheckedBySession(List<Items> list ,HttpSession session){
        for(Items items:list){
            items.setChoose(session.getAttribute(items.getId())!=null?true:false);
        }

    }

    private void addIntoSession(HttpServletRequest req, HttpServletResponse resp,List<Items> itemList){
        HttpSession session=req.getSession();
        for (Items item:itemList){
            String checked=req.getParameter(item.getId());
            if(checked!=null){
                session.setAttribute(item.getId(),"checked");
            }else {
                session.removeAttribute(item.getId());
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req,resp);
    }
}
