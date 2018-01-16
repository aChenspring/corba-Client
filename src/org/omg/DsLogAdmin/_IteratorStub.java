package org.omg.DsLogAdmin;


/**
 *	Generated from IDL interface "Iterator"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _IteratorStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.DsLogAdmin.Iterator
{
	private String[] ids = {"IDL:omg.org/DsLogAdmin/Iterator:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.DsLogAdmin.IteratorOperations.class;
	public org.omg.DsLogAdmin.LogRecord[] get(int position, int how_many) throws org.omg.DsLogAdmin.InvalidParam
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get", true);
				_os.write_ulong(position);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.LogRecord[] _result = org.omg.DsLogAdmin.RecordListHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidParam:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidParamHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IteratorOperations _localServant = (IteratorOperations)_so.servant;
			org.omg.DsLogAdmin.LogRecord[] _result;			try
			{
			_result = _localServant.get(position,how_many);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void destroy()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "destroy", true);
				_is = _invoke(_os);
				return;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "destroy", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			IteratorOperations _localServant = (IteratorOperations)_so.servant;
			try
			{
			_localServant.destroy();
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
