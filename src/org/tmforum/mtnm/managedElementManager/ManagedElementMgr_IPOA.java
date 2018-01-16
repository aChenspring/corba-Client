package org.tmforum.mtnm.managedElementManager;

/**
 *	Generated from IDL interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class ManagedElementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.tmforum.mtnm.managedElementManager.ManagedElementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getAllCrossConnections", new java.lang.Integer(0));
		m_opsHash.put ( "getAllActiveAlarms", new java.lang.Integer(1));
		m_opsHash.put ( "getAllPTPNames", new java.lang.Integer(2));
		m_opsHash.put ( "getContainedInUseTPNames", new java.lang.Integer(3));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(4));
		m_opsHash.put ( "getAllFixedCrossConnections", new java.lang.Integer(5));
		m_opsHash.put ( "getGTP", new java.lang.Integer(6));
		m_opsHash.put ( "getAllFTPNames", new java.lang.Integer(7));
		m_opsHash.put ( "deleteGTP", new java.lang.Integer(8));
		m_opsHash.put ( "setGtpAlarmReportingOff", new java.lang.Integer(9));
		m_opsHash.put ( "getContainedCurrentTPNames", new java.lang.Integer(10));
		m_opsHash.put ( "getContainingSubnetworkNames", new java.lang.Integer(11));
		m_opsHash.put ( "setOwner", new java.lang.Integer(12));
		m_opsHash.put ( "createGTP", new java.lang.Integer(13));
		m_opsHash.put ( "getAllManagedElements", new java.lang.Integer(14));
		m_opsHash.put ( "getTP", new java.lang.Integer(15));
		m_opsHash.put ( "getContainedPotentialTPNames", new java.lang.Integer(16));
		m_opsHash.put ( "getPotentialFixedCCs", new java.lang.Integer(17));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(18));
		m_opsHash.put ( "getContainedCurrentTPs", new java.lang.Integer(19));
		m_opsHash.put ( "getAllPTPsWithoutFTPs", new java.lang.Integer(20));
		m_opsHash.put ( "getAllPTPs", new java.lang.Integer(21));
		m_opsHash.put ( "getContainingTPs", new java.lang.Integer(22));
		m_opsHash.put ( "getAllUnacknowledgedActiveAlarms", new java.lang.Integer(23));
		m_opsHash.put ( "setGtpAlarmReportingOn", new java.lang.Integer(24));
		m_opsHash.put ( "setTPData", new java.lang.Integer(25));
		m_opsHash.put ( "getContainingGTP", new java.lang.Integer(26));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(27));
		m_opsHash.put ( "getManagedElement", new java.lang.Integer(28));
		m_opsHash.put ( "getAllFTPs", new java.lang.Integer(29));
		m_opsHash.put ( "verifyTMDAssignment", new java.lang.Integer(30));
		m_opsHash.put ( "getAllPTPNamesWithoutFTPs", new java.lang.Integer(31));
		m_opsHash.put ( "getAllManagedElementNames", new java.lang.Integer(32));
		m_opsHash.put ( "getAllGTPs", new java.lang.Integer(33));
		m_opsHash.put ( "getContainedPotentialTPs", new java.lang.Integer(34));
		m_opsHash.put ( "getContainedInUseTPs", new java.lang.Integer(35));
		m_opsHash.put ( "modifyGTP", new java.lang.Integer(36));
		m_opsHash.put ( "getContainingTPNames", new java.lang.Integer(37));
		m_opsHash.put ( "getAllGTPNames", new java.lang.Integer(38));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(39));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.tmforum.mtnm.managedElementManager.ManagedElementMgr_I _this()
	{
		return org.tmforum.mtnm.managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getAllCrossConnections
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THolder();
				org.tmforum.mtnm.subnetworkConnection.CCIterator_IHolder _arg4= new org.tmforum.mtnm.subnetworkConnection.CCIterator_IHolder();
				_out = handler.createReply();
				getAllCrossConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.subnetworkConnection.CCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllActiveAlarms
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=org.tmforum.mtnm.notifications.ProbableCauseList_THelper.read(_input);
				org.tmforum.mtnm.notifications.PerceivedSeverity_T[] _arg2=org.tmforum.mtnm.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.tmforum.mtnm.notifications.EventList_THolder _arg4= new org.tmforum.mtnm.notifications.EventList_THolder();
				org.tmforum.mtnm.notifications.EventIterator_IHolder _arg5= new org.tmforum.mtnm.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.notifications.EventList_THelper.write(_out,_arg4.value);
				org.tmforum.mtnm.notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getAllPTPNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg4= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg5= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPTPNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 3: // getContainedInUseTPNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setNativeEMSName
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
			case 5: // getAllFixedCrossConnections
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THolder();
				org.tmforum.mtnm.subnetworkConnection.CCIterator_IHolder _arg4= new org.tmforum.mtnm.subnetworkConnection.CCIterator_IHolder();
				_out = handler.createReply();
				getAllFixedCrossConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.subnetworkConnection.CCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getGTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.terminationPoint.GTP_THolder _arg1= new org.tmforum.mtnm.terminationPoint.GTP_THolder();
				_out = handler.createReply();
				getGTP(_arg0,_arg1);
				org.tmforum.mtnm.terminationPoint.GTP_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllFTPNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg4= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg5= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFTPNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 8: // deleteGTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteGTP(_arg0);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setGtpAlarmReportingOff
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setGtpAlarmReportingOff(_arg0);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getContainedCurrentTPNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getContainingSubnetworkNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingSubnetworkNames(_arg0,_arg1);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // setOwner
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
			case 13: // createGTP
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				boolean _arg1=_input.read_boolean();
				java.lang.String _arg2=_input.read_string();
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] _arg3=org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg4=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg5=_input.read_ulong();
				org.tmforum.mtnm.terminationPoint.GTPEffort_T _arg6=org.tmforum.mtnm.terminationPoint.GTPEffort_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg7=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.terminationPoint.GTP_THolder _arg8= new org.tmforum.mtnm.terminationPoint.GTP_THolder();
				_out = handler.createReply();
				createGTP(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				org.tmforum.mtnm.terminationPoint.GTP_THelper.write(_out,_arg8.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getAllManagedElements
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.tmforum.mtnm.managedElement.ManagedElementList_THolder _arg1= new org.tmforum.mtnm.managedElement.ManagedElementList_THolder();
				org.tmforum.mtnm.managedElement.ManagedElementIterator_IHolder _arg2= new org.tmforum.mtnm.managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.managedElement.ManagedElementList_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.managedElement.ManagedElementIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder _arg1= new org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				getTP(_arg0,_arg1);
				org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getContainedPotentialTPNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getPotentialFixedCCs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				getPotentialFixedCCs(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // setAdditionalInfo
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
			case 19: // getContainedCurrentTPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder _arg3= new org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder();
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder _arg4= new org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getAllPTPsWithoutFTPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder _arg4= new org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder();
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder _arg5= new org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllPTPsWithoutFTPs(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.write(_out,_arg4.value);
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAllPTPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder _arg4= new org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder();
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder _arg5= new org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllPTPs(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.write(_out,_arg4.value);
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getContainingTPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder _arg1= new org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getContainingTPs(_arg0,_arg1);
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getAllUnacknowledgedActiveAlarms
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=org.tmforum.mtnm.notifications.ProbableCauseList_THelper.read(_input);
				org.tmforum.mtnm.notifications.PerceivedSeverity_T[] _arg2=org.tmforum.mtnm.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.tmforum.mtnm.notifications.EventList_THolder _arg4= new org.tmforum.mtnm.notifications.EventList_THolder();
				org.tmforum.mtnm.notifications.EventIterator_IHolder _arg5= new org.tmforum.mtnm.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllUnacknowledgedActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.notifications.EventList_THelper.write(_out,_arg4.value);
				org.tmforum.mtnm.notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // setGtpAlarmReportingOn
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setGtpAlarmReportingOn(_arg0);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // setTPData
			{
			try
			{
				org.tmforum.mtnm.subnetworkConnection.TPData_T _arg0=org.tmforum.mtnm.subnetworkConnection.TPData_THelper.read(_input);
				org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder _arg1= new org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				setTPData(_arg0,_arg1);
				org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getContainingGTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.terminationPoint.GTP_THolder _arg1= new org.tmforum.mtnm.terminationPoint.GTP_THolder();
				_out = handler.createReply();
				getContainingGTP(_arg0,_arg1);
				org.tmforum.mtnm.terminationPoint.GTP_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // setUserLabel
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
			case 28: // getManagedElement
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.managedElement.ManagedElement_THolder _arg1= new org.tmforum.mtnm.managedElement.ManagedElement_THolder();
				_out = handler.createReply();
				getManagedElement(_arg0,_arg1);
				org.tmforum.mtnm.managedElement.ManagedElement_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // getAllFTPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder _arg4= new org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder();
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder _arg5= new org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllFTPs(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.write(_out,_arg4.value);
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // verifyTMDAssignment
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.terminationPoint.Directionality_T _arg1=org.tmforum.mtnm.terminationPoint.Directionality_THelper.read(_input);
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THolder _arg3= new org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THolder();
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg4= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				verifyTMDAssignment(_arg0,_arg1,_arg2,_arg3,_arg4);
				_out.write_string(_arg2.value);
				org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getAllPTPNamesWithoutFTPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg4= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg5= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPTPNamesWithoutFTPs(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 32: // getAllManagedElementNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getAllGTPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.terminationPoint.GTPlist_THolder _arg3= new org.tmforum.mtnm.terminationPoint.GTPlist_THolder();
				org.tmforum.mtnm.terminationPoint.GTPiterator_IHolder _arg4= new org.tmforum.mtnm.terminationPoint.GTPiterator_IHolder();
				_out = handler.createReply();
				getAllGTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.terminationPoint.GTPlist_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.terminationPoint.GTPiterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getContainedPotentialTPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder _arg3= new org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder();
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder _arg4= new org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // getContainedInUseTPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder _arg3= new org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder();
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder _arg4= new org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // modifyGTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] _arg1=org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				org.tmforum.mtnm.terminationPoint.GTP_THolder _arg3= new org.tmforum.mtnm.terminationPoint.GTP_THolder();
				_out = handler.createReply();
				modifyGTP(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.terminationPoint.GTP_THelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // getContainingTPNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingTPNames(_arg0,_arg1);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // getAllGTPNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllGTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // getCapabilities
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
