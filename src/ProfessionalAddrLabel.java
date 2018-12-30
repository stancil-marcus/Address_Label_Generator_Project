/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mstanc1
 */
public class ProfessionalAddrLabel extends AddrLabel{
	
    private String professionalSuffix;
    private String suite;
    
    /**
     * Constructor for Professional AddrLabel
     * @param name1
     * @param professionalSuffix1
     * @param street1
     * @param suite1
     * @param state1
     * @param city1
     * @param zip1 
     */
    public ProfessionalAddrLabel(String name1, String professionalSuffix1, String street1, String suite1, String state1, String city1, String zip1)
    {
    	super(name1, street1, city1, state1, zip1);
    	professionalSuffix = professionalSuffix1;
    	suite = suite1;
    }
    
    /**
     * Converts the info into a string
     * @return 
     */
    public String toString() {
    	return getName() + ", " + professionalSuffix + "\n" + getStreet() + 
                        ", " + "Suite: " + suite + "\n" +
    			getCity() + ", " + getState() + " " + getZip();
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
