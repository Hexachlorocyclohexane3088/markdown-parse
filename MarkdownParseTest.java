import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
	
		Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
		ArrayList<String> res = MarkdownParse.getLinks(contents);
		ArrayList<String> ans = new ArrayList<>();
		ans.add("https://something.com");
		ans.add("some-page.html");
		assertEquals(res, ans);
	}
}