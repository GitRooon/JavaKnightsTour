/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chris
 */
public class knightMove extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet knightMove</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Welcome to a Kights Tour</h3>");

            out.println("</body>");
            out.println("</html>");
           
            //get parameters
        int xpos = Integer.parseInt(request.getParameter("xpos"));
        int ypos = Integer.parseInt(request.getParameter("ypos"));
        String method = request.getParameter("DumbSmart");
        int iterations = Integer.parseInt(request.getParameter("quantity"));
        ArrayList<String> resultsToFile=new ArrayList<String>();
        
        
        
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        
         int[][] moves = {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}
                        ,{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}};
         
          String[][] movesString = new String[8][8];
         
        
        
            for (int i = 0; i < iterations; i++) {
            
                Knight sirRobin = new Knight(xpos, ypos);
                
          //do either smart or dumb moves depending on selection && write moves to array  
          //records trial data to string arraylist
          
        do{
            
            if(method.equals("Smart")){
            sirRobin.moveSmart();
            moves[sirRobin.xPosition][sirRobin.yPosition] = sirRobin.listMoves.size();
            
            }
            else{
                sirRobin.moveDumb();
                moves[sirRobin.xPosition][sirRobin.yPosition] = sirRobin.listMoves.size();
            }
        } while (sirRobin.validMoves().size()>0);
        
        String results = "trial #"+(i+1)+" the "+method+"Knight sucessfully touched "+ (sirRobin.listMoves.size()+1)+" squares";
        
        resultsToFile.add(results);
        
        pw.println(results);
        pw.println("<br>");
        
        if(sirRobin.listMoves.size()==63){
            pw.println("the knight touched every Tile!!! what a smart knight");
            pw.println("<br>");
        }
//        pw.println(sirRobin.listMoves);
        
sirRobin.Create_Write_File(resultsToFile, method);

    pw.println("<br>");

//outout move board to HTML
 for (int j = 0; j < movesString.length; j++) {
         for (int k = 0; k < movesString.length; k++) {
             

                if (moves[j][k]<10){
                 movesString[j][k] = "0"+Integer.toString(moves[j][k]);
             }
            else if(moves[j][k]>=10){
                 movesString[j][k] = Integer.toString(moves[j][k]);
             }
             pw.println(movesString[j][k]);
         }
         pw.println("<br>");
         }
pw.println("<br>");

        
        }//end of for
            
   
    
    
//    pw.println(resultsToFile);
        
//        if(method.equalsIgnoreCase("Smart")){
//           
//          
//            File Test = new File("C:\\Ez2Search.txt");
//            Path path = Paths.get("src/main/resources/myfile.txt");
//            File FileF = new File("src/main/resources/test9922.txt");
//            File File1 = new File("RooneChrHeuristicsMethod.txt");
//            pw.println("did it get called?");
//            
////            Files.createFile(path);
////            
////            File1.createNewFile();
//            
//            PrintWriter toFile = new PrintWriter(File1);
//            
//            for (int i = 0; i < resultsToFile.size(); i++) {
//                toFile.write(resultsToFile.get(i));
//                
//            }
//           toFile.close();
//           
//           if (File1.createNewFile()) {
//            
//          
//           }
//            
//        }
//        
//          if(method.equalsIgnoreCase("Dumb")){
//            File File1 = new File("Test/RooneChrNonIntelligentMethod.txt");
//            File1.createNewFile();
//        }
        


        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
       
                
            
        
        
        
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
public static void main(String[] args) {
        
    }
    
}
