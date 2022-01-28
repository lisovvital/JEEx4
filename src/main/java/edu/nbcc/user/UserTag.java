package edu.nbcc.user;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class UserTag extends BodyTagSupport {

	private String name;
	private String address;
	private String email;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public int doStartTag() {
		try {
			JspWriter out = pageContext.getOut();
			out.println("Welcome " + getName() + "<br>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doAfterBody() {
		try {
			JspWriter out = pageContext.getOut();
			out.println(" " + getAddress() + "<br>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		return SKIP_BODY;
	}
	
	@Override
	public int doEndTag() {
		try {
			JspWriter out = pageContext.getOut();
			out.println("Email address is " + getEmail() + "<br>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		return EVAL_PAGE;
	}
}
