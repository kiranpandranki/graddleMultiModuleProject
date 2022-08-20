package com.kiran.gradle;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/coupon")
public class CouponServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	//Printing the existing coupons when user clicks in 'coupon' button
    	response.getWriter().print("SUPERSALE");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	//Getting the coupon code entered by the user into a string
    	String coupon = request.getParameter("coupon");
    	
    	//Setting the request attribute for showing discount to the user.
    	request.setAttribute("discount", "discount for "+coupon+" is 50%");
    	
    	//Forwarding the request and response to the jsp file.
    	request.getRequestDispatcher("response.jsp").forward(request, response);;
     }
}