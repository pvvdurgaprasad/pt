package pt.evolute.utils.sql;

public class FieldIndex extends Field
{
	protected Operand indexed;
	protected Integer index;
	
	public FieldIndex( Operand indexed, int index )
	{
		this( indexed, new Integer( index ) );
	}
	
	/** Creates a new instance of FieldIndex */
	public FieldIndex( Operand indexed, Integer index )
	{
		super( index.toString() );
		this.indexed = indexed;
		this.index = index;
	}
}