package org.tmforum.mtnm.softwareAndDataManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "BackupIdIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class BackupIdIterator_IPOATie
	extends BackupIdIterator_IPOA
{
	private BackupIdIterator_IOperations _delegate;

	private POA _poa;
	public BackupIdIterator_IPOATie(BackupIdIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public BackupIdIterator_IPOATie(BackupIdIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.tmforum.mtnm.softwareAndDataManager.BackupIdIterator_I _this()
	{
		return org.tmforum.mtnm.softwareAndDataManager.BackupIdIterator_IHelper.narrow(_this_object());
	}
	public org.tmforum.mtnm.softwareAndDataManager.BackupIdIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.tmforum.mtnm.softwareAndDataManager.BackupIdIterator_IHelper.narrow(_this_object(orb));
	}
	public BackupIdIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BackupIdIterator_IOperations delegate)
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
	public int getLength() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, org.tmforum.mtnm.softwareAndDataManager.BackupIdList_THolder backupList) throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,backupList);
	}

	public void destroy() throws org.tmforum.mtnm.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
