package com.bodejidi.freezing.octo.wallhack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ContactDaoImpl contactDaoImpl = new ContactDaoImpl();
        ContactService contactService = new ContactService(contactDaoImpl);
        Contact contact = new Contact();

        contact.setName(req.getParameter("name"));

        contactService.save(contact);
        resp.getWriter().println("Contact: " + contact);
    }
}
