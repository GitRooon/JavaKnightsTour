
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class Knight {
    
    public int xPosition;
    public int yPosition;
    public int[][] movesDone;
    ArrayList<String> listMoves;
    public String validMove;
    public int[][]  heuristicBoard;
    
   Knight(int xPosition, int yPosition){
       
       this.xPosition= xPosition;
       this.yPosition= yPosition;
      
       this.listMoves = new ArrayList<String>();
       
       int board[][] = {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}
                        ,{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}};
       
       int heuristicBoard[][] = {{2,3,4,4,4,4,3,2},{3,4,6,6,6,6,4,3},{4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},
                                 {4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},{3,4,6,6,6,6,4,3},{2,3,4,4,4,4,3,2}};
       
       this.heuristicBoard = heuristicBoard;
       this.movesDone = board;
       this.movesDone[this.xPosition][this.yPosition] = 1;
   }
    
   public void setX(int x){
       this.xPosition = x;
   }
   
   public void setY(int y){
       this.yPosition = y;
   }
    public int getxPosition(){
        return this.xPosition;
    }
    
       public int getyPosition(){
        return this.yPosition;
    }
       
         
               public boolean moveDone()
       {
           if(this.movesDone[this.getxPosition()][this.getyPosition()]== 1){
               
           }
           return true;
       }
       //has the move been done
        public boolean moveDone(int xPos, int yPos){
           if(this.movesDone[xPos][yPos]== 1){
               return true;
           }
           return false;
       }
        
      //can you move, moves counter clockwise from X-1,y-2
        public boolean canMove1(){
           
           int x = this.getxPosition();
           int y = this.getyPosition();
           
           int newX = x - 1;
           int newY = y - 2;
          
           if (x>=1 && y>=2 ){
               
               boolean check = moveDone(newX, newY);
               
               if(!check)
                   return true;
               
            
               
//               this.movesDone[newX][newY] = 1;
           }
          
           return false;
           
       }
       
        public boolean canMove2(){
           
           int x = this.getxPosition();
           int y = this.getyPosition();
           
           int newX = x-2;
           int newY = y-1;
           
          if (x>=2 && y>=1 ){
               
               boolean check = moveDone(newX, newY);
               
               if(!check)
                   return true;
               
               
//               this.movesDone[newX][newY] = 1;
           }
           return false;
       }
        
        public boolean canMove3(){
           
           int x = this.getxPosition();
           int y = this.getyPosition();
           
           int newX = x-2;
           int newY = y+1;
           
          if (x>=2 && y<=6 ){
               
               boolean check = moveDone(newX, newY);
               
               if(!check)
                   return true;
               
                
//               this.movesDone[newX][newY] = 1;
           }
           return false;
       }
        
        public boolean canMove4(){
           
           int x = this.getxPosition();
           int y = this.getyPosition();
           
           int newX = x-1;
           int newY = y+2;
           
          if (x>=1 && y<=5 ){
               
               boolean check = moveDone(newX, newY);
               
               if(!check)
                   return true;
               
               
//               this.movesDone[newX][newY] = 1;
           }
           return false;
       }
        
        public boolean canMove5(){
           
           int x = this.getxPosition();
           int y = this.getyPosition();
           
           int newX = x+1;
           int newY = y+2;
           
          if (x<=6 && y<=5 ){
               
               boolean check = moveDone(newX, newY);
               
               if(!check)
                   return true;
               
                  
//               this.movesDone[newX][newY] = 1;
           }
           return false;
       }
         
        public boolean canMove6(){
           
           int x = this.getxPosition();
           int y = this.getyPosition();
           
           int newX = x+2;
           int newY = y+1;
           
          if (x<=5 && y<=6 ){
               
               boolean check = moveDone(newX, newY);
               
               if(!check)
                   return true;
               
                
//               this.movesDone[newX][newY] = 1;
           }
           return false;
       }
              
        public boolean canMove7(){
           
           int x = this.getxPosition();
           int y = this.getyPosition();
           
           int newX = x+2;
           int newY = y-1;
           
          if (x<=5 && y>=1 ){
               
               boolean check = moveDone(newX, newY);
               
               if(!check)
                   return true;
               
                
//               this.movesDone[newX][newY] = 1;
           }
           return false;
       }
         
        public boolean canMove8(){
           
           int x = this.getxPosition();
           int y = this.getyPosition();
           
           int newX = x+1;
           int newY = y-2;
           
          if (x<=6 && y>=2 ){
               
               boolean check = moveDone(newX, newY);
               
               if(!check)
                   return true;
               
//               this.xPosition = newX;
//               this.yPosition = newY;   
//               this.movesDone[newX][newY] = 1;
           }
           return false;
       }
    
    
    public ArrayList validMoves(){
        
        
        
        ArrayList<Integer> validList=new ArrayList<Integer>();
//        int moves[] ={};
        
        if(this.canMove1()){

            validList.add(1);
            
        }
        
         if(this.canMove2()){

            validList.add(2);
            
        }
        
          if(this.canMove3()){

            validList.add(3);
            
        }
        
           if(this.canMove4()){

            validList.add(4);
            
        }
        
            if(this.canMove5()){

            validList.add(5);
            
        }
        
             if(this.canMove6()){

            validList.add(6);
            
        }
        
              if(this.canMove7()){

            validList.add(7);
            
        }
        
               if(this.canMove8()){

            validList.add(8);
            
        }
        
        
        return validList;
    }
    
    public ArrayList validSmart(){
       
        ArrayList<Integer> validList= this.validMoves();
        ArrayList<Integer> smartList=new ArrayList<Integer>(); 
        ArrayList<Integer> smartListA=new ArrayList<Integer>();
        
        for (int i = 0; i < validList.size(); i++) {
            
            int index = validList.get(i);
            
            switch(index){
                
                case 1:
                        int huer1 = this.heuristicBoard[this.xPosition-1][this.yPosition-2];
                        smartList.add(huer1);
                        smartList.add(1);
                        break;
                        
                        
                case 2:
                        int heur2 = this.heuristicBoard[this.xPosition-2][this.yPosition-1];
                        smartList.add(heur2);
                        smartList.add(2);
                        break;
                        
                case 3:
                        int heur3 = this.heuristicBoard[this.xPosition-2][this.yPosition+1];
                        smartList.add(heur3);
                        smartList.add(3);
                        break;
                
                case 4:
                        int heur4 = this.heuristicBoard[this.xPosition-1][this.yPosition+2];
                        smartList.add(heur4);
                        smartList.add(4);
                        break;
                        
                case 5:
                         int heur5 = this.heuristicBoard[this.xPosition+1][this.yPosition+2];
                         smartList.add(heur5);
                         smartList.add(5);
                         break;
                         
                case 6:
                        int heur6 = this.heuristicBoard[this.xPosition+2][this.yPosition+1];
                        smartList.add(heur6);
                        smartList.add(6);
                        break;
                        
                case 7:
                        int heur7 = this.heuristicBoard[this.xPosition+2][this.yPosition-1];
                        smartList.add(heur7);
                        smartList.add(7);
                        break;
                        
                case 8:
                        int heur8 = this.heuristicBoard[this.xPosition+1][this.yPosition-2];
                        smartList.add(heur8);
                        smartList.add(8);
                        break;
                        
                        }
            
           
            
        }
//        int huer1 = this.heuristicBoard[this.xPosition-1][this.yPosition-2];
//        int heur2 = this.heuristicBoard[this.xPosition-2][this.yPosition-1];
//        int heur3 = this.heuristicBoard[this.xPosition-2][this.yPosition+1];
//        int heur4 = this.heuristicBoard[this.xPosition-1][this.yPosition+2];
//        int heur5 = this.heuristicBoard[this.xPosition+1][this.yPosition+2];
//        int heur6 = this.heuristicBoard[this.xPosition+2][this.yPosition+1];
//        int heur7 = this.heuristicBoard[this.xPosition+2][this.yPosition-1];
//        int heur8 = this.heuristicBoard[this.xPosition+1][this.yPosition-2];
        return smartList;
    }
   
    public ArrayList finalList(){
        
         ArrayList<Integer> smartList= this.validSmart();
         ArrayList<Integer> smartListA=new ArrayList<Integer>();
        
        for (int i = 0; i < smartListA.size(); i++) {
            
            if(i%2==1){
                
                if(smartList.get(i)==2){
                    smartListA.add(smartList.get(i+1));
                }
                      
            }
     
        }
        
        if(smartListA.isEmpty()){
        for (int i = 0; i < smartList.size(); i++) {
         if(i%2==1){
                   if(smartList.get(i)==3){
                    smartListA.add(smartList.get(i+1));   
                }
         }
        }
        }
        
        
         if(smartListA.isEmpty()){
        for (int i = 0; i < smartList.size(); i++) {
         if(i%2==1){
                   if(smartList.get(i)==4){
                    smartListA.add(smartList.get(i+1));   
                }
         }
        }
         }
         
          if(smartListA.isEmpty()){
        for (int i = 0; i < smartList.size(); i++) {
         if(i%2==1){
                   if(smartList.get(i)==6){
                    smartListA.add(smartList.get(i+1));   
                }
         }
        }
          }
          
           if(smartListA.isEmpty()){
        for (int i = 0; i < smartList.size(); i++) {
         if(i%2==1){
                   if(smartList.get(i)==8){
                    smartListA.add(smartList.get(i+1));   
                }
         }
        }
           }
        
        return smartListA;
    }
    
    
    public ArrayList finalList222(){
         
        ArrayList<Integer> firstList= this.validSmart();
        ArrayList<Integer> finalList=new ArrayList<Integer>();
        
        
        for (int i = 0; i < firstList.size(); i++) {
//            System.out.println(i);(firstList.get(i+1))
            if(i%2==0){
                System.out.println("i value: "+i);
//                System.out.println("uneven index number");
                System.out.println("i value get = "+firstList.get(i));
                if(firstList.get(i)==2){
                    System.out.println("smart move choice: "+ firstList.get(i)+"  " + firstList.get(i+1));
                    finalList.add(firstList.get(i+1));
                    System.out.println("added: "+finalList);
                }
                
                if (finalList.isEmpty()){
                    
                if(firstList.get(i)==3){
                    System.out.println("smart move choice: "+ firstList.get(i)+"  " + firstList.get(i+1));
                    finalList.add(firstList.get(i+1));
                    System.out.println("added: "+finalList);
                 } 
                 
                 if (finalList.isEmpty()){
                 if(firstList.get(i)==4){
                    System.out.println("smart move choice: "+ firstList.get(i)+"  " + firstList.get(i+1));
                    finalList.add(firstList.get(i+1));
                    System.out.println("added: "+finalList);
                }  
                }
           
                 if (finalList.isEmpty()){
                 if(firstList.get(i)==6){
                    System.out.println("smart move choice: "+ firstList.get(i)+"  " + firstList.get(i+1));
                    finalList.add(firstList.get(i+1));
                    System.out.println("added: "+finalList);
                }  
                }
                 
                 if (finalList.isEmpty()){
                 if(firstList.get(i)==8){
                    System.out.println("smart move choice: "+ firstList.get(i)+"  " + firstList.get(i+1));
                    finalList.add(firstList.get(i+1));
                    System.out.println("added: "+finalList);
                }  
                }
                 
           }
            
        }
        
        
    }
        return finalList;
    }
    
    public ArrayList FinalReal(){
        
        ArrayList<Integer> firstList= this.validSmart();
        ArrayList<Integer> finalList=new ArrayList<Integer>();
        
        ArrayList<Integer> finalList2=new ArrayList<Integer>();
          ArrayList<Integer> finalList3=new ArrayList<Integer>();
           ArrayList<Integer> finalList4=new ArrayList<Integer>();
            ArrayList<Integer> finalList6=new ArrayList<Integer>();
             ArrayList<Integer> finalList8=new ArrayList<Integer>();
        
        for (int i = 0; i < firstList.size(); i++) {
            
            if(i%2==0){
                
                if(firstList.get(i)==2){
                    
                    finalList2.add(firstList.get(i+1));
                }
                
                if(firstList.get(i)==3){
                    
                    finalList3.add(firstList.get(i+1));
                }
                
                if(firstList.get(i)==4){
                    
                    finalList4.add(firstList.get(i+1));
                }
                
                if(firstList.get(i)==6){
                    
                    finalList6.add(firstList.get(i+1));
                }
                
                if(firstList.get(i)==8){
                    
                    finalList8.add(firstList.get(i+1));
                }
                
                
                
                
            }
        }
        
        if(finalList2.size()>0){
            return finalList2;
        }
        
        else if(finalList3.size()>0){
            return finalList3;
        }
        
         else if(finalList4.size()>0){
            return finalList4;
        }
        
         else if(finalList6.size()>0){
            return finalList6;
        }
        
         else if(finalList8.size()>0){
            return finalList8;
        }
        
        return firstList;
    }

public void moveDumb(){
    
   ArrayList<Integer> validList=this.validMoves();
   
   int rand = (int)Math.floor(Math.random() * validList.size());
   
   int choice = validList.get(rand);
    System.out.println("random = "+rand);
//int choice = 2;
   
   switch (choice){
       
       case 1: 
           
           this.setX(this.xPosition - 1);
           this.setY(this.yPosition - 2);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           String xposition = Integer.toString(this.xPosition);
           String yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
      
       case 2: 
           
           this.setX(this.xPosition - 2);
           this.setY(this.yPosition - 1);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
           
      case 3: 
           
           this.setX(this.xPosition - 2);
           this.setY(this.yPosition + 1);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
      
      case 4: 
           
           this.setX(this.xPosition - 1);
           this.setY(this.yPosition + 2);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
      
      case 5: 
           
           this.setX(this.xPosition + 1);
           this.setY(this.yPosition + 2);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);   
           break;
      
      case 6: 
           
           this.setX(this.xPosition + 2);
           this.setY(this.yPosition + 1);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
      
      case 7: 
           
           this.setX(this.xPosition + 2);
           this.setY(this.yPosition - 1);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
           
        case 8: 
           
           this.setX(this.xPosition + 1);
           this.setY(this.yPosition - 2);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
           
       
   }
}

public void moveSmart(){
    
   ArrayList<Integer> validList=this.FinalReal();
   
   int rand = (int)Math.floor(Math.random() * validList.size());
   
 int choice = validList.get(rand);
//int choice = 2;
System.out.println(rand);
   
   switch (choice){
       
       case 1: 
           
           this.setX(this.xPosition - 1);
           this.setY(this.yPosition - 2);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           String xposition = Integer.toString(this.xPosition);
           String yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
      
       case 2: 
           
           this.setX(this.xPosition - 2);
           this.setY(this.yPosition - 1);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
           
      case 3: 
           
           this.setX(this.xPosition - 2);
           this.setY(this.yPosition + 1);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
      
      case 4: 
           
           this.setX(this.xPosition - 1);
           this.setY(this.yPosition + 2);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
      
      case 5: 
           
           this.setX(this.xPosition + 1);
           this.setY(this.yPosition + 2);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);   
           break;
      
      case 6: 
           
           this.setX(this.xPosition + 2);
           this.setY(this.yPosition + 1);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
      
      case 7: 
           
           this.setX(this.xPosition + 2);
           this.setY(this.yPosition - 1);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
           
        case 8: 
           
           this.setX(this.xPosition + 1);
           this.setY(this.yPosition - 2);
           
           this.movesDone[this.xPosition][this.yPosition] = 1;
           xposition = Integer.toString(this.xPosition);
           yposition = Integer.toString(this.yPosition);
           this.listMoves.add(xposition+yposition);
           break;
           
            
   }
    
}

public void Create_Write_File(ArrayList list, String SD) throws FileNotFoundException{
    File file1 = new File("name");
    
        try {
            
//            PrintWriter out;
           
            if(SD.equals("Smart")){
            PrintWriter out = new PrintWriter("RooneChrHueristics.txt","UTF-8");
            }
            else;
            PrintWriter out = new PrintWriter("RooneChrNonIntelligent.txt","UTF-8");
            
            
            for (int i = 0; i < list.size(); i++) {
                out.println(list.get(i));
                
            }
            out.close();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Knight.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public static void main(String[] args) {
        
//        Array Board = new Array();
        int Board[][] = {{0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7},
                  {0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7}};
        
        int blah[][] = {{0,1},{0,2}};
        
//       if(x[0]==1){
//           System.out.println("test true");
//       }
//       else{
//           System.out.println("false");
//       }
//       
       
       
        Knight test = new Knight(5,5);
        Knight test2 = new Knight(0,0);
        
        System.out.println(test.canMove2());
        System.out.println(test2.canMove2());
        System.out.println(test.validMoves());
        
        ArrayList<String> listM;
        
        
        do{
//                try{
System.out.println("valid moves: "+test.validMoves());
            System.out.println("valid smart moves: "+test.validSmart());
//            System.out.println("finaltest: "+test.finalList222());
            System.out.println("final real test"+ test.FinalReal());
//            System.out.println(test.finalList());
//            System.out.println();
            System.out.println(test.xPosition + "  " + test.yPosition);
//            test.moveSmart();
            test.moveDumb();
//            System.out.println(test.xPosition + "  " + test.yPosition);
//            }catch(IndexOutOfBoundsException e){}
                
            listM= test.validMoves();
        
        }while (listM.size()>0);
       
//        
//         do{
//            test.moveSmart();
//            listM= test.validMoves();
//        }while (listM.size()>0);
        
        System.out.println(test.listMoves);
        System.out.println("how many turns: "+ test.listMoves.size());
        System.out.println(test.xPosition);
        System.out.println(test.xPosition+2);
        
        System.out.println(2%2);
        
        
//        ArrayList<Integer> validList=new ArrayList<Integer>();
//        validList.add(1);
//        System.out.println(validList);
        
        
//        for (int i = 0; i < test.movesDone.length; i++) {
////            System.out.println(test.movesDone[i]);
//            for (int j = 0; j < test.movesDone.length; j++) {
//                System.out.println(test.movesDone[i][j]);
//                if
//                        (test.movesDone[i][j]==1){
//                    System.out.println(i+j);
//                }
//                
//            }
//            
//        }
//        System.out.println("");
       
//        System.out.println(Arrays.toString(test.getPosition()));
//        System.out.println("pooooo");
    }

}
