package org.omg.DsLogAdmin;

/**
 *	Generated from IDL interface "LogMgr"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class LogMgrPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.DsLogAdmin.LogMgrOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "list_logs", new java.lang.Integer(0));
		m_opsHash.put ( "list_logs_by_id", new java.lang.Integer(1));
		m_opsHash.put ( "find_log", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:omg.org/DsLogAdmin/LogMgr:1.0"};
	public org.omg.DsLogAdmin.LogMgr _this()
	{
		return org.omg.DsLogAdmin.LogMgrHelper.narrow(_this_object());
	}
	public org.omg.DsLogAdmin.LogMgr _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.DsLogAdmin.LogMgrHelper.narrow(_this_object(orb));
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
			case 0: // list_logs
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.LogListHelper.write(_out,list_logs());
				break;
			}
			case 1: // list_logs_by_id
			{
				_out = handler.createReply();
				org.omg.DsLogAdmin.LogIdListHelper.write(_out,list_logs_by_id());
				break;
			}
			case 2: // find_log
			{
				int _arg0=_input.read_ulong();
				_out = handler.createReply();
				org.omg.DsLogAdmin.LogHelper.write(_out,find_log(_arg0));
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
