package org.tmforum.mtnm.performance;


/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _PerformanceManagementMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.tmforum.mtnm.performance.PerformanceManagementMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/performance/PerformanceManagementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.tmforum.mtnm.performance.PerformanceManagementMgr_IOperations.class;
	public void enablePMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "enablePMData", true);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				_is = _invoke(_os);
				failedTPSelectList.value = org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "enablePMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.enablePMData(pmTPSelectList,failedTPSelectList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setTCATPParameter(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.performance.TCAParameters_THolder tcaParameters) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setTCATPParameter", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.performance.TCAParameters_THelper.write(_os,tcaParameters.value);
				_is = _invoke(_os);
				tcaParameters.value = org.tmforum.mtnm.performance.TCAParameters_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setTCATPParameter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.setTCATPParameter(tpName,tcaParameters);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setTCAParameterProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcaParameterProfileName, org.tmforum.mtnm.performance.TCAParameter_T[] listOfTCAParameter, int how_many, org.tmforum.mtnm.performance.TCAParameterProfile_THolder tcaParameterProfile, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder failedTPList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setTCAParameterProfile", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tcaParameterProfileName);
				org.tmforum.mtnm.performance.TCAParameterList_THelper.write(_os,listOfTCAParameter);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tcaParameterProfile.value = org.tmforum.mtnm.performance.TCAParameterProfile_THelper.read(_is);
				failedTPList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setTCAParameterProfile", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.setTCAParameterProfile(tcaParameterProfileName,listOfTCAParameter,how_many,tcaParameterProfile,failedTPList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setTCAParameterProfilePointer(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] addTCAParameterProfile, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] removeTCAParameterProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setTCAParameterProfilePointer", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,addTCAParameterProfile);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,removeTCAParameterProfile);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setTCAParameterProfilePointer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.setTCAParameterProfilePointer(tpName,addTCAParameterProfile,removeTCAParameterProfile);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMEPMcapabilities(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, short layerRate, org.tmforum.mtnm.performance.PMParameterList_THolder pmParameterList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMEPMcapabilities", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_short(layerRate);
				_is = _invoke(_os);
				pmParameterList.value = org.tmforum.mtnm.performance.PMParameterList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMEPMcapabilities", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMEPMcapabilities(meName,layerRate,pmParameterList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTCATPParameter(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, org.tmforum.mtnm.performance.TCAParameters_THolder tcaParameter) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTCATPParameter", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpName);
				_os.write_short(layerRate);
				_os.write_string(granularity);
				_is = _invoke(_os);
				tcaParameter.value = org.tmforum.mtnm.performance.TCAParameters_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTCATPParameter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTCATPParameter(tpName,layerRate,granularity,tcaParameter);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getProfileAssociatedTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] profileName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder tpNames, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getProfileAssociatedTPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,profileName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tpNames.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getProfileAssociatedTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getProfileAssociatedTPs(profileName,how_many,tpNames,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getHoldingTime(org.tmforum.mtnm.performance.HoldingTime_THolder holdingTime) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getHoldingTime", true);
				_is = _invoke(_os);
				holdingTime.value = org.tmforum.mtnm.performance.HoldingTime_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getHoldingTime", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getHoldingTime(holdingTime);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTCAParameterProfileNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder tcaParameterProfileNames, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTCAParameterProfileNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tcaParameterProfileNames.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTCAParameterProfileNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTCAParameterProfileNames(meName,how_many,tcaParameterProfileNames,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void enableTCA(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "enableTCA", true);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				_is = _invoke(_os);
				failedTPSelectList.value = org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "enableTCA", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.enableTCA(pmTPSelectList,failedTPSelectList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCurrentPMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, org.tmforum.mtnm.performance.PMDataList_THolder pmDataList, org.tmforum.mtnm.performance.PMDataIterator_IHolder pmIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCurrentPMData", true);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				org.tmforum.mtnm.performance.PMParameterNameList_THelper.write(_os,pmParameters);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				pmDataList.value = org.tmforum.mtnm.performance.PMDataList_THelper.read(_is);
				pmIt.value = org.tmforum.mtnm.performance.PMDataIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCurrentPMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCurrentPMData(pmTPSelectList,pmParameters,how_many,pmDataList,pmIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void clearPMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "clearPMData", true);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				_is = _invoke(_os);
				failedTPSelectList.value = org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "clearPMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.clearPMData(pmTPSelectList,failedTPSelectList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllPMPNames(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllPMPNames", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpOrMeName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllPMPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllPMPNames(tpOrMeName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void disablePMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "disablePMData", true);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				_is = _invoke(_os);
				failedTPSelectList.value = org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "disablePMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.disablePMData(pmTPSelectList,failedTPSelectList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getHistoryPMData", true);
				_os.write_string(destination);
				_os.write_string(userName);
				_os.write_string(password);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				org.tmforum.mtnm.performance.PMParameterNameList_THelper.write(_os,pmParameters);
				_os.write_string(startTime);
				_os.write_string(endTime);
				_os.write_boolean(forceUpload);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getHistoryPMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getHistoryPMData(destination,userName,password,pmTPSelectList,pmParameters,startTime,endTime,forceUpload);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void disableTCA(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, org.tmforum.mtnm.performance.PMTPSelectList_THolder failedTPSelectList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "disableTCA", true);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				_is = _invoke(_os);
				failedTPSelectList.value = org.tmforum.mtnm.performance.PMTPSelectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "disableTCA", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.disableTCA(pmTPSelectList,failedTPSelectList);
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
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
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
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
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
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
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
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
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

	public void getTPHistoryPMData(org.tmforum.mtnm.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, org.tmforum.mtnm.performance.PMDataList_THolder pmDataList, org.tmforum.mtnm.performance.PMDataIterator_IHolder pmIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTPHistoryPMData", true);
				org.tmforum.mtnm.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				org.tmforum.mtnm.performance.PMParameterNameList_THelper.write(_os,pmParameters);
				_os.write_string(startTime);
				_os.write_string(endTime);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				pmDataList.value = org.tmforum.mtnm.performance.PMDataList_THelper.read(_is);
				pmIt.value = org.tmforum.mtnm.performance.PMDataIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTPHistoryPMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTPHistoryPMData(pmTPSelectList,pmParameters,startTime,endTime,how_many,pmDataList,pmIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTCAParameterProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcaParameterProfileName, org.tmforum.mtnm.performance.TCAParameterProfile_THolder tcaParameterProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTCAParameterProfile", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tcaParameterProfileName);
				_is = _invoke(_os);
				tcaParameterProfile.value = org.tmforum.mtnm.performance.TCAParameterProfile_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTCAParameterProfile", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTCAParameterProfile(tcaParameterProfileName,tcaParameterProfile);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllPMPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.tmforum.mtnm.performance.PMPList_THolder pmpList, org.tmforum.mtnm.performance.PMPIterator_IHolder pmpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllPMPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tpOrMeName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				pmpList.value = org.tmforum.mtnm.performance.PMPList_THelper.read(_is);
				pmpIt.value = org.tmforum.mtnm.performance.PMPIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllPMPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllPMPs(tpOrMeName,how_many,pmpList,pmpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createTCAParameterProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, short layerRate, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInfo, org.tmforum.mtnm.performance.TCAParameter_T[] listOfTCAParameter, org.tmforum.mtnm.performance.TCAParameterProfile_THolder tcaParameterProfile) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createTCAParameterProfile", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
				_os.write_short(layerRate);
				_os.write_string(userLabel);
				_os.write_boolean(forceUniqueness);
				_os.write_string(owner);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,additionalInfo);
				org.tmforum.mtnm.performance.TCAParameterList_THelper.write(_os,listOfTCAParameter);
				_is = _invoke(_os);
				tcaParameterProfile.value = org.tmforum.mtnm.performance.TCAParameterProfile_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createTCAParameterProfile", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.createTCAParameterProfile(managedElementName,layerRate,userLabel,forceUniqueness,owner,additionalInfo,listOfTCAParameter,tcaParameterProfile);
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
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
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

	public void getAllTCAParameterProfiles(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] meName, int how_many, org.tmforum.mtnm.performance.TCAParameterProfileList_THolder tcaParameterProfileList, org.tmforum.mtnm.performance.TCAParameterProfileIterator_IHolder tcaParameterProfileIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTCAParameterProfiles", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tcaParameterProfileList.value = org.tmforum.mtnm.performance.TCAParameterProfileList_THelper.read(_is);
				tcaParameterProfileIt.value = org.tmforum.mtnm.performance.TCAParameterProfileIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTCAParameterProfiles", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTCAParameterProfiles(meName,how_many,tcaParameterProfileList,tcaParameterProfileIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteTCAParameterProfile(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tcaParameterProfileName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteTCAParameterProfile", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tcaParameterProfileName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteTCAParameterProfile", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteTCAParameterProfile(tcaParameterProfileName);
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
