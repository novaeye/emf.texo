package org.eclipse.emf.texo.json;

import java.math.BigDecimal;

import org.json.JSONObject;

public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub
    final JSONObject jsonObject = new JSONObject();
    jsonObject.put("test2", (Object) null);
    jsonObject.put("test", new BigDecimal("1.123131312312333145432"));
    jsonObject.put("test8", new Long(5));


    System.err.println(jsonObject.toString());
  }

}
