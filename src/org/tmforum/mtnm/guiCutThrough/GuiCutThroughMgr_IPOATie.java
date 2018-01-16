package org.tmforum.mtnm.guiCutThrough;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "GuiCutThroughMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class GuiCutThroughMgr_IPOATie
	extends GuiCutThroughMgr_IPOA
{
	private GuiCutThroughMgr_IOperations _delegate;

	private POA _poa;
	public GuiCutThroughMgr_IPOATie(GuiCutThroughMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public GuiCutThroughMgr_IPOATie(GuiCutThroughMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.guiCutThrough.GuiCutThroughMgr_I _this()
	{
		return org.tmforum.mtnm.guiCutThrough.GuiCutThroughMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.guiCutThrough.GuiCutThroughMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.guiCutThrough.GuiCutThroughMgr_IHelper.narrow(_this_object(orb));
	}
	public GuiCutThroughMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(GuiCutThroughMgr_IOperations delegate)
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

	public void destroyGCT(java.lang.String displayAddress) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.destroyGCT(displayAddress);
	}

	public void getGCTProfileInfo(org.tmforum.mtnm.guiCutThrough.GCTProfileInfo_THolder gctProfileInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getGCTProfileInfo(gctProfileInfo);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void launchGCT(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String gctContext, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] userInfo, java.lang.String displayAddress, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] additionalInputInfo, org.omg.CORBA.BooleanHolder closingEnabled, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalOutputInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.launchGCT(objectName,gctContext,userInfo,displayAddress,additionalInputInfo,closingEnabled,additionalOutputInfo);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
