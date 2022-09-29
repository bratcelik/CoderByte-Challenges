package Hard;

import java.util.HashMap;
import java.util.Scanner;

/*
* Hamiltonian Path
*
* Have the function HamiltonianPath(strArr) take strArr which will be an array of length three.
* The first part of the array will be a list of vertices in a graph in the form (A,B,C,...),
* the second part of the array will be the edges connecting the vertices in the form (A-B,C-D,...)
* where each edge is bidirectional.
* The last part of the array will be a set of vertices in the form (X,Y,Z,...)
* and your program will have to determine whether or not the set of vertices
* given forms a Hamiltonian path on the graph which means that every vertex in
* the graph is visited only once in the order given.
*
* For example: if strArr is ["(A,B,C,D)","(A-B,A-D,B-D,A-C)","(C,A,D,B)"]
* then the vertices (C,A,D,B) in this order do in fact form a Hamiltonian path
* on the graph so your program should return the string yes.
* If for example the last part of the array was (D,A,B,C) then
* this doesn't form a Hamiltonian path because once you get to B you can't get to C
* in the graph without passing through the visited vertices again.
* Here your program should return the vertex where the path had to terminate,
* in this case your program should return B.
*
* The graph will have at least 2 vertices and all the vertices in the graph will be connected.
*
*
* Examples
*
* Input: ["(A,B,C)","(B-A,C-B)","(C,B,A)"]
* Output: yes
*
* Input: ["(X,Y,Z,Q)","(X-Y,Y-Q,Y-Z)","(Z,Y,Q,X)"]
* Output: Q
*
* @author Berat Sercan Çelik
* */

public class HamiltonianPath {


    public static String HamiltonianPath(String[] strArr) {
        // code goes here
        class Vertex{
            private StringBuilder links;
            private char name;

            public Vertex(char name){
                this.name = name;
                this.links = new StringBuilder();
            }

            public boolean isNeighbor(char v){
                if (this.links.toString().contains(v+"")){
                    return true;
                }
                return false;
            }

            public void addNeighbor(char v){
                if (!this.links.toString().contains(v+"")){
                    this.links.append(v);
                }
            }

            public StringBuilder getLinks(){ return links; }
            public void setLinks(StringBuilder links) { this.links = links; }
            public char getName() { return name; }
            public void setName(char name) { this.name = name; }
        }

        HashMap<Character,Vertex> nodes = new HashMap<>();

        for (int i = 0; i < strArr[0].length(); i++){
            if (Character.isLetter(strArr[0].charAt(i))){
                nodes.put(strArr[0].charAt(i), new Vertex(strArr[0].charAt(i)));
            }
        }

        for (int i = 0; i < strArr[1].length()-3; i++){
            if (Character.isLetter(strArr[1].charAt(i))){
                nodes.get(strArr[1].charAt(i)).addNeighbor(strArr[1].charAt(i+2));
                nodes.get(strArr[1].charAt(i+2)).addNeighbor(strArr[1].charAt(i));
                i += 2;
            }
        }

        for (int i = 0; i < strArr[2].length()-3; i++){
            if (Character.isLetter(strArr[2].charAt(i))){
                if (nodes.get(strArr[2].charAt(i)).isNeighbor(strArr[2].charAt(i+2))){
                    i++;
                    continue;
                }

                else{
                    return strArr[2].charAt(i) + "";
                }
            }
        }

        return "yes";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(HamiltonianPath(s.nextLine()));
    }
}

