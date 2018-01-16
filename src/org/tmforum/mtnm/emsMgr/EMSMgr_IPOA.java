package org.tmforum.mtnm.emsMgr;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class EMSMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.tmforum.mtnm.emsMgr.EMSMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getAllMLSNPPsWithTP", new java.lang.Integer(0));
		m_opsHash.put ( "unacknowledgeAlarms", new java.lang.Integer(1));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(2));
		m_opsHash.put ( "getAllASAPs", new java.lang.Integer(3));
		m_opsHash.put ( "getAllEMSSystemActiveAlarms", new java.lang.Integer(4));
		m_opsHash.put ( "getAllMLSNPPsWithTNA", new java.lang.Integer(5));
		m_opsHash.put ( "createTopologicalLink", new java.lang.Integer(6));
		m_opsHash.put ( "acknowledgeAlarms", new java.lang.Integer(7));
		m_opsHash.put ( "getASAPbyResource", new java.lang.Integer(8));
		m_opsHash.put ( "getAllASAPNames", new java.lang.Integer(9));
		m_opsHash.put ( "getAllEMSSystemUnacknowledgedActiveAlarms", new java.lang.Integer(10));
		m_opsHash.put ( "deassignASAP", new java.lang.Integer(11));
		m_opsHash.put ( "getAllMLSNPPLinksWithMLSNs", new java.lang.Integer(12));
		m_opsHash.put ( "assignASAP", new java.lang.Integer(13));
		m_opsHash.put ( "setOwner", new java.lang.Integer(14));
		m_opsHash.put ( "getAllMLSNPPs", new java.lang.Integer(15));
		m_opsHash.put ( "deleteTopologicalLink", new java.lang.Integer(16));
		m_opsHash.put ( "getASAPAssociatedResourceNames", new java.lang.Integer(17));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(18));
		m_opsHash.put ( "getAllTopLevelSubnetworks", new java.lang.Integer(19));
		m_opsHash.put ( "getAllTopLevelTopologicalLinkNames", new java.lang.Integer(20));
		m_opsHash.put ( "deleteASAP", new java.lang.Integer(21));
		m_opsHash.put ( "getAllMLRAs", new java.lang.Integer(22));
		m_opsHash.put ( "getAllEMSAndMEUnacknowledgedActiveAlarms", new java.lang.Integer(23));
		m_opsHash.put ( "getAllMLSNPPLinksWithTNAs", new java.lang.Integer(24));
		m_opsHash.put ( "getAllTopLevelTopologicalLinks", new java.lang.Integer(25));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(26));
		m_opsHash.put ( "modifyASAP", new java.lang.Integer(27));
		m_opsHash.put ( "getAllTopLevelSubnetworkNames", new java.lang.Integer(28));
		m_opsHash.put ( "getEMS", new java.lang.Integer(29));
		m_opsHash.put ( "getASAP", new java.lang.Integer(30));
		m_opsHash.put ( "createASAP", new java.lang.Integer(31));
		m_opsHash.put ( "getAllEMSAndMEActiveAlarms", new java.lang.Integer(32));
		m_opsHash.put ( "getTopLevelTopologicalLink", new java.lang.Integer(33));
		m_opsHash.put ( "getAllMLSNPPLinksWithTP", new java.lang.Integer(34));
		m_opsHash.put ( "getAllMLSNPPLinks", new java.lang.Integer(35));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(36));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.tmforum.mtnm.emsMgr.EMSMgr_I _this()
	{
		return org.tmforum.mtnm.emsMgr.EMSMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.emsMgr.EMSMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getAllMLSNPPsWithTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder _arg3= new org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder();
				org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder _arg4= new org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPsWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.mLSNPP.MLSNPPList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // unacknowledgeAlarms
			{
			try
			{
				org.tmforum.mtnm.notifications.AlarmOrTCAIdentifier_T[] _arg0=org.tmforum.mtnm.notifications.AlarmAndTCAIDList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg1=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.notifications.AlarmAndTCAIDList_THolder _arg2= new org.tmforum.mtnm.notifications.AlarmAndTCAIDList_THolder();
				_out = handler.createReply();
				unacknowledgeAlarms(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.notifications.AlarmAndTCAIDList_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setNativeEMSName
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
			case 3: // getAllASAPs
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.tmforum.mtnm.aSAP.ASAPList_THolder _arg1= new org.tmforum.mtnm.aSAP.ASAPList_THolder();
				org.tmforum.mtnm.aSAP.ASAPIterator_IHolder _arg2= new org.tmforum.mtnm.aSAP.ASAPIterator_IHolder();
				_out = handler.createReply();
				getAllASAPs(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.aSAP.ASAPList_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.aSAP.ASAPIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getAllEMSSystemActiveAlarms
			{
			try
			{
				org.tmforum.mtnm.notifications.PerceivedSeverity_T[] _arg0=org.tmforum.mtnm.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.notifications.EventList_THolder _arg2= new org.tmforum.mtnm.notifications.EventList_THolder();
				org.tmforum.mtnm.notifications.EventIterator_IHolder _arg3= new org.tmforum.mtnm.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllEMSSystemActiveAlarms(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.notifications.EventList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.notifications.EventIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getAllMLSNPPsWithTNA
			{
			try
			{
				java.lang.String[] _arg0=org.tmforum.mtnm.mLSNPP.TNAList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder _arg3= new org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder();
				org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder _arg4= new org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPsWithTNA(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.mLSNPP.MLSNPPList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // createTopologicalLink
			{
			try
			{
				org.tmforum.mtnm.topologicalLink.TLCreateData_T _arg0=org.tmforum.mtnm.topologicalLink.TLCreateData_THelper.read(_input);
				org.tmforum.mtnm.topologicalLink.TopologicalLink_THolder _arg1= new org.tmforum.mtnm.topologicalLink.TopologicalLink_THolder();
				_out = handler.createReply();
				createTopologicalLink(_arg0,_arg1);
				org.tmforum.mtnm.topologicalLink.TopologicalLink_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // acknowledgeAlarms
			{
			try
			{
				org.tmforum.mtnm.notifications.AlarmOrTCAIdentifier_T[] _arg0=org.tmforum.mtnm.notifications.AlarmAndTCAIDList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg1=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.notifications.AlarmAndTCAIDList_THolder _arg2= new org.tmforum.mtnm.notifications.AlarmAndTCAIDList_THolder();
				_out = handler.createReply();
				acknowledgeAlarms(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.notifications.AlarmAndTCAIDList_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getASAPbyResource
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.aSAP.ASAPList_THolder _arg3= new org.tmforum.mtnm.aSAP.ASAPList_THolder();
				org.tmforum.mtnm.aSAP.ASAPIterator_IHolder _arg4= new org.tmforum.mtnm.aSAP.ASAPIterator_IHolder();
				_out = handler.createReply();
				getASAPbyResource(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.aSAP.ASAPList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.aSAP.ASAPIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAllASAPNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllASAPNames(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getAllEMSSystemUnacknowledgedActiveAlarms
			{
			try
			{
				org.tmforum.mtnm.notifications.PerceivedSeverity_T[] _arg0=org.tmforum.mtnm.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.notifications.EventList_THolder _arg2= new org.tmforum.mtnm.notifications.EventList_THolder();
				org.tmforum.mtnm.notifications.EventIterator_IHolder _arg3= new org.tmforum.mtnm.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllEMSSystemUnacknowledgedActiveAlarms(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.notifications.EventList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.notifications.EventIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // deassignASAP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_arg2._read (_input);
				_out = handler.createReply();
				deassignASAP(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllMLSNPPLinksWithMLSNs
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] _arg0=org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder _arg3= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPLinksWithMLSNs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // assignASAP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg1=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				short _arg2=_input.read_short();
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg3= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_arg3._read (_input);
				_out = handler.createReply();
				assignASAP(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // setOwner
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
			case 15: // getAllMLSNPPs
			{
			try
			{
				boolean _arg0=_input.read_boolean();
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder _arg2= new org.tmforum.mtnm.mLSNPP.MLSNPPList_THolder();
				org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder _arg3= new org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPs(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.mLSNPP.MLSNPPList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.mLSNPP.MLSNPPIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // deleteTopologicalLink
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteTopologicalLink(_arg0);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getASAPAssociatedResourceNames
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getASAPAssociatedResourceNames(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // setAdditionalInfo
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
			case 19: // getAllTopLevelSubnetworks
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THolder _arg1= new org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THolder();
				org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHolder _arg2= new org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelSubnetworks(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getAllTopLevelTopologicalLinkNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinkNames(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // deleteASAP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				deleteASAP(_arg0,_arg1);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllMLRAs
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THolder _arg1= new org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THolder();
				org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHolder _arg2= new org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHolder();
				_out = handler.createReply();
				getAllMLRAs(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkList_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.multiLayerSubnetwork.SubnetworkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getAllEMSAndMEUnacknowledgedActiveAlarms
			{
			try
			{
				java.lang.String[] _arg0=org.tmforum.mtnm.notifications.ProbableCauseList_THelper.read(_input);
				org.tmforum.mtnm.notifications.PerceivedSeverity_T[] _arg1=org.tmforum.mtnm.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.notifications.EventList_THolder _arg3= new org.tmforum.mtnm.notifications.EventList_THolder();
				org.tmforum.mtnm.notifications.EventIterator_IHolder _arg4= new org.tmforum.mtnm.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllEMSAndMEUnacknowledgedActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.notifications.EventList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.notifications.EventIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getAllMLSNPPLinksWithTNAs
			{
			try
			{
				java.lang.String[] _arg0=org.tmforum.mtnm.mLSNPP.TNAList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder _arg3= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPLinksWithTNAs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getAllTopLevelTopologicalLinks
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder _arg1= new org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder();
				org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHolder _arg2= new org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinks(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // setUserLabel
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
			case 27: // modifyASAP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.aSAP.ASAPCreateModifyData_T _arg1=org.tmforum.mtnm.aSAP.ASAPCreateModifyData_THelper.read(_input);
				org.tmforum.mtnm.aSAP.ASAP_THolder _arg2= new org.tmforum.mtnm.aSAP.ASAP_THolder();
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg3= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				modifyASAP(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.aSAP.ASAP_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getAllTopLevelSubnetworkNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder _arg1= new org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder();
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelSubnetworkNames(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // getEMS
			{
			try
			{
				org.tmforum.mtnm.emsMgr.EMS_THolder _arg0= new org.tmforum.mtnm.emsMgr.EMS_THolder();
				_out = handler.createReply();
				getEMS(_arg0);
				org.tmforum.mtnm.emsMgr.EMS_THelper.write(_out,_arg0.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getASAP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.aSAP.ASAP_THolder _arg1= new org.tmforum.mtnm.aSAP.ASAP_THolder();
				_out = handler.createReply();
				getASAP(_arg0,_arg1);
				org.tmforum.mtnm.aSAP.ASAP_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // createASAP
			{
			try
			{
				org.tmforum.mtnm.aSAP.ASAPCreateModifyData_T _arg0=org.tmforum.mtnm.aSAP.ASAPCreateModifyData_THelper.read(_input);
				org.tmforum.mtnm.aSAP.ASAP_THolder _arg1= new org.tmforum.mtnm.aSAP.ASAP_THolder();
				org.tmforum.mtnm.globaldefs.NVSList_THolder _arg2= new org.tmforum.mtnm.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				createASAP(_arg0,_arg1,_arg2);
				org.tmforum.mtnm.aSAP.ASAP_THelper.write(_out,_arg1.value);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_out,_arg2.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // getAllEMSAndMEActiveAlarms
			{
			try
			{
				java.lang.String[] _arg0=org.tmforum.mtnm.notifications.ProbableCauseList_THelper.read(_input);
				org.tmforum.mtnm.notifications.PerceivedSeverity_T[] _arg1=org.tmforum.mtnm.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.notifications.EventList_THolder _arg3= new org.tmforum.mtnm.notifications.EventList_THolder();
				org.tmforum.mtnm.notifications.EventIterator_IHolder _arg4= new org.tmforum.mtnm.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllEMSAndMEActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.notifications.EventList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.notifications.EventIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getTopLevelTopologicalLink
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				org.tmforum.mtnm.topologicalLink.TopologicalLink_THolder _arg1= new org.tmforum.mtnm.topologicalLink.TopologicalLink_THolder();
				_out = handler.createReply();
				getTopLevelTopologicalLink(_arg0,_arg1);
				org.tmforum.mtnm.topologicalLink.TopologicalLink_THelper.write(_out,_arg1.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getAllMLSNPPLinksWithTP
			{
			try
			{
				org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] _arg0=org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder _arg3= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPLinksWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // getAllMLSNPPLinks
			{
			try
			{
				boolean _arg0=_input.read_boolean();
				int _arg1=_input.read_ulong();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder _arg2= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THolder();
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg3= new org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPLinks(_arg0,_arg1,_arg2,_arg3);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg2.value);
				org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.tmforum.mtnm.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // getCapabilities
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
