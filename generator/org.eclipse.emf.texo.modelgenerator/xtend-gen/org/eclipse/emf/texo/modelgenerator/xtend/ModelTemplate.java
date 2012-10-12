package org.eclipse.emf.texo.modelgenerator.xtend;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;
import org.eclipse.emf.texo.generator.BaseMainTemplate;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.modelgenerator.xtend.DaoTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.EcoreFileTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.EntityTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.EnumTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.InterfaceTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.ModelFactoryTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.ModelPackageTemplate;

@SuppressWarnings("all")
public class ModelTemplate extends BaseMainTemplate {
  public void generate(final EPackage ePackage, final ModelController modelController, final boolean doDao) {
    ENamedElementAnnotation _annotation = modelController.getAnnotation(ePackage, ModelcodegeneratorPackage.eNS_URI);
    EPackageModelGenAnnotation ePackageAnnotation = ((EPackageModelGenAnnotation) _annotation);
    EList<EClassModelGenAnnotation> _eClassModelGenAnnotations = ePackageAnnotation.getEClassModelGenAnnotations();
    for (final EClassModelGenAnnotation eClassAnnotation : _eClassModelGenAnnotations) {
      EClass _eClass = eClassAnnotation.getEClass();
      boolean _isInterface = _eClass.isInterface();
      if (_isInterface) {
        InterfaceTemplate _interfaceTemplate = new InterfaceTemplate();
        InterfaceTemplate template = _interfaceTemplate;
        template.generate(modelController, eClassAnnotation);
        Map<String,String> _files = template.getFiles();
        this.addFiles(_files);
      } else {
        EntityTemplate _entityTemplate = new EntityTemplate();
        EntityTemplate template_1 = _entityTemplate;
        template_1.generate(modelController, eClassAnnotation);
        Map<String,String> _files_1 = template_1.getFiles();
        this.addFiles(_files_1);
      }
    }
    EList<EEnumModelGenAnnotation> _eEnumModelGenAnnotations = ePackageAnnotation.getEEnumModelGenAnnotations();
    for (final EEnumModelGenAnnotation eEnumAnnotation : _eEnumModelGenAnnotations) {
      {
        EnumTemplate _enumTemplate = new EnumTemplate();
        EnumTemplate enumTemplate = _enumTemplate;
        enumTemplate.generate(modelController, eEnumAnnotation);
        Map<String,String> _files_2 = enumTemplate.getFiles();
        this.addFiles(_files_2);
      }
    }
    boolean _isAddRuntimeModelBehavior = ePackageAnnotation.isAddRuntimeModelBehavior();
    if (_isAddRuntimeModelBehavior) {
      {
        ModelPackageTemplate _modelPackageTemplate = new ModelPackageTemplate();
        ModelPackageTemplate template_2 = _modelPackageTemplate;
        template_2.generate(modelController, ePackageAnnotation, doDao);
        Map<String,String> _files_2 = template_2.getFiles();
        this.addFiles(_files_2);
      }
      {
        ModelFactoryTemplate _modelFactoryTemplate = new ModelFactoryTemplate();
        ModelFactoryTemplate template_2 = _modelFactoryTemplate;
        template_2.generate(modelController, ePackageAnnotation);
        Map<String,String> _files_2 = template_2.getFiles();
        this.addFiles(_files_2);
      }
      boolean _isHandleEcoreFile = ePackageAnnotation.isHandleEcoreFile();
      if (_isHandleEcoreFile) {
        EcoreFileTemplate _ecoreFileTemplate = new EcoreFileTemplate();
        EcoreFileTemplate template_2 = _ecoreFileTemplate;
        template_2.generate(modelController, ePackageAnnotation);
        Map<String,String> _files_2 = template_2.getFiles();
        this.addFiles(_files_2);
      }
      if (doDao) {
        EList<EClassModelGenAnnotation> _eClassModelGenAnnotations_1 = ePackageAnnotation.getEClassModelGenAnnotations();
        for (final EClassModelGenAnnotation eClassAnnotation_1 : _eClassModelGenAnnotations_1) {
          String _daoQualifiedClassName = eClassAnnotation_1.getDaoQualifiedClassName();
          boolean _notEquals = (!Objects.equal(_daoQualifiedClassName, null));
          if (_notEquals) {
            DaoTemplate _daoTemplate = new DaoTemplate();
            DaoTemplate template_3 = _daoTemplate;
            template_3.generate(modelController, eClassAnnotation_1);
            Map<String,String> _files_3 = template_3.getFiles();
            this.addFiles(_files_3);
          }
        }
      }
    }
  }
}
