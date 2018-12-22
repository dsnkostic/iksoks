package org.demo;

import org.junit.Assert;
import org.junit.Test;

public class SabiranjeTest {

  @Test
  public void Dalisu2i2jednako4(){
    Sabiranje sabiranje = new Sabiranje();

    int result = sabiranje.saberi(2, 2);

    Assert.assertEquals(4, result);
  }

  @Test
  public void Dalisu2i3jednako5(){
    Sabiranje sabiranje = new Sabiranje();

    int result = sabiranje.saberi(2, 3);

    Assert.assertEquals(5, result);
  }

}
