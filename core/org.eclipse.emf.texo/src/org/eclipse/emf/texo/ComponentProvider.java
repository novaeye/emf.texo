package org.eclipse.emf.texo;

import java.util.HashMap;
import java.util.Map;

/**
 * Central factory for internal components used by Texo. The registry in this class can be used to override the
 * implementation classes used by Texo internally. Initially the registry is empty, meaning that the requested
 * implementation class is used. User specific code can set the implementation class by calling
 * {@link #register(Class, Class)}.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ComponentProvider {

  private static ComponentProvider instance = new ComponentProvider();

  public static ComponentProvider getInstance() {
    return instance;
  }

  public static void setInstance(ComponentProvider instance) {
    ComponentProvider.instance = instance;
  }

  private Map<Class<?>, Class<?>> registry = new HashMap<Class<?>, Class<?>>();

  /**
   * Create a new instance of the requested class using the internal registry.
   */
  public <T extends Object> T newInstance(Class<T> clz) {
    return newInstance(clz, null, null);
  }

  /**
   * Create a new instance of the requested class using the internal registry.
   */
  @SuppressWarnings("unchecked")
  public <T extends Object> T newInstance(Class<T> clz, Class<?>[] argTypes, Object[] args) {
    Class<?> implementationClass = getImplementation(clz);
    if (implementationClass == null) {
      implementationClass = clz;
    }
    try {
      if (args == null) {
        return (T) implementationClass.newInstance();
      }
      return (T) implementationClass.getConstructor(argTypes).newInstance(args);
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }

  /**
   * Register the implementation class for a certain texo class. Note, if there is already an entry in the registry for
   * the texoClass, then it will be overwritten.
   */
  public void register(Class<?> texoClass, Class<?> implementationClass) {
    // TODO: handle the case that there is already an entry...
    registry.put(texoClass, implementationClass);
  }

  /**
   * Return the current registered implementation.
   */
  @SuppressWarnings("unchecked")
  public <T extends Object> Class<T> getImplementation(Class<T> clz) {
    return (Class<T>) registry.get(clz);
  }
}
