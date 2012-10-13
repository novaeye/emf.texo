package org.eclipse.emf.texo.modelgenerator.xtend;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.texo.generator.BaseTemplate;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;

@SuppressWarnings("all")
public class EcoreFileTemplate extends BaseTemplate {
  public void generate(final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    boolean _executeOverrides = this.executeOverrides(ePackageModelGenAnnotation);
    if (_executeOverrides) {
      return;
    }
    String fileName = TemplateUtil.ecoreFileName(ePackageModelGenAnnotation);
    String content = ePackageModelGenAnnotation.getEcoreFileContent();
    this.addFile(fileName, content);
  }
  
  public List<String> getTemplateOverrides() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    List<String> list = _arrayList;
    list.add("org::eclipse::emf::texo::modelgenerator::templates::ecorefile");
    list.add("org::eclipse::emf::texo::modelgenerator::xtend::EcoreFileTemplate");
    return list;
  }
}
