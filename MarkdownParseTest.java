import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

import java.nio.file.Files;
import java.nio.file.Path;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

	@Test
	public void getLinke() throws IOException {
		String[] files = {"test-file.md","anotherBug.md", "aNewFile.md"};
		List<List<String>> results = List.of(List.of("some-page.html","https://something.com"),
		 new ArrayList<String>, e3)
		for (int i = 0; i < files.length; i++) {
			Path fileName = Path.of(files[i]);
	    	String contents = Files.readString(fileName);
			ArrayList<String> res = MarkdownParse.getLinks(contents);
			List<String> ans = results.get(i);
			
			assertEquals(res, ans);
		}
		
		
	}
}