package org.tmforum.mtnm.transmissionDescriptor;

/**
 *	Generated from IDL definition of union "TPorMFDorFDFr_T"
 *	@author JacORB IDL compiler 
 */

public final class TPorMFDorFDFr_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private org.tmforum.mtnm.transmissionDescriptor.TPorMFDorFDFrQualifier_T discriminator;
	private org.tmforum.mtnm.terminationPoint.TerminationPoint_T tp;
	private org.tmforum.mtnm.flowDomain.MatrixFlowDomain_T mfd;
	private org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_T fdfr;

	public TPorMFDorFDFr_T ()
	{
	}

	public org.tmforum.mtnm.transmissionDescriptor.TPorMFDorFDFrQualifier_T discriminator ()
	{
		return discriminator;
	}

	public org.tmforum.mtnm.terminationPoint.TerminationPoint_T tp ()
	{
		if (discriminator != org.tmforum.mtnm.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP)
			throw new org.omg.CORBA.BAD_OPERATION();
		return tp;
	}

	public void tp (org.tmforum.mtnm.terminationPoint.TerminationPoint_T _x)
	{
		discriminator = org.tmforum.mtnm.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP;
		tp = _x;
	}

	public org.tmforum.mtnm.flowDomain.MatrixFlowDomain_T mfd ()
	{
		if (discriminator != org.tmforum.mtnm.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD)
			throw new org.omg.CORBA.BAD_OPERATION();
		return mfd;
	}

	public void mfd (org.tmforum.mtnm.flowDomain.MatrixFlowDomain_T _x)
	{
		discriminator = org.tmforum.mtnm.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD;
		mfd = _x;
	}

	public org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_T fdfr ()
	{
		if (discriminator != org.tmforum.mtnm.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr)
			throw new org.omg.CORBA.BAD_OPERATION();
		return fdfr;
	}

	public void fdfr (org.tmforum.mtnm.flowDomainFragment.FlowDomainFragment_T _x)
	{
		discriminator = org.tmforum.mtnm.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr;
		fdfr = _x;
	}

}
