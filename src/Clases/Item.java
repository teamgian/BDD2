/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Felipe
 */

// Esta clase es útil para los combo box

public class Item {
    
    private int id;
    private String idString, name;
    private String firstID, secondID;
    
    public Item(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    public Item(String id, String name)
    {
        this.idString = id;
        this.name = name;
    }
    
    // constructor útil para postulación o adjudicación (que requieren 2 claves)
    public Item(String firstID, String secondID, String name)
    {
        this.firstID = firstID;
        this.secondID = secondID;
        this.name = name;
    }
    
    public int getId(){ return this.id; }
    public String getIdString() { return this.idString; }
    public String getName(){ return this.name;}
    public String getFirstID(){ return this.firstID; }
    public String getSecondID() { return this.secondID; } 
    
    @Override
    public String toString()
    {
        return this.name;
    }
    
    
}
