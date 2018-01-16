package org.tmforum.mtnm.multiLayerSubnetwork;

/**
 *	Generated from IDL interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class MultiLayerSubnetworkMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "removeConnections", new java.lang.Integer(0));
		m_opsHash.put ( "getAllEdgeMLSNPPLinks", new java.lang.Integer(1));
		m_opsHash.put ( "modifyDiversityAndCorouting", new java.lang.Integer(2));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(3));
		m_opsHash.put ( "getAllCallIdsWithSNPPOrTNAName", new java.lang.Integer(4));
		m_opsHash.put ( "getIntendedRoute", new java.lang.Integer(5));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(6));
		m_opsHash.put ( "getSNC", new java.lang.Integer(7));
		m_opsHash.put ( "getConnectionsAndRouteDetails", new java.lang.Integer(8));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(9));
		m_opsHash.put ( "addRoute", new java.lang.Integer(10));
		m_opsHash.put ( "getAllSubnetworkConnectionNamesWithTP", new java.lang.Integer(11));
		m_opsHash.put ( "getBackupRoutes", new java.lang.Integer(12));
		m_opsHash.put ( "getAllSubnetworkConnectionNames", new java.lang.Integer(13));
		m_opsHash.put ( "setRoutesAdminState", new java.lang.Integer(14));
		m_opsHash.put ( "getMLSNPPLink", new java.lang.Integer(15));
		m_opsHash.put ( "getSNCsByUserLabel", new java.lang.Integer(16));
		m_opsHash.put ( "getTPGroupingRelationships", new java.lang.Integer(17));
		m_opsHash.put ( "getAllEdgePoints", new java.lang.Integer(18));
		m_opsHash.put ( "getAllTopologicalLinks", new java.lang.Integer(19));
		m_opsHash.put ( "modifyCall", new java.lang.Integer(20));
		m_opsHash.put ( "getAssociatedTP", new java.lang.Integer(21));
		m_opsHash.put ( "getRouteAndTopologicalLinks", new java.lang.Integer(22));
		m_opsHash.put ( "releaseCall", new java.lang.Integer(23));
		m_opsHash.put ( "setOwner", new java.lang.Integer(24));
		m_opsHash.put ( "createSNC", new java.lang.Integer(25));
		m_opsHash.put ( "getAllEdgePointNames", new java.lang.Integer(26));
		m_opsHash.put ( "getRoute", new java.lang.Integer(27));
		m_opsHash.put ( "getAllTopologicalLinkNames", new java.lang.Integer(28));
		m_opsHash.put ( "getAllManagedElementNames", new java.lang.Integer(29));
		m_opsHash.put ( "getTPPool", new java.lang.Integer(30));
		m_opsHash.put ( "getAllSubnetworkConnections", new java.lang.Integer(31));
		m_opsHash.put ( "swapSNC", new java.lang.Integer(32));
		m_opsHash.put ( "getAllTPPoolNames", new java.lang.Integer(33));
		m_opsHash.put ( "getAllFixedSubnetworkConnectionNamesWithTP", new java.lang.Integer(34));
		m_opsHash.put ( "getAllMLSNPPs", new java.lang.Integer(35));
		m_opsHash.put ( "removeRoute", new java.lang.Integer(36));
		m_opsHash.put ( "deactivateSNC", new java.lang.Integer(37));
		m_opsHash.put ( "switchRoute", new java.lang.Integer(38));
		m_opsHash.put ( "getAllCallIdsWithTP", new java.lang.Integer(39));
		m_opsHash.put ( "getAllCallsAndTopLevelConnectionsAndSNCs", new java.lang.Integer(40));
		m_opsHash.put ( "checkValidSNC", new java.lang.Integer(41));
		m_opsHash.put ( "getAllSubordinateMLSNs", new java.lang.Integer(42));
		m_opsHash.put ( "modifySNC", new java.lang.Integer(43));
		m_opsHash.put ( "getAllCallsAndTopLevelConnectionsAndSNCsWithTP", new java.lang.Integer(44));
		m_opsHash.put ( "establishCall", new java.lang.Integer(45));
		m_opsHash.put ( "getAllCallsAndTopLevelConnectionsWithME", new java.lang.Integer(46));
		m_opsHash.put ( "getAllCallsAndTopLevelConnections", new java.lang.Integer(47));
		m_opsHash.put ( "deleteTPPool", new java.lang.Integer(48));
		m_opsHash.put ( "createAndActivateSNC", new java.lang.Integer(49));
		m_opsHash.put ( "createTPPool", new java.lang.Integer(50));
		m_opsHash.put ( "getAllInternalMLSNPPLinks", new java.lang.Integer(51));
		m_opsHash.put ( "getAllManagedElements", new java.lang.Integer(52));
		m_opsHash.put ( "getCall", new java.lang.Integer(53));
		m_opsHash.put ( "addConnections", new java.lang.Integer(54));
		m_opsHash.put ( "deactivateAndDeleteSNC", new java.lang.Integer(55));
		m_opsHash.put ( "getAllFixedSubnetworkConnections", new java.lang.Integer(56));
		m_opsHash.put ( "getAllSubordinateRAidsWithConnection", new java.lang.Integer(57));
		m_opsHash.put ( "createModifiedSNC", new java.lang.Integer(58));
		m_opsHash.put ( "modifyTPPool", new java.lang.Integer(59));
		m_opsHash.put ( "getCallAndTopLevelConnections", new java.lang.Integer(60));
		m_opsHash.put ( "getAllSubnetworkConnectionsWithTP", new java.lang.Integer(61));
		m_opsHash.put ( "getMultiLayerSubnetwork", new java.lang.Integer(62));
		m_opsHash.put ( "activateSNC", new java.lang.Integer(63));
		m_opsHash.put ( "getTopologicalLink", new java.lang.Integer(64));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(65));
		m_opsHash.put ( "getAllTPPools", new java.lang.Integer(66));
		m_opsHash.put ( "deleteSNC", new java.lang.Integer(67));
		m_opsHash.put ( "getAllFixedSubnetworkConnectionNames", new java.lang.Integer(68));
		m_opsHash.put ( "getCallAndTopLevelConnectionsAndSNCs", new java.lang.Integer(69));
		m_opsHash.put ( "getAllFixedSubnetworkConnectionsWithTP", new java.lang.Integer(70));
		m_opsHash.put ( "setIntendedRoute", new java.lang.Integer(71));
		m_opsHash.put ( "getAllMLSNPPLinks", new java.lang.Integer(72));
		m_opsHash.put ( "getAllCallsAndTopLevelConnectionsAndSNCsWithME", new java.lang.Integer(73));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetworkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		return org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // removeConnections
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] _arg1=org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder _arg2= new org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				removeConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllEdgeMLSNPPLinks
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder _arg3= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllEdgeMLSNPPLinks(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // modifyDiversityAndCorouting
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.callSNC.Diversity_T _arg1=org.tmforum.mtnm.callSNC.Diversity_THelper.read(_input);
				org.tmforum.mtnm.callSNC.RouteGroupInfo_T[] _arg2=org.tmforum.mtnm.callSNC.RouteGroupInfoList_THelper.read(_input);
				boolean _arg3=_input.read_boolean();
				java.lang.String _arg4=_input.read_string();
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg5= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_arg5._read (_input);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THolder _arg6= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THolder();
				_out = handler.createReply();
				modifyDiversityAndCorouting(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg5.value);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THelper.write(_out,_arg6.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setNativeEMSName
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
			case 4: // getAllCallIdsWithSNPPOrTNAName
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T _arg0=org.tmforum.mtnm.globaldefs.NameAndStringValue_THelper.read(_input);
				org.tmforum.mtnm.callSNC.CallIdList_THolder _arg1= new org.tmforum.mtnm.callSNC.CallIdList_THolder();
				_out = handler.createReply();
				getAllCallIdsWithSNPPOrTNAName(_arg0,_arg1);
				org.tmforum.mtnm.callSNC.CallIdList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getIntendedRoute
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_arg2._read (_input);
				org.tmforum.mtnm.subnetworkConnection.Route_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.Route_THolder();
				_out = handler.createReply();
				getIntendedRoute(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.subnetworkConnection.Route_THelper.write(_out,_arg3.value);
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
			case 7: // getSNC
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder _arg1= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder();
				_out = handler.createReply();
				getSNC(_arg0,_arg1);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getConnectionsAndRouteDetails
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg1=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				boolean _arg3=_input.read_boolean();
				java.lang.String _arg4=_input.read_string();
				org.tmforum.mtnm.callSNC.SNCAndRouteList_THolder _arg5= new org.tmforum.mtnm.callSNC.SNCAndRouteList_THolder();
				_out = handler.createReply();
				getConnectionsAndRouteDetails(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.callSNC.SNCAndRouteList_THelper.write(_out,_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setUserLabel
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
			case 10: // addRoute
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.RouteCreateData_T _arg1=org.tmforum.mtnm.subnetworkConnection.RouteCreateData_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T _arg2=org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T _arg3=org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.RouteDescriptor_THolder _arg4= new org.tmforum.mtnm.subnetworkConnection.RouteDescriptor_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				addRoute(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.subnetworkConnection.RouteDescriptor_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAllSubnetworkConnectionNamesWithTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionNamesWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 12: // getBackupRoutes
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg3= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_arg3._read (_input);
				org.tmforum.mtnm.subnetworkConnection.RouteList_THolder _arg4= new org.tmforum.mtnm.subnetworkConnection.RouteList_THolder();
				_out = handler.createReply();
				getBackupRoutes(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.subnetworkConnection.RouteList_THelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getAllSubnetworkConnectionNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 14: // setRoutesAdminState
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.RouteNameAndAdminStateList_THolder _arg1= new org.tmforum.mtnm.subnetworkConnection.RouteNameAndAdminStateList_THolder();
				_arg1._read (_input);
				org.tmforum.mtnm.subnetworkConnection.SNCState_THolder _arg2= new org.tmforum.mtnm.subnetworkConnection.SNCState_THolder();
				_out = handler.createReply();
				setRoutesAdminState(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.subnetworkConnection.RouteNameAndAdminStateList_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.subnetworkConnection.SNCState_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getMLSNPPLink
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THolder _arg2= new org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THolder();
				_out = handler.createReply();
				getMLSNPPLink(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getSNCsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder _arg1= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder();
				_out = handler.createReply();
				getSNCsByUserLabel(_arg0,_arg1);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getTPGroupingRelationships
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getTPGroupingRelationships(_arg0,_arg1,_arg2,_arg3);
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
			case 18: // getAllEdgePoints
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
				getAllEdgePoints(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 19: // getAllTopologicalLinks
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder _arg2= new org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder();
				org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHolder _arg3= new org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinks(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // modifyCall
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.callSNC.CallModifyData_T _arg1=org.tmforum.mtnm.callSNC.CallModifyData_THelper.read(_input);
				org.tmforum.mtnm.callSNC.Call_THolder _arg2= new org.tmforum.mtnm.callSNC.Call_THolder();
				_out = handler.createReply();
				modifyCall(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.callSNC.Call_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAssociatedTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder _arg1= new org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getAssociatedTP(_arg0,_arg1);
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getRouteAndTopologicalLinks
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.Route_THolder _arg1= new org.tmforum.mtnm.subnetworkConnection.Route_THolder();
				org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder _arg2= new org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder();
				_out = handler.createReply();
				getRouteAndTopologicalLinks(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.subnetworkConnection.Route_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // releaseCall
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder _arg1= new org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder _arg2= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				releaseCall(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // setOwner
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
			case 25: // createSNC
			{
			try
			{
				org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T _arg0=org.tmforum.mtnm.subnetworkConnection.SNCCreateData_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T _arg1=org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createSNC(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getAllEdgePointNames
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
				getAllEdgePointNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 27: // getRoute
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				org.tmforum.mtnm.subnetworkConnection.Route_THolder _arg2= new org.tmforum.mtnm.subnetworkConnection.Route_THolder();
				_out = handler.createReply();
				getRoute(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.subnetworkConnection.Route_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getAllTopologicalLinkNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinkNames(_arg0,_arg1,_arg2,_arg3);
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
			case 29: // getAllManagedElementNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0,_arg1,_arg2,_arg3);
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
			case 30: // getTPPool
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder _arg1= new org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder();
				org.omg.CORBA.IntHolder _arg2= new org.omg.CORBA.IntHolder();
				org.omg.CORBA.IntHolder _arg3= new org.omg.CORBA.IntHolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				getTPPool(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
				_out.write_ulong(_arg2.value);
				_out.write_ulong(_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getAllSubnetworkConnections
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder _arg4= new org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // swapSNC
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg1=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T _arg3=org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder _arg4= new org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				org.tmforum.mtnm.subnetworkConnection.SNCState_THolder _arg5= new org.tmforum.mtnm.subnetworkConnection.SNCState_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				swapSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				org.tmforum.mtnm.subnetworkConnection.SNCState_THelper.write(_out,_arg5.value);
				_out.write_string(_arg6.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getAllTPPoolNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTPPoolNames(_arg0,_arg1,_arg2,_arg3);
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
			case 34: // getAllFixedSubnetworkConnectionNamesWithTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFixedSubnetworkConnectionNamesWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 35: // getAllMLSNPPs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder _arg3= new org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder();
				org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder _arg4= new org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.mLSNPP.MLSNPPList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // removeRoute
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg3= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_arg3._read (_input);
				_out = handler.createReply();
				removeRoute(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // deactivateSNC
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T _arg1=org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder _arg4= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // switchRoute
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T _arg2=org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T _arg3=org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder _arg4= new org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg5= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_arg5._read (_input);
				org.tmforum.mtnm.subnetworkConnection.SNCState_THolder _arg6= new org.tmforum.mtnm.subnetworkConnection.SNCState_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				switchRoute(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg5.value);
				org.tmforum.mtnm.subnetworkConnection.SNCState_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // getAllCallIdsWithTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.callSNC.CallIdList_THolder _arg1= new org.tmforum.mtnm.callSNC.CallIdList_THolder();
				_out = handler.createReply();
				getAllCallIdsWithTP(_arg0,_arg1);
				org.tmforum.mtnm.callSNC.CallIdList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // getAllCallsAndTopLevelConnectionsAndSNCs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder _arg2= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder();
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder _arg3= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnectionsAndSNCs(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // checkValidSNC
			{
			try
			{
				org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T _arg0=org.tmforum.mtnm.subnetworkConnection.SNCCreateData_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.TPData_T[] _arg1=org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				org.omg.CORBA.BooleanHolder _arg3= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				checkValidSNC(_arg0,_arg1,_arg2,_arg3);
				_out.write_boolean(_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // getAllSubordinateMLSNs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THolder _arg2= new org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THolder();
				org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHolder _arg3= new org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHolder();
				_out = handler.createReply();
				getAllSubordinateMLSNs(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // modifySNC
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.tmforum.mtnm.subnetworkConnection.SNCModifyData_T _arg2=org.tmforum.mtnm.subnetworkConnection.SNCModifyData_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T _arg3=org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_T _arg4=org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_THelper.read(_input);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T _arg5=org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder _arg6= new org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder();
				_arg6._read (_input);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder _arg7= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg8= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifySNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_out,_arg6.value);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg7.value);
				_out.write_string(_arg8.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // getAllCallsAndTopLevelConnectionsAndSNCsWithTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg1=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder _arg3= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder();
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder _arg4= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnectionsAndSNCsWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // establishCall
			{
			try
			{
				org.tmforum.mtnm.callSNC.CallCreateData_T _arg0=org.tmforum.mtnm.callSNC.CallCreateData_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T[] _arg1=org.tmforum.mtnm.subnetworkConnection.SNCCreateDataList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCs_THolder _arg4= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCs_THolder();
				org.tmforum.mtnm.subnetworkConnection.SNCCreateDataList_THolder _arg5= new org.tmforum.mtnm.subnetworkConnection.SNCCreateDataList_THolder();
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder _arg6= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				establishCall(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.write(_out,_arg4.value);
				org.tmforum.mtnm.subnetworkConnection.SNCCreateDataList_THelper.write(_out,_arg5.value);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 46: // getAllCallsAndTopLevelConnectionsWithME
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg1=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THolder _arg3= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THolder();
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHolder _arg4= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnectionsWithME(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 47: // getAllCallsAndTopLevelConnections
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THolder _arg2= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THolder();
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHolder _arg3= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnections(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 48: // deleteTPPool
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteTPPool(_arg0);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 49: // createAndActivateSNC
			{
			try
			{
				org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T _arg0=org.tmforum.mtnm.subnetworkConnection.SNCCreateData_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T _arg1=org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder _arg4= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createAndActivateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 50: // createTPPool
			{
			try
			{
				org.tmforum.mtnm.multiLayerSubnetwork.TPPoolCreateData_T _arg0=org.tmforum.mtnm.multiLayerSubnetwork.TPPoolCreateData_THelper.read(_input);
				org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder _arg1= new org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				createTPPool(_arg0,_arg1);
				org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 51: // getAllInternalMLSNPPLinks
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder _arg3= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllInternalMLSNPPLinks(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 52: // getAllManagedElements
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.managedElement.ManagedElementList_THolder _arg2= new org.tmforum.mtnm.managedElement.ManagedElementList_THolder();
				org.tmforum.mtnm.managedElement.ManagedElementIterator_IHolder _arg3= new org.tmforum.mtnm.managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.managedElement.ManagedElementList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.managedElement.ManagedElementIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 53: // getCall
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.callSNC.Call_THolder _arg1= new org.tmforum.mtnm.callSNC.Call_THolder();
				_out = handler.createReply();
				getCall(_arg0,_arg1);
				org.tmforum.mtnm.callSNC.Call_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 54: // addConnections
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T[] _arg1=org.tmforum.mtnm.subnetworkConnection.SNCCreateDataList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder _arg4= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder _arg5= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				addConnections(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg4.value);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg5.value);
				_out.write_string(_arg6.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 55: // deactivateAndDeleteSNC
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T _arg1=org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder _arg4= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateAndDeleteSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 56: // getAllFixedSubnetworkConnections
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder _arg4= new org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllFixedSubnetworkConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 57: // getAllSubordinateRAidsWithConnection
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg1=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				org.tmforum.mtnm.multiLayerSubnetwork.RoutePerRouteType_THolder _arg3= new org.tmforum.mtnm.multiLayerSubnetwork.RoutePerRouteType_THolder();
				_out = handler.createReply();
				getAllSubordinateRAidsWithConnection(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.multiLayerSubnetwork.RoutePerRouteType_THelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 58: // createModifiedSNC
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.tmforum.mtnm.subnetworkConnection.SNCModifyData_T _arg2=org.tmforum.mtnm.subnetworkConnection.SNCModifyData_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T _arg3=org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_T _arg4=org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_THelper.read(_input);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T _arg5=org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder _arg6= new org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder();
				_arg6._read (_input);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder _arg7= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg8= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createModifiedSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_out,_arg6.value);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg7.value);
				_out.write_string(_arg8.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 59: // modifyTPPool
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] _arg1=org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder _arg3= new org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				modifyTPPool(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 60: // getCallAndTopLevelConnections
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THolder _arg2= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THolder();
				_out = handler.createReply();
				getCallAndTopLevelConnections(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 61: // getAllSubnetworkConnectionsWithTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder _arg4= new org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionsWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 62: // getMultiLayerSubnetwork
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetwork_THolder _arg1= new org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetwork_THolder();
				_out = handler.createReply();
				getMultiLayerSubnetwork(_arg0,_arg1);
				org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetwork_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 63: // activateSNC
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T _arg1=org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder _arg4= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 64: // getTopologicalLink
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.topologicalLink.TopologicalLink_THolder _arg1= new org.tmforum.mtnm.topologicalLink.TopologicalLink_THolder();
				_out = handler.createReply();
				getTopologicalLink(_arg0,_arg1);
				org.tmforum.mtnm.topologicalLink.TopologicalLink_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 65: // setAdditionalInfo
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
			case 66: // getAllTPPools
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder _arg2= new org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder();
				org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder _arg3= new org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllTPPools(_arg0,_arg1,_arg2,_arg3);
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
			case 67: // deleteSNC
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T _arg1=org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				_out = handler.createReply();
				deleteSNC(_arg0,_arg1);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 68: // getAllFixedSubnetworkConnectionNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFixedSubnetworkConnectionNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 69: // getCallAndTopLevelConnectionsAndSNCs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCs_THolder _arg1= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCs_THolder();
				_out = handler.createReply();
				getCallAndTopLevelConnectionsAndSNCs(_arg0,_arg1);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 70: // getAllFixedSubnetworkConnectionsWithTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder();
				org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder _arg4= new org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllFixedSubnetworkConnectionsWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 71: // setIntendedRoute
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_arg2._read (_input);
				_out = handler.createReply();
				setIntendedRoute(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 72: // getAllMLSNPPLinks
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder _arg3= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPLinks(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 73: // getAllCallsAndTopLevelConnectionsAndSNCsWithME
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg1=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder _arg3= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder();
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder _arg4= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder();
				_out = handler.createReply();
				getAllCallsAndTopLevelConnectionsAndSNCsWithME(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.write(_out,_arg4.value);
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
