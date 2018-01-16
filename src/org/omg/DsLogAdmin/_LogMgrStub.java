package org.omg.DsLogAdmin;


/**
 *	Generated from IDL interface "LogMgr"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _LogMgrStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.DsLogAdmin.LogMgr
{
	private String[] ids = {"IDL:omg.org/DsLogAdmin/LogMgr:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.DsLogAdmin.LogMgrOperations.class;
	public org.omg.DsLogAdmin.Log[] list_logs()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "list_logs", true);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.Log[] _result = org.omg.DsLogAdmin.LogListHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "list_logs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LogMgrOperations _localServant = (LogMgrOperations)_so.servant;
			org.omg.DsLogAdmin.Log[] _result;			try
			{
			_result = _localServant.list_logs();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int[] list_logs_by_id()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "list_logs_by_id", true);
				_is = _invoke(_os);
				int[] _result = org.omg.DsLogAdmin.LogIdListHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "list_logs_by_id", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LogMgrOperations _localServant = (LogMgrOperations)_so.servant;
			int[] _result;			try
			{
			_result = _localServant.list_logs_by_id();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.DsLogAdmin.Log find_log(int id)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "find_log", true);
				_os.write_ulong(id);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.Log _result = org.omg.DsLogAdmin.LogHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "find_log", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			LogMgrOperations _localServant = (LogMgrOperations)_so.servant;
			org.omg.DsLogAdmin.Log _result;			try
			{
			_result = _localServant.find_log(id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

}
