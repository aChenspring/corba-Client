package org.omg.DsNotifyLogAdmin;


/**
 *	Generated from IDL interface "NotifyLog"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _NotifyLogStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.DsNotifyLogAdmin.NotifyLog
{
	private String[] ids = {"IDL:omg.org/DsNotifyLogAdmin/NotifyLog:1.0","IDL:omg.org/DsLogAdmin/Log:1.0","IDL:omg.org/CosNotification/QoSAdmin:1.0","IDL:omg.org/CosEventChannelAdmin/EventChannel:1.0","IDL:omg.org/CosNotifyChannelAdmin/EventChannel:1.0","IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0","IDL:omg.org/DsEventLogAdmin/EventLog:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.DsNotifyLogAdmin.NotifyLogOperations.class;
	public long get_max_size()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_max_size", true);
				_is = _invoke(_os);
				long _result = _is.read_ulonglong();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_max_size", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			long _result;			try
			{
			_result = _localServant.get_max_size();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int id()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "id", true);
				_is = _invoke(_os);
				int _result = _is.read_ulong();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "id", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			int _result;			try
			{
			_result = _localServant.id();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosNotifyChannelAdmin.SupplierAdmin default_supplier_admin()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_default_supplier_admin",true);
				_is = _invoke(_os);
				return org.omg.CosNotifyChannelAdmin.SupplierAdminHelper.read(_is);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_default_supplier_admin", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosNotifyChannelAdmin.SupplierAdmin _result;
		try
		{
			_result = _localServant.default_supplier_admin();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.DsLogAdmin.AdministrativeState get_administrative_state()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_administrative_state", true);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.AdministrativeState _result = org.omg.DsLogAdmin.AdministrativeStateHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_administrative_state", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.DsLogAdmin.AdministrativeState _result;			try
			{
			_result = _localServant.get_administrative_state();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int set_records_attribute(java.lang.String grammar, java.lang.String c, org.omg.DsLogAdmin.NVPair[] attr_list) throws org.omg.DsLogAdmin.InvalidConstraint,org.omg.DsLogAdmin.InvalidGrammar,org.omg.DsLogAdmin.InvalidAttribute
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_records_attribute", true);
				_os.write_string(grammar);
				_os.write_string(c);
				org.omg.DsLogAdmin.NVListHelper.write(_os,attr_list);
				_is = _invoke(_os);
				int _result = _is.read_ulong();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidConstraint:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidConstraintHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidGrammar:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidGrammarHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidAttribute:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidAttributeHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_records_attribute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			int _result;			try
			{
			_result = _localServant.set_records_attribute(grammar,c,attr_list);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int delete_records_by_id(long[] ids)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "delete_records_by_id", true);
				org.omg.DsLogAdmin.RecordIdListHelper.write(_os,ids);
				_is = _invoke(_os);
				int _result = _is.read_ulong();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "delete_records_by_id", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			int _result;			try
			{
			_result = _localServant.delete_records_by_id(ids);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosNotifyFilter.Filter get_filter()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_filter", true);
				_is = _invoke(_os);
				org.omg.CosNotifyFilter.Filter _result = org.omg.CosNotifyFilter.FilterHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_filter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosNotifyFilter.Filter _result;			try
			{
			_result = _localServant.get_filter();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosNotifyChannelAdmin.EventChannelFactory MyFactory()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_MyFactory",true);
				_is = _invoke(_os);
				return org.omg.CosNotifyChannelAdmin.EventChannelFactoryHelper.read(_is);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_MyFactory", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosNotifyChannelAdmin.EventChannelFactory _result;
		try
		{
			_result = _localServant.MyFactory();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.CosNotifyFilter.FilterFactory default_filter_factory()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_default_filter_factory",true);
				_is = _invoke(_os);
				return org.omg.CosNotifyFilter.FilterFactoryHelper.read(_is);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_default_filter_factory", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosNotifyFilter.FilterFactory _result;
		try
		{
			_result = _localServant.default_filter_factory();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public int match(java.lang.String grammar, java.lang.String c) throws org.omg.DsLogAdmin.InvalidConstraint,org.omg.DsLogAdmin.InvalidGrammar
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "match", true);
				_os.write_string(grammar);
				_os.write_string(c);
				_is = _invoke(_os);
				int _result = _is.read_ulong();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidConstraint:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidConstraintHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidGrammar:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidGrammarHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "match", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			int _result;			try
			{
			_result = _localServant.match(grammar,c);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosEventChannelAdmin.SupplierAdmin for_suppliers()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "for_suppliers", true);
				_is = _invoke(_os);
				org.omg.CosEventChannelAdmin.SupplierAdmin _result = org.omg.CosEventChannelAdmin.SupplierAdminHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "for_suppliers", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosEventChannelAdmin.SupplierAdmin _result;			try
			{
			_result = _localServant.for_suppliers();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.DsLogAdmin.ForwardingState get_forwarding_state()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_forwarding_state", true);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.ForwardingState _result = org.omg.DsLogAdmin.ForwardingStateHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_forwarding_state", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.DsLogAdmin.ForwardingState _result;			try
			{
			_result = _localServant.get_forwarding_state();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.DsLogAdmin.TimeInterval get_interval()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_interval", true);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.TimeInterval _result = org.omg.DsLogAdmin.TimeIntervalHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_interval", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.DsLogAdmin.TimeInterval _result;			try
			{
			_result = _localServant.get_interval();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosNotifyChannelAdmin.ConsumerAdmin default_consumer_admin()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_default_consumer_admin",true);
				_is = _invoke(_os);
				return org.omg.CosNotifyChannelAdmin.ConsumerAdminHelper.read(_is);
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
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_default_consumer_admin", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosNotifyChannelAdmin.ConsumerAdmin _result;
		try
		{
			_result = _localServant.default_consumer_admin();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public void set_log_full_action(short action) throws org.omg.DsLogAdmin.InvalidLogFullAction
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_log_full_action", true);
				_os.write_ushort(action);
				_is = _invoke(_os);
				return;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_log_full_action", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_log_full_action(action);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void set_admin(org.omg.CosNotification.Property[] admin) throws org.omg.CosNotification.UnsupportedAdmin
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_admin", true);
				org.omg.CosNotification.PropertySeqHelper.write(_os,admin);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotification/UnsupportedAdmin:1.0"))
				{
					throw org.omg.CosNotification.UnsupportedAdminHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_admin", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_admin(admin);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void set_administrative_state(org.omg.DsLogAdmin.AdministrativeState state)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_administrative_state", true);
				org.omg.DsLogAdmin.AdministrativeStateHelper.write(_os,state);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_administrative_state", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_administrative_state(state);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.DsLogAdmin.LogMgr my_factory()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "my_factory", true);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.LogMgr _result = org.omg.DsLogAdmin.LogMgrHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "my_factory", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.DsLogAdmin.LogMgr _result;			try
			{
			_result = _localServant.my_factory();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.DsLogAdmin.NVPair[] get_record_attribute(long id) throws org.omg.DsLogAdmin.InvalidRecordId
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_record_attribute", true);
				_os.write_ulonglong(id);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.NVPair[] _result = org.omg.DsLogAdmin.NVListHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidRecordId:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidRecordIdHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_record_attribute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.DsLogAdmin.NVPair[] _result;			try
			{
			_result = _localServant.get_record_attribute(id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public long get_current_size()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_current_size", true);
				_is = _invoke(_os);
				long _result = _is.read_ulonglong();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_current_size", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			long _result;			try
			{
			_result = _localServant.get_current_size();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_qos(org.omg.CosNotification.Property[] qos) throws org.omg.CosNotification.UnsupportedQoS
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_qos", true);
				org.omg.CosNotification.PropertySeqHelper.write(_os,qos);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
				{
					throw org.omg.CosNotification.UnsupportedQoSHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_qos(qos);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CosNotifyChannelAdmin.ConsumerAdmin get_consumeradmin(int id) throws org.omg.CosNotifyChannelAdmin.AdminNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_consumeradmin", true);
				_os.write_long(id);
				_is = _invoke(_os);
				org.omg.CosNotifyChannelAdmin.ConsumerAdmin _result = org.omg.CosNotifyChannelAdmin.ConsumerAdminHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyChannelAdmin/AdminNotFound:1.0"))
				{
					throw org.omg.CosNotifyChannelAdmin.AdminNotFoundHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_consumeradmin", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosNotifyChannelAdmin.ConsumerAdmin _result;			try
			{
			_result = _localServant.get_consumeradmin(id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.DsLogAdmin.LogRecord[] query(java.lang.String grammar, java.lang.String c, org.omg.DsLogAdmin.IteratorHolder i) throws org.omg.DsLogAdmin.InvalidConstraint,org.omg.DsLogAdmin.InvalidGrammar
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "query", true);
				_os.write_string(grammar);
				_os.write_string(c);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.LogRecord[] _result = org.omg.DsLogAdmin.RecordListHelper.read(_is);
				i.value = org.omg.DsLogAdmin.IteratorHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidConstraint:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidConstraintHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidGrammar:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidGrammarHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "query", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.DsLogAdmin.LogRecord[] _result;			try
			{
			_result = _localServant.query(grammar,c,i);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_max_size(long size) throws org.omg.DsLogAdmin.InvalidParam
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_max_size", true);
				_os.write_ulonglong(size);
				_is = _invoke(_os);
				return;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_max_size", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_max_size(size);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void set_log_qos(short[] qos) throws org.omg.DsLogAdmin.UnsupportedQoS
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_log_qos", true);
				org.omg.DsLogAdmin.QoSListHelper.write(_os,qos);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/UnsupportedQoS:1.0"))
				{
					throw org.omg.DsLogAdmin.UnsupportedQoSHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_log_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_log_qos(qos);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CosEventChannelAdmin.ConsumerAdmin for_consumers()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "for_consumers", true);
				_is = _invoke(_os);
				org.omg.CosEventChannelAdmin.ConsumerAdmin _result = org.omg.CosEventChannelAdmin.ConsumerAdminHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "for_consumers", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosEventChannelAdmin.ConsumerAdmin _result;			try
			{
			_result = _localServant.for_consumers();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_week_mask(org.omg.DsLogAdmin.WeekMaskItem[] masks) throws org.omg.DsLogAdmin.InvalidMask,org.omg.DsLogAdmin.InvalidTimeInterval,org.omg.DsLogAdmin.InvalidTime
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_week_mask", true);
				org.omg.DsLogAdmin.WeekMaskHelper.write(_os,masks);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidMask:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidMaskHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidTimeInterval:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidTimeIntervalHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidTime:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidTimeHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_week_mask", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_week_mask(masks);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
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
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
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

	public void set_max_record_life(int life)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_max_record_life", true);
				_os.write_ulong(life);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_max_record_life", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_max_record_life(life);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.DsLogAdmin.LogRecord[] retrieve(long from_time, int how_many, org.omg.DsLogAdmin.IteratorHolder i)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "retrieve", true);
				_os.write_ulonglong(from_time);
				_os.write_long(how_many);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.LogRecord[] _result = org.omg.DsLogAdmin.RecordListHelper.read(_is);
				i.value = org.omg.DsLogAdmin.IteratorHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "retrieve", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.DsLogAdmin.LogRecord[] _result;			try
			{
			_result = _localServant.retrieve(from_time,how_many,i);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_record_attribute(long id, org.omg.DsLogAdmin.NVPair[] attr_list) throws org.omg.DsLogAdmin.InvalidAttribute,org.omg.DsLogAdmin.InvalidRecordId
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_record_attribute", true);
				_os.write_ulonglong(id);
				org.omg.DsLogAdmin.NVListHelper.write(_os,attr_list);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidAttribute:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidAttributeHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidRecordId:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidRecordIdHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_record_attribute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_record_attribute(id,attr_list);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void set_interval(org.omg.DsLogAdmin.TimeInterval interval) throws org.omg.DsLogAdmin.InvalidTimeInterval,org.omg.DsLogAdmin.InvalidTime
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_interval", true);
				org.omg.DsLogAdmin.TimeIntervalHelper.write(_os,interval);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidTimeInterval:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidTimeIntervalHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidTime:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidTimeHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_interval", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_interval(interval);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void validate_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "validate_qos", true);
				org.omg.CosNotification.PropertySeqHelper.write(_os,required_qos);
				_is = _invoke(_os);
				available_qos.value = org.omg.CosNotification.NamedPropertyRangeSeqHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
				{
					throw org.omg.CosNotification.UnsupportedQoSHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "validate_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.validate_qos(required_qos,available_qos);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void flush() throws org.omg.DsLogAdmin.UnsupportedQoS
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "flush", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/UnsupportedQoS:1.0"))
				{
					throw org.omg.DsLogAdmin.UnsupportedQoSHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "flush", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.flush();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void set_forwarding_state(org.omg.DsLogAdmin.ForwardingState state)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_forwarding_state", true);
				org.omg.DsLogAdmin.ForwardingStateHelper.write(_os,state);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_forwarding_state", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_forwarding_state(state);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public short[] get_capacity_alarm_thresholds()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_capacity_alarm_thresholds", true);
				_is = _invoke(_os);
				short[] _result = org.omg.DsLogAdmin.CapacityAlarmThresholdListHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_capacity_alarm_thresholds", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			short[] _result;			try
			{
			_result = _localServant.get_capacity_alarm_thresholds();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int delete_records(java.lang.String grammar, java.lang.String c) throws org.omg.DsLogAdmin.InvalidConstraint,org.omg.DsLogAdmin.InvalidGrammar
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "delete_records", true);
				_os.write_string(grammar);
				_os.write_string(c);
				_is = _invoke(_os);
				int _result = _is.read_ulong();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidConstraint:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidConstraintHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidGrammar:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidGrammarHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "delete_records", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			int _result;			try
			{
			_result = _localServant.delete_records(grammar,c);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosNotification.Property[] get_admin()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_admin", true);
				_is = _invoke(_os);
				org.omg.CosNotification.Property[] _result = org.omg.CosNotification.PropertySeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_admin", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosNotification.Property[] _result;			try
			{
			_result = _localServant.get_admin();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int[] get_all_supplieradmins()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_all_supplieradmins", true);
				_is = _invoke(_os);
				int[] _result = org.omg.CosNotifyChannelAdmin.AdminIDSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_all_supplieradmins", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			int[] _result;			try
			{
			_result = _localServant.get_all_supplieradmins();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.DsLogAdmin.Log copy(org.omg.CORBA.IntHolder id)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "copy", true);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.Log _result = org.omg.DsLogAdmin.LogHelper.read(_is);
				id.value = _is.read_ulong();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "copy", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.DsLogAdmin.Log _result;			try
			{
			_result = _localServant.copy(id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_filter(org.omg.CosNotifyFilter.Filter filter)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_filter", true);
				org.omg.CosNotifyFilter.FilterHelper.write(_os,filter);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_filter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_filter(filter);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.DsLogAdmin.AvailabilityStatus get_availability_status()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_availability_status", true);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.AvailabilityStatus _result = org.omg.DsLogAdmin.AvailabilityStatusHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_availability_status", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.DsLogAdmin.AvailabilityStatus _result;			try
			{
			_result = _localServant.get_availability_status();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int get_max_record_life()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_max_record_life", true);
				_is = _invoke(_os);
				int _result = _is.read_ulong();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_max_record_life", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			int _result;			try
			{
			_result = _localServant.get_max_record_life();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.DsLogAdmin.WeekMaskItem[] get_week_mask()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_week_mask", true);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.WeekMaskItem[] _result = org.omg.DsLogAdmin.WeekMaskHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_week_mask", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.DsLogAdmin.WeekMaskItem[] _result;			try
			{
			_result = _localServant.get_week_mask();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public short[] get_log_qos()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_log_qos", true);
				_is = _invoke(_os);
				short[] _result = org.omg.DsLogAdmin.QoSListHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_log_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			short[] _result;			try
			{
			_result = _localServant.get_log_qos();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void write_records(org.omg.CORBA.Any[] records) throws org.omg.DsLogAdmin.LogDisabled,org.omg.DsLogAdmin.LogOffDuty,org.omg.DsLogAdmin.LogLocked,org.omg.DsLogAdmin.LogFull
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "write_records", true);
				org.omg.DsLogAdmin.AnysHelper.write(_os,records);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/LogDisabled:1.0"))
				{
					throw org.omg.DsLogAdmin.LogDisabledHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/LogOffDuty:1.0"))
				{
					throw org.omg.DsLogAdmin.LogOffDutyHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/LogLocked:1.0"))
				{
					throw org.omg.DsLogAdmin.LogLockedHelper.read(_ax.getInputStream());
				}
				else if( _id.equals("IDL:omg.org/DsLogAdmin/LogFull:1.0"))
				{
					throw org.omg.DsLogAdmin.LogFullHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "write_records", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.write_records(records);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.DsLogAdmin.Log copy_with_id(int id) throws org.omg.DsLogAdmin.LogIdAlreadyExists
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "copy_with_id", true);
				_os.write_ulong(id);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.Log _result = org.omg.DsLogAdmin.LogHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "copy_with_id", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.DsLogAdmin.Log _result;			try
			{
			_result = _localServant.copy_with_id(id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosNotifyChannelAdmin.ConsumerAdmin new_for_consumers(org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "new_for_consumers", true);
				org.omg.CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.write(_os,op);
				_is = _invoke(_os);
				org.omg.CosNotifyChannelAdmin.ConsumerAdmin _result = org.omg.CosNotifyChannelAdmin.ConsumerAdminHelper.read(_is);
				id.value = _is.read_long();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "new_for_consumers", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosNotifyChannelAdmin.ConsumerAdmin _result;			try
			{
			_result = _localServant.new_for_consumers(op,id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosNotifyChannelAdmin.SupplierAdmin new_for_suppliers(org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "new_for_suppliers", true);
				org.omg.CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.write(_os,op);
				_is = _invoke(_os);
				org.omg.CosNotifyChannelAdmin.SupplierAdmin _result = org.omg.CosNotifyChannelAdmin.SupplierAdminHelper.read(_is);
				id.value = _is.read_long();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "new_for_suppliers", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosNotifyChannelAdmin.SupplierAdmin _result;			try
			{
			_result = _localServant.new_for_suppliers(op,id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int[] get_all_consumeradmins()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_all_consumeradmins", true);
				_is = _invoke(_os);
				int[] _result = org.omg.CosNotifyChannelAdmin.AdminIDSeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_all_consumeradmins", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			int[] _result;			try
			{
			_result = _localServant.get_all_consumeradmins();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.DsLogAdmin.OperationalState get_operational_state()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_operational_state", true);
				_is = _invoke(_os);
				org.omg.DsLogAdmin.OperationalState _result = org.omg.DsLogAdmin.OperationalStateHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_operational_state", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.DsLogAdmin.OperationalState _result;			try
			{
			_result = _localServant.get_operational_state();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosNotifyChannelAdmin.SupplierAdmin get_supplieradmin(int id) throws org.omg.CosNotifyChannelAdmin.AdminNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_supplieradmin", true);
				_os.write_long(id);
				_is = _invoke(_os);
				org.omg.CosNotifyChannelAdmin.SupplierAdmin _result = org.omg.CosNotifyChannelAdmin.SupplierAdminHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyChannelAdmin/AdminNotFound:1.0"))
				{
					throw org.omg.CosNotifyChannelAdmin.AdminNotFoundHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_supplieradmin", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosNotifyChannelAdmin.SupplierAdmin _result;			try
			{
			_result = _localServant.get_supplieradmin(id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosNotification.Property[] get_qos()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_qos", true);
				_is = _invoke(_os);
				org.omg.CosNotification.Property[] _result = org.omg.CosNotification.PropertySeqHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			org.omg.CosNotification.Property[] _result;			try
			{
			_result = _localServant.get_qos();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_capacity_alarm_thresholds(short[] threshs) throws org.omg.DsLogAdmin.InvalidThreshold
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_capacity_alarm_thresholds", true);
				org.omg.DsLogAdmin.CapacityAlarmThresholdListHelper.write(_os,threshs);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/DsLogAdmin/InvalidThreshold:1.0"))
				{
					throw org.omg.DsLogAdmin.InvalidThresholdHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_capacity_alarm_thresholds", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			try
			{
			_localServant.set_capacity_alarm_thresholds(threshs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public long get_n_records()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_n_records", true);
				_is = _invoke(_os);
				long _result = _is.read_ulonglong();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_n_records", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			long _result;			try
			{
			_result = _localServant.get_n_records();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public short get_log_full_action()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_log_full_action", true);
				_is = _invoke(_os);
				short _result = _is.read_ushort();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_log_full_action", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			NotifyLogOperations _localServant = (NotifyLogOperations)_so.servant;
			short _result;			try
			{
			_result = _localServant.get_log_full_action();
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
