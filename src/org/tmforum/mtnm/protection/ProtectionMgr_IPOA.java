package org.tmforum.mtnm.protection;

/**
 *	Generated from IDL interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class ProtectionMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.tmforum.mtnm.protection.ProtectionMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(0));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(1));
		m_opsHash.put ( "retrieveSwitchData", new java.lang.Integer(2));
		m_opsHash.put ( "getAllProtectedTPNames", new java.lang.Integer(3));
		m_opsHash.put ( "retrieveESwitchData", new java.lang.Integer(4));
		m_opsHash.put ( "getEProtectionGroup", new java.lang.Integer(5));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(6));
		m_opsHash.put ( "performProtectionCommand", new java.lang.Integer(7));
		m_opsHash.put ( "setOwner", new java.lang.Integer(8));
		m_opsHash.put ( "getAllProtectionGroups", new java.lang.Integer(9));
		m_opsHash.put ( "getAllPreemptibleTPNames", new java.lang.Integer(10));
		m_opsHash.put ( "getAllNUTTPNames", new java.lang.Integer(11));
		m_opsHash.put ( "getProtectionGroup", new java.lang.Integer(12));
		m_opsHash.put ( "getAllEProtectionGroups", new java.lang.Integer(13));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(14));
		m_opsHash.put ( "getContainingPGNames", new java.lang.Integer(15));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/protection/ProtectionMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.tmforum.mtnm.protection.ProtectionMgr_I _this()
	{
		return org.tmforum.mtnm.protection.ProtectionMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.protection.ProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.protection.ProtectionMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // setNativeEMSName
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
			case 1: // setUserLabel
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
			case 2: // retrieveSwitchData
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.protection.SwitchDataList_THolder _arg1= new org.tmforum.mtnm.protection.SwitchDataList_THolder();
				_out = handler.createReply();
				retrieveSwitchData(_arg0,_arg1);
				org.tmforum.mtnm.protection.SwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getAllProtectedTPNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllProtectedTPNames(_arg0,_arg1,_arg2,_arg3);
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
			case 4: // retrieveESwitchData
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.protection.ESwitchDataList_THolder _arg1= new org.tmforum.mtnm.protection.ESwitchDataList_THolder();
				_out = handler.createReply();
				retrieveESwitchData(_arg0,_arg1);
				org.tmforum.mtnm.protection.ESwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getEProtectionGroup
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.protection.EProtectionGroup_THolder _arg1= new org.tmforum.mtnm.protection.EProtectionGroup_THolder();
				_out = handler.createReply();
				getEProtectionGroup(_arg0,_arg1);
				org.tmforum.mtnm.protection.EProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getCapabilities
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
			case 7: // performProtectionCommand
			{
			try
			{
				org.tmforum.mtnm.protection.ProtectionCommand_T _arg0=org.tmforum.mtnm.protection.ProtectionCommand_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg1=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg2=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg3=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.protection.SwitchData_THolder _arg4= new org.tmforum.mtnm.protection.SwitchData_THolder();
				_out = handler.createReply();
				performProtectionCommand(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.protection.SwitchData_THelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setOwner
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
			case 9: // getAllProtectionGroups
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.protection.ProtectionGroupList_THolder _arg2= new org.tmforum.mtnm.protection.ProtectionGroupList_THolder();
				org.tmforum.mtnm.protection.ProtectionGroupIterator_IHolder _arg3= new org.tmforum.mtnm.protection.ProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getAllProtectionGroups(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.protection.ProtectionGroupList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.protection.ProtectionGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getAllPreemptibleTPNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPreemptibleTPNames(_arg0,_arg1,_arg2,_arg3);
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
			case 11: // getAllNUTTPNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllNUTTPNames(_arg0,_arg1,_arg2,_arg3);
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
			case 12: // getProtectionGroup
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.protection.ProtectionGroup_THolder _arg1= new org.tmforum.mtnm.protection.ProtectionGroup_THolder();
				_out = handler.createReply();
				getProtectionGroup(_arg0,_arg1);
				org.tmforum.mtnm.protection.ProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getAllEProtectionGroups
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.protection.EProtectionGroupList_THolder _arg2= new org.tmforum.mtnm.protection.EProtectionGroupList_THolder();
				org.tmforum.mtnm.protection.EProtectionGroupIterator_IHolder _arg3= new org.tmforum.mtnm.protection.EProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getAllEProtectionGroups(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.protection.EProtectionGroupList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.protection.EProtectionGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // setAdditionalInfo
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
			case 15: // getContainingPGNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingPGNames(_arg0,_arg1);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
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
