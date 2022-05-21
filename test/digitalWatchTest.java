import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.juimport junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ClockTest eclktends TestCase {

    Clock clk;
    String output;
    @Nested
    class buttomUp {
        @BeforeEach
        public void init() {
            clk = new Clock();
        }
        @Test
        public void firstDriver(){
            output = clk.Input('a');
            System.out.println("todays date is "+ output);
            assertEquals("todays date is "+ output,"todays date is "+ clk.year+"-"+clk.month+"-"+clk.day);
        }
        @Test
        public void secondDriver(){
            output = clk.Input('a');
            output = clk.Input('a');
            System.out.println("it is "+ output);
            assertEquals("it is "+ output,"it is "+ clk.hour+":"+clk.month);
        }
        @Test
        public void thirdDriver(){
            Clock clk = new Clock();
            String[][] times = new String[5][2];
            clk.Input('c');
            for(int i = 0 ; i < 5 ; i ++) {
                System.out.print(clk.state2);
                times[i][0] = (clk.DisplayDate() + " " + clk.DisplayTIME());
                clk.Input('b');
                clk.Input('a');
                times[i][1] = (clk.DisplayDate() + " " + clk.DisplayTIME());
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(times[i][j] + " ");
                }
                System.out.println();
            }}
        @AfterEach
        public void clean(){
            clk=null ;
        }
    }

    class buttomUp {
        @BeforeEach
        public void init() {
            clk = new Clock();
        }
        @Test
        public void firstDriver(){
            output = clk.Input('a');
            System.out.println("todays date is "+ output);
            assertEquals("todays date is "+ output,"todays date is "+ clk.year+"-"+clk.month+"-"+clk.day);
        }
        @Test
        public void secondDriver(){
            output = clk.Input('a');
            output = clk.Input('a');
            System.out.println("it is "+ output);
            assertEquals("it is "+ output,"it is "+ clk.hour+":"+clk.month);
        }
        @Test
        public void thirdDriver(){
            Clock clk = new Clock();
            String[][] times = new String[5][2];
            clk.Input('c');
            for(int i = 0 ; i < 5 ; i ++) {
                System.out.print(clk.state2);
                times[i][0] = (clk.DisplayDate() + " " + clk.DisplayTIME());
                clk.Input('b');
                clk.Input('a');
                times[i][1] = (clk.DisplayDate() + " " + clk.DisplayTIME());
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(times[i][j] + " ");
                }
                System.out.println();
            }}
        @AfterEach
        public void clean(){
            clk=null ;
        }
    }
}