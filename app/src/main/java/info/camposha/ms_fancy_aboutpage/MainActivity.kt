package info.camposha.ms_fancy_aboutpage

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.shashank.sony.fancyaboutpagelib.FancyAboutPage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "About Page"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        val fancyAboutPage = findViewById<FancyAboutPage>(R.id.fancyaboutpage)
        //fancyAboutPage.setCoverTintColor(Color.BLUE); //Optional
        fancyAboutPage.setCover(R.drawable.coverimg)
        fancyAboutPage.setName("Shashank Singhal")
        fancyAboutPage.setDescription("Google Certified Associate Android Developer | Android App, Game, Web and Software Developer.")
        fancyAboutPage.setAppIcon(R.drawable.cakepop)
        fancyAboutPage.setAppName("Cake Pop Icon Pack")
        fancyAboutPage.setVersionNameAsAppSubTitle("1.2.3")
        fancyAboutPage.setAppDescription(
            """
    Cake Pop Icon Pack is an icon pack which follows Google's Material Design language.

    This icon pack uses the material design color palette given by google. Every icon is handcrafted with attention to the smallest details!

    A fresh new take on Material Design iconography. Cake Pop offers unique, creative and vibrant icons. Spice up your phones home-screen by giving it a fresh and unique look with Polycon.
    """.trimIndent()
        )
        fancyAboutPage.addEmailLink("shashanksinghal02@gmail.com")
        fancyAboutPage.addFacebookLink("https://www.facebook.com/shashanksinghal02")
        fancyAboutPage.addTwitterLink("https://twitter.com/shashank020597")
        fancyAboutPage.addLinkedinLink("https://www.linkedin.com/in/shashank-singhal-a87729b5/")
        fancyAboutPage.addGitHubLink("https://github.com/Shashank02051997")
    }
}