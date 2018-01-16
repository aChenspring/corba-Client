package org.omg.DsLogAdmin;


/**
 *	Generated from IDL interface "BasicLogFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _BasicLogFactoryStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.DsLogAdmin.BasicLogFactory
{
	private String[] ids = {"IDL:omg.org/DsLogAdmin/BasicLogFactory:1.0","IDL:omg.org/DsLogAdmin/LogMgr:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.DsLogAdmin.BasicLogFactoryOperations.class;
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
			BasicLogFactoryOperations _localServant = (BasicLogFactoryOperations)_so.servant;
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

	public org.omg.DsLogAdmin.BasicLog create(short full_action, long max_size, org.omg.CORBA.IntHolder id) throws org.omg.DsLogAdmin.InvalidLogFullAction
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "create", true);
				_os.write_ushort(full_action);
				_os.write_ulonglong(max_size);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.BasicLog _result = org.omg.DsLogAdmin.BasicLogHelper.read(_is);
				id.value = _is.read_ulong();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidLogFullAction:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidLogFullActionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BasicLogFactoryOperations _localServant = (BasicLogFactoryOperations)_so.servant;
			org.omg.DsLogAdmin.BasicLog _result;			try
			{
			_result = _localServant.create(full_action,max_size,id);
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
			BasicLogFactoryOperations _localServant = (BasicLogFactoryOperations)_so.servant;
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

	public org.omg.DsLogAdmin.BasicLog create_with_id(int id, short full_action, long max_size) throws org.omg.DsLogAdmin.LogIdAlreadyExists,org.omg.DsLogAdmin.InvalidLogFullAction
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "create_with_id", true);
				_os.write_ulong(id);
				_os.write_ushort(full_action);
				_os.write_ulonglong(max_size);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.BasicLog _result = org.omg.DsLogAdmin.BasicLogHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/LogIdAlreadyExists:1.0"))
				{
					throw org.omg.DsLogAdmin.LogIdAlreadyExistsHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidLogFullAction:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidLogFullActionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_with_id", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			BasicLogFactoryOperations _localServant = (BasicLogFactoryOperations)_so.servant;
			org.omg.DsLogAdmin.BasicLog _result;			try
			{
			_result = _localServant.create_with_id(id,full_action,max_size);
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
			BasicLogFactoryOperations _localServant = (BasicLogFactoryOperations)_so.servant;
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
