/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrago
 */
public class TrainCarriage {
    private String category;
    private TrainCarriage next;
    
    public TrainCarriage(String s){
        next = null;
        category = s;
    }
    
    public String getCategory(){return category;}
    public TrainCarriage getNext(){return next;}
    public void setNext(TrainCarriage t){next=t;}
    public void setCategory(String s){category=s;}
}

