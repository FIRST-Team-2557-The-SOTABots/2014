/*
Error code 221: Socket could not be opened.
Error code 222: Data stream could not be created.
Error code 223: Could not read boolean.
Error code 224: Could not read String.
*/

package edu.wpi.first.wpilibj.templates;

import java.io.DataInput;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

/**
 *
 * @author SOTA
 */
public class Network {
    public static int listenBool(){
        //If error occurs returns value -1
        //If no error occurs returns 1(true) or 0(false)
        SocketConnection socket;
        DataInput data;
        int seen = -1;
        //Tries to open a socket to the Pi.
        try{
            socket = (SocketConnection) Connector.open("10.25.57.10:111");
        }
        catch(IOException e){
            System.out.println("Error code 221");
            //Returns if error occurs.
            return seen;
        }
        //Tries to open a Data Input Stream from the Pi.
        try{
            data = socket.openDataInputStream();
        }
        catch(IOException e){
            System.out.println("Error code 222");
            //Returns if error occurs.
            return seen;
        }
        //Tries to read boolean sent by the Pi.
        try{
            if(data.readBoolean()){
                seen = 1;
            }
            else{
                seen = 0;
            }
        }
        catch(IOException e){
            System.out.println("Error code 223");
            //Returns if error occurrs.
            return -1;
        }
        return seen;
    }
    public static String listenCoor(){
        //If error ocurrs returns value "-2,-2"
        //If no error occurs returns "x,y" or "-1,-1" if nothing found
        SocketConnection socket;
        DataInput data;
        String seen = "-2,-2";
        //Tries to open a socket to Pi.
        try{
            socket = (SocketConnection) Connector.open("10.25.57.10:111");
        }
        catch(IOException e){
            System.out.println("Error code 221");
            //Retuns if error occurs.
            return seen;
        }
        //Tries to open a Data Input Stream to the Pi.
        try{
            data = socket.openDataInputStream();
        }
        catch(IOException e){
            System.out.println("Error code 222");
            //Returns if error occurs.
            return seen;
        }
        //Tries to read string sent by the Pi.
        try{
            return data.readUTF();
        }
        catch(IOException e){
            System.out.println("Error code 224");
            //Returns if error occurs.
            return "-2,-2";
        }
    }
}
