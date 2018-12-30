/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mstanc1
 */
public class FriendAddrLabel extends AddrLabel
{
    String name;
    String street;
    String city;
    String state;
    String zip;
    
    /**
     * This is the constructor for the FriendAddrLabel class
     * @param name1
     * @param street1
     * @param city1
     * @param state1
     * @param zip1 
     */
    public FriendAddrLabel(String name1, String street1, String city1, String state1, String zip1)
    {
    	super(name1, street1, city1, state1, zip1);
    }
    
    /**
     * Sets name
     * @param name1 
     */
    public void setName(String name1)
    {
        name = name1;
    }
    
    /**
     * Sets street address
     * @param street1 
     */
    public void setStreet(String street1)
    {
        street = street1;
    }
    
    /**
     * Sets city
     * @param city1 
     */
    public void setCity(String city1)
    {
        city = city1;
    }
    
    /**
     * Sets zip code
     * @param zipCode1 
     */
    public void setZipCode (String zipCode1)
    {
        zip = zipCode1;
    }
    
    /**
     * Makes a string from the all the elements of the label
     * @return returns the string of the label
     */
    public String toString() {
    	return getName() + "\n" + getStreet() + "\n" + getCity() + ", " + getState() + " " + getZip();
    }

    /**
     * Overrides the getAttnName() from the AddrLabelClass/AddrLabelnterface
     * @return null
    */
    @Override
    public String getAttnName() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
    * Overrides the getTitle() from the AddrLabelClass/AddrLabelnterface
    * @return null
    */
    @Override
    public String getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
    * Overrides the getNameSuffix() from the AddrLabelClass/AddrLabelnterface
    * @return null
    */
    @Override
    public String getNameSuffix() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
    * Overrides the getProfessionalSuffix() from the AddrLabelClass/AddrLabelnterface
    * @return null
    */
    @Override
    public String getProfessionalSuffix() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
    * Overrides the getSuiteNum() from the AddrLabelClass/AddrLabelnterface
    * @return null
    */
    @Override
    public String getSuiteNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
    * Overrides the getZipCode() from the AddrLabelClass/AddrLabelnterface
    * @return null
     */
    @Override
    public String getZipCode() {
	// TODO Auto-generated method stub
	return null;
    }
   
}