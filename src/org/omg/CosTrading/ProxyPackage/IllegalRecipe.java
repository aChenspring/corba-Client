package org.omg.CosTrading.ProxyPackage;

/**
 *	Generated from IDL definition of exception "IllegalRecipe"
 *	@author JacORB IDL compiler 
 */

public final class IllegalRecipe
	extends org.omg.CORBA.UserException
{
	public IllegalRecipe()
	{
		super(org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.id());
	}

	public java.lang.String recipe;
	public IllegalRecipe(java.lang.String _reason,java.lang.String recipe)
	{
		super(org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.id()+ " " + _reason);
		this.recipe = recipe;
	}
	public IllegalRecipe(java.lang.String recipe)
	{
		super(org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.id());
		this.recipe = recipe;
	}
}
