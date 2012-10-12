package org.eclipse.emf.texo.modelgenerator.xtend;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public abstract class BaseTemplate {
  private Map<String,String> files = new Function0<Map<String,String>>() {
    public Map<String,String> apply() {
      HashMap<String,String> _hashMap = new HashMap<String,String>();
      return _hashMap;
    }
  }.apply();
  
  public String addFile(final String name, final String content) {
    String _put = this.files.put(name, content);
    return _put;
  }
  
  public void addFiles(final Map<String,String> newFiles) {
    this.files.putAll(newFiles);
  }
  
  public Map<String,String> getFiles() {
    return this.files;
  }
}
