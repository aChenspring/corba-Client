package org.tmforum.mtnm.mLSNPP;

/**
 *	Generated from IDL interface "MLSNPPMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class MLSNPPMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.tmforum.mtnm.mLSNPP.MLSNPPMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(0));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(1));
		m_opsHash.put ( "setTNANameForMLSNPP", new java.lang.Integer(2));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(3));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(4));
		m_opsHash.put ( "getMLSNPP", new java.lang.Integer(5));
		m_opsHash.put ( "setOwner", new java.lang.Integer(6));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/mLSNPP/MLSNPPMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.tmforum.mtnm.mLSNPP.MLSNPPMgr_I _this()
	{
		return org.tmforum.mtnm.mLSNPP.MLSNPPMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.mLSNPP.MLSNPPMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.mLSNPP.MLSNPPMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // setUserLabel
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // setNativeEMSName
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setTNANameForMLSNPP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.mLSNPP.SNPTNAData_T[] _arg1=org.tmforum.mtnm.mLSNPP.SNPTNADataList_THelper.read(_input);
				org.tmforum.mtnm.mLSNPP.SNPPTNAPair_T[] _arg2=org.tmforum.mtnm.mLSNPP.SNPPTNAPairList_THelper.read(_input);
				java.lang.String _arg3=_input.read_string();
				java.lang.String _arg4=_input.read_string();
				org.tmforum.mtnm.mLSNPP.MultiLayerSNPP_THolder _arg5= new org.tmforum.mtnm.mLSNPP.MultiLayerSNPP_THolder();
				_out = handler.createReply();
				setTNANameForMLSNPP(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.tmforum.mtnm.mLSNPP.MultiLayerSNPP_THelper.write(_out,_arg5.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getCapabilities
			{
			try
			{
				org.tmforum.mtnm.common.CapabilityList_THolder _arg0= new org.tmforum.mtnm.common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				org.tmforum.mtnm.common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setAdditionalInfo
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getMLSNPP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.mLSNPP.MultiLayerSNPP_THolder _arg1= new org.tmforum.mtnm.mLSNPP.MultiLayerSNPP_THolder();
				_out = handler.createReply();
				getMLSNPP(_arg0,_arg1);
				org.tmforum.mtnm.mLSNPP.MultiLayerSNPP_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // setOwner
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setOwner(_arg0,_arg1);
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
