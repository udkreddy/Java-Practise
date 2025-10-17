class SqueakyClean {
    static String clean(String identifierIn) {
        
        char[] identifier = identifierIn.toCharArray();
        StringBuilder resultString = new StringBuilder();
        for(int i = 0;i<identifierIn.length();i++) {
            if(Character.isLetter(identifier[i])) {
                resultString.append(identifier[i]);
                continue;
            }
            if(Character.isWhitespace(identifier[i])) resultString.append('_');
            if(identifier[i]=='-') {
                i++;
                if(i<identifierIn.length())
                    resultString.append(Character.toUpperCase(identifier[i]));
                continue;
            }
            String switchRes = "";
            switch (identifier[i]){
                case '4':
                    switchRes = "a"; break;
                case '3':
                    switchRes = "e";break;
                case '0':
                    switchRes = "o";break;
                case '1':
                    switchRes = "l";break;
                case '7':
                    switchRes = "t";break;
            }
            resultString.append(switchRes);
            
        }
        return resultString.toString();
    }
}
