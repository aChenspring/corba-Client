package org.tmforum.mtnm.emsSession;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EmsSession_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EmsSession_IPOATie
	extends EmsSession_IPOA
{
	private EmsSession_IOperations _delegate;

	private POA _poa;
	public EmsSession_IPOATie(EmsSession_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EmsSession_IPOATie(EmsSession_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.emsSession.EmsSession_I _this()
	{
		return org.tmforum.mtnm.emsSession.EmsSession_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.emsSession.EmsSession_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.emsSession.EmsSession_IHelper.narrow(_this_object(orb));
	}
	public EmsSession_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EmsSession_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public org.tmforum.mtnm.session.Session_I associatedSession()
	{
		return _delegate.associatedSession();
	}

	public void ping()
	{
_delegate.ping();
	}

	public void getManager(java.lang.String managerName, org.tmforum.mtnm.common.Common_IHolder managerInterface) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getManager(managerName,managerInterface);
	}

	public void getSupportedManagers(org.tmforum.mtnm.emsSession.EmsSession_IPackage.managerNames_THolder supportedManagerList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getSupportedManagers(supportedManagerList);
	}

	public void endSession()
	{
_delegate.endSession();
	}

	public void getEventChannel(org.omg.CosNotifyChannelAdmin.EventChannelHolder eventChannel) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getEventChannel(eventChannel);
	}

}
