package org.eclipse.emf.texo.modelgenerator.xtend;

import org.eclipse.emf.texo.generator.BaseTemplate;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;

@SuppressWarnings("all")
public class EcoreFileTemplate extends BaseTemplate {
  public void generate(final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    String fileName = TemplateUtil.ecoreFileName(ePackageModelGenAnnotation);
    String content = ePackageModelGenAnnotation.getEcoreFileContent();
    this.addFile(fileName, content);
  }
}
