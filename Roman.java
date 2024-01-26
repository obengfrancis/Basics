public class Roman {
    public int romanToInt(String s) {

        int temp = 0;

        for(int i=0;i<s.length();i++){
            // System.out.println(temp);	   
            if(s.charAt(i)=='M') temp+=1000;
            else if(s.charAt(i)=='V') temp+=5;
            else if(s.charAt(i)=='L') temp+=50;
            else if(s.charAt(i)=='D') temp+=500;
            else if(s.charAt(i)=='I'){
                if((i+1)<s.length()&&s.charAt(i+1)=='X') {
                    temp+=9;
                    i++;
                }
                else if((i+1)<s.length()&&s.charAt(i+1)=='V') {
                    temp+=4;
                    i++;
                }else{
                    temp+=1;
                }
            }
            else if(s.charAt(i)=='X'){
                if((i+1)<s.length()&&s.charAt(i+1)=='L') {
                    temp+=40;
                    i++;
                }
                else if((i+1)<s.length()&&s.charAt(i+1)=='C') {
                    temp+=90;
                    i++;
                }else{
                    temp+=10;
                }
            }
            else if(s.charAt(i)=='C'){
                if((i+1)<s.length()&&s.charAt(i+1)=='D') {
                    temp+=400;
                    i++;
                }
                else if((i+1)<s.length()&&s.charAt(i+1)=='M') {
                    temp+=900;
                    i++;
                }else{
                    temp+=100;
                }
            }
        }
        return temp;


    }
}
