package onlineShipping;

import javax.swing.JOptionPane;

public class OnlineShippingMain {
/*
 * 4. Create an online shipping system with the following features:
*       The system has a login that locks after the third failed attempt.
*       Display a menu that allows: Sending a package, exiting the system.
*       To send a package, sender and recipient details are required.
*       The system assigns a random package number to each sent package.
*       The system calculates the shipping price. $2 per kg.
*       The user must input the total weight of their package, and the system should
*        display the amount to pay.
 * */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String username = "pablo";
        String password = "6yT8=5cnNBRw,";
        int count = 0;
        
        
        do {
            JOptionPane.showMessageDialog(null, "Welcome to Online Shipping Center");
            String usernameLogin = JOptionPane.showInputDialog("Enter your username");
            String passwordLogin = JOptionPane.showInputDialog("Enter your password");
            if(username.equals(usernameLogin) && password.equals(passwordLogin)) {
                int  option= Integer.parseInt(JOptionPane.showInputDialog("Welcome to Online Shipping Center \n Select an option \n 1.) Sending a package \n 2.) Exit"));
                
                switch(option) {
                case 1:
                    JOptionPane.showMessageDialog(null,"To send a package you must  enter name and direction for recipient and sender");
                    String nameOfSender = JOptionPane.showInputDialog("Enter the name of the sender");
                    String directionOfSender = JOptionPane.showInputDialog("Enter the direccion of the sender");
                    String nameOfRecipient= JOptionPane.showInputDialog("Enter the name of the recipient");
                    String directionOfRecipient = JOptionPane.showInputDialog("Enter the direccion of the recipient");
                    double packageWeight = Double.parseDouble(JOptionPane.showInputDialog("Enter the weight of the package"));
                    double widthInch = Double.parseDouble(JOptionPane.showInputDialog("Enter the width in inches of the package"));
                    double heighInche = Double.parseDouble(JOptionPane.showInputDialog("Enter the height in inches of the package"));
                    String typeOfPackage = JOptionPane.showInputDialog("Enter the type of package");
                    int serialPackage = (int) (Math.random()*1000000000);
                    double price = packageWeight*2;
                    JOptionPane.showMessageDialog(null, "Here is a deatil information of your package and the amount you must pay for it\n"
                            + "PACKAGE SERIAL: " + serialPackage +"\n"
                            + "Name of the Sender: " + nameOfSender +"\n"
                            + "Direction of the Sender: " + directionOfSender +"\n"
                            + "Name of the Repicipient: " + nameOfRecipient +"\n"
                            + "Direction of the Recipient: "+ directionOfRecipient+"\n"
                            + "Type of package:" + typeOfPackage +"\n"
                            + "Width in inches: "+ widthInch+ "\n"
                            + "Heigh in inches  " + heighInche+ "\n"
                            + "Shipping Price: " + price
                             );
                    System.exit(0);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Thanks for use Online shipping system");
                    System.exit(0);
                    
                }
            }else {
                count ++;
                JOptionPane.showMessageDialog(null, "User or password wrong. Remaining attempts : " + (3 - count));
            }
        }while(count< 3);
        if(count == 3) {
            JOptionPane.showMessageDialog(null, "You reached the number of tries. You have been blocked.");
            System.exit(0);
        }
        
    }

}
