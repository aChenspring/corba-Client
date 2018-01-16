package org.tmforum.mtnm.flowDomain;


/**
 *	Generated from IDL interface "FlowDomainMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _FlowDomainMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.tmforum.mtnm.flowDomain.FlowDomainMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/flowDomain/FlowDomainMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.tmforum.mtnm.flowDomain.FlowDomainMgr_IOperations.class;
	public void getTransmissionParams(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTransmissionParams", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,name);
				org.tmforum.mtnm.flowDomain.ParameterGroupsList_THelper.write(_os,filter);
				_is = _invoke(_os);
				transmissionParams.value = org.tmforum.mtnm.transmissionParameters.LayeredParameterList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTransmissionParams", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTransmissionParams(name,filter,transmissionParams);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setNativeEMSName(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setNativeEMSName", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(nativeEMSName);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setNativeEMSName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.setNativeEMSName(objectName,nativeEMSName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void assignCPTPsToMFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] tpNames, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "assignCPTPsToMFD", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mfdName);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,tpNames);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "assignCPTPsToMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.assignCPTPsToMFD(mfdName,tpNames,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createFTP(org.tmforum.mtnm.flowDomain.FTPCreateData_T createData, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.terminationPoint.TerminationPoint_THolder theFTP, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createFTP", true);
				org.tmforum.mtnm.flowDomain.FTPCreateData_THelper.write(_os,createData);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				theFTP.value = org.tmforum.mtnm.terminationPoint.TerminationPoint_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createFTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.createFTP(createData,tpsToModify,theFTP,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAssigningMFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] cptpName, org.tmforum.mtnm.flowDomain.MatrixFlowDomain_THolder mfd) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAssigningMFD", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,cptpName);
				_is = _invoke(_os);
				mfd.value = org.tmforum.mtnm.flowDomain.MatrixFlowDomain_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAssigningMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAssigningMFD(cptpName,mfd);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createFlowDomain(org.tmforum.mtnm.flowDomain.FDCreateData_T createData, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder assignedCPTPs, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.flowDomain.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createFlowDomain", true);
				org.tmforum.mtnm.flowDomain.FDCreateData_THelper.write(_os,createData);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,assignedCPTPs.value);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				assignedCPTPs.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				theFD.value = org.tmforum.mtnm.flowDomain.FlowDomain_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.createFlowDomain(createData,assignedCPTPs,tpsToModify,theFD,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteMFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteMFD", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mfdName);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteMFD(mfdName,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFlowDomainsByUserLabel(java.lang.String userLabel, org.tmforum.mtnm.flowDomain.FDList_THolder flowDomains) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFlowDomainsByUserLabel", true);
				_os.write_string(userLabel);
				_is = _invoke(_os);
				flowDomains.value = org.tmforum.mtnm.flowDomain.FDList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFlowDomainsByUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFlowDomainsByUserLabel(userLabel,flowDomains);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyFDFr(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdfrName, org.tmforum.mtnm.flowDomainFragment.FDFrModifyData_T fdfrModifyData, org.tmforum.mtnm.flowDomain.ConnectivityRequirement_T connectivityRequirement, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder failedTPList, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyFDFr", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdfrName);
				org.tmforum.mtnm.flowDomainFragment.FDFrModifyData_THelper.write(_os,fdfrModifyData);
				org.tmforum.mtnm.flowDomain.ConnectivityRequirement_THelper.write(_os,connectivityRequirement);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				failedTPList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				parameterProblemsTPList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				newFDFr.value = org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyFDFr(fdfrName,fdfrModifyData,connectivityRequirement,tpsToModify,failedTPList,parameterProblemsTPList,newFDFr,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopologicalLinksOfFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] flowDomainName, int how_many, org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THolder topoList, org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopologicalLinksOfFD", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,flowDomainName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				topoList.value = org.tmforum.mtnm.topologicalLink.TopologicalLinkList_THelper.read(_is);
				topoIt.value = org.tmforum.mtnm.topologicalLink.TopologicalLinkIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopologicalLinksOfFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopologicalLinksOfFD(flowDomainName,how_many,topoList,topoIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFr(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdfrName, org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFDFr", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdfrName);
				_is = _invoke(_os);
				fdfr.value = org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFDFr(fdfrName,fdfr);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteFTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] ftpName, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteFTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,ftpName);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteFTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteFTP(ftpName,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFDFrs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, org.tmforum.mtnm.flowDomainFragment.FDFrList_THolder fdfrList, org.tmforum.mtnm.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFDFrs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdName);
				_os.write_ulong(how_many);
				org.tmforum.mtnm.transmissionParameters.LayerRateList_THelper.write(_os,connectivityRateList);
				_is = _invoke(_os);
				fdfrList.value = org.tmforum.mtnm.flowDomainFragment.FDFrList_THelper.read(_is);
				fdfrIt.value = org.tmforum.mtnm.flowDomainFragment.FDFrIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFDFrs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFDFrs(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllAssignableCPTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder cptpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllAssignableCPTPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mfdName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				cptpList.value = org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.read(_is);
				cptpIt.value = org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllAssignableCPTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllAssignableCPTPs(mfdName,how_many,cptpList,cptpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setOwner(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setOwner", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(owner);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setOwner", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.setOwner(objectName,owner);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteFlowDomain", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdName);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteFlowDomain(fdName,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deAssociateCPTPsFromFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] tpNames, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deAssociateCPTPsFromFlowDomain", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdName);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,tpNames);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deAssociateCPTPsFromFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.deAssociateCPTPsFromFlowDomain(fdName,tpNames,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCPTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.flowDomain.CPTP_Role_T cptpRole, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder cptpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCPTPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdName);
				org.tmforum.mtnm.flowDomain.CPTP_Role_THelper.write(_os,cptpRole);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				cptpList.value = org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.read(_is);
				cptpIt.value = org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCPTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCPTPs(fdName,cptpRole,how_many,cptpList,cptpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllAssignedCPTPs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, int how_many, org.tmforum.mtnm.terminationPoint.TerminationPointList_THolder cptpList, org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllAssignedCPTPs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mfdName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				cptpList.value = org.tmforum.mtnm.terminationPoint.TerminationPointList_THelper.read(_is);
				cptpIt.value = org.tmforum.mtnm.terminationPoint.TerminationPointIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllAssignedCPTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllAssignedCPTPs(mfdName,how_many,cptpList,cptpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setAdditionalInfo(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, org.tmforum.mtnm.globaldefs.NVSList_THolder additionalInfo) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setAdditionalInfo", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,objectName);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = org.tmforum.mtnm.globaldefs.NVSList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setAdditionalInfo", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.setAdditionalInfo(objectName,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createMFD(org.tmforum.mtnm.flowDomain.MFDCreateData_T createData, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.flowDomain.MatrixFlowDomain_THolder theMFD, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createMFD", true);
				org.tmforum.mtnm.flowDomain.MFDCreateData_THelper.write(_os,createData);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				theMFD.value = org.tmforum.mtnm.flowDomain.MatrixFlowDomain_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.createMFD(createData,tpsToModify,theMFD,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFrsWithTP(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] cptpName, int how_many, org.tmforum.mtnm.flowDomainFragment.FDFrList_THolder fdfrList, org.tmforum.mtnm.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFDFrsWithTP", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,cptpName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				fdfrList.value = org.tmforum.mtnm.flowDomainFragment.FDFrList_THelper.read(_is);
				fdfrIt.value = org.tmforum.mtnm.flowDomainFragment.FDFrIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrsWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFDFrsWithTP(cptpName,how_many,fdfrList,fdfrIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateAndDeleteFDFr(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdfrName, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateAndDeleteFDFr", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdfrName);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				theFDFr.value = org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateAndDeleteFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.deactivateAndDeleteFDFr(fdfrName,tpsToModify,theFDFr,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFlowDomains(int how_many, org.tmforum.mtnm.flowDomain.FDList_THolder flowDomains, org.tmforum.mtnm.flowDomain.FDIterator_IHolder fdIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFlowDomains", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				flowDomains.value = org.tmforum.mtnm.flowDomain.FDList_THelper.read(_is);
				fdIt.value = org.tmforum.mtnm.flowDomain.FDIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFlowDomains", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFlowDomains(how_many,flowDomains,fdIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deAssociateMFDsFromFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] mfdNames, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deAssociateMFDsFromFlowDomain", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdName);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,mfdNames);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deAssociateMFDsFromFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.deAssociateMFDsFromFlowDomain(fdName,mfdNames,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSupportedMFDs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] holderName, int how_many, org.tmforum.mtnm.flowDomain.MFDList_THolder mfds, org.tmforum.mtnm.flowDomain.MFDIterator_IHolder mfdIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSupportedMFDs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,holderName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mfds.value = org.tmforum.mtnm.flowDomain.MFDList_THelper.read(_is);
				mfdIt.value = org.tmforum.mtnm.flowDomain.MFDIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSupportedMFDs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSupportedMFDs(holderName,how_many,mfds,mfdIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setUserLabel(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setUserLabel", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(userLabel);
				_os.write_boolean(enforceUniqueness);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.setUserLabel(objectName,userLabel,enforceUniqueness);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, org.tmforum.mtnm.flowDomain.MatrixFlowDomain_THolder mfd) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMFD", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mfdName);
				_is = _invoke(_os);
				mfd.value = org.tmforum.mtnm.flowDomain.MatrixFlowDomain_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMFD(mfdName,mfd);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFrRoute(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdfrName, org.tmforum.mtnm.flowDomainFragment.FDFrRoute_THolder route) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFDFrRoute", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdfrName);
				_is = _invoke(_os);
				route.value = org.tmforum.mtnm.flowDomainFragment.FDFrRoute_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFDFrRoute(fdfrName,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAssociatingFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, org.tmforum.mtnm.flowDomain.FlowDomain_THolder flowDomain) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAssociatingFD", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mfdName);
				_is = _invoke(_os);
				flowDomain.value = org.tmforum.mtnm.flowDomain.FlowDomain_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAssociatingFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAssociatingFD(mfdName,flowDomain);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createAndActivateFDFr(org.tmforum.mtnm.flowDomainFragment.FDFrCreateData_T createData, org.tmforum.mtnm.flowDomain.ConnectivityRequirement_T connectivityRequirement, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] aEnd, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] zEnd, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder internalTPs, org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, org.tmforum.mtnm.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createAndActivateFDFr", true);
				org.tmforum.mtnm.flowDomainFragment.FDFrCreateData_THelper.write(_os,createData);
				org.tmforum.mtnm.flowDomain.ConnectivityRequirement_THelper.write(_os,connectivityRequirement);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,aEnd);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,zEnd);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,internalTPs.value);
				org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragmentList_THelper.write(_os,mfdfrs.value);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				internalTPs.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				mfdfrs.value = org.tmforum.mtnm.flowDomainFragment.MatrixFlowDomainFragmentList_THelper.read(_is);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				theFDFr.value = org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_THelper.read(_is);
				notConnectableCPTPList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				parameterProblemsTPList.value = org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createAndActivateFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.createAndActivateFDFr(createData,connectivityRequirement,aEnd,zEnd,internalTPs,mfdfrs,tpsToModify,theFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyMFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, org.tmforum.mtnm.flowDomain.MFDModifyData_T mfdModifyData, org.tmforum.mtnm.flowDomain.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyMFD", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mfdName);
				org.tmforum.mtnm.flowDomain.MFDModifyData_THelper.write(_os,mfdModifyData);
				_is = _invoke(_os);
				newMFD.value = org.tmforum.mtnm.flowDomain.MatrixFlowDomain_THelper.read(_is);
				failedAttributes.value = _is.read_string();
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyMFD(mfdName,mfdModifyData,newMFD,failedAttributes,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, org.tmforum.mtnm.flowDomainFragment.FDFrList_THolder fdfrs) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFDFrsByUserLabel", true);
				_os.write_string(userLabel);
				_is = _invoke(_os);
				fdfrs.value = org.tmforum.mtnm.flowDomainFragment.FDFrList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrsByUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFDFrsByUserLabel(userLabel,fdfrs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void unassignCPTPsFromMFD(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] mfdName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] tpNames, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "unassignCPTPsFromMFD", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,mfdName);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,tpNames);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "unassignCPTPsFromMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.unassignCPTPsFromMFD(mfdName,tpNames,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.flowDomain.FDModifyData_T fdModifyData, org.tmforum.mtnm.flowDomain.FlowDomain_THolder modifiedFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyFlowDomain", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdName);
				org.tmforum.mtnm.flowDomain.FDModifyData_THelper.write(_os,fdModifyData);
				_is = _invoke(_os);
				modifiedFD.value = org.tmforum.mtnm.flowDomain.FlowDomain_THelper.read(_is);
				failedAttributes.value = _is.read_string();
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyFlowDomain(fdName,fdModifyData,modifiedFD,failedAttributes,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void associateMFDsWithFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] mfdNames, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "associateMFDsWithFlowDomain", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdName);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,mfdNames);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "associateMFDsWithFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.associateMFDsWithFlowDomain(fdName,mfdNames,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCapabilities(org.tmforum.mtnm.common.CapabilityList_THolder capabilities) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCapabilities", true);
				_is = _invoke(_os);
				capabilities.value = org.tmforum.mtnm.common.CapabilityList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCapabilities", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getCapabilities(capabilities);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void associateCPTPsWithFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.globaldefs.NameAndStringValue_T[][] cptpNames, org.tmforum.mtnm.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "associateCPTPsWithFlowDomain", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdName);
				org.tmforum.mtnm.globaldefs.NamingAttributesList_THelper.write(_os,cptpNames);
				org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.tmforum.mtnm.subnetworkConnection.TPDataList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "associateCPTPsWithFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.associateCPTPsWithFlowDomain(fdName,cptpNames,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllAssociatedMFDs(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] tmdOrFdName, int how_many, org.tmforum.mtnm.flowDomain.MFDList_THolder mfds, org.tmforum.mtnm.flowDomain.MFDIterator_IHolder mfdIt) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllAssociatedMFDs", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,tmdOrFdName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mfds.value = org.tmforum.mtnm.flowDomain.MFDList_THelper.read(_is);
				mfdIt.value = org.tmforum.mtnm.flowDomain.MFDIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllAssociatedMFDs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllAssociatedMFDs(tmdOrFdName,how_many,mfds,mfdIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFlowDomain(org.tmforum.mtnm.globaldefs.NameAndStringValue_T[] fdName, org.tmforum.mtnm.flowDomain.FlowDomain_THolder flowDomain) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFlowDomain", true);
				org.tmforum.mtnm.globaldefs.NVSList_THelper.write(_os,fdName);
				_is = _invoke(_os);
				flowDomain.value = org.tmforum.mtnm.flowDomain.FlowDomain_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFlowDomain(fdName,flowDomain);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

}
