public class No2 {
    public static void main(String[] args) {
        char [] chars=new char[100];
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
        for (int j1 = 0; j1 <chars.length; j1++) {
        double d1=Math.random();
        int i1=(int)(d1*26);

            chars [j1]=(char)(i1+'a');
        }
        for (char c1 : chars) {
            System.out.print(c1+" ");
        }
        for(int x1=0;x1<chars.length;x1++){
            if(chars[x1]=='a'){
                   a+=1;
                }
            if(chars[x1]=='b'){
                b+=1;
            }
            if(chars[x1]=='c'){
                c+=1;
            }
            if(chars[x1]=='d'){
                d+=1;
            }
            if(chars[x1]=='e'){
                e+=1;
            }
            if(chars[x1]=='f'){
                f+=1;
            }
            if(chars[x1]=='g'){
                g+=1;
            }
            if(chars[x1]=='h'){
                h+=1;
            }
            if(chars[x1]=='i'){
                i+=1;
            }
            if(chars[x1]=='g'){
                g+=1;
            }
            if(chars[x1]=='k'){
                k+=1;
            }
            if(chars[x1]=='l'){
                l+=1;
            }
            if(chars[x1]=='m'){
                m+=1;
            }
            if(chars[x1]=='n'){
                n+=1;
            }
            if(chars[x1]=='o'){
                o+=1;
            }
            if(chars[x1]=='p'){
                p+=1;
            }
            if(chars[x1]=='q'){
                q+=1;
            }
            if(chars[x1]=='r'){
                r+=1;
            }
            if(chars[x1]=='s'){
                s+=1;
            }
            if(chars[x1]=='t'){
                t+=1;
            }
            if(chars[x1]=='u'){
                u+=1;
            }
            if(chars[x1]=='v'){
                v+=1;
            }
            if(chars[x1]=='w'){
                w+=1;
            }
            if(chars[x1]=='x'){
                x+=1;
            }
            if(chars[x1]=='y'){
                y+=1;
            }
            if(chars[x1]=='z'){
                z+=1;
            }


        }
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("d:"+d);
        System.out.println("e:"+e);
        System.out.println("f:"+f);
        System.out.println("g:"+g);
        System.out.println("h:"+h);
        System.out.println("i:"+i);
        System.out.println("j:"+j);
        System.out.println("k:"+k);
        System.out.println("l:"+l);
        System.out.println("m:"+m);
        System.out.println("n:"+n);
        System.out.println("o:"+o);
        System.out.println("p:"+p);
        System.out.println("q:"+q);
        System.out.println("r:"+r);
        System.out.println("s:"+s);
        System.out.println("t:"+t);
        System.out.println("u:"+u);
        System.out.println("v:"+v);
        System.out.println("w:"+w);
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("z:"+z);
    }
}
