package com.geekbang.ppttools;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class TOCGen {
    public static void main(String[] args) throws Exception{

        String toc = genTocFromPPTX("");
    }

    private static String genTocFromPPTX(String s)throws Exception{
        File rootDir = new File(s);
        StringBuffer ret = new StringBuffer("# 0.自我介绍\n\n");
        for (File pptx : rootDir.listFiles()){
            if (isThePPt(pptx)){
                ret.append('\n').append(PPTXUtils.getToc(pptx)).append('\n');
            }
        }
        return ret.toString();
    }

    static boolean isThePPt(File pptx){
        String pptxName = pptx.getName();
        if (!pptxName.endsWith("pptx")){
            return false;
        }
        for (char ch : pptxName.substring(0,pptxName.indexOf('.')).toCharArray()){
            if (!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }


}
