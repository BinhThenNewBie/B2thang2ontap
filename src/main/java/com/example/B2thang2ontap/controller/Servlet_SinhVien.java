package com.example.B2thang2ontap.controller;

import com.example.B2thang2ontap.entity.SinhVien;
import com.example.B2thang2ontap.repo.Repo_SinhVien;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Servlet_SinhVien", value = {"/Servlet_SinhVien","/read","/detail","/delete","/add","/update"})
public class Servlet_SinhVien extends HttpServlet {
    Repo_SinhVien repo = new Repo_SinhVien();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if(uri.contains("/read")){
            ArrayList<SinhVien> lstsv = repo.getAll();
            request.setAttribute("lstsv", lstsv);
            request.getRequestDispatcher("/view/SinhVien.jsp").forward(request,response);
        }else if(uri.contains("/detail")){
            String id = request.getParameter("id");
            SinhVien sv = repo.getRow(id);
            request.setAttribute("detail", sv);
            ArrayList<SinhVien> lstsv = repo.getAll();
            request.setAttribute("lstsv", lstsv);
            request.getRequestDispatcher("/view/SinhVien.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
