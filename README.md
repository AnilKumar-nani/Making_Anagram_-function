# Making_Anagram_function

Requirement is to make anagram from the given two strings which may contain or may not contain the same length.

initially i took two strings

    String a="";
		String b="";

and then compared b0th strings with for lopps

    for(int i=0;i<str1.length();i++) 
		{
			if(str2.indexOf(str1.charAt(i))!=-1) a+=str1.charAt(i);
			else deletions++;
		}
		for(int i=0;i<str2.length();i++) 
		{
			if(str1.indexOf(str2.charAt(i))!=-1) b+=str2.charAt(i);
			else deletions++;
		}
    
connverted string to char and then char to String
  
    char[] ch = a.toCharArray();
		Arrays.sort(ch);
		a = String.valueOf(ch);
		ch = b.toCharArray();
		Arrays.sort(ch);
		b = String .valueOf(ch);
    
To repeated char which are not a part of both strings

    for(int i=0;i<unique.length();i++) 
        {
          int c1=0;
          int c2=0;
          for(int ind1=0;ind1<a.length();ind1++) 
          {
            if(unique.charAt(i)!=a.charAt(ind1))  break;
            c1++;

          }
          for(int ind2=0 ;ind2<b.length();ind2++) 
          {
            if(unique.charAt(i)!=b.charAt(ind2)) break;
            c2++;

          }

          deletions += Math.abs(c1-c2);
        }
        return deletions;


