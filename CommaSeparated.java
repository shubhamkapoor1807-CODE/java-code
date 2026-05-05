public class CommaSeparated
{
public static void main(String[] args)
{
String input="Welcome,to,Java Session Session Session";
String[] words=input.split(",");
for(int k=0;k<words.length;k++)
{
System.out.println(words[k]);
 }
}
}
