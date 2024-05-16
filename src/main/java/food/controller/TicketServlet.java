package food.controller;

import java.io.IOException;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import food.entity.Ticket;
import food.service.TicketService;


@WebServlet("/food/ticket.do")
public class TicketServlet extends HttpServlet {

	private TicketService ticketService;
	
	@Override
	public void init() throws ServletException{
		ticketService = new TicketService();
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		doPost(req, res);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
			
	}
	
	private String getAll(HttpServletRequest req, HttpServletResponse res) {
	    try {
	        List<Ticket> ticketList = ticketService.getAll(new ArrayList<Ticket>());

	        req.setAttribute("ticketList", ticketList);

	        return "/food/index.jsp";
	    } catch (Exception e) {
	        e.printStackTrace(); 
	        return "/error.jsp"; 
	    }
	}
}
