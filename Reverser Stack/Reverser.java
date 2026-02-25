public class Reverser {
    private String input;
    private String output;
    public Reverser(String in){
    this.input = in;
    }
    public String DoRev(){
    int Size = input.length();
    Stack my = new Stack(Size);
    for(int i = 0; i < Size; i++){
    char ch = input.charAt(i);
    my.push(ch);
        }
    output = "";
    while(!my.isEmpty()){
        char ch = my.pop();
        output = output + ch;
    }
    return output;
    }
}
