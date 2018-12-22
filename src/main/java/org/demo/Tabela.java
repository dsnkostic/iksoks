package org.demo;

public class Tabela {
  private Polje mat[][] = new Polje[3][3];

  public Tabela() {
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        mat[i][j] = Polje.PRAZNO;
  }

  public boolean odigarjPotez(int x, int y, Polje igrac){
    if (igrac != Polje.PRAZNO
        && (x >= 0 && x < 3 && y >= 0 && y < 3)
        && (mat[x][y] == Polje.PRAZNO)) {
      mat[x][y] = igrac;
      return true;
    }
    return false;
  }

  public boolean isKrajIgre(){
    return true;
  }

  public Polje pobednik(){
    return Polje.PRAZNO;
  }

  public Polje[][] vratiMatricu(){
    return mat;
  }

}
