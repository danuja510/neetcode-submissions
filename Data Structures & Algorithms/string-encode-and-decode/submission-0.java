class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String str: strs){
            res += str.length() + "#"+ str;
        }
        return res;
    }

    public List<String> decode(String str) {
     List<String> res  =new ArrayList();
        String tempStr = str;
        while(tempStr.length()>0){
            int length = Integer.valueOf(tempStr.substring(0, tempStr.indexOf("#")));
            System.out.println(length);
            String val= tempStr.substring(tempStr.indexOf("#")+1, tempStr.indexOf("#")+1+length);
            System.out.println(val);
            res.add(val);
            tempStr = tempStr.substring(tempStr.indexOf("#")+1+length, tempStr.length());
            
        }
        return res;
    }
}
