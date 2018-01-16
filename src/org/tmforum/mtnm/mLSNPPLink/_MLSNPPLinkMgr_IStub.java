package org.tmforum.mtnm.mLSNPPLink;


/**
 *	Generated from IDL interface "MLSNPPLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _MLSNPPLinkMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/mLSNPPLink/MLSNPPLinkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkMgr_IOperations.class;
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
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
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
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
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

	public void enableSignalling(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "enableSignalling", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mLSNPPLinkName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "enableSignalling", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.enableSignalling(mLSNPPLinkName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setSignallingProtocolAndParameters(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingProtocol, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] signallingParameters) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setSignallingProtocolAndParameters", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mLSNPPLinkName);
				_os.write_string(signallingProtocol);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,signallingParameters);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setSignallingProtocolAndParameters", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setSignallingProtocolAndParameters(mLSNPPLinkName,signallingProtocol,signallingParameters);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAvailableCapacity(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, short layerRate, org.tmforum.mtnm.mLSNPPLink.AvailableCapacity_THolder availableCapacity) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAvailableCapacity", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mLSNPPLinkName);
				_os.write_short(layerRate);
				_is = _invoke(_os);
				availableCapacity.value = org.tmforum.mtnm.mLSNPPLink.AvailableCapacity_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAvailableCapacity", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAvailableCapacity(mLSNPPLinkName,layerRate,availableCapacity);
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
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
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
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
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

	public void setTNANameForMLSNPPLinkEnd(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, org.tmforum.mtnm.mLSNPP.SNPTNAData_T[] sNPTNADataList, org.tmforum.mtnm.mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String aTNAName, java.lang.String zTNAName, java.lang.String aTNAGroupName, java.lang.String zTNAGroupName, org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THolder mLSNPPLink) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setTNANameForMLSNPPLinkEnd", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mLSNPPLinkName);
				org.tmforum.mtnm.mLSNPP.SNPTNADataList_THelper.write(_os,sNPTNADataList);
				org.tmforum.mtnm.mLSNPP.SNPPTNAPairList_THelper.write(_os,sNPPTNAPairList);
				_os.write_string(aTNAName);
				_os.write_string(zTNAName);
				_os.write_string(aTNAGroupName);
				_os.write_string(zTNAGroupName);
				_is = _invoke(_os);
				mLSNPPLink.value = org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setTNANameForMLSNPPLinkEnd", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setTNANameForMLSNPPLinkEnd(mLSNPPLinkName,sNPTNADataList,sNPPTNAPairList,aTNAName,zTNAName,aTNAGroupName,zTNAGroupName,mLSNPPLink);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void disableSignalling(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "disableSignalling", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mLSNPPLinkName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "disableSignalling", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.disableSignalling(mLSNPPLinkName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deassignSignallingController(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deassignSignallingController", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mLSNPPLinkName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deassignSignallingController", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deassignSignallingController(mLSNPPLinkName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void assignSignallingController(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingControllerIdentifier) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "assignSignallingController", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mLSNPPLinkName);
				_os.write_string(signallingControllerIdentifier);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "assignSignallingController", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.assignSignallingController(mLSNPPLinkName,signallingControllerIdentifier);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifySignallingProtocolParameters(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, org.tmforum.mtnm.globaldefs.NVSList_THolder signallingParameters) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifySignallingProtocolParameters", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mLSNPPLinkName);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,signallingParameters.value);
				_is = _invoke(_os);
				signallingParameters.value = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifySignallingProtocolParameters", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifySignallingProtocolParameters(mLSNPPLinkName,signallingParameters);
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
			MLSNPPLinkMgr_IOperations _localServant = (MLSNPPLinkMgr_IOperations)_so.servant;
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

}
