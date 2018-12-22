package org.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TabelaTest {

  private Tabela tabela;

  @Before
  public void setup(){
    this.tabela = new Tabela();
  }

  private void assertPolje(Polje p00, Polje p01, Polje p02, Polje p10, Polje p11, Polje p12, Polje p20, Polje p21, Polje p22, Polje[][] actualPolje){
    Assert.assertEquals(p00, actualPolje[0][0]);
    Assert.assertEquals(p01, actualPolje[0][1]);
    Assert.assertEquals(p02, actualPolje[0][2]);
    Assert.assertEquals(p10, actualPolje[1][0]);
    Assert.assertEquals(p11, actualPolje[1][1]);
    Assert.assertEquals(p12, actualPolje[1][2]);
    Assert.assertEquals(p20, actualPolje[2][0]);
    Assert.assertEquals(p21, actualPolje[2][1]);
    Assert.assertEquals(p22, actualPolje[2][2]);
  }

  @Test
  public void odigrajPotezZaIks(){
    boolean result = tabela.odigarjPotez(0,0, Polje.IKS);
    Polje[][] mat = tabela.vratiMatricu();

    Assert.assertTrue(result);
    assertPolje(Polje.IKS, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO, mat);
  }

  @Test
  public void odigrajPotezZaOks(){
    boolean result = tabela.odigarjPotez(1,1, Polje.OKS);
    Polje[][] mat = tabela.vratiMatricu();

    Assert.assertTrue(result);
    assertPolje(Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.OKS, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO, mat);
  }

  @Test
  public void odigrajPotezZaPrazno(){
    boolean result = tabela.odigarjPotez(1,1, Polje.PRAZNO);
    Polje[][] mat = tabela.vratiMatricu();

    Assert.assertFalse(result);
    assertPolje(Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO, mat);
  }

  @Test
  public void odigrajPotezZaDebilnuXKooridnatu1(){
    boolean result = tabela.odigarjPotez(-2323,1, Polje.IKS);
    Polje[][] mat = tabela.vratiMatricu();

    Assert.assertFalse(result);
    assertPolje(Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO, mat);
  }

  @Test
  public void odigrajPotezZaDebilnuXKooridnatu2(){
    boolean result = tabela.odigarjPotez(234234,1, Polje.IKS);
    Polje[][] mat = tabela.vratiMatricu();

    Assert.assertFalse(result);
    assertPolje(Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO, mat);
  }

  @Test
  public void odigrajPotezZaDebilnuYKooridnatu1(){
    boolean result = tabela.odigarjPotez(1,-2323, Polje.IKS);
    Polje[][] mat = tabela.vratiMatricu();

    Assert.assertFalse(result);
    assertPolje(Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO, mat);
  }

  @Test
  public void odigrajPotezZaDebilnuYKooridnatu2(){
    boolean result = tabela.odigarjPotez(1,234234, Polje.IKS);
    Polje[][] mat = tabela.vratiMatricu();

    Assert.assertFalse(result);
    assertPolje(Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO, mat);
  }

  @Test
  public void odigrajPotezZaVisePoteza(){
    boolean result = tabela.odigarjPotez(2,0, Polje.IKS);
    Polje[][] mat = tabela.vratiMatricu();

    Assert.assertTrue(result);
    assertPolje(Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.IKS, Polje.PRAZNO, Polje.PRAZNO, mat);

    result = tabela.odigarjPotez(1,2, Polje.OKS);
    mat = tabela.vratiMatricu();

    Assert.assertTrue(result);
    assertPolje(Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.OKS,
        Polje.IKS, Polje.PRAZNO, Polje.PRAZNO, mat);
  }

  @Test
  public void odigrajPotezZaIstiPotez(){
    boolean result = tabela.odigarjPotez(2,0, Polje.IKS);
    Polje[][] mat = tabela.vratiMatricu();

    Assert.assertTrue(result);
    assertPolje(Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.IKS, Polje.PRAZNO, Polje.PRAZNO, mat);

    result = tabela.odigarjPotez(2,0, Polje.OKS);
    mat = tabela.vratiMatricu();

    Assert.assertFalse(result);
    assertPolje(Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.PRAZNO, Polje.PRAZNO, Polje.PRAZNO,
        Polje.IKS, Polje.PRAZNO, Polje.PRAZNO, mat);
  }

}
