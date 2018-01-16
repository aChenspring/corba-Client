package org.tmforum.mtnm.callSNC;

/**
 *	Generated from IDL interface "CallAndTopLevelConnectionsAndSNCsIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class CallAndTopLevelConnectionsAndSNCsIterator_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "next_n", new java.lang.Integer(0));
		m_opsHash.put ( "getLength", new java.lang.Integer(1));
		m_opsHash.put ( "destroy", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/callSNC/CallAndTopLevelConnectionsAndSNCsIterator_I:1.0"};
	public org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I _this()
	{
		return org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.narrow(_this_object(orb));
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
			case 0: // next_n
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder _arg1= new org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder();
				_out = handler.createReply();
				_out.write_boolean(next_n(_arg0,_arg1));
				org.tmforum.mtnm.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getLength
			{
			try
			{
				_out = handler.createReply();
				_out.write_ulong(getLength());
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // destroy
			{
			try
			{
				_out = handler.createReply();
				destroy();
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
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
