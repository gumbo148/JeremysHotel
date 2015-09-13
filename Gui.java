import com.sun.xml.internal.fastinfoset.util.StringArray;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Jeremy on 9/12/2015.
 */
public class Gui {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JTextArea textArea1;
    private JPanel bestForm;
    private JPanel betterPanel;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    //use setText() to output
    private JTextPane textPane1;

    private Hotel JeremysHotel;

    public Gui() {
        JeremysHotel = new Hotel();
    //adds a room
        button1.addActionListener(e -> {
                JeremysHotel.addRoom(JeremysHotel.totalRooms(), "suit", 300);
                textPane1.setText("Room Added");

        });

        //shows available roms
        button2.addActionListener(e -> {
            String whole = "Rooms: \n" ;
            ArrayList<Room> tempArrayList = JeremysHotel.availableRooms();
                int i = 0;
                int b = 0;
                textPane1.setText("available rooms: ");
            StringArray allRooms = new StringArray();
               for (Room tempRoom : tempArrayList){

                   allRooms.add(tempRoom.roomSize);
                   allRooms.add(Integer.toString(tempRoom.roomNumber));
                i++;
               }
           while (b < i) {
               whole = whole  + allRooms.get(b);

               b++;

           }
            textPane1.setText(whole);

        });

        //adds a room
        button3.addActionListener(e ->  {

                JeremysHotel.addRoom(JeremysHotel.totalRooms(), "penthouse", 600);
                textPane1.setText("Room Added");

        });

        //prints out info for selected room
        button4.addActionListener(e -> {
            Room tempRoom = JeremysHotel.searchRooms(Integer.parseInt(textArea1.getText()));
            textPane1.setText("Room" + " " + tempRoom.roomNumber);
            textPane1.setText("Room Size: " + tempRoom.roomSize);
            if (!tempRoom.available) {
                textPane1.setText("Availability: Occupied");
            } else textPane1.setText("Availability: Unoccupied");
            textPane1.setText("Price Per night: " + tempRoom.roomPrice);


        });

        //selects a room
        button5.addActionListener(e -> {
            Room tempRoom = JeremysHotel.removeRoom(Integer.parseInt(textArea1.getText()));

        });

    }

    public static void main(String[] args){
        Gui belmont = new Gui();
        JFrame greeg = new JFrame();

        greeg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        greeg.setVisible(true);
        greeg.add(belmont.bestForm);
        greeg.setSize(302, 231);


    }


}