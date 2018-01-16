package org.tmforum.mtnm.maintenanceOps;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class MaintenanceMgr_IPOATie
	extends MaintenanceMgr_IPOA
{
	private MaintenanceMgr_IOperations _delegate;

	private POA _poa;
	public MaintenanceMgr_IPOATie(MaintenanceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MaintenanceMgr_IPOATie(MaintenanceMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.maintenanceOps.MaintenanceMgr_I _this()
	{
		return org.tmforum.mtnm.maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.maintenanceOps.MaintenanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object(orb));
	}
	public MaintenanceMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MaintenanceMgr_IOperations delegate)
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
	public void performMaintenanceOperation(org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, org.tmforum.mtnm.maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.performMaintenanceOperation(maintenanceOperation,maintenanceOperationMode);
	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getActiveMaintenanceOperations(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOperationList, org.tmforum.mtnm.maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getActiveMaintenanceOperations(tpOrMeName,how_many,currentMaintenanceOperationList,cmoIt);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
