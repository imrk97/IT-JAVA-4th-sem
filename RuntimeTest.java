/**
 * @(#)RuntimeTest.java
 *
 *
 * @author
 * @version 1.00 2018/4/19
 */

import java.io.IOException;
public class RuntimeTest {

    public RuntimeTest() {
    }
   	public static void main(String [] args) throws IOException{
   			Runtime rt= Runtime.getRuntime();
   			rt.gc();
   			rt.exec("notepad.exe");
   		}

}