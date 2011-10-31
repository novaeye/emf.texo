package org.eclipse.emf.texo.test;

import org.eclipse.emf.texo.test.model.issues.bz325427.Bz325427ModelPackage;
import org.junit.Assert;
import org.junit.Test;

public class TestBz325427 {

  @Test
  public void test() throws Exception {
    Assert.assertTrue(Bz325427ModelPackage.ECLASSB_CLASSIFIER_ID == 0);
    Assert.assertTrue(Bz325427ModelPackage.ECLASSA_CLASSIFIER_ID == 1);
    Assert.assertTrue(Bz325427ModelPackage.ENUMA_CLASSIFIER_ID == 3);
    Assert.assertTrue(Bz325427ModelPackage.ENUMB_CLASSIFIER_ID == 2);
  }
}
