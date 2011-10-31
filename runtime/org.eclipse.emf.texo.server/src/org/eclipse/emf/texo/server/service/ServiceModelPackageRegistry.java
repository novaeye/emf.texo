package org.eclipse.emf.texo.server.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.texo.model.ModelPackage;

/**
 * Registry for all {@link ModelPackage} instances handled by this service layer.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ServiceModelPackageRegistry {

  private static ServiceModelPackageRegistry instance = new ServiceModelPackageRegistry();

  public static ServiceModelPackageRegistry getInstance() {
    return instance;
  }

  public static void setInstance(ServiceModelPackageRegistry instance) {
    ServiceModelPackageRegistry.instance = instance;
  }

  private List<ModelPackage> registry = new ArrayList<ModelPackage>();

  /**
   * Add a {@link ModelPackage} to the service package registry.
   * 
   * @param modelPackage
   */
  public void register(ModelPackage modelPackage) {
    if (registry.contains(modelPackage)) {
      // do nothing, be lenient...
      return;
    }
    registry.add(modelPackage);
  }

  /**
   * @return all {@link ModelPackage} instances handled by the service layer.
   */
  public List<ModelPackage> getRegisteredModelPackages() {
    return registry;
  }
}