class hf_047{

  public static void main(String[] args){

    int x = 0;

    int y = 0;

    while(x < 5){

      // y = x - y; first candidate

      // y = y + x; second candidate

      // y = y + 2; third candidate
      //
      // if(y > 4){
      //
      //   y = y - 1;
      // }

      // x = x + 1; fourth candidate
      //
      // y = y + x;

      if(y < 5){

        x = x + 1;

        if(y < 3){

          x = x - 1;
        }
      }

      y = y + 2;

      System.out.print(x + "" + y + " ");

      x = x + 1;
    }
  }
}
