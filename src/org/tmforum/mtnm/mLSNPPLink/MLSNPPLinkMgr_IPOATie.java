package org.tmforum.mtnm.mLSNPPLink;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MLSNPPLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class MLSNPPLinkMgr_IPOATie
	extends MLSNPPLinkMgr_IPOA
{
	private MLSNPPLinkMgr_IOperations _delegate;

	private POA _poa;
	public MLSNPPLinkMgr_IPOATie(MLSNPPLinkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MLSNPPLinkMgr_IPOATie(MLSNPPLinkMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkMgr_I _this()
	{
		return org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.mLSNPPLink.MLSNPPLinkMgr_IHelper.narrow(_this_object(orb));
	}
	public MLSNPPLinkMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MLSNPPLinkMgr_IOperations delegate)
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
	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void enableSignalling(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.enableSignalling(mLSNPPLinkName);
	}

	public void setSignallingProtocolAndParameters(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingProtocol, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] signallingParameters) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setSignallingProtocolAndParameters(mLSNPPLinkName,signallingProtocol,signallingParameters);
	}

	public void getAvailableCapacity(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, short layerRate, org.tmforum.mtnm.mLSNPPLink.AvailableCapacity_THolder availableCapacity) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAvailableCapacity(mLSNPPLinkName,layerRate,availableCapacity);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setTNANameForMLSNPPLinkEnd(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, org.tmforum.mtnm.mLSNPP.SNPTNAData_T[] sNPTNADataList, org.tmforum.mtnm.mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String aTNAName, java.lang.String zTNAName, java.lang.String aTNAGroupName, java.lang.String zTNAGroupName, org.tmforum.mtnm.mLSNPPLink.MultiLayerSNPPLink_THolder mLSNPPLink) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setTNANameForMLSNPPLinkEnd(mLSNPPLinkName,sNPTNADataList,sNPPTNAPairList,aTNAName,zTNAName,aTNAGroupName,zTNAGroupName,mLSNPPLink);
	}

	public void disableSignalling(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.disableSignalling(mLSNPPLinkName);
	}

	public void deassignSignallingController(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deassignSignallingController(mLSNPPLinkName);
	}

	public void assignSignallingController(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingControllerIdentifier) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.assignSignallingController(mLSNPPLinkName,signallingControllerIdentifier);
	}

	public void modifySignallingProtocolParameters(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, org.tmforum.mtnm.globaldefs.NVSList_THolder signallingParameters) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.modifySignallingProtocolParameters(mLSNPPLinkName,signallingParameters);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

}
