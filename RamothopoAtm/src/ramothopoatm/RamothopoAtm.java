
package ramothopoatm;

import javax.swing.JOptionPane;
public class RamothopoAtm {
    public static double depositAmt(){
        double depositAmount=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the amount you want to deposit : R"));
    JOptionPane.showMessageDialog(null,"You have sucsessfully deposited : R "+depositAmount,"Deposits",JOptionPane.INFORMATION_MESSAGE);
    return depositAmount;
    }
public static double viewBalance(double availableBalance){
JOptionPane.showMessageDialog(null, "Your available balance is : R "+availableBalance);
return availableBalance;
}
public static double widthrawal(){
   
double widthdrawn=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the amount you would like to widthdraw : "));

JOptionPane.showMessageDialog(null,"Sucsessfully widthdrawn : R "+widthdrawn);
return  widthdrawn;
}
    public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"Please insert the card", "The ATM", JOptionPane.INFORMATION_MESSAGE);
   int opt=Integer.parseInt(JOptionPane.showInputDialog(null,"Which transaction do you want to perfom ? \npress 1: Deposit\npress 2: Widthdraw \npress 3: view balance",JOptionPane.QUESTION_MESSAGE));
   double availableBalance=200;
   availableBalance=viewBalance( availableBalance)-widthrawal()+depositAmt();
        
             switch(opt){
       case 1 : depositAmt();break;
       case 2 : widthrawal();break;
       case 3 : viewBalance(availableBalance);break;
       default :JOptionPane.showMessageDialog(null,"Invalid choice","Unknown choice",JOptionPane.INFORMATION_MESSAGE);
   }
        
        
  
    }
    
}
