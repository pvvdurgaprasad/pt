package pt.evolute.utils.sql.table;

import pt.evolute.utils.sql.Expression;

/**
 *
 * @author  fpalma
 */
public interface JoinBuilder
{
	public String getDatabaseType();
	public String getHeader();
	public Expression getFilter();
}