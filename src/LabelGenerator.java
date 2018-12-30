/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mstanc1
 */
public class LabelGenerator {
    private AddrLabelInterface [] addresses;
    private String [] strings;
    
    /**
     * This is the constructor for the class. Automatically turns the incoming data to strings so that the user can print them.
     * @param addresses1 the labels
     */
    public LabelGenerator(AddrLabelInterface[] addresses1)
    {
    	addresses = addresses1;
    	strings = new String [addresses.length];
    	getAddrLines();
    }
    
    
    /**
     * Default constructor
     */
    public LabelGenerator()
    {
        
    }
    
    /**
     * Converts to data to strings so the user can print the data
     * @return the labels in string form
     */
    public String[] getAddrLines()
    {
    	for (int i = 0; i < addresses.length; i++)
    	{
    		strings[i] = addresses[i].toString();
    	}
    	return strings;
    }
    
    /**
     * This method prints the labels.
     */
    public void printLabels() {
    	for (int k = 0; k < strings.length; k++)
    	{
    		System.out.println(strings[k]);
                System.out.println(" ");
    	}
    }
}


