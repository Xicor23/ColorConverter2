package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String deci[]= new String[148];
        String colorname[]={"AliceBlue" , "AntiqueWhite" , "Aqua" , "Aquamarine" , "Azure" , "Beige" , "Bisque" ,
                "Black" , "BlanchedAlmond" , "Blue" , "BlueViolet" , "Brown" , "BurlyWood" , "CadetBlue" , "Chartreuse" ,
                "Chocolate" , "Coral" , "CornflowerBlue" , "Cornsilk" , "Crimson" , "Cyan" , "DarkBlue" , "DarkCyan" ,
                "DarkGoldenRod" , "DarkGray" , "DarkGrey" , "DarkGreen" , "DarkKhaki" , "DarkMagenta" , "DarkOliveGreen" ,
                "DarkOrange" , "DarkOrchid" , "DarkRed" , "DarkSalmon" , "DarkSeaGreen", "DarkSlateBlue" , "DarkSlateGray" ,
                "DarkSlateGrey" , "DarkTurquoise" , "DarkViolet" , "DeepPink" , "DeepSkyBlue" , "DimGray" , "DimGrey" , "DodgerBlue" ,
                "FireBrick" , "FloralWhite" , "ForestGreen" , "Fuchsia" , "Gainsboro" , "GhostWhite" , "Gold" , "GoldenRod" ,
                "Gray" , "Grey" , "Green" , "GreenYellow" , "HoneyDew" , "HotPink" , "IndianRed"  , "Indigo" , "Ivory" , "Khaki" ,
                "Lavender" , "LavenderBlush" , "LawnGreen" , "LemonChiffon" , "LightBlue" , "LightCoral" , "LightCyan" ,
                "LightGoldenRodYellow" , "LightGray" , "LightGrey" , "LightGreen" , "LightPink" , "LightSalmon" ,
                "LightSeaGreen" , "LightSkyBlue" , "LightSlateGray" , "LightSlateGrey" , "LightSteelBlue" , "LightYellow" ,
                "Lime" , "LimeGreen" , "Linen" , "Magenta" , "Maroon" , "MediumAquaMarine" , "MediumBlue" , "MediumOrchid" ,
                "MediumPurple" , "MediumSeaGreen" , "MediumSlateBlue" , "MediumSpringGreen" , "MediumTurquoise" , "MediumVioletRed" ,
                "MidnightBlue" , "MintCream" , "MistyRose" , "Moccasin" , "NavajoWhite" , "Navy" , "OldLace" , "Olive" ,
                "OliveDrab" , "Orange" , "OrangeRed" , "Orchid" , "PaleGoldenRod" , "PaleGreen" , "PaleTurquoise" ,
                "PaleVioletRed" , "PapayaWhip" , "PeachPuff" , "Peru" , "Pink" , "Plum" , "PowderBlue" , "Purple" ,
                "RebeccaPurple" , "Red" , "RosyBrown" , "RoyalBlue" , "SaddleBrown" , "Salmon" , "SandyBrown" ,
                "SeaGreen" , "SeaShell" , "Sienna" , "Silver" , "SkyBlue" , "SlateBlue" , "SlateGray" , "SlateGrey" ,
                "Snow" , "SpringGreen" , "SteelBlue" , "Tan" , "Teal" , "Thistle" , "Tomato" , "Turquoise" ,
                "Violet" , "Wheat" , "White" , "WhiteSmoke" , "Yellow" , "YellowGreen" };
                for(int a = 0;a<colorname.length;a++)
                    colorname[a]=colorname[a].toLowerCase();
        String hexadecimal[]={"F0F8FF", "FAEBD7", "00FFFF", "7FFFD4", "F0FFFF", "F5F5DC", "FFE4C4", "000000", "FFEBCD", "0000FF",
                "8A2BE2", "A52A2A", "DEB887", "5F9EA0", "7FFF00", "D2691E", "FF7F50", "6495ED", "FFF8DC", "DC143C",
                "00FFFF", "00008B", "008B8B", "B8860B", "A9A9A9", "A9A9A9", "006400", "BDB76B", "8B008B", "556B2F",
                "FF8C00", "9932CC", "8B0000", "E9967A", "8FBC8F", "483D8B", "2F4F4F", "2F4F4F", "00CED1", "9400D3",
                "FF1493", "00BFFF", "696969", "696969", "1E90FF", "B22222", "FFFAF0", "228B22", "FF00FF", "DCDCDC",
                "F8F8FF", "FFD700", "DAA520", "808080", "808080", "008000", "ADFF2F", "F0FFF0", "FF69B4", "CD5C5C",
                "4B0082", "FFFFF0", "F0E68C", "E6E6FA", "FFF0F5", "7CFC00", "FFFACD", "ADD8E6", "F08080", "E0FFFF",
                "FAFAD2", "D3D3D3", "D3D3D3", "90EE90", "FFB6C1", "FFA07A", "20B2AA", "87CEFA", "778899", "778899",
                "B0C4DE", "FFFFE0", "00FF00", "32CD32", "FAF0E6", "FF00FF", "800000", "66CDAA", "0000CD", "BA55D3",
                "9370DB", "3CB371", "7B68EE", "00FA9A", "48D1CC", "C71585", "191970", "F5FFFA", "FFE4E1", "FFE4B5",
                "FFDEAD", "000080", "FDF5E6", "808000", "6B8E23", "FFA500", "FF4500", "DA70D6", "EEE8AA", "98FB98",
                "AFEEEE", "DB7093", "FFEFD5", "FFDAB9", "CD853F", "FFC0CB", "DDA0DD", "B0E0E6", "800080", "663399",
                "FF0000", "BC8F8F", "4169E1", "8B4513", "FA8072", "F4A460", "2E8B57", "FFF5EE", "A0522D", "C0C0C0",
                "87CEEB", "6A5ACD", "708090", "708090", "FFFAFA", "00FF7F", "4682B4", "D2B48C", "008080", "D8BFD8",
                "FF6347", "40E0D0", "EE82EE", "F5DEB3", "FFFFFF", "F5F5F5", "FFFF00", "9ACD32",};
        for(int i =0;i<hexadecimal.length;i++) {
                    Integer dec1 = Integer.parseInt(hexadecimal[i].substring(0,2), 16);
                    Integer dec2 = Integer.parseInt(hexadecimal[i].substring(2,4), 16);
                    Integer dec3 = Integer.parseInt(hexadecimal[i].substring(4,6), 16);
                    deci[i]=dec1.toString()+", "+dec2.toString()+", "+dec3.toString();
        }
        System.out.println(colorname[0]);
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to put in a color in hexadecimal, decimal, or name?");
        String a = scan.next().toLowerCase();
        if(a.equals("hexadecimal")){
            System.out.println("Put in hexadecimal to convert");
            String b = scan.next().toUpperCase();
            int c = Arrays.asList(hexadecimal).indexOf(b);
            if(c==-1){
                System.out.println("No hexadecimal found");
            }
            else {
                System.out.println("Hexadecimal: " + hexadecimal[c]);
                System.out.println("Decimal: " + deci[c]);
                System.out.println("Name: " + colorname[c]);
            }
        }
        if(a.equals("decimal")){
            System.out.println("Put in decimal to convert, put it in the form of R ,G ,B");
            String b = scan.next();
            int c = Arrays.asList(deci).indexOf(b);
            if(c==-1){
                System.out.println("No decimal found");
            }
            else {
                System.out.println("Decimal: " + deci[c]);
                System.out.println("Hexadecimal: " + hexadecimal[c]);
                System.out.println("Name: " + colorname[c]);
            }
        }
        if(a.equals("name")){
            System.out.println("Put in a name to convert");
            String b = scan.next().toLowerCase();
            int c = Arrays.asList(colorname).indexOf(b);
            if(c==-1){
                System.out.println("No name found");
            }
            else {
                System.out.println("Name: " + colorname[c]);
                System.out.println("Hexadecimal: " + hexadecimal[c]);
                System.out.println("Decimal: " + deci[c]);
            }
        }
    }
}
