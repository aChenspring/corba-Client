package org.tmforum.mtnm.trafficDescriptor;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TrafficDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TrafficDescriptorMgr_IPOATie
	extends TrafficDescriptorMgr_IPOA
{
	private TrafficDescriptorMgr_IOperations _delegate;

	private POA _poa;
	public TrafficDescriptorMgr_IPOATie(TrafficDescriptorMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TrafficDescriptorMgr_IPOATie(TrafficDescriptorMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.trafficDescriptor.TrafficDescriptorMgr_I _this()
	{
		return org.tmforum.mtnm.trafficDescriptor.TrafficDescriptorMgr_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.trafficDescriptor.TrafficDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.trafficDescriptor.TrafficDescriptorMgr_IHelper.narrow(_this_object(orb));
	}
	public TrafficDescriptorMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TrafficDescriptorMgr_IOperations delegate)
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

	public void deleteTrafficDescriptor(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] descriptorName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.deleteTrafficDescriptor(descriptorName);
	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void createTrafficDescriptor(org.tmforum.mtnm.trafficDescriptor.TDCreateData_T newTDCreateData, org.tmforum.mtnm.trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.createTrafficDescriptor(newTDCreateData,newTrafficDescriptor);
	}

	public void getTrafficDescriptor(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tdName, org.tmforum.mtnm.trafficDescriptor.TrafficDescriptor_THolder td) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficDescriptor(tdName,td);
	}

	public void getAssociatedCTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] trafficDescriptorName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder tpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedCTPs(trafficDescriptorName,how_many,tpList,tpIt);
	}

	public void getAllTrafficDescriptors(int how_many, org.tmforum.mtnm.trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, org.tmforum.mtnm.trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficDescriptors(how_many,trafficDescList,trafficDescIt);
	}

	public void getAllTrafficDescriptorNames(int how_many, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder nameList, org.tmforum.mtnm.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficDescriptorNames(how_many,nameList,nameIt);
	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

}
