package org.tmforum.mtnm.equipment;

/**
 *	Generated from IDL interface "EquipmentInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class EquipmentInventoryMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.tmforum.mtnm.equipment.EquipmentInventoryMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setAlarmReportingOff", new java.lang.Integer(0));
		m_opsHash.put ( "getContainedEquipment", new java.lang.Integer(1));
		m_opsHash.put ( "getAllEquipment", new java.lang.Integer(2));
		m_opsHash.put ( "unprovisionEquipment", new java.lang.Integer(3));
		m_opsHash.put ( "setAlarmReportingOn", new java.lang.Integer(4));
		m_opsHash.put ( "getSupportedEquipment", new java.lang.Integer(5));
		m_opsHash.put ( "getSupportedEquipmentNames", new java.lang.Integer(6));
		m_opsHash.put ( "getAllEquipmentNames", new java.lang.Integer(7));
		m_opsHash.put ( "getAllSupportedPTPNames", new java.lang.Integer(8));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(9));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(10));
		m_opsHash.put ( "setOwner", new java.lang.Integer(11));
		m_opsHash.put ( "getSupportingEquipmentNames", new java.lang.Integer(12));
		m_opsHash.put ( "getSupportingEquipment", new java.lang.Integer(13));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(14));
		m_opsHash.put ( "getAllSupportingEquipment", new java.lang.Integer(15));
		m_opsHash.put ( "provisionEquipment", new java.lang.Integer(16));
		m_opsHash.put ( "getEquipment", new java.lang.Integer(17));
		m_opsHash.put ( "getAllSupportedPTPs", new java.lang.Integer(18));
		m_opsHash.put ( "getAllSupportingEquipmentNames", new java.lang.Integer(19));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(20));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/equipment/EquipmentInventoryMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.tmforum.mtnm.equipment.EquipmentInventoryMgr_I _this()
	{
		return org.tmforum.mtnm.equipment.EquipmentInventoryMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.equipment.EquipmentInventoryMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.equipment.EquipmentInventoryMgr_IHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // setAlarmReportingOff
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setAlarmReportingOff(_arg0);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getContainedEquipment
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder _arg1= new org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder();
				_out = handler.createReply();
				getContainedEquipment(_arg0,_arg1);
				org.tmforum.mtnm.equipment.EquipmentOrHolderList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getAllEquipment
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder _arg2= new org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder();
				org.tmforum.mtnm.equipment.EquipmentOrHolderIterator_IHolder _arg3= new org.tmforum.mtnm.equipment.EquipmentOrHolderIterator_IHolder();
				_out = handler.createReply();
				getAllEquipment(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.equipment.EquipmentOrHolderList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.equipment.EquipmentOrHolderIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // unprovisionEquipment
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				unprovisionEquipment(_arg0);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setAlarmReportingOn
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setAlarmReportingOn(_arg0);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getSupportedEquipment
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder _arg1= new org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder();
				_out = handler.createReply();
				getSupportedEquipment(_arg0,_arg1);
				org.tmforum.mtnm.equipment.EquipmentOrHolderList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getSupportedEquipmentNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getSupportedEquipmentNames(_arg0,_arg1);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllEquipmentNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllEquipmentNames(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getAllSupportedPTPNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSupportedPTPNames(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setAdditionalInfo
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getCapabilities
			{
			try
			{
				org.tmforum.mtnm.common.CapabilityList_THolder _arg0= new org.tmforum.mtnm.common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				org.tmforum.mtnm.common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // setOwner
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setOwner(_arg0,_arg1);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getSupportingEquipmentNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getSupportingEquipmentNames(_arg0,_arg1);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getSupportingEquipment
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder _arg1= new org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder();
				_out = handler.createReply();
				getSupportingEquipment(_arg0,_arg1);
				org.tmforum.mtnm.equipment.EquipmentOrHolderList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // setNativeEMSName
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getAllSupportingEquipment
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder _arg1= new org.tmforum.mtnm.equipment.EquipmentOrHolderList_THolder();
				_out = handler.createReply();
				getAllSupportingEquipment(_arg0,_arg1);
				org.tmforum.mtnm.equipment.EquipmentOrHolderList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // provisionEquipment
			{
			try
			{
				org.tmforum.mtnm.equipment.EQTCreateData_T _arg0=org.tmforum.mtnm.equipment.EQTCreateData_THelper.read(_input);
				org.tmforum.mtnm.equipment.Equipment_THolder _arg1= new org.tmforum.mtnm.equipment.Equipment_THolder();
				_out = handler.createReply();
				provisionEquipment(_arg0,_arg1);
				org.tmforum.mtnm.equipment.Equipment_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getEquipment
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.equipment.EquipmentOrHolder_THolder _arg1= new org.tmforum.mtnm.equipment.EquipmentOrHolder_THolder();
				_out = handler.createReply();
				getEquipment(_arg0,_arg1);
				org.tmforum.mtnm.equipment.EquipmentOrHolder_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getAllSupportedPTPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder _arg2= new org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder();
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder _arg3= new org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllSupportedPTPs(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getAllSupportingEquipmentNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllSupportingEquipmentNames(_arg0,_arg1);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // setUserLabel
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
