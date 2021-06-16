package poo.u7.estrutural.flyweight.depois;

public class ObjectUtils {

	public static String getObjectMemoryId(Object obj) {
		return Integer.toHexString(System.identityHashCode(obj));
	}
}
