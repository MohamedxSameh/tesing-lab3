public class Clock {
String state = "NORMAL";
String state1 = "TIME";
String state2 = "min";
String state3 = "ALARM";
int min=0,hour=0, day=18,month=5, year=2022;
String Input(char x){
    switch(state) {
        case "NORMAL": {
            if (x == 'c')
                this.state = "UPDATE";
            if (x == 'b')
                this.state = "ALARM";
            if (x == 'a')
                if (state1 == "TIME") {
                    state1 = "DATE";
                    return this.DisplayDate();
                }
                else{
                    state1 = "TIME";
                    return this.DisplayTIME();
                }
            return state;
        }
        case "UPDATE": {
            if (x == 'd')
                state = "NORMAL";
            else if (x == 'c')
                state = "UPDATE";
            else {
                switch (state2) {
                    case "min": {
                        if (x == 'a')
                            state2 = "hour";
                        if (x == 'b'){
                            this.month = (month+1)%60;
                        }
                        break;
                    }
                    case "hour": {
                          if (x == 'a')
                              state2 = "day";
                          if (x == 'b'){
                              this.hour= (hour+1)%12 +1;
                          }break;
                      }
                      case "day": {
                          if (x == 'a')
                              state2 = "month";
                          if (x == 'b'){
                              this.day= (day+1)%30+1;
                          }break;
                      }
                      case "month": {
                          if (x == 'a')
                              state2 = "year";
                          if (x == 'b'){
                              this.mon= (mon+1)%12+1;
                          }break;
                      }
                      case "year": {
                          if (x == 'a')
                              state = "NORMAL";
                          if (x == 'b'){
                              this.year= (year+1);
                          }
                      }break;
                  }
              }
              return state;
          }
          case "ALARM":{
              if(x == 'd'){
                  state = "NORMAL";
                  return state;
              }
              else if (x == 'a')
                  if(state3 == "ALARM"){
                      state3 = "CHIME";
                      return state3;
                  }
                  else{
                      state = "ALARM";
                      return state3;
                  }}
          return state;
      }
      return state;
  }
  String DisplayDate(){
      System.out.println(day+"-"+month+"-"+year);
  }
  String DisplayTIME(){
      System.out.println( hour+":"+min);
  }
  public static void main(String args[]){
  }}
