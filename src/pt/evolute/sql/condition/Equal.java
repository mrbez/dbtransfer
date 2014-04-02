package pt.evolute.sql.condition;

import pt.evolute.sql.Condition;
import pt.evolute.sql.Operand;

public class Equal extends Condition
{
	public Equal( Operand left, Operand right )
	{
		super( left, right );
	}

	@Override
	public String getSymbol()
	{
		if( iRight.isNull() )
		{
			return "IS";
		}
		else
		{
			return "=";
		}
	}
}