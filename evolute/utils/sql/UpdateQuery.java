package pt.evolute.utils.sql;


import java.sql.SQLException;

/**
 *
 * @author  informatica
 */
public interface UpdateQuery extends SQLQuery
{
	public boolean isBatch();
	
	public String[] getBatch();

	public void fillParameters(Object stm)
			throws SQLException;
}
