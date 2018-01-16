package org.omg.DsLogAdmin;

/**
 *	Generated from IDL interface "Iterator"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class IteratorPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.DsLogAdmin.IteratorOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "get", new java.lang.Integer(0));
		m_opsHash.put ( "destroy", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:omg.org/DsLogAdmin/Iterator:1.0"};
	public org.omg.DsLogAdmin.Iterator _this()
	{
		return org.omg.DsLogAdmin.IteratorHelper.narrow(_this_object());
	}
	public org.omg.DsLogAdmin.Iterator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DsLogAdmin.IteratorHelper.narrow(_this_object(orb));
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
			case 0: // get
			{
			try
			{
				int _arg0=_input.read_ulong();
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				org.omg.DsLogAdmin.RecordListHelper.write(_out,get(_arg0,_arg1));
			}
			catch(org.omg.DsLogAdmin.InvalidParam _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.DsLogAdmin.InvalidParamHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // destroy
			{
				_out = handler.createReply();
				destroy();
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
