package org.tmforum.mtnm.common;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "Common_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class Common_IPOATie
	extends Common_IPOA
{
	private Common_IOperations _delegate;

	private POA _poa;
	public Common_IPOATie(Common_IOperations delegate)
	{
		_delegate = delegate;
	}
	public Common_IPOATie(Common_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.common.Common_I _this()
	{
		return org.tmforum.mtnm.common.Common_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.common.Common_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.common.Common_IHelper.narrow(_this_object(orb));
	}
	public Common_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(Common_IOperations delegate)
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
	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
