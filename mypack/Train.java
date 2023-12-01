package mypack;

public class Train extends Vehicle{
  // private int crewNum;

  public Train(int crewNum){
    this.crewNum = crewNum;
  }
  public void showCrewNum(){
    System.out.println("電車の乗客：" + crewNum + "名");
  }
}
