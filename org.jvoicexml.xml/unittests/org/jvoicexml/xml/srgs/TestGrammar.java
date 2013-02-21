/*
 * File:    $HeadURL$
 * Version: $LastChangedRevision$
 * Date:    $Date$
 * Author:  $LastChangedBy$
 *
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2008-2010 JVoiceXML group - http://jvoicexml.sourceforge.net
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

package org.jvoicexml.xml.srgs;

import java.io.File;
import java.io.FileReader;

import junit.framework.Assert;

import org.junit.Test;
import org.jvoicexml.xml.IllegalAttributeException;
import org.jvoicexml.xml.VoiceXmlNode;
import org.jvoicexml.xml.vxml.VoiceXmlDocument;
import org.xml.sax.InputSource;

/**
 * Test cases for {@link Grammar}.
 * @author Dirk Schnelle-Walka
 * @version $Revision$
 * @since 0.7
 */
public final class TestGrammar {
    /** Base directory with test grammars. */
    private static final String SRGS_BASE =
        "../org.jvoicexml/test/config/custom_grammar/";

    /**
     * Test method for {@link org.jvoicexml.xml.srgs.Grammar#getRootRule()}.
     * @exception Exception
     *            test failed
     */
    @Test
    public void testGetRootRule() throws Exception {
        SrgsXmlDocument document = new SrgsXmlDocument();
        Grammar grammar = document.getGrammar();
        grammar.setRoot("test");
        Rule rule = grammar.appendChild(Rule.class);
        rule.setId("test");

        Rule rootRule = grammar.getRootRule();
        Assert.assertEquals(rule, rootRule);
    }

    /**
     * Test method for {@link org.jvoicexml.xml.srgs.Grammar#getRule(String))}.
     * @exception Exception
     *            test failed
     */
    @Test
    public void testGetRule() throws Exception {
        SrgsXmlDocument document = new SrgsXmlDocument();
        Grammar grammar = document.getGrammar();
        grammar.setRoot("test1");
        Rule rule1 = grammar.appendChild(Rule.class);
        rule1.setId("test1");
        Rule rule2 = grammar.appendChild(Rule.class);
        rule2.setId("test2");

        Rule rule1Node = grammar.getRule("test1");
        Assert.assertEquals(rule1, rule1Node);
        Rule rule2Node = grammar.getRule("test2");
        Assert.assertEquals(rule2, rule2Node);
    }

    /**
     * Test method for {@link org.jvoicexml.xml.srgs.Grammar#setType(GrammarType))}.
     * @exception Exception
     *            test failed
     */
    @Test
    public void testSetType() throws Exception {
        SrgsXmlDocument document = new SrgsXmlDocument();
        Grammar grammar = document.getGrammar();
        grammar.setType(GrammarType.SRGS_XML);
        Assert.assertEquals(GrammarType.SRGS_XML, grammar.getType());
        Assert.assertEquals(GrammarType.SRGS_XML.getType(),
                grammar.getTypename());
    }

    /**
     * Try to process a srgs abnf grammar.
     * @exception Exception test failed
     */
    @Test(expected = IllegalAttributeException.class)
    public void testIsExternalInvalid1() throws Exception {
        File testFile = new File(SRGS_BASE + "external/invalid1.grxml");
        /* create a VoiceXmlDocument from the string */
        final VoiceXmlDocument document = new VoiceXmlDocument(
                new InputSource(new FileReader(testFile)));
        /* Lets test, if it is srgs+xml */
        final VoiceXmlNode node = (VoiceXmlNode) document.getFirstChild();
        if (node instanceof Grammar) {
            /* ok, it seems to be a srgs xml grammar */
            Grammar gr = (Grammar) node;
            /* now test isExternalMethod */
            gr.isExternalGrammar();
        }
    }

    /**
     * Try to process a srgs abnf grammar.
     * @exception Exception test failed
     */
    @Test(expected = IllegalAttributeException.class)
    public void testIsExternalInvalid2() throws Exception {
        File testFile = new File(SRGS_BASE + "external/invalid2.grxml");
        /* create a VoiceXmlDocument from the string */
        final VoiceXmlDocument document = new VoiceXmlDocument(
                new InputSource(new FileReader(testFile)));
        /* Lets test, if it is srgs+xml */
        final VoiceXmlNode node = (VoiceXmlNode) document.getFirstChild();
        if (node instanceof Grammar) {
            /* ok, it seems to be a srgs xml grammar */
            Grammar gr = (Grammar) node;

            /* now test isExternalMethod */
            gr.isExternalGrammar();
        }
    }

    /**
     * Try to process a srgs abnf grammar.
     * @exception Exception test failed
     */
    @Test(expected = IllegalAttributeException.class)
    public void testIsExternalInvalid3() throws Exception {
        File testFile = new File(SRGS_BASE + "external/invalid3.grxml");
        /* create a VoiceXmlDocument from the string */
        final VoiceXmlDocument document = new VoiceXmlDocument(
                new InputSource(new FileReader(testFile)));
        /* Lets test, if it is srgs+xml */
        final VoiceXmlNode node = (VoiceXmlNode) document.getFirstChild();
        if (node instanceof Grammar) {
            /* ok, it seems to be a srgs xml grammar */
            Grammar gr = (Grammar) node;

            /* now test isExternalMethod */
            gr.isExternalGrammar();
        }
    }

    /**
     * Try to process a srgs abnf grammar.
     * @exception Exception test failed
     */
    @Test(expected = IllegalAttributeException.class)
    public void testIsExternalInvalid4() throws Exception {
        File testFile = new File(SRGS_BASE + "external/invalid4.grxml");
        /* create a VoiceXmlDocument from the string */
        final VoiceXmlDocument document = new VoiceXmlDocument(
                new InputSource(new FileReader(testFile)));
        /* Lets test, if it is srgs+xml */
        final VoiceXmlNode node = (VoiceXmlNode) document.getFirstChild();
        if (node instanceof Grammar) {
            /* ok, it seems to be a srgs xml grammar */
            Grammar gr = (Grammar) node;

            /* now test isExternalMethod */
            gr.isExternalGrammar();
        }
    }

    /**
     * Try to process a srgs abnf grammar.
     * @exception Exception test failed
     */
    @Test
    public void testIsExternalValid1() throws Exception  {
        File testFile = new File(SRGS_BASE + "external/valid1.grxml");
        /* create a VoiceXmlDocument from the string */
        final VoiceXmlDocument document = new VoiceXmlDocument(
                new InputSource(new FileReader(testFile)));
        /* Lets test, if it is srgs+xml */
        final VoiceXmlNode node = (VoiceXmlNode) document.getFirstChild();
        if (node instanceof Grammar) {
            /* ok, it seems to be a srgs xml grammar */
            Grammar gr = (Grammar) node;

            /* now test isExternalMethod */
            Assert.assertEquals(true, gr.isExternalGrammar());
        }
    }

    /**
     * Try to process a srgs abnf grammar.
     * @exception Exception test failed
     */
    public void testIsExternalValid2() throws Exception {
        File testFile = new File(SRGS_BASE + "external/valid2.grxml");
        /* create a VoiceXmlDocument from the string */
        final VoiceXmlDocument document = new VoiceXmlDocument(
                new InputSource(new FileReader(testFile)));
        /* Lets test, if it is srgs+xml */
        final VoiceXmlNode node = (VoiceXmlNode) document.getFirstChild();
        if (node instanceof Grammar) {
            /* ok, it seems to be a srgs xml grammar */
            Grammar gr = (Grammar) node;

            /* now test isExternalMethod */
            Assert.assertEquals(true, gr.isExternalGrammar());
        }
    }

    /**
     * Try to process a srgs abnf grammar.
     * @exception Exception test failed
     */
    @Test
    public void testIsExternalvalid3() throws Exception {
        File testFile = new File(SRGS_BASE + "inline/valid1.grxml");
        /* create a VoiceXmlDocument from the string */
        final VoiceXmlDocument document = new VoiceXmlDocument(
                new InputSource(new FileReader(testFile)));
        /* Lets test, if it is srgs+xml */
        final VoiceXmlNode node = (VoiceXmlNode) document.getFirstChild();
        if (node instanceof Grammar) {
            /* ok, it seems to be a srgs xml grammar */
            Grammar gr = (Grammar) node;

            /* now test isExternalMethod */
            Assert.assertEquals(false, gr.isExternalGrammar());
        }
    }
}
