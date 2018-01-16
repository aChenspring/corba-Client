package org.tmforum.mtnm.multiLayerSubnetwork;


/**
 *	Generated from IDL interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _MultiLayerSubnetworkMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetworkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IOperations.class;
	public void removeConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] connectionNamesList, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sNCsNotDeleted, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "removeConnections", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,callName);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,connectionNamesList);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				sNCsNotDeleted.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "removeConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.removeConnections(callName,connectionNamesList,tpsToModify,sNCsNotDeleted,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllEdgeMLSNPPLinks(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllEdgeMLSNPPLinks", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_boolean(sNPListRequested);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mLSNPPLinkList.value = org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.read(_is);
				mLSNPPLinkIt.value = org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEdgeMLSNPPLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllEdgeMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyDiversityAndCorouting(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.callSNC.Diversity_T callDiversity, org.tmforum.mtnm.callSNC.RouteGroupInfo_T[] routeGroupInfoList, boolean connectionRouteReArrangementAllowed, java.lang.String routeGroupsNumber, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo, org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyDiversityAndCorouting", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,callName);
				org.tmforum.mtnm.callSNC.Diversity_THelper.write(_os,callDiversity);
				org.tmforum.mtnm.callSNC.RouteGroupInfoList_THelper.write(_os,routeGroupInfoList);
				_os.write_boolean(connectionRouteReArrangementAllowed);
				_os.write_string(routeGroupsNumber);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_is);
				callAndTopLevelConnections.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyDiversityAndCorouting", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyDiversityAndCorouting(callName,callDiversity,routeGroupInfoList,connectionRouteReArrangementAllowed,routeGroupsNumber,additionalInfo,callAndTopLevelConnections);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setNativeEMSName", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(nativeEMSName);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setNativeEMSName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setNativeEMSName(objectName,nativeEMSName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallIdsWithSNPPOrTNAName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T sNPPOrTNAName, org.tmforum.mtnm.callSNC.CallIdList_THolder callIdList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallIdsWithSNPPOrTNAName", true);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_THelper.write(_os,sNPPOrTNAName);
				_is = _invoke(_os);
				callIdList.value = org.tmforum.mtnm.callSNC.CallIdList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallIdsWithSNPPOrTNAName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallIdsWithSNPPOrTNAName(sNPPOrTNAName,callIdList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getIntendedRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo, org.tmforum.mtnm.subnetworkConnection.Route_THolder route) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getIntendedRoute", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_boolean(includeHigherOrderCCs);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_is);
				route.value = org.tmforum.mtnm.subnetworkConnection.Route_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getIntendedRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getIntendedRoute(sncName,includeHigherOrderCCs,additionalInfo,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCapabilities", true);
				_is = _invoke(_os);
				capabilities.value = org.tmforum.mtnm.common.CapabilityList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCapabilities", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getCapabilities(capabilities);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder snc) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSNC", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				_is = _invoke(_os);
				snc.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getSNC(sncName,snc);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getConnectionsAndRouteDetails(java.lang.String callID, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLRAName, java.lang.String sNPOrSNPPID, boolean mLSNPPLinkRequested, java.lang.String routeType, org.tmforum.mtnm.callSNC.SNCAndRouteList_THolder connectionAndRouteList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getConnectionsAndRouteDetails", true);
				_os.write_string(callID);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mLRAName);
				_os.write_string(sNPOrSNPPID);
				_os.write_boolean(mLSNPPLinkRequested);
				_os.write_string(routeType);
				_is = _invoke(_os);
				connectionAndRouteList.value = org.tmforum.mtnm.callSNC.SNCAndRouteList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getConnectionsAndRouteDetails", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getConnectionsAndRouteDetails(callID,mLRAName,sNPOrSNPPID,mLSNPPLinkRequested,routeType,connectionAndRouteList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setUserLabel", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(userLabel);
				_os.write_boolean(enforceUniqueness);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setUserLabel(objectName,userLabel,enforceUniqueness);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void addRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.RouteCreateData_T createRoute, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.RouteDescriptor_THolder theRoute, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "addRoute", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				org.tmforum.mtnm.subnetworkConnection.RouteCreateData_THelper.write(_os,createRoute);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				_is = _invoke(_os);
				theRoute.value = org.tmforum.mtnm.subnetworkConnection.RouteDescriptor_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "addRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.addRoute(sncName,createRoute,tolerableImpact,emsFreedomLevel,theRoute,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubnetworkConnectionNamesWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubnetworkConnectionNamesWithTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubnetworkConnectionNamesWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSubnetworkConnectionNamesWithTP(tpName,connectionRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getBackupRoutes(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, boolean includeHigherOrderCCs, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo, org.tmforum.mtnm.subnetworkConnection.RouteList_THolder routeList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getBackupRoutes", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				_os.write_boolean(includeHigherOrderCCs);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_is);
				routeList.value = org.tmforum.mtnm.subnetworkConnection.RouteList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getBackupRoutes", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getBackupRoutes(sncName,routeId,includeHigherOrderCCs,additionalInfo,routeList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubnetworkConnectionNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubnetworkConnectionNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubnetworkConnectionNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSubnetworkConnectionNames(subnetName,connectionRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setRoutesAdminState(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.RouteNameAndAdminStateList_THolder routeNameAndAdminStateList, org.tmforum.mtnm.subnetworkConnection.SNCState_THolder sncState) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setRoutesAdminState", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				org.tmforum.mtnm.subnetworkConnection.RouteNameAndAdminStateList_THelper.write(_os,routeNameAndAdminStateList.value);
				_is = _invoke(_os);
				routeNameAndAdminStateList.value = org.tmforum.mtnm.subnetworkConnection.RouteNameAndAdminStateList_THelper.read(_is);
				sncState.value = org.tmforum.mtnm.subnetworkConnection.SNCState_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setRoutesAdminState", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setRoutesAdminState(sncName,routeNameAndAdminStateList,sncState);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMLSNPPLink(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, boolean sNPListRequested, org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THolder theMLSNPPLink) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMLSNPPLink", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mLSNPPLinkName);
				_os.write_boolean(sNPListRequested);
				_is = _invoke(_os);
				theMLSNPPLink.value = org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMLSNPPLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMLSNPPLink(mLSNPPLinkName,sNPListRequested,theMLSNPPLink);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSNCsByUserLabel(java.lang.String userLabel, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSNCsByUserLabel", true);
				_os.write_string(userLabel);
				_is = _invoke(_os);
				sncList.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSNCsByUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getSNCsByUserLabel(userLabel,sncList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTPGroupingRelationships(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTPGroupingRelationships", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTPGroupingRelationships", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTPGroupingRelationships(tpName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllEdgePoints(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllEdgePoints", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,tpLayerRateList);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectionLayerRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tpList.value = org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.read(_is);
				tpIt.value = org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEdgePoints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllEdgePoints(subnetName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopologicalLinks(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder topoList, org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopologicalLinks", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				topoList.value = org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THelper.read(_is);
				topoIt.value = org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopologicalLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopologicalLinks(subnetName,how_many,topoList,topoIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyCall(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.callSNC.CallModifyData_T callModifyData, org.tmforum.mtnm.callSNC.Call_THolder modifiedCall) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyCall", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,callName);
				org.tmforum.mtnm.callSNC.CallModifyData_THelper.write(_os,callModifyData);
				_is = _invoke(_os);
				modifiedCall.value = org.tmforum.mtnm.callSNC.Call_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyCall", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyCall(callName,callModifyData,modifiedCall);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAssociatedTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAssociatedTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				_is = _invoke(_os);
				tpList.value = org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAssociatedTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAssociatedTP(tpName,tpList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getRouteAndTopologicalLinks(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.Route_THolder route, org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder topologicalLinkList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getRouteAndTopologicalLinks", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				_is = _invoke(_os);
				route.value = org.tmforum.mtnm.subnetworkConnection.Route_THelper.read(_is);
				topologicalLinkList.value = org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getRouteAndTopologicalLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getRouteAndTopologicalLinks(sncName,route,topologicalLinkList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void releaseCall(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder remainingSNCs, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "releaseCall", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,callName);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				remainingSNCs.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "releaseCall", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.releaseCall(callName,tpsToModify,remainingSNCs,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setOwner", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(owner);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setOwner", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setOwner(objectName,owner);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createSNC(org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T createData, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createSNC", true);
				org.tmforum.mtnm.subnetworkConnection.SNCCreateData_THelper.write(_os,createData);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				_is = _invoke(_os);
				theSNC.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.createSNC(createData,tolerableImpact,emsFreedomLevel,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllEdgePointNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, short[] layerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllEdgePointNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectionLayerRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEdgePointNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllEdgePointNames(subnetName,layerRateList,connectionLayerRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, org.tmforum.mtnm.subnetworkConnection.Route_THolder route) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getRoute", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_boolean(includeHigherOrderCCs);
				_is = _invoke(_os);
				route.value = org.tmforum.mtnm.subnetworkConnection.Route_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getRoute(sncName,includeHigherOrderCCs,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopologicalLinkNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopologicalLinkNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopologicalLinkNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopologicalLinkNames(subnetName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllManagedElementNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllManagedElementNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllManagedElementNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllManagedElementNames(subnetName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTPPool(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tPPoolName, org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder tPPool, org.omg.CORBA.IntHolder numberOfMembers, org.omg.CORBA.IntHolder numberOfIdleMembers, org.omg.CORBA.StringHolder descriptionOfUse) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTPPool", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tPPoolName);
				_is = _invoke(_os);
				tPPool.value = org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.read(_is);
				numberOfMembers.value = _is.read_ulong();
				numberOfIdleMembers.value = _is.read_ulong();
				descriptionOfUse.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTPPool", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTPPool(tPPoolName,tPPool,numberOfMembers,numberOfIdleMembers,descriptionOfUse);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubnetworkConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubnetworkConnections", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				sncList.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				sncIt.value = org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubnetworkConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void swapSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] nameOfSNCtoBeDeactivated, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] nameOfSNCtoBeActivated, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SNCState_THolder stateOfActivatedSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "swapSNC", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,nameOfSNCtoBeDeactivated);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,nameOfSNCtoBeActivated);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				stateOfActivatedSNC.value = org.tmforum.mtnm.subnetworkConnection.SNCState_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "swapSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.swapSNC(nameOfSNCtoBeDeactivated,nameOfSNCtoBeActivated,emsFreedomLevel,tolerableImpact,tpsToModify,stateOfActivatedSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTPPoolNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTPPoolNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetworkName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTPPoolNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTPPoolNames(subnetworkName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFixedSubnetworkConnectionNamesWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFixedSubnetworkConnectionNamesWithTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFixedSubnetworkConnectionNamesWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFixedSubnetworkConnectionNamesWithTP(tpName,connectionRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMLSNPPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder mLSNPPList, org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMLSNPPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_boolean(sNPListRequested);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mLSNPPList.value = org.tmforum.mtnm.mLSNPP.MLSNPPList_THelper.read(_is);
				mLSNPPIt.value = org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMLSNPPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMLSNPPs(subnetName,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void removeRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "removeRoute", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "removeRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.removeRoute(sncName,routeId,emsFreedomLevel,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateSNC", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				theSNC.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deactivateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void switchRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo, org.tmforum.mtnm.subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "switchRoute", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				additionalInfo.value = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_is);
				sncState.value = org.tmforum.mtnm.subnetworkConnection.SNCState_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "switchRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.switchRoute(sncName,routeId,tolerableImpact,emsFreedomLevel,tpsToModify,additionalInfo,sncState,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallIdsWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tPName, org.tmforum.mtnm.callSNC.CallIdList_THolder callIdList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallIdsWithTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tPName);
				_is = _invoke(_os);
				callIdList.value = org.tmforum.mtnm.callSNC.CallIdList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallIdsWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallIdsWithTP(tPName,callIdList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallsAndTopLevelConnectionsAndSNCs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallsAndTopLevelConnectionsAndSNCs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsAndSNCsList.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.read(_is);
				callAndTopLevelConnectionsAndSNCsIt.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnectionsAndSNCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallsAndTopLevelConnectionsAndSNCs(subnetName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void checkValidSNC(org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T createData, org.tmforum.mtnm.subnetworkConnection.TPData_T[] tpsToModify, boolean considerResources, org.omg.CORBA.BooleanHolder valid) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "checkValidSNC", true);
				org.tmforum.mtnm.subnetworkConnection.SNCCreateData_THelper.write(_os,createData);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify);
				_os.write_boolean(considerResources);
				_is = _invoke(_os);
				valid.value = _is.read_boolean();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "checkValidSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.checkValidSNC(createData,tpsToModify,considerResources,valid);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubordinateMLSNs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THolder subordinateMLSNsList, org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHolder subnetIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubordinateMLSNs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				subordinateMLSNsList.value = org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THelper.read(_is);
				subnetIt.value = org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubordinateMLSNs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSubordinateMLSNs(subnetName,how_many,subordinateMLSNsList,subnetIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifySNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.tmforum.mtnm.subnetworkConnection.SNCModifyData_T SNCModifyData, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifySNC", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				org.tmforum.mtnm.subnetworkConnection.SNCModifyData_THelper.write(_os,SNCModifyData);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_THelper.write(_os,tolerableImpactEffort);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				newSNC.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifySNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifySNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,emsFreedomLevel,tpsToModify,newSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tPName, int how_many, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallsAndTopLevelConnectionsAndSNCsWithTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tPName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsAndSNCsList.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.read(_is);
				callAndTopLevelConnectionsAndSNCsIt.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnectionsAndSNCsWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallsAndTopLevelConnectionsAndSNCsWithTP(subnetName,tPName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void establishCall(org.tmforum.mtnm.callSNC.CallCreateData_T callCreateData, org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T[] connectionCreateDataList, java.lang.String routeGroupsNumber, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs, org.tmforum.mtnm.subnetworkConnection.SNCCreateDataList_THolder sNCsNotCreated, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder callErrorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "establishCall", true);
				org.tmforum.mtnm.callSNC.CallCreateData_THelper.write(_os,callCreateData);
				org.tmforum.mtnm.subnetworkConnection.SNCCreateDataList_THelper.write(_os,connectionCreateDataList);
				_os.write_string(routeGroupsNumber);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				callAndTopLevelConnectionsAndSNCs.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.read(_is);
				sNCsNotCreated.value = org.tmforum.mtnm.subnetworkConnection.SNCCreateDataList_THelper.read(_is);
				partialSNCs.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				callErrorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "establishCall", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.establishCall(callCreateData,connectionCreateDataList,routeGroupsNumber,tpsToModify,callAndTopLevelConnectionsAndSNCs,sNCsNotCreated,partialSNCs,callErrorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallsAndTopLevelConnectionsWithME(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallsAndTopLevelConnectionsWithME", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsList.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THelper.read(_is);
				callAndTopLevelConnectionsIt.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnectionsWithME", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallsAndTopLevelConnectionsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallsAndTopLevelConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallsAndTopLevelConnections", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsList.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsList_THelper.read(_is);
				callAndTopLevelConnectionsIt.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallsAndTopLevelConnections(subnetName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteTPPool(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpPoolName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteTPPool", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpPoolName);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteTPPool", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteTPPool(tpPoolName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createAndActivateSNC(org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T createData, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createAndActivateSNC", true);
				org.tmforum.mtnm.subnetworkConnection.SNCCreateData_THelper.write(_os,createData);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				theSNC.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createAndActivateSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.createAndActivateSNC(createData,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createTPPool(org.tmforum.mtnm.multiLayerSubnetwork.TPPoolCreateData_T newTPPoolCreateData, org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder newTPPool) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createTPPool", true);
				org.tmforum.mtnm.multiLayerSubnetwork.TPPoolCreateData_THelper.write(_os,newTPPoolCreateData);
				_is = _invoke(_os);
				newTPPool.value = org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createTPPool", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.createTPPool(newTPPoolCreateData,newTPPool);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllInternalMLSNPPLinks(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllInternalMLSNPPLinks", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_boolean(sNPListRequested);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mLSNPPLinkList.value = org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.read(_is);
				mLSNPPLinkIt.value = org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllInternalMLSNPPLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllInternalMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllManagedElements(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.tmforum.mtnm.managedElement.ManagedElementList_THolder meList, org.tmforum.mtnm.managedElement.ManagedElementIterator_IHolder meIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllManagedElements", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				meList.value = org.tmforum.mtnm.managedElement.ManagedElementList_THelper.read(_is);
				meIt.value = org.tmforum.mtnm.managedElement.ManagedElementIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllManagedElements", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllManagedElements(subnetName,how_many,meList,meIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCall(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.callSNC.Call_THolder theCall) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCall", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,callName);
				_is = _invoke(_os);
				theCall.value = org.tmforum.mtnm.callSNC.Call_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCall", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getCall(callName,theCall);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void addConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.subnetworkConnection.SNCCreateData_T[] connectionsToAdd, boolean connectionRouteReArrangementAllowed, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder connectionList, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "addConnections", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,callName);
				org.tmforum.mtnm.subnetworkConnection.SNCCreateDataList_THelper.write(_os,connectionsToAdd);
				_os.write_boolean(connectionRouteReArrangementAllowed);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				connectionList.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				partialSNCs.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "addConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.addConnections(callName,connectionsToAdd,connectionRouteReArrangementAllowed,tpsToModify,connectionList,partialSNCs,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateAndDeleteSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateAndDeleteSNC", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				theSNC.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateAndDeleteSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deactivateAndDeleteSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFixedSubnetworkConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFixedSubnetworkConnections", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				sncList.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				sncIt.value = org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFixedSubnetworkConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFixedSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubordinateRAidsWithConnection(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] connection, java.lang.String routeType, org.tmforum.mtnm.multiLayerSubnetwork.RoutePerRouteType_THolder routePerRouteType) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubordinateRAidsWithConnection", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,connection);
				_os.write_string(routeType);
				_is = _invoke(_os);
				routePerRouteType.value = org.tmforum.mtnm.multiLayerSubnetwork.RoutePerRouteType_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubordinateRAidsWithConnection", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSubordinateRAidsWithConnection(subnetName,connection,routeType,routePerRouteType);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createModifiedSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.tmforum.mtnm.subnetworkConnection.SNCModifyData_T SNCModifyData, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createModifiedSNC", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				org.tmforum.mtnm.subnetworkConnection.SNCModifyData_THelper.write(_os,SNCModifyData);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.tmforum.mtnm.subnetworkConnection.ProtectionEffort_THelper.write(_os,tolerableImpactEffort);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				newSNC.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createModifiedSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.createModifiedSNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,emsFreedomLevel,tpsToModify,newSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyTPPool(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tPPoolName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] containedMembers, java.lang.String actionType, org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder modifiedTPPool) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyTPPool", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tPPoolName);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,containedMembers);
				_os.write_string(actionType);
				_is = _invoke(_os);
				modifiedTPPool.value = org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyTPPool", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyTPPool(tPPoolName,containedMembers,actionType,modifiedTPPool);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCallAndTopLevelConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, java.lang.String callId, org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCallAndTopLevelConnections", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,callName);
				_os.write_string(callId);
				_is = _invoke(_os);
				callAndTopLevelConnections.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnections_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCallAndTopLevelConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getCallAndTopLevelConnections(callName,callId,callAndTopLevelConnections);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubnetworkConnectionsWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubnetworkConnectionsWithTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				sncList.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				sncIt.value = org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubnetworkConnectionsWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSubnetworkConnectionsWithTP(tpName,connectionRateList,how_many,sncList,sncIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMultiLayerSubnetwork(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMultiLayerSubnetwork", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				_is = _invoke(_os);
				subnetwork.value = org.tmforum.mtnm.multiLayerSubnetwork.MultiLayerSubnetwork_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMultiLayerSubnetwork", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMultiLayerSubnetwork(subnetName,subnetwork);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void activateSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "activateSNC", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				org.tmforum.mtnm.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				theSNC.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.activateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTopologicalLink(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] topoLinkName, org.tmforum.mtnm.topologicalLink.TopologicalLink_THolder topoLink) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTopologicalLink", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,topoLinkName);
				_is = _invoke(_os);
				topoLink.value = org.tmforum.mtnm.topologicalLink.TopologicalLink_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTopologicalLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTopologicalLink(topoLinkName,topoLink);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setAdditionalInfo", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,objectName);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setAdditionalInfo", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setAdditionalInfo(objectName,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTPPools(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTPPools", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetworkName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tpList.value = org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.read(_is);
				tpIt.value = org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTPPools", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTPPools(subnetworkName,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteSNC(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteSNC", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				org.tmforum.mtnm.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteSNC(sncName,emsFreedomLevel);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFixedSubnetworkConnectionNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFixedSubnetworkConnectionNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFixedSubnetworkConnectionNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFixedSubnetworkConnectionNames(subnetName,connectionRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCallAndTopLevelConnectionsAndSNCs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] callName, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCallAndTopLevelConnectionsAndSNCs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,callName);
				_is = _invoke(_os);
				callAndTopLevelConnectionsAndSNCs.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCallAndTopLevelConnectionsAndSNCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getCallAndTopLevelConnectionsAndSNCs(callName,callAndTopLevelConnectionsAndSNCs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFixedSubnetworkConnectionsWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFixedSubnetworkConnectionsWithTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				sncList.value = org.tmforum.mtnm.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				sncIt.value = org.tmforum.mtnm.subnetworkConnection.SNCIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFixedSubnetworkConnectionsWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFixedSubnetworkConnectionsWithTP(tpName,connectionRateList,how_many,sncList,sncIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setIntendedRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setIntendedRoute", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setIntendedRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setIntendedRoute(sncName,routeId,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMLSNPPLinks(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMLSNPPLinks", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_boolean(sNPListRequested);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mLSNPPLinkList.value = org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.read(_is);
				mLSNPPLinkIt.value = org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMLSNPPLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithME(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] subnetName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallsAndTopLevelConnectionsAndSNCsWithME", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsAndSNCsList.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.read(_is);
				callAndTopLevelConnectionsAndSNCsIt.value = org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnectionsAndSNCsWithME", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallsAndTopLevelConnectionsAndSNCsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

}
