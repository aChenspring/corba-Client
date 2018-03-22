package org.tmforum.mtnm.KYLAND_alarmMgr;


import org.tmforum.mtnm.globaldefs.NVSList_THolder;
import org.tmforum.mtnm.globaldefs.NameAndStringValue_T;
import org.tmforum.mtnm.globaldefs.ProcessingFailureException;

/**
 *	Generated from IDL interface "KYLAND_alarmMgr_I"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class _KYLAND_alarmMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.tmforum.mtnm.KYLAND_alarmMgr.KYLAND_alarmMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/KYLAND_alarmMgr/KYLAND_alarmMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.tmforum.mtnm.KYLAND_alarmMgr.KYLAND_alarmMgr_IOperations.class;
	@Override
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
			KYLAND_alarmMgr_IOperations _localServant = (KYLAND_alarmMgr_IOperations)_so.servant;
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

	@Override
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
			KYLAND_alarmMgr_IOperations _localServant = (KYLAND_alarmMgr_IOperations)_so.servant;
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

	@Override
	public void getAllHisAlarms(java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int[] excludeTypeList, int how_many, java.lang.String startTime, java.lang.String endTime, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllHisAlarms", true);
				org.tmforum.mtnm.notifications.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				org.tmforum.mtnm.notifications.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				org.tmforum.mtnm.KYLAND_alarmMgr.AlarmTypeList_THelper.write(_os,excludeTypeList);
				_os.write_ulong(how_many);
				_os.write_string(startTime);
				_os.write_string(endTime);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllHisAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			KYLAND_alarmMgr_IOperations _localServant = (KYLAND_alarmMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllHisAlarms(excludeProbCauseList,excludeSeverityList,excludeTypeList,how_many,startTime,endTime,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	@Override
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
			KYLAND_alarmMgr_IOperations _localServant = (KYLAND_alarmMgr_IOperations)_so.servant;
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

	@Override
	public void setAdditionalInfo(NameAndStringValue_T[] objectName, NVSList_THolder additionalInfo) throws ProcessingFailureException {

	}

	@Override
	public void getMEHisAlarms(java.lang.String[] excludeProbCauseList, org.tmforum.mtnm.notifications.PerceivedSeverity_T[] excludeSeverityList, int[] excludeTypeList, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, java.lang.String startTime, java.lang.String endTime, org.tmforum.mtnm.notifications.EventList_THolder eventList, org.tmforum.mtnm.notifications.EventIterator_IHolder eventIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMEHisAlarms", true);
				org.tmforum.mtnm.notifications.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				org.tmforum.mtnm.notifications.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				org.tmforum.mtnm.KYLAND_alarmMgr.AlarmTypeList_THelper.write(_os,excludeTypeList);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,managedElementName);
				_os.write_ulong(how_many);
				_os.write_string(startTime);
				_os.write_string(endTime);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMEHisAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			KYLAND_alarmMgr_IOperations _localServant = (KYLAND_alarmMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMEHisAlarms(excludeProbCauseList,excludeSeverityList,excludeTypeList,managedElementName,how_many,startTime,endTime,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	@Override
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
			KYLAND_alarmMgr_IOperations _localServant = (KYLAND_alarmMgr_IOperations)_so.servant;
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

}
