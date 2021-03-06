/*
 * Created by the DBAccessor generator.
 * Programmer: Lennart Martens
 * Date: 04/12/2007
 * Time: 09:10:25
 */
package com.compomics.ppr.db.accessors;

import java.sql.*;
import java.util.*;
import com.compomics.util.db.interfaces.Deleteable;
import com.compomics.util.db.interfaces.Persistable;
import com.compomics.util.db.interfaces.Retrievable;
import com.compomics.util.db.interfaces.Updateable;

/*
 * CVS information:
 *
 * $Revision: 1.4 $
 * $Date: 2007/07/06 09:41:53 $
 */

/**
 * This class is a generated accessor for the Peptide_modification table.
 *
 * @author DBAccessor generator class (Lennart Martens).
 */
public class Peptide_modificationTableAccessor implements Deleteable, Retrievable, Updateable, Persistable {

	/**
	 * This variable tracks changes to the object.
	 */
	protected boolean iUpdated = false;

	/**
	 * This variable can hold generated primary key columns.
	 */
	protected Object[] iKeys = null;

	/**
	 * This variable represents the contents for the 'peptide_modificationid' column.
	 */
	protected long iPeptide_modificationid = Long.MIN_VALUE;


	/**
	 * This variable represents the contents for the 'l_identificationid' column.
	 */
	protected long iL_identificationid = Long.MIN_VALUE;


	/**
	 * This variable represents the contents for the 'l_modificationid' column.
	 */
	protected long iL_modificationid = Long.MIN_VALUE;


	/**
	 * This variable represents the contents for the 'username' column.
	 */
	protected String iUsername = null;


	/**
	 * This variable represents the contents for the 'creationdate' column.
	 */
	protected java.sql.Timestamp iCreationdate = null;


	/**
	 * This variable represents the contents for the 'modificationdate' column.
	 */
	protected java.sql.Timestamp iModificationdate = null;


	/**
	 * This variable represents the key for the 'peptide_modificationid' column.
	 */
	public static final String PEPTIDE_MODIFICATIONID = "PEPTIDE_MODIFICATIONID";

	/**
	 * This variable represents the key for the 'l_identificationid' column.
	 */
	public static final String L_IDENTIFICATIONID = "L_IDENTIFICATIONID";

	/**
	 * This variable represents the key for the 'l_modificationid' column.
	 */
	public static final String L_MODIFICATIONID = "L_MODIFICATIONID";

	/**
	 * This variable represents the key for the 'username' column.
	 */
	public static final String USERNAME = "USERNAME";

	/**
	 * This variable represents the key for the 'creationdate' column.
	 */
	public static final String CREATIONDATE = "CREATIONDATE";

	/**
	 * This variable represents the key for the 'modificationdate' column.
	 */
	public static final String MODIFICATIONDATE = "MODIFICATIONDATE";




	/**
	 * Default constructor.
	 */
	public Peptide_modificationTableAccessor() {
	}

	/**
	 * This constructor allows the creation of the 'Peptide_modificationTableAccessor' object based on a set of values in the HashMap.
	 *
	 * @param	aParams	HashMap with the parameters to initialize this object with.
	 *		<i>Please use only constants defined on this class as keys in the HashMap!</i>
	 */
	public Peptide_modificationTableAccessor(HashMap aParams) {
		if(aParams.containsKey(PEPTIDE_MODIFICATIONID)) {
			this.iPeptide_modificationid = ((Long)aParams.get(PEPTIDE_MODIFICATIONID)).longValue();
		}
		if(aParams.containsKey(L_IDENTIFICATIONID)) {
			this.iL_identificationid = ((Long)aParams.get(L_IDENTIFICATIONID)).longValue();
		}
		if(aParams.containsKey(L_MODIFICATIONID)) {
			this.iL_modificationid = ((Long)aParams.get(L_MODIFICATIONID)).longValue();
		}
		if(aParams.containsKey(USERNAME)) {
			this.iUsername = (String)aParams.get(USERNAME);
		}
		if(aParams.containsKey(CREATIONDATE)) {
			this.iCreationdate = (java.sql.Timestamp)aParams.get(CREATIONDATE);
		}
		if(aParams.containsKey(MODIFICATIONDATE)) {
			this.iModificationdate = (java.sql.Timestamp)aParams.get(MODIFICATIONDATE);
		}
		this.iUpdated = true;
	}


	/**
	 * This method returns the value for the 'Peptide_modificationid' column
	 * 
	 * @return	long	with the value for the Peptide_modificationid column.
	 */
	public long getPeptide_modificationid() {
		return this.iPeptide_modificationid;
	}

	/**
	 * This method returns the value for the 'L_identificationid' column
	 * 
	 * @return	long	with the value for the L_identificationid column.
	 */
	public long getL_identificationid() {
		return this.iL_identificationid;
	}

	/**
	 * This method returns the value for the 'L_modificationid' column
	 * 
	 * @return	long	with the value for the L_modificationid column.
	 */
	public long getL_modificationid() {
		return this.iL_modificationid;
	}

	/**
	 * This method returns the value for the 'Username' column
	 * 
	 * @return	String	with the value for the Username column.
	 */
	public String getUsername() {
		return this.iUsername;
	}

	/**
	 * This method returns the value for the 'Creationdate' column
	 * 
	 * @return	java.sql.Timestamp	with the value for the Creationdate column.
	 */
	public java.sql.Timestamp getCreationdate() {
		return this.iCreationdate;
	}

	/**
	 * This method returns the value for the 'Modificationdate' column
	 * 
	 * @return	java.sql.Timestamp	with the value for the Modificationdate column.
	 */
	public java.sql.Timestamp getModificationdate() {
		return this.iModificationdate;
	}

	/**
	 * This method sets the value for the 'Peptide_modificationid' column
	 * 
	 * @param	aPeptide_modificationid	long with the value for the Peptide_modificationid column.
	 */
	public void setPeptide_modificationid(long aPeptide_modificationid) {
		this.iPeptide_modificationid = aPeptide_modificationid;
		this.iUpdated = true;
	}

	/**
	 * This method sets the value for the 'L_identificationid' column
	 * 
	 * @param	aL_identificationid	long with the value for the L_identificationid column.
	 */
	public void setL_identificationid(long aL_identificationid) {
		this.iL_identificationid = aL_identificationid;
		this.iUpdated = true;
	}

	/**
	 * This method sets the value for the 'L_modificationid' column
	 * 
	 * @param	aL_modificationid	long with the value for the L_modificationid column.
	 */
	public void setL_modificationid(long aL_modificationid) {
		this.iL_modificationid = aL_modificationid;
		this.iUpdated = true;
	}

	/**
	 * This method sets the value for the 'Username' column
	 * 
	 * @param	aUsername	String with the value for the Username column.
	 */
	public void setUsername(String aUsername) {
		this.iUsername = aUsername;
		this.iUpdated = true;
	}

	/**
	 * This method sets the value for the 'Creationdate' column
	 * 
	 * @param	aCreationdate	java.sql.Timestamp with the value for the Creationdate column.
	 */
	public void setCreationdate(java.sql.Timestamp aCreationdate) {
		this.iCreationdate = aCreationdate;
		this.iUpdated = true;
	}

	/**
	 * This method sets the value for the 'Modificationdate' column
	 * 
	 * @param	aModificationdate	java.sql.Timestamp with the value for the Modificationdate column.
	 */
	public void setModificationdate(java.sql.Timestamp aModificationdate) {
		this.iModificationdate = aModificationdate;
		this.iUpdated = true;
	}



	/**
	 * This method allows the caller to delete the data represented by this
	 * object in a persistent store.
	 *
	 * @param   aConn Connection to the persitent store.
	 */
	public int delete(Connection aConn) throws SQLException {
		PreparedStatement lStat = aConn.prepareStatement("DELETE FROM peptide_modification WHERE peptide_modificationid = ?");
		lStat.setLong(1, iPeptide_modificationid);
		int result = lStat.executeUpdate();
		lStat.close();
		return result;
	}


	/**
	 * This method allows the caller to read data for this
	 * object from a persistent store based on the specified keys.
	 *
	 * @param   aConn Connection to the persitent store.
	 */
	public void retrieve(Connection aConn, HashMap aKeys) throws SQLException {
		// First check to see whether all PK fields are present.
		if(!aKeys.containsKey(PEPTIDE_MODIFICATIONID)) {
			throw new IllegalArgumentException("Primary key field 'PEPTIDE_MODIFICATIONID' is missing in HashMap!");
		} else {
			iPeptide_modificationid = ((Long)aKeys.get(PEPTIDE_MODIFICATIONID)).longValue()
;		}
		// In getting here, we probably have all we need to continue. So let's...
		PreparedStatement lStat = aConn.prepareStatement("SELECT * FROM peptide_modification WHERE peptide_modificationid = ?");
		lStat.setLong(1, iPeptide_modificationid);
		ResultSet lRS = lStat.executeQuery();
		int hits = 0;
		while(lRS.next()) {
			hits++;
			iPeptide_modificationid = lRS.getLong("peptide_modificationid");
			iL_identificationid = lRS.getLong("l_identificationid");
			iL_modificationid = lRS.getLong("l_modificationid");
			iUsername = (String)lRS.getObject("username");
			iCreationdate = (java.sql.Timestamp)lRS.getObject("creationdate");
			iModificationdate = (java.sql.Timestamp)lRS.getObject("modificationdate");
		}
		lRS.close();
		lStat.close();
		if(hits>1) {
			throw new SQLException("More than one hit found for the specified primary keys in the 'peptide_modification' table! Object is initialized to last row returned.");
		} else if(hits == 0) {
			throw new SQLException("No hits found for the specified primary keys in the 'peptide_modification' table! Object is not initialized correctly!");
		}
	}


	/**
	 * This method allows the caller to update the data represented by this
	 * object in a persistent store.
	 *
	 * @param   aConn Connection to the persitent store.
	 */
	public int update(Connection aConn) throws SQLException {
		if(!this.iUpdated) {
			return 0;
		}
		PreparedStatement lStat = aConn.prepareStatement("UPDATE peptide_modification SET peptide_modificationid = ?, l_identificationid = ?, l_modificationid = ?, username = ?, creationdate = ?, modificationdate = CURRENT_TIMESTAMP WHERE peptide_modificationid = ?");
		lStat.setLong(1, iPeptide_modificationid);
		lStat.setLong(2, iL_identificationid);
		lStat.setLong(3, iL_modificationid);
		lStat.setObject(4, iUsername);
		lStat.setObject(5, iCreationdate);
		lStat.setLong(6, iPeptide_modificationid);
		int result = lStat.executeUpdate();
		lStat.close();
		this.iUpdated = false;
		return result;
	}


	/**
	 * This method allows the caller to insert the data represented by this
	 * object in a persistent store.
	 *
	 * @param   aConn Connection to the persitent store.
	 */
	public int persist(Connection aConn) throws SQLException {
		PreparedStatement lStat = aConn.prepareStatement("INSERT INTO peptide_modification (peptide_modificationid, l_identificationid, l_modificationid, username, creationdate, modificationdate) values(?, ?, ?, CURRENT_USER, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)");
		if(iPeptide_modificationid == Long.MIN_VALUE) {
			lStat.setNull(1, 4);
		} else {
			lStat.setLong(1, iPeptide_modificationid);
		}
		if(iL_identificationid == Long.MIN_VALUE) {
			lStat.setNull(2, 4);
		} else {
			lStat.setLong(2, iL_identificationid);
		}
		if(iL_modificationid == Long.MIN_VALUE) {
			lStat.setNull(3, 4);
		} else {
			lStat.setLong(3, iL_modificationid);
		}
		int result = lStat.executeUpdate();

		// Retrieving the generated keys (if any).
		ResultSet lrsKeys = lStat.getGeneratedKeys();
		ResultSetMetaData lrsmKeys = lrsKeys.getMetaData();
		int colCount = lrsmKeys.getColumnCount();
		iKeys = new Object[colCount];
		while(lrsKeys.next()) {
			for(int i=0;i<iKeys.length;i++) {
				iKeys[i] = lrsKeys.getObject(i+1);
			}
		}
		lrsKeys.close();
		lStat.close();
		this.iUpdated = false;
		return result;
	}

	/**
	 * This method will return the automatically generated key for the insert if 
	 * one was triggered, or 'null' otherwise.
	 *
	 * @return	Object[]	with the generated keys.
	 */
	public Object[] getGeneratedKeys() {
		return this.iKeys;
	}

}