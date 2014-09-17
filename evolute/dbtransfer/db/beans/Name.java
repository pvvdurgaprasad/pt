package pt.evolute.dbtransfer.db.beans;

import pt.evolute.utils.string.StringPlainer;

public class Name 
{
	public final String saneName;
	public final String originalName;
	
	public Name( String original )
	{
		originalName = original;
		String sane = original;
		if( sane.contains( " " ) )
		{
			sane = sane.replace( ' ', '_' );
		}
		if( sane.contains( "." ) )
		{
			sane = sane.replace( '.', '_' );
		}
		/*Modified for IPMDBCONV*/
		//if(sane.startsWith("1775")){
		if(sane.equalsIgnoreCase("1775_ChangeIntelligence_Rights")){			
			sane = "changeintelligence_rights_1775";
		}
		saneName = StringPlainer.convertString( sane );
	}
	
        @Override
	public String toString()
	{
		return saneName;
	}
        
        @Override
        public boolean equals( Object o )
        {
            return originalName.equals( o );
        }

    @Override
    public int hashCode() 
    {
        int hash = 3;
        hash = 53 * hash + (this.originalName != null ? this.originalName.hashCode() : 0);
        return hash;
    }
}