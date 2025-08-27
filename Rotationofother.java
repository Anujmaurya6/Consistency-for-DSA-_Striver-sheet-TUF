public class Rotationofother {
    public static boolean isRotation(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.isEmpty()&& s2.isEmpty()) {
            return true;
        }
        String temp=s1+s2;
        return temp.contains(s2);
    }
    public static void main(String[] args) {
        System.out.println (isRotation("abcde","edcba"));
    }
}
