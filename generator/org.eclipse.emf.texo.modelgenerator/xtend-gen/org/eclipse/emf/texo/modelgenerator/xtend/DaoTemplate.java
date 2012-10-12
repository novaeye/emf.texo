package org.eclipse.emf.texo.modelgenerator.xtend;

import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.BaseTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DaoTemplate extends BaseTemplate {
  private ModelController modelController;
  
  private EClassModelGenAnnotation eClassModelGenAnnotation;
  
  private EPackageModelGenAnnotation ePackageModelGenAnnotation;
  
  public void generate(final ModelController theModelController, final EClassModelGenAnnotation theEClassModelGenAnnotation) {
    this.modelController = theModelController;
    this.eClassModelGenAnnotation = theEClassModelGenAnnotation;
    EPackageModelGenAnnotation _ownerEPackageAnnotation = theEClassModelGenAnnotation.getOwnerEPackageAnnotation();
    this.ePackageModelGenAnnotation = _ownerEPackageAnnotation;
    boolean _isAddRuntimeModelBehavior = this.ePackageModelGenAnnotation.isAddRuntimeModelBehavior();
    boolean _not = (!_isAddRuntimeModelBehavior);
    if (_not) {
      return;
    }
    String fileName = TemplateUtil.daoClassFileName(this.eClassModelGenAnnotation);
    String content = this.generateContent();
    this.addFile(fileName, content);
  }
  
  public String generateContent() {
    StringConcatenation _builder = new StringConcatenation();
    String _javaFileHeader = this.ePackageModelGenAnnotation.getJavaFileHeader();
    _builder.append(_javaFileHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _daoClassesPackagePath = this.ePackageModelGenAnnotation.getDaoClassesPackagePath();
    _builder.append(_daoClassesPackagePath, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/** ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* The Dao implementation for the model object \'<em><b>");
    String _name = this.eClassModelGenAnnotation.getName();
    _builder.append(_name, " ");
    _builder.append("</b></em>\'.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @generated ");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _simpleClassName = this.eClassModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName, "");
    String _daoPatternName = this.ePackageModelGenAnnotation.getDaoPatternName();
    String _firstUpper = StringExtensions.toFirstUpper(_daoPatternName);
    _builder.append(_firstUpper, "");
    _builder.append(" extends ");
    String _daoRootClass = this.ePackageModelGenAnnotation.getDaoRootClass();
    _builder.append(_daoRootClass, "");
    _builder.append("<");
    String _qualifiedClassName = this.eClassModelGenAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName, "");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("public Class<");
    String _qualifiedClassName_1 = this.eClassModelGenAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName_1, "  	");
    _builder.append("> getEntityClass() {");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t\t");
    _builder.append("return ");
    String _qualifiedClassName_2 = this.eClassModelGenAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName_2, "  		");
    _builder.append(".class;");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public org.eclipse.emf.ecore.EClass getEClass() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    String _qualifiedClassName_3 = this.ePackageModelGenAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName_3, "		");
    _builder.append(".INSTANCE.get");
    String _name_1 = this.eClassModelGenAnnotation.getName();
    String _firstUpper_1 = TemplateUtil.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "		");
    _builder.append("EClass();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
