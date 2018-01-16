package org.tmforum.mtnm.managedElementManager;


/**
 *	Generated from IDL interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _ManagedElementMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.tmforum.mtnm.managedElementManager.ManagedElementMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.tmforum.mtnm.managedElementManager.ManagedElementMgr_IOperations.class;
	public void getAllCrossConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THolder ccList, org.tmforum.mtnm.subnetworkConnection.CCIterator_IHolder ccIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCrossConnections", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				ccList.value = org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THelper.read(_is);
				ccIt.value = org.tmforum.mtnm.subnetworkConnection.CCIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCrossConnections(managedElementName,connectionRateList,how_many,ccList,ccIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllActiveAlarms(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllActiveAlarms", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,meName);
				org.tmforum.mtnm.notifications.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				org.tmforum.mtnm.notifications.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				eventList.value = org.tmforum.mtnm.notifications.EventList_THelper.read(_is);
				eventIt.value = org.tmforum.mtnm.notifications.EventIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllActiveAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllActiveAlarms(meName,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllPTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllPTPNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,tpLayerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllPTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllPTPNames(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainedInUseTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getContainedInUseTPNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainedInUseTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getContainedInUseTPNames(tpName,layerRateList,how_many,nameList,nameIt);
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
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
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

	public void getAllFixedCrossConnections(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THolder ccList, org.tmforum.mtnm.subnetworkConnection.CCIterator_IHolder ccIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFixedCrossConnections", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				ccList.value = org.tmforum.mtnm.subnetworkConnection.CrossConnectList_THelper.read(_is);
				ccIt.value = org.tmforum.mtnm.subnetworkConnection.CCIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFixedCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFixedCrossConnections(managedElementName,connectionRateList,how_many,ccList,ccIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getGTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] gtpName, org.tmforum.mtnm.terminationPoint.GTP_THolder gtp) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getGTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,gtpName);
				_is = _invoke(_os);
				gtp.value = org.tmforum.mtnm.terminationPoint.GTP_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getGTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getGTP(gtpName,gtp);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFTPNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,tpLayerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFTPNames(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteGTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] gtpName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteGTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,gtpName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteGTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteGTP(gtpName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setGtpAlarmReportingOff(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] gtpName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setGtpAlarmReportingOff", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,gtpName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setGtpAlarmReportingOff", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.setGtpAlarmReportingOff(gtpName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainedCurrentTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getContainedCurrentTPNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainedCurrentTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getContainedCurrentTPNames(tpName,layerRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainingSubnetworkNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder subnetNames) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getContainingSubnetworkNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
				_is = _invoke(_os);
				subnetNames.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainingSubnetworkNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getContainingSubnetworkNames(managedElementName,subnetNames);
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
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
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

	public void createGTP(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] listOfTPs, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] initialCTPname, int numberOfCTPs, org.tmforum.mtnm.terminationPoint.GTPEffort_T gtpEffort, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalCreationInfo, org.tmforum.mtnm.terminationPoint.GTP_THolder newGTP) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createGTP", true);
				_os.write_string(userLabel);
				_os.write_boolean(forceUniqueness);
				_os.write_string(owner);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,listOfTPs);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,initialCTPname);
				_os.write_ulong(numberOfCTPs);
				org.tmforum.mtnm.terminationPoint.GTPEffort_THelper.write(_os,gtpEffort);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,additionalCreationInfo);
				_is = _invoke(_os);
				newGTP.value = org.tmforum.mtnm.terminationPoint.GTP_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createGTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.createGTP(userLabel,forceUniqueness,owner,listOfTPs,initialCTPname,numberOfCTPs,gtpEffort,additionalCreationInfo,newGTP);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllManagedElements(int how_many, org.tmforum.mtnm.managedElement.ManagedElementList_THolder meList, org.tmforum.mtnm.managedElement.ManagedElementIterator_IHolder meIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllManagedElements", true);
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
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllManagedElements(how_many,meList,meIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder tp) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				_is = _invoke(_os);
				tp.value = org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTP(tpName,tp);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainedPotentialTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getContainedPotentialTPNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainedPotentialTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getContainedPotentialTPNames(tpName,layerRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getPotentialFixedCCs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] inputTP, org.tmforum.mtnm.globaldefs.NVSList_THolder ContainingTP, org.tmforum.mtnm.globaldefs.NVSList_THolder potentialCCList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getPotentialFixedCCs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,inputTP);
				_is = _invoke(_os);
				ContainingTP.value = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_is);
				potentialCCList.value = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getPotentialFixedCCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getPotentialFixedCCs(inputTP,ContainingTP,potentialCCList);
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
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
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

	public void getContainedCurrentTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getContainedCurrentTPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainedCurrentTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getContainedCurrentTPs(tpName,layerRateList,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllPTPsWithoutFTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllPTPsWithoutFTPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllPTPsWithoutFTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllPTPsWithoutFTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllPTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllPTPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllPTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllPTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainingTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getContainingTPs", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainingTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getContainingTPs(tpName,tpList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllUnacknowledgedActiveAlarms(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllUnacknowledgedActiveAlarms", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,meName);
				org.tmforum.mtnm.notifications.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				org.tmforum.mtnm.notifications.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				eventList.value = org.tmforum.mtnm.notifications.EventList_THelper.read(_is);
				eventIt.value = org.tmforum.mtnm.notifications.EventIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllUnacknowledgedActiveAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllUnacknowledgedActiveAlarms(meName,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setGtpAlarmReportingOn(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] gtpName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setGtpAlarmReportingOn", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,gtpName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setGtpAlarmReportingOn", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.setGtpAlarmReportingOn(gtpName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setTPData(org.tmforum.mtnm.subnetworkConnection.TPData_T tpInfo, org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder modifiedTP) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setTPData", true);
				org.tmforum.mtnm.subnetworkConnection.TPData_THelper.write(_os,tpInfo);
				_is = _invoke(_os);
				modifiedTP.value = org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setTPData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.setTPData(tpInfo,modifiedTP);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainingGTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ctpName, org.tmforum.mtnm.terminationPoint.GTP_THolder gtp) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getContainingGTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,ctpName);
				_is = _invoke(_os);
				gtp.value = org.tmforum.mtnm.terminationPoint.GTP_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainingGTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getContainingGTP(ctpName,gtp);
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
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
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

	public void getManagedElement(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, org.tmforum.mtnm.managedElement.ManagedElement_THolder me) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getManagedElement", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
				_is = _invoke(_os);
				me.value = org.tmforum.mtnm.managedElement.ManagedElement_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getManagedElement", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getManagedElement(managedElementName,me);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFTPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void verifyTMDAssignment(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.terminationPoint.Directionality_T direction, org.omg.CORBA.StringHolder tmdAssignmentState, org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THolder transmissionParams, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalTPInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "verifyTMDAssignment", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.terminationPoint.Directionality_THelper.write(_os,direction);
				_is = _invoke(_os);
				tmdAssignmentState.value = _is.read_string();
				transmissionParams.value = org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THelper.read(_is);
				additionalTPInfo.value = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "verifyTMDAssignment", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.verifyTMDAssignment(tpName,direction,tmdAssignmentState,transmissionParams,additionalTPInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllPTPNamesWithoutFTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllPTPNamesWithoutFTPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,tpLayerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllPTPNamesWithoutFTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllPTPNamesWithoutFTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllManagedElementNames(int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllManagedElementNames", true);
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
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllManagedElementNames(how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllGTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, int how_many, org.tmforum.mtnm.terminationPoint.GTPlist_THolder gtpList, org.tmforum.mtnm.terminationPoint.GTPiterator_IHolder gtpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllGTPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,tpLayerRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				gtpList.value = org.tmforum.mtnm.terminationPoint.GTPlist_THelper.read(_is);
				gtpIt.value = org.tmforum.mtnm.terminationPoint.GTPiterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllGTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllGTPs(managedElementName,tpLayerRateList,how_many,gtpList,gtpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainedPotentialTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getContainedPotentialTPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainedPotentialTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getContainedPotentialTPs(tpName,layerRateList,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainedInUseTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getContainedInUseTPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainedInUseTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getContainedInUseTPs(tpName,layerRateList,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyGTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] gtpName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] tpNames, java.lang.String actionType, org.tmforum.mtnm.terminationPoint.GTP_THolder modifiedGTP) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyGTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,gtpName);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,tpNames);
				_os.write_string(actionType);
				_is = _invoke(_os);
				modifiedGTP.value = org.tmforum.mtnm.terminationPoint.GTP_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyGTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyGTP(gtpName,tpNames,actionType,modifiedGTP);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getContainingTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder tpNameList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getContainingTPNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				_is = _invoke(_os);
				tpNameList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getContainingTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getContainingTPNames(tpName,tpNameList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllGTPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllGTPNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,tpLayerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllGTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllGTPNames(managedElementName,tpLayerRateList,how_many,nameList,nameIt);
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
			ManagedElementMgr_IOperations _localServant = (ManagedElementMgr_IOperations)_so.servant;
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

}
