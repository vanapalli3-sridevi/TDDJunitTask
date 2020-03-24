package com.Junit.TDDTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
class RemovefirstAat01inStringTest {
		/* 1 2 chars : AB->B
		 * 2 5 chars : BABCA->BABCA
		 * 3 n char  : ABCDEF->BCDEF
		 * 4 1 Char  : A->""
		 * 5 empty char : ""->""
		 * 6 6 char  : IBCDE->IBCDE
		 * 7 small char  : acd->acd
		 * 8 same char : AAAAA->AAAAA
		 * 9 2 char same : AA->""
		 * 10 singleA   : A->""
		 * 11 2 char  : BA->B
		 */
		RemovefirstAat01inString removefirstAat01inString;
		
		@BeforeEach
		void setUp() {
			removefirstAat01inString = new RemovefirstAat01inString();
		}
		@Test
		void test2chars() {
			assertEquals( "B", removefirstAat01inString.removeAFromStringinfirstTwoindex("AB"));
		}
		@Test
		void test5chars() {
			assertEquals("BBCA", removefirstAat01inString.removeAFromStringinfirstTwoindex("BABCA"));
		}
		@Test
		void testnchars() {
			assertEquals("BCDEF", removefirstAat01inString.removeAFromStringinfirstTwoindex("ABCDEF"));
		}
		@Test
		void test1chars() {
			assertEquals("", removefirstAat01inString.removeAFromStringinfirstTwoindex("A"));
		}
		@Test
		void testemptychars() {
			assertEquals("", removefirstAat01inString.removeAFromStringinfirstTwoindex(""));
		}
		@Test
		void test6chars() {
			assertEquals("IBCDE", removefirstAat01inString.removeAFromStringinfirstTwoindex("IBCDE"));
		}
		@Test
		void testsmallchars() {
			assertEquals("acd", removefirstAat01inString.removeAFromStringinfirstTwoindex("acd"));
		}
		@Test
		void testsamechars() {
			assertEquals("AAA", removefirstAat01inString.removeAFromStringinfirstTwoindex("AAAAA"));
		}
		@Test
		void testsame2chars() {
			assertEquals("", removefirstAat01inString.removeAFromStringinfirstTwoindex("AA"));
		}
		@Test
		void testsingleAchars() {
			assertEquals("", removefirstAat01inString.removeAFromStringinfirstTwoindex("A"));
		}
		@Test
		void testBAchars() {
			assertEquals("B", removefirstAat01inString.removeAFromStringinfirstTwoindex("BA"));
		}

		
		

}
