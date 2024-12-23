class DataTypes {
    static int dataTypeSize(String str) {
        // code here
        if(str.equals("Character")){
            return 2;
        }
        else if(str.equals("Integer")){
            return 4;
        }
        else if(str.equals("Long")){
            return 8;
        }
        else if(str.equals("Float")){
            return 4;
        }
        else if(str.equals("Double")){
            return 8;
        }
        else{
            return -1;
        }
    }
}