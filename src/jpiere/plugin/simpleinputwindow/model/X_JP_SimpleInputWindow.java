/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package jpiere.plugin.simpleinputwindow.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for JP_SimpleInputWindow
 *  @author iDempiere (generated) 
 *  @version Release 2.1 - $Id$ */
public class X_JP_SimpleInputWindow extends PO implements I_JP_SimpleInputWindow, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20151021L;

    /** Standard Constructor */
    public X_JP_SimpleInputWindow (Properties ctx, int JP_SimpleInputWindow_ID, String trxName)
    {
      super (ctx, JP_SimpleInputWindow_ID, trxName);
      /** if (JP_SimpleInputWindow_ID == 0)
        {
			setAD_Tab_ID (0);
			setAD_Window_ID (0);
			setJP_PageSize (0);
// 20
			setJP_SimpleInputWindow_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_JP_SimpleInputWindow (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_JP_SimpleInputWindow[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_Tab getAD_Tab() throws RuntimeException
    {
		return (org.compiere.model.I_AD_Tab)MTable.get(getCtx(), org.compiere.model.I_AD_Tab.Table_Name)
			.getPO(getAD_Tab_ID(), get_TrxName());	}

	/** Set Tab.
		@param AD_Tab_ID 
		Tab within a Window
	  */
	public void setAD_Tab_ID (int AD_Tab_ID)
	{
		if (AD_Tab_ID < 1) 
			set_Value (COLUMNNAME_AD_Tab_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Tab_ID, Integer.valueOf(AD_Tab_ID));
	}

	/** Get Tab.
		@return Tab within a Window
	  */
	public int getAD_Tab_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tab_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_Window getAD_Window() throws RuntimeException
    {
		return (org.compiere.model.I_AD_Window)MTable.get(getCtx(), org.compiere.model.I_AD_Window.Table_Name)
			.getPO(getAD_Window_ID(), get_TrxName());	}

	/** Set Window.
		@param AD_Window_ID 
		Data entry or display window
	  */
	public void setAD_Window_ID (int AD_Window_ID)
	{
		if (AD_Window_ID < 1) 
			set_Value (COLUMNNAME_AD_Window_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
	}

	/** Get Window.
		@return Data entry or display window
	  */
	public int getAD_Window_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set SQL JOIN.
		@param JP_JoinClause SQL JOIN	  */
	public void setJP_JoinClause (String JP_JoinClause)
	{
		set_Value (COLUMNNAME_JP_JoinClause, JP_JoinClause);
	}

	/** Get SQL JOIN.
		@return SQL JOIN	  */
	public String getJP_JoinClause () 
	{
		return (String)get_Value(COLUMNNAME_JP_JoinClause);
	}

	/** Set Page Size.
		@param JP_PageSize Page Size	  */
	public void setJP_PageSize (int JP_PageSize)
	{
		set_Value (COLUMNNAME_JP_PageSize, Integer.valueOf(JP_PageSize));
	}

	/** Get Page Size.
		@return Page Size	  */
	public int getJP_PageSize () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_JP_PageSize);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Simple Input Window.
		@param JP_SimpleInputWindow_ID Simple Input Window	  */
	public void setJP_SimpleInputWindow_ID (int JP_SimpleInputWindow_ID)
	{
		if (JP_SimpleInputWindow_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_JP_SimpleInputWindow_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_JP_SimpleInputWindow_ID, Integer.valueOf(JP_SimpleInputWindow_ID));
	}

	/** Get Simple Input Window.
		@return Simple Input Window	  */
	public int getJP_SimpleInputWindow_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_JP_SimpleInputWindow_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set JP_SimpleInputWindow_UU.
		@param JP_SimpleInputWindow_UU JP_SimpleInputWindow_UU	  */
	public void setJP_SimpleInputWindow_UU (String JP_SimpleInputWindow_UU)
	{
		set_ValueNoCheck (COLUMNNAME_JP_SimpleInputWindow_UU, JP_SimpleInputWindow_UU);
	}

	/** Get JP_SimpleInputWindow_UU.
		@return JP_SimpleInputWindow_UU	  */
	public String getJP_SimpleInputWindow_UU () 
	{
		return (String)get_Value(COLUMNNAME_JP_SimpleInputWindow_UU);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set Sql WHERE.
		@param WhereClause 
		Fully qualified SQL WHERE clause
	  */
	public void setWhereClause (String WhereClause)
	{
		set_Value (COLUMNNAME_WhereClause, WhereClause);
	}

	/** Get Sql WHERE.
		@return Fully qualified SQL WHERE clause
	  */
	public String getWhereClause () 
	{
		return (String)get_Value(COLUMNNAME_WhereClause);
	}
}