package com.skateshop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skateshop.model.CrearProducto;

@WebServlet("/actualizarProductoServlet")
public class actualizarProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public actualizarProductoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		CrearProducto miProducto = new CrearProducto();
		miProducto.setIdProducto(Integer.parseInt(request.getParameter("idItem")));
		miProducto.setNombreProducto(request.getParameter("nombreItem"));
		miProducto.setPrecioProducto(Double.parseDouble(request.getParameter("precioItem")));
		miProducto.setExistencias(Integer.parseInt(request.getParameter("existencias")));
		miProducto.setFecha(request.getParameter("fecha"));
		
		PrintWriter salida=response.getWriter();
		
		response.setContentType("text/html");
		
		
		//Paso 1
		String user="root";
		String pass="root";
		String urlServidor="jdbc:mysql://localhost:3306/skateshop?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
			String sentenciaSQL ="SELECT * FROM productos WHERE idItem='El ID de mi Producto'";
			
		//Paso 2
		Connection conn = null;
		Statement stmnt = null;
		int nRegistros=0;
		
		try {
			//Paso 3
			
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			
			//Paso 4
			conn = DriverManager.getConnection(urlServidor, user, pass);
			
			//Paso 5
			stmnt = conn.createStatement();
			
			//Paso 6
			sentenciaSQL= "UPDATE productos SET nombreItem='"+miProducto.getNombreProducto()+"',precioItem="
					+miProducto.getPrecioProducto()+",existenciaItem="
					+miProducto.getExistencias()+",fecha="
					+miProducto.getFecha()+" WHERE idItem='"
					+miProducto.getIdProducto()+"'";
			
			//Paso 7
			nRegistros = stmnt.executeUpdate(sentenciaSQL);
			if(nRegistros>0)
			{
				salida.append("Registro fue modificado con exito");
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
		
			try {
				//Paso 8: Cerrar
				stmnt.close();
				conn.close();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		salida.close();
	}

}
