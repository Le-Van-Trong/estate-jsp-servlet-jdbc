package singleton_pattern;

import java.lang.reflect.Constructor;

// Reflection duoc su dung de huy Singleton

public class ReflectionSingletonTest {
	
	public static void main(String[] args) {
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = null;
		try {
			@SuppressWarnings("rawtypes")
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for(@SuppressWarnings("rawtypes") Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
}
}

