/**
 * Created by Jeremy on 9/9/2015.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
public class Main extends JFrame {
    public Main() {
        setTitle("My Empty Frame");
        setSize(200,200); // default size is 0,0
        setLocation(10,200); // default is 0,0 (top left corner)
    }


    public static void main(String[] args) {
        Hotel JeremysHotel = new Hotel();
        JFrame frame = new Main();
        JButton button1 = new JButton("Add Suit");
        JButton button3 = new JButton("Add Penthouse");
        JButton button2 = new JButton("Available");
        JButton button4 = new JButton("Search");
        JTextField number = new JTextField();
        frame.getContentPane().add(BorderLayout.WEST,button3);
        frame.getContentPane().add(BorderLayout.EAST, button1);
        frame.getContentPane().add(BorderLayout.NORTH, button2);
        frame.getContentPane().add(BorderLayout.SOUTH, button4);
        frame.getContentPane().add(BorderLayout.CENTER, number);
        frame.setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JeremysHotel.addRoom(JeremysHotel.totalRooms(), "suit", 300);
                System.out.println("Room added");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent g) {
                System.out.println("available rooms: ");
                JeremysHotel.availableRooms();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JeremysHotel.addRoom(JeremysHotel.totalRooms(), "penthouse", 600);
                System.out.println("Room added");
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Room tempRoom = JeremysHotel.searchRooms(Integer.parseInt(number.getText()));
                System.out.println("Room" + " " + tempRoom.roomNumber);
                System.out.println("Room Size: " + tempRoom.roomSize);
                if (tempRoom.available == false){
                    System.out.println("Availability: Occupied");
                }
                else System.out.println("Availability: Unoccupied");
                System.out.println("Price Per night: " + tempRoom.roomPrice);


            }
        });





        System.out.println("The total rooms in the hotel: " + JeremysHotel.totalRooms());

    }



}
