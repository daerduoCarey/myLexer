package main;

import java.util.*;
import java.io.*;
import token.*;
import main.*;

public class main
{
	public static void main(String[] args) throws IOException
	{
		lexer a = new lexer(args[0]);
		a.run();
		a.output();
	}
}
