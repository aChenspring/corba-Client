package org.omg.TimeBase;

/**
 *	Generated from IDL definition of struct "UtcT"
 *	@author JacORB IDL compiler 
 */

public final class UtcT
	implements org.omg.CORBA.portable.IDLEntity
{
	public UtcT(){}
	public long time;
	public int inacclo;
	public short inacchi;
	public short tdf;
	public UtcT(long time, int inacclo, short inacchi, short tdf)
	{
		this.time = time;
		this.inacclo = inacclo;
		this.inacchi = inacchi;
		this.tdf = tdf;
	}
}
