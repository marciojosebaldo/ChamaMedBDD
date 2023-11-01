import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue={""},
monochrome = true,
        plugin = {"pretty", "json:target/JSONReports/report.json",
        "junit:target/JUnitReports/report.xml",
                "html:target/HTMLReports/HtmlReports"}
        // As 3 linhas acima salva os relatórios em três arquivos diferentes
        , tags = "@smoketest"
//        A anotação @smoketest serve para fazer o teste de aplicações que tenham esta anotação
)
public class TestRunner {
}