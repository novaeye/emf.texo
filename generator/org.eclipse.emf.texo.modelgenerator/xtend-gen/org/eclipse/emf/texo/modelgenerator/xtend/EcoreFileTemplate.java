package org.eclipse.emf.texo.modelgenerator.xtend;

import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.BaseTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;

@SuppressWarnings("all")
public class EcoreFileTemplate extends BaseTemplate {
  public void generate(final ModelController theModelController, final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    String fileName = TemplateUtil.ecoreFileName(ePackageModelGenAnnotation);
    String content = ePackageModelGenAnnotation.getEcoreFileContent();
    this.addFile(fileName, content);
  }
}
