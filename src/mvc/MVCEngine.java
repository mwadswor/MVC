package mvc;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;

public class MVCEngine {

	private static ArgumentParser parser;
	
	
	
	public static void main(String[] args){
		
		MVCEngine mvc = new MVCEngine();
		mvc.run();
	}
	
	private void run(){
		parser = parserSetUp();
		
		return;
	}

	private ArgumentParser parserSetUp() {
		ArgumentParser parser = ArgumentParsers.newArgumentParser("MVC", true, "-");
		
		parser.description("Mitochondrial Variant Caller (MVC) has been created to facilitate the" + 
				" detection of false positives and heteroplasmic variants in Next Generation Sequencing of mtDNA.");
		
		
		
		return parser;
	}
}
