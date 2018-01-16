package org.tmforum.mtnm.mLSNPP;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MLSNPPMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class MLSNPPMgr_IPOATie
	extends MLSNPPMgr_IPOA
{
	private MLSNPPMgr_IOperations _delegate;

	private POA _poa;
	public MLSNPPMgr_IPOATie(MLSNPPMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MLSNPPMgr_IPOATie(MLSNPPMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.mLSNPP.MLSNPPMgr_I _this()
	{
		return org.tmforum.mtnm.mLSNPP.MLSNPPMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.mLSNPP.MLSNPPMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.mLSNPP.MLSNPPMgr_IHelper.narrow(_this_object(orb));
	}
	public MLSNPPMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MLSNPPMgr_IOperations delegate)
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

	public void setTNANameForMLSNPP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPName, org.tmforum.mtnm.mLSNPP.SNPTNAData_T[] sNPTNADataList, org.tmforum.mtnm.mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String tNAName, java.lang.String tNAGroupName, org.tmforum.mtnm.mLSNPP.MultiLayerSNPP_THolder mLSNPP) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setTNANameForMLSNPP(mLSNPPName,sNPTNADataList,sNPPTNAPairList,tNAName,tNAGroupName,mLSNPP);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getMLSNPP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mLSNPPName, org.tmforum.mtnm.mLSNPP.MultiLayerSNPP_THolder theMLSNPP) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getMLSNPP(mLSNPPName,theMLSNPP);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
