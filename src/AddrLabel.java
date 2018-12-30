/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mstanc1
 */
public abstract class AddrLabel implements AddrLabelInterface {

    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    
    public AddrLabel(String name1, String street1, String city1, String state1, String zip1)
    {
    	name = name1;
    	street = street1;
    	city = city1;
    	state = state1;
    	zip = zip1;
    }
	
	public String getName()
    {
    	return name;
    }
    
    public String getStreet() {
    	return street;
    }
    
    public String getCity()
    {
    	return city;
    }
    
    public String getState()
    {
    	return state;
    }
    
    public String getZip()
    {
    	return zip;
    }
    
    public String getAttnName(String name)
    {
        return "";
    }
    
    public String getTitle(String title)
    {
        return "";
    }
    
    public String getNameSuffix(String suffix)
    {
        return "";
    }
    
    public String getProfessionalSuffix(String suffix)
    {
        return "";
    }
    
    public String getSuiteNum(String num)
    {
        return "";
    }

        /**
         * Overrides getAttnName() method from AddrLabelInterface
         * @return null
         */
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
