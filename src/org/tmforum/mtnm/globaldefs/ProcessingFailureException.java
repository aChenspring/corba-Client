package org.tmforum.mtnm.globaldefs;

/**
 *	Generated from IDL definition of exception "ProcessingFailureException"
 *	@author JacORB IDL compiler 
 */

public final class ProcessingFailureException
	extends org.omg.CORBA.UserException
{
	public ProcessingFailureException()
	{
		super(org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.id());
	}

	public org.tmforum.mtnm.globaldefs.ExceptionType_T exceptionType;
	public java.lang.String errorReason = "";
	public ProcessingFailureException(java.lang.String _reason,org.tmforum.mtnm.globaldefs.ExceptionType_T exceptionType, java.lang.String errorReason)
	{
		super(org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.id()+ " " + _reason);
		this.exceptionType = exceptionType;
		this.errorReason = errorReason;
	}
	public ProcessingFailureException(org.tmforum.mtnm.globaldefs.ExceptionType_T exceptionType, java.lang.String errorReason)
	{
		super(org.tmforum.mtnm.globaldefs.ProcessingFailureExceptionHelper.id());
		this.exceptionType = exceptionType;
		this.errorReason = errorReason;
	}
}
