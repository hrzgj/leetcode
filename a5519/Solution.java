package a5519;

/**
 * @author: chenyu
 * @date: 2020/9/20 13:09
 */
public class Solution {
    public String reorderSpaces(String text) {
        int sum=0;
        int word=0;
        boolean trant=true;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                sum++;
                trant=true;
                continue;
            }else {
                if(trant){
                    word++;
                    trant=false;
                }
            }
        }
        if(word==1&&sum==0){
            return text;
        }
        if(word==1){
            StringBuilder stringBuilder=new StringBuilder();
            int begin=0,end=text.length()-1;
            for(int i=0;i<text.length();i++){
                if(text.charAt(i)!=' '){
                    begin=i;
                    break;
                }
            }
            for(int i=end;i>=0;i-- ){
                if(text.charAt(i)!=' '){
                    end=i;
                    break;
                }
            }
            stringBuilder.append(text, begin, end+1);
            while (sum>0){
                stringBuilder.append(' ');
                sum--;
            }
            return stringBuilder.toString();
        }
        int a=sum/(word-1);
        int b=sum%(word-1);
        StringBuilder stringBuilder=new StringBuilder();
        int begin=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)!=' '){
                begin=i;
                break;
            }
        }
        trant=true;
        for(int i=begin;i<text.length();i++ ){
            if(text.charAt(i)!=' '){
                stringBuilder.append(text.charAt(i));
                trant=true;
            }else {
                if(trant) {
                    word--;
                    for (int j = 0; j < a&&sum>0&&word>0; j++) {
                        stringBuilder.append(' ');
                        sum--;
                    }
                    trant=false;
                }
            }
        }
        for(int i=0;i<b;i++){
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }
}
