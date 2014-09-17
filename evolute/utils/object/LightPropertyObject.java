package pt.evolute.utils.object;

import java.util.Map;

/**
 *
 * @author fpalma
 */
public interface LightPropertyObject
{
	public Object get(String fieldName);

	public String[] getPropertyNames();

	public Map<String, Object> getMapData();

	public void set(String fieldName, Object value);

	public void setMapData(Map<String, Object> map);
}
