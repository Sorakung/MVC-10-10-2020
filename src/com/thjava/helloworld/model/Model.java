package com.thjava.helloworld.model;
import java.util.Random;
public class Model {
    
    // ประกาศตัวแปร
    private String name;
    private String Hashtag;
    private String[] hashtag = {"","","","",""};
    //private String random1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String[] Account = {"","","","","","","","","",""};
    public String getHashtag() {
        return Hashtag;
    }

    public void setHashtag(String Hashtag) {
        this.Hashtag = Hashtag;
        //sethashtag(Hashtag);
    }
    
    // Getter & Setter  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // toString() 

    @Override
    public String toString() {
        return "Model{" + "name=" + name + '}';
    }
    
    public void sethashtag (String [] name){
        for(int i =0;i<5;i++){
        if(hashtag[i].equals("")){
            hashtag[i]+="#";
            hashtag[i]+=name[i];
        }
        }
        for (int i = 0; i < hashtag.length; i++) {
        System.out.println(hashtag[i]);
}
        //System.out.println(hashtag);
        
    }
    public void random(){
        Random rand = new Random(); 
        String account = "";
        int num1 = rand.nextInt(111) + 30;
        for(int i = 0;i>num1 ;i++){
            int num = rand.nextInt(43);
            switch(num){
                case 0:
                    account+= "Z";
                    break;
                case 1:
                    account+= "A";
                    break;
                case 2:
                    account+= "B";
                    break;
                case 3:
                    account+= "C";
                    break;
                    case 4:
                    account+= "D";
                    break;
                    case 5:
                    account+= "E";
                    break;
                    case 6:
                    account+= "F";
                    break;
                    case 7:
                    account+= "G";
                    break;
                    case 8:
                    account+= "H";
                    break;
                    case 9:
                    account+= "I";
                    break;
                    case 10:
                    account+= "J";
                    break;
                    case 11:
                    account+= "K";
                    break;
                    case 12:
                    account+= "L";
                    break;
                    case 13:
                    account+= "M";
                    break;
                    case 14:
                    account+= "N";
                    break;
                    case 15:
                    account+= "O";
                    break;
            } 
        }
        int a = rand.nextInt(5);
        switch(a){
            case 0:
                account+= hashtag[a];
                break;
            case 1:
                account+= hashtag[a];
                break;
            case 2:
                account+= hashtag[a];
                break;
            case 3:
                account+= hashtag[a];
                break;
            case 4:
                account+= hashtag[a];
                break;
        }
        for(int j =0;j<11;j++){
        if(Account[j].equals("")){
            Account[j]+= account;
            j = 11;
        }
        }
    }
    public static String[] showAcc(){
        int ci = 0;
        int co = 0;
        String accsend[] = {"","","","","","","","","",""}; 
        for(int j = 0 ; j<10;j++){
            String name = Account[j];
            
            for(int i = 0;i<name.length();i++){
                switch(name.substring(i, i+1)){
                    case "I":
                        ci++;
                        break;
                    case "O":
                        co++;
                        break;
                }
                
            }
            if(ci>0 || co>0 && ci+co > 5 && ci+co <=10 ){
                for (int x =0 ; x<10;x++){
                    if(accsend[x].equals("")){
                        accsend[x]+= name;
                        x=10;
                    }
                }
            }
        }
        
        
        return accsend;
    }
} // class Model
