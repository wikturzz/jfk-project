import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Compiler {
    public void compile(String filename) throws IOException {
        final var input = CharStreams.fromFileName(filename);
        final var lexer = new MyLangLexer(input);
        final var tokens = new CommonTokenStream(lexer);
        final var parser = new MyLangParser(tokens);
        final var tree = parser.prog();
        final var walker = new ParseTreeWalker();
        final var actions = new Actions();
        walker.walk(actions, tree);

        String llvmCode = Generator.generate();

        Files.write(Paths.get("MyLang.ll"), llvmCode.getBytes());

        System.out.println("Kod LLVM został zapisany do pliku MyLang.ll");
    }
}
