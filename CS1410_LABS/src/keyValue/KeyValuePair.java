package keyValue;

import java.util.Objects;

public class KeyValuePair<K, V>{

	private K key;
	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}
	
	private V value;

	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}

		
	@Override
	public int hashCode() {
		return Objects.hash(key, value);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyValuePair other = (KeyValuePair) obj;
		return Objects.equals(key, other.key) && Objects.equals(value, other.value);
	}


	public void keyValueConstructor(K key, V value) {
		
		this.key = key;
		this.value = value;
		
	}
//	@Override
//	public String toString(key, value) {
//		
//	}

	
		
}

