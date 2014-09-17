package pt.evolute.utils.sql.Expression;

import pt.evolute.utils.sql.Expression;

public class Or extends Expression
{
	public Or( Expression left, Expression right )
	{
		super( left, right );
	}

	@Override
	public String getSymbol()
	{
		return "OR";
	}
}