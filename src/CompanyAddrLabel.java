/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mstanc1
 */
public class CompanyAddrLabel extends AddrLabel {
    
	private String attnName;
	private String title;
	
        /**
         * Constructor for the CompanyAddrLabel
         * @param attnName1
         * @param title1
         * @param companyName
         * @param street
         * @param city
         * @param state
         * @param zip 
         */
	public CompanyAddrLabel(String attnName1, String title1, String companyName, String street, String city, String state, String zip) {
		super(companyName, street, city, state, zip);
		attnName = attnName1;
		title = title1;
	}
	
        /**
         * Puts the information in a string
         * @return 
         */
	public String toString() {
		return "ATTN: " + attnName + "\n" + getName() + "\n" + getStreet() + "\n" + getCity() + ", " + getState() + " " + getZip();
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
