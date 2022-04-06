package com.geekbang.ppttools;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class TOCGenTest {

    @Test
    public void isThePPTNotPPTFile(){
        boolean ret = TOCGen.isThePPt(new File("noitppt"));
        Assert.assertFalse(ret);
    }

    @Test
    public void isThePPTIsPPTFile(){
        boolean ret = TOCGen.isThePPt(new File("001.pptx"));
        Assert.assertTrue(ret);
    }
}
