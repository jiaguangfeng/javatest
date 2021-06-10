package com.qx.day15;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

    public static void main(String args[]) {
        String strings = "1435000, 1434991, 1434961, 1434944, 1434832, 1434583, 1434566, 1434309, 1434208, 1434142, 1433942, 1432322, 1432303, 1432289, 1432288, 1432253, 1432233, 1432134, 1431884, 1430901, 1430883, 1430726, 1430632, 1430629, 1430570, 1429862, 1429846, 1429817, 1429037, 1429030, 1429025, 1429023, 1428979, 1428956, 1428929, 1428917, 1428895, 1428890, 1428883, 1428880, 1428877, 1428807, 1428419, 1428409, 1428163, 1428159, 1428142, 1428111, 1428070, 1428053, 1427892, 1427839, 1427838, 1427776, 1427774, 1427755, 1427625, 1427600, 1424371, 1423811, 1423786, 1423752, 1423746, 1391966, 1391868, 1391858, 1391717, 1391715, 1391640, 1391392, 1391391, 1391390, 1391389, 1391388, 1391387, 1391386, 1391385, 1391383, 1391382, 1391381, 1391380, 1391377, 1391376, 1391375, 1391374, 1391373, 1391372, 1391371, 1391370, 1391369, 1391368, 1391367, 1391366, 1391365, 1391364, 1391362, 1391361, 1391360, 1391359, 1391358, 1391357, 1391356, 1391355, 1391354, 1391353, 1391352, 1391351, 1391350, 1391349, 1391348, 1391347, 1391346, 1391345, 1391344, 1391343, 1391342, 1391341, 1391340, 1391339, 1391338, 1391337, 1391336, 1391335, 1391334, 1391333, 1391332, 1391331, 1391330, 1391329, 1391328, 1391327, 1391326, 1391325, 1391324, 1391323, 1391322, 1391321, 1391320, 1391319, 1391318, 1391317, 1391316, 1391315, 1391314, 1391313, 1391312, 1391311, 1391310, 1391309, 1391308, 1391307, 1391306, 1391305, 1391304, 1391303, 1391302, 1391301, 1391300, 1391299, 1391298, 1391297, 1391296, 1391295, 1391294, 1391293, 1391292, 1391291, 1391290, 1391289, 1391288, 1391287, 1391286, 1391285, 1391284, 1391283, 1391282, 1391281, 1391280, 1391279, 1391278, 1391277, 1391276, 1391274, 1391273, 1391272, 1391271, 1391270, 1391269, 1391268, 1391267, 1391266, 1391265, 1391264, 1391263, 1391262, 1391261, 1391260, 1391259, 1391258, 1391257, 1391256, 1391255, 1391254, 1391253, 1391252, 1391251, 1391250, 1391249, 1391248, 1391247, 1391246, 1391245, 1391244, 1391243, 1391242, 1391241, 1391240, 1391239";


        String path = "/Users/coffey/Desktop/4114063.eml";
//        String fil = FilenameUtils.getExtension(path).toLowerCase();
//        System.out.println(fil);

//        String extension = path.substring(path.lastIndexOf("."));
//        System.out.println(extension);

//        String strings = "/sdcard/Download/WeiXin/makensis.exe";
//
        System.out.println(strings.split(",").length);
//
//        String str = "54.002201223";
//        String jieguo = str.substring(0, str.indexOf(".") + 3);

//        System.out.println(isEmail("ex_jiagf.eyou@cnooc.com.cn")+"");
//
//        System.out.println(getFormatSizeKBtoMB(5077455.0)+"");

        String email = "jiaguangfeng@eyou.net";

        System.out.println(email.substring( 0,email.indexOf("@")+1));




    }

    public int aMethod() {
        int i = 0;
        i++;
        return i;
    }


    public static boolean isEmail(String string) {
        if (string == null)
            return false;
//        String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        String regEx1 = "^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$";
        Pattern p;
        Matcher m;
        p = Pattern.compile(regEx1);
        m = p.matcher(string);
        if (m.matches())
            return true;
        else
            return false;
    }

    public static double getFormatSizeKBtoMB(double size) {

        double gigaByte = size / (1024*1024);

        return gigaByte;


    }
}
