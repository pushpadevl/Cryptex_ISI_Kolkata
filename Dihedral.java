import java.util.Scanner;
// CozySphinxWavesQuartJugOfBadMilk
public class Dihedral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] Key = sc.nextLine().toCharArray();
        //print(Key);
        
        char[][] ops = new char[4][10]; //max 10 ops on a set
        for(int i=0;i<4;i++)
            ops[i] = sc.nextLine().toCharArray();

        int N = Key.length; //N%4==0 for cases.
        divideAndpermute(Key,N,ops);
        
    }
    static void divideAndpermute(char[] Key, int N, char[][] ops){
        int Ns = N/4;
        char[][] Sets = new char[4][Ns];
        
        for(int i=0,j=0;i<Ns&&j<N;i++){
            Sets[0][i] = Key[j++];
            Sets[1][i] = Key[j++];
            Sets[2][i] = Key[j++];
            Sets[3][i] = Key[j++];
            
        }
        print(Sets);

        for(int i=0;i<4;i++){
            for(char c: ops[i]){
                if(c=='f')
                    reflect(Sets[i], Ns);
                else { // add digits check
                    rotate(Sets[i], c-'0', Ns);
                }
            }
            print(Sets[i]);
        }
    }
    // CozySphinxWavesQuartJugOfBadMilk
    static void rotate(char[] str, int r, int Ns){
        
        r = Ns-(r%Ns);
        char[] nstr = new char[Ns];
        for(int i=0;i<Ns;i++){
            nstr[i] = str[(r+i)%Ns];
        }
        for(int i=0;i<Ns;i++) //str=nstr doesn't work because it is a 2d array and str=nstr changes the reference pointer of str to nstr
            str[i]=nstr[i];
        //    print("zxcv");
        //    print(str);
        //return nstr;
    }
    static void reflect(char[] str, int N){
        for(int i=1;i<=N/2;i++)
            swap(str, i, N-i);
            
    }
    static void swap(char[] str, int i, int j){
        char t = str[i];
        str[i] = str[j];
        str[j] = t;
    }
    static void print(char c){
        System.out.println("------------");
        System.out.println(c);
        //System.out.println("------------");
    }
    static void print(char[] s){
        System.out.println("------------");
        System.out.println(s);
        //System.out.println("------------");
    }
    static void print(String s){
        System.out.println("------------");
        System.out.println(s);
    //    System.out.println("------------");
    }
    static void print(char[][] str){
        System.out.println("------------");
        for(char[] s:str)
            print(s);
    //    System.out.println("------------");
    } 
}
// CozySphinxWavesQuartJugOfBadMilk