package org.tmforum.mtnm.performance;

/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class PerformanceManagementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.tmforum.mtnm.performance.PerformanceManagementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "enablePMData", new java.lang.Integer(0));
		m_opsHash.put ( "setTCATPParameter", new java.lang.Integer(1));
		m_opsHash.put ( "setTCAParameterProfile", new java.lang.Integer(2));
		m_opsHash.put ( "setTCAParameterProfilePointer", new java.lang.Integer(3));
		m_opsHash.put ( "getMEPMcapabilities", new java.lang.Integer(4));
		m_opsHash.put ( "getTCATPParameter", new java.lang.Integer(5));
		m_opsHash.put ( "getProfileAssociatedTPs", new java.lang.Integer(6));
		m_opsHash.put ( "getHoldingTime", new java.lang.Integer(7));
		m_opsHash.put ( "getAllTCAParameterProfileNames", new java.lang.Integer(8));
		m_opsHash.put ( "enableTCA", new java.lang.Integer(9));
		m_opsHash.put ( "getAllCurrentPMData", new java.lang.Integer(10));
		m_opsHash.put ( "clearPMData", new java.lang.Integer(11));
		m_opsHash.put ( "getAllPMPNames", new java.lang.Integer(12));
		m_opsHash.put ( "disablePMData", new java.lang.Integer(13));
		m_opsHash.put ( "getHistoryPMData", new java.lang.Integer(14));
		m_opsHash.put ( "disableTCA", new java.lang.Integer(15));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(16));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(17));
		m_opsHash.put ( "setOwner", new java.lang.Integer(18));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(19));
		m_opsHash.put ( "getTPHistoryPMData", new java.lang.Integer(20));
		m_opsHash.put ( "getTCAParameterProfile", new java.lang.Integer(21));
		m_opsHash.put ( "getAllPMPs", new java.lang.Integer(22));
		m_opsHash.put ( "createTCAParameterProfile", new java.lang.Integer(23));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(24));
		m_opsHash.put ( "getAllTCAParameterProfiles", new java.lang.Integer(25));
		m_opsHash.put ( "deleteTCAParameterProfile", new java.lang.Integer(26));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/performance/PerformanceManagementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.tmforum.mtnm.performance.PerformanceManagementMgr_I _this()
	{
		return org.tmforum.mtnm.performance.PerformanceManagementMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.performance.PerformanceManagementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // enablePMData
			{
			try
			{
				org.tmforum.mtnm.performance.PMTPSelect_T[] _arg0=org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_input);
				org.tmforum.mtnm.performance.PMTPSelectList_THolder _arg1= new org.tmforum.mtnm.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				enablePMData(_arg0,_arg1);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // setTCATPParameter
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.performance.TCAParameters_THolder _arg1= new org.tmforum.mtnm.performance.TCAParameters_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setTCATPParameter(_arg0,_arg1);
				org.tmforum.mtnm.performance.TCAParameters_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setTCAParameterProfile
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.performance.TCAParameter_T[] _arg1=org.tmforum.mtnm.performance.TCAParameterList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.performance.TCAParameterProfile_THolder _arg3= new org.tmforum.mtnm.performance.TCAParameterProfile_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg4= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg5= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				setTCAParameterProfile(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.performance.TCAParameterProfile_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setTCAParameterProfilePointer
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg1=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg2=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setTCAParameterProfilePointer(_arg0,_arg1,_arg2);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getMEPMcapabilities
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				org.tmforum.mtnm.performance.PMParameterList_THolder _arg2= new org.tmforum.mtnm.performance.PMParameterList_THolder();
				_out = handler.createReply();
				getMEPMcapabilities(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.performance.PMParameterList_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getTCATPParameter
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				java.lang.String _arg2=_input.read_string();
				org.tmforum.mtnm.performance.TCAParameters_THolder _arg3= new org.tmforum.mtnm.performance.TCAParameters_THolder();
				_out = handler.createReply();
				getTCATPParameter(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.performance.TCAParameters_THelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getProfileAssociatedTPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getProfileAssociatedTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 7: // getHoldingTime
			{
			try
			{
				org.tmforum.mtnm.performance.HoldingTime_THolder _arg0= new org.tmforum.mtnm.performance.HoldingTime_THolder();
				_out = handler.createReply();
				getHoldingTime(_arg0);
				org.tmforum.mtnm.performance.HoldingTime_THelper.write(_out,_arg0.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getAllTCAParameterProfileNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTCAParameterProfileNames(_arg0,_arg1,_arg2,_arg3);
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
			case 9: // enableTCA
			{
			try
			{
				org.tmforum.mtnm.performance.PMTPSelect_T[] _arg0=org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_input);
				org.tmforum.mtnm.performance.PMTPSelectList_THolder _arg1= new org.tmforum.mtnm.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				enableTCA(_arg0,_arg1);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getAllCurrentPMData
			{
			try
			{
				org.tmforum.mtnm.performance.PMTPSelect_T[] _arg0=org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=org.tmforum.mtnm.performance.PMParameterNameList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.performance.PMDataList_THolder _arg3= new org.tmforum.mtnm.performance.PMDataList_THolder();
				org.tmforum.mtnm.performance.PMDataIterator_IHolder _arg4= new org.tmforum.mtnm.performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getAllCurrentPMData(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.performance.PMDataList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.performance.PMDataIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // clearPMData
			{
			try
			{
				org.tmforum.mtnm.performance.PMTPSelect_T[] _arg0=org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_input);
				org.tmforum.mtnm.performance.PMTPSelectList_THolder _arg1= new org.tmforum.mtnm.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				clearPMData(_arg0,_arg1);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllPMPNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPMPNames(_arg0,_arg1,_arg2,_arg3);
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
			case 13: // disablePMData
			{
			try
			{
				org.tmforum.mtnm.performance.PMTPSelect_T[] _arg0=org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_input);
				org.tmforum.mtnm.performance.PMTPSelectList_THolder _arg1= new org.tmforum.mtnm.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				disablePMData(_arg0,_arg1);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getHistoryPMData
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.tmforum.mtnm.performance.PMTPSelect_T[] _arg3=org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg4=org.tmforum.mtnm.performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg5=_input.read_string();
				java.lang.String _arg6=_input.read_string();
				boolean _arg7=_input.read_boolean();
				_out = handler.createReply();
				getHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // disableTCA
			{
			try
			{
				org.tmforum.mtnm.performance.PMTPSelect_T[] _arg0=org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_input);
				org.tmforum.mtnm.performance.PMTPSelectList_THolder _arg1= new org.tmforum.mtnm.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				disableTCA(_arg0,_arg1);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // setAdditionalInfo
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
			case 17: // getCapabilities
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
			case 18: // setOwner
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
			case 19: // setNativeEMSName
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
			case 20: // getTPHistoryPMData
			{
			try
			{
				org.tmforum.mtnm.performance.PMTPSelect_T[] _arg0=org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=org.tmforum.mtnm.performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				int _arg4=_input.read_ulong();
				org.tmforum.mtnm.performance.PMDataList_THolder _arg5= new org.tmforum.mtnm.performance.PMDataList_THolder();
				org.tmforum.mtnm.performance.PMDataIterator_IHolder _arg6= new org.tmforum.mtnm.performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getTPHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				org.tmforum.mtnm.performance.PMDataList_THelper.write(_out,_arg5.value);
				org.tmforum.mtnm.performance.PMDataIterator_IHelper.write(_out,_arg6.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getTCAParameterProfile
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.performance.TCAParameterProfile_THolder _arg1= new org.tmforum.mtnm.performance.TCAParameterProfile_THolder();
				_out = handler.createReply();
				getTCAParameterProfile(_arg0,_arg1);
				org.tmforum.mtnm.performance.TCAParameterProfile_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllPMPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.performance.PMPList_THolder _arg2= new org.tmforum.mtnm.performance.PMPList_THolder();
				org.tmforum.mtnm.performance.PMPIterator_IHolder _arg3= new org.tmforum.mtnm.performance.PMPIterator_IHolder();
				_out = handler.createReply();
				getAllPMPs(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.performance.PMPList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.performance.PMPIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // createTCAParameterProfile
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				java.lang.String _arg2=_input.read_string();
				boolean _arg3=_input.read_boolean();
				java.lang.String _arg4=_input.read_string();
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg5=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.performance.TCAParameter_T[] _arg6=org.tmforum.mtnm.performance.TCAParameterList_THelper.read(_input);
				org.tmforum.mtnm.performance.TCAParameterProfile_THolder _arg7= new org.tmforum.mtnm.performance.TCAParameterProfile_THolder();
				_out = handler.createReply();
				createTCAParameterProfile(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				org.tmforum.mtnm.performance.TCAParameterProfile_THelper.write(_out,_arg7.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // setUserLabel
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
			case 25: // getAllTCAParameterProfiles
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.performance.TCAParameterProfileList_THolder _arg2= new org.tmforum.mtnm.performance.TCAParameterProfileList_THolder();
				org.tmforum.mtnm.performance.TCAParameterProfileIterator_IHolder _arg3= new org.tmforum.mtnm.performance.TCAParameterProfileIterator_IHolder();
				_out = handler.createReply();
				getAllTCAParameterProfiles(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.performance.TCAParameterProfileList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.performance.TCAParameterProfileIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // deleteTCAParameterProfile
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteTCAParameterProfile(_arg0);
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
