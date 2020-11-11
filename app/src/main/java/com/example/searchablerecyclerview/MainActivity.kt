package com.example.searchablerecyclerview

import android.os.Bundle
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.searchablerecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val characterList = ArrayList<Character>()
    private lateinit var binding: ActivityMainBinding
    private lateinit var characterAdapter: CharacterAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout for this fragment using view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // fill data source
        fillListWithData()

        // bind controls
        val verticalLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.layoutManager = verticalLayoutManager
        characterAdapter = CharacterAdapter(this, characterList)
        binding.recyclerView.adapter = characterAdapter

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(queryString: String?): Boolean {
                characterAdapter.filter.filter(queryString)
                return false
            }

            override fun onQueryTextChange(queryString: String?): Boolean {
                characterAdapter.filter.filter(queryString)
                return false
            }
        })

    }

    @Suppress("SpellCheckingInspection")
    private fun fillListWithData() {
        // from https://en.wikipedia.org/wiki/List_of_The_Simpsons_characters
        if (characterList.size == 0) {
            characterList.add(Character("Homer Simpson"))
            characterList.add(Character("Marge Simpson"))
            characterList.add(Character("Bart Simpson"))
            characterList.add(Character("Lisa Simpson"))
            characterList.add(Character("Maggie Simpson"))
            characterList.add(Character("Abraham Simpson"))
            characterList.add(Character("Santas Little Helper"))
            characterList.add(Character("Snowball II/V"))
            characterList.add(Character("Apu Nahasapeemapetilon"))
            characterList.add(Character("Barney Gumble"))
            characterList.add(Character("Bleeding Gums Murphy"))
            characterList.add(Character("Chief Clancy Wiggum"))
            characterList.add(Character("Dewey Largo"))
            characterList.add(Character("Eddie"))
            characterList.add(Character("Edna Krabappel"))
            characterList.add(Character("Itchy"))
            characterList.add(Character("Janey Powell"))
            characterList.add(Character("Jasper Beardly"))
            characterList.add(Character("Kent Brockman"))
            characterList.add(Character("Krusty The Clown"))
            characterList.add(Character("Lenny Leonard"))
            characterList.add(Character("Lou"))
            characterList.add(Character("Martin Prince"))
            characterList.add(Character("Marvin Monroe"))
            characterList.add(Character("Milhouse Van Houten"))
            characterList.add(Character("Moe Szyslak"))
            characterList.add(Character("Mr. Burns"))
            characterList.add(Character("Ned Flanders"))
            characterList.add(Character("Otto Mann"))
            characterList.add(Character("Patty Bouvier"))
            characterList.add(Character("Ralph Wiggum"))
            characterList.add(Character("Reverend Timothy Lovejoy"))
            characterList.add(Character("Scratchy"))
            characterList.add(Character("Selma Bouvier"))
            characterList.add(Character("Seymour Skinner"))
            characterList.add(Character("Sherri"))
            characterList.add(Character("Sideshow Bob"))
            characterList.add(Character("Terri"))
            characterList.add(Character("Todd Flanders"))
            characterList.add(Character("Waylon Smithers"))
            characterList.add(Character("Wendell Borton"))
            characterList.add(Character("Bernice Hibbert"))
            characterList.add(Character("Blue-Haired Lawyer"))
            characterList.add(Character("Carl Carlson"))
            characterList.add(Character("Dolph Starbeam"))
            characterList.add(Character("Dr. Julius Hibbert"))
            characterList.add(Character("Dr. Nick Riviera"))
            characterList.add(Character("Elizabeth Hoover"))
            characterList.add(Character("Hans Moleman"))
            characterList.add(Character("Helen Lovejoy"))
            characterList.add(Character("Herman Hermann"))
            characterList.add(Character("Jacqueline Bouvier"))
            characterList.add(Character("Jimbo Jones"))
            characterList.add(Character("Kearney Zzyzwicz"))
            characterList.add(Character("Lionel Hutz"))
            characterList.add(Character("Maude Flanders"))
            characterList.add(Character("Mayor Joe Quimby"))
            characterList.add(Character("Nelson Muntz"))
            characterList.add(Character("Princess Kashmir"))
            characterList.add(Character("Professor Jonathan Frink"))
            characterList.add(Character("Rainier Wolfcastle"))
            characterList.add(Character("Rod Flanders"))
            characterList.add(Character("Sideshow Mel"))
            characterList.add(Character("Troy McClure"))
            characterList.add(Character("Wise Guy"))
            characterList.add(Character("Agnes Skinner"))
            characterList.add(Character("Akira Kurosawa"))
            characterList.add(Character("Comic Book Guy"))
            characterList.add(Character("Groundskeeper Willie"))
            characterList.add(Character("Judge Roy Snyder"))
            characterList.add(Character("Kang"))
            characterList.add(Character("Kodos"))
            characterList.add(Character("Luann Van Houten"))
            characterList.add(Character("Mr. Teeny"))
            characterList.add(Character("Snake Jailbird"))
            characterList.add(Character("Arnie Pye"))
            characterList.add(Character("Bumblebee Man"))
            characterList.add(Character("Drederick Tatum"))
            characterList.add(Character("Kirk Van Houten"))
            characterList.add(Character("Lunchlady Doris"))
            characterList.add(Character("Old Jewish Man"))
            characterList.add(Character("Ruth Powers"))
            characterList.add(Character("Sea Captain"))
            characterList.add(Character("Squeaky-Voiced Teen"))
            characterList.add(Character("Baby Gerald"))
            characterList.add(Character("Cletus Spuckler"))
            characterList.add(Character("Luigi Risotto"))
            characterList.add(Character("Miss Springfield"))
            characterList.add(Character("Superintendent Gary Chalmers"))
            characterList.add(Character("Alice Glick"))
            characterList.add(Character("Allison Taylor"))
            characterList.add(Character("Database"))
            characterList.add(Character("The Rich Texan"))
            characterList.add(Character("Sarah Wiggum"))
            characterList.add(Character("Üter Zörker"))
            characterList.add(Character("Brandine Spuckler"))
            characterList.add(Character("Disco Stu"))
            characterList.add(Character("Fat Tony"))
            characterList.add(Character("Louie"))
            characterList.add(Character("Mona Simpson"))
            characterList.add(Character("Legs"))
            characterList.add(Character("Gil Gunderson"))
            characterList.add(Character("Manjula Nahasapeemapetilon"))
            characterList.add(Character("Lindsey Naegle"))
            characterList.add(Character("Mrs. Vanderbilt"))
            characterList.add(Character("Artie Ziff"))
            characterList.add(Character("Duffman"))
            characterList.add(Character("Gloria Jailbird"))
            characterList.add(Character("The Yes Guy"))
            characterList.add(Character("Cookie Kwan"))
            characterList.add(Character("Johnny Tightlips"))
            characterList.add(Character("Rabbi Hyman Krustofsky"))
            characterList.add(Character("Crazy Cat Lady"))
            characterList.add(Character("Jessica Lovejoy"))
            characterList.add(Character("Booberella"))
            characterList.add(Character("Capital City Goofball"))
            characterList.add(Character("Leprechaun"))
            characterList.add(Character("Ling Bouvier"))
            characterList.add(Character("Julio"))
            characterList.add(Character("Mrs. Muntz"))
            characterList.add(Character("Chazz Busby"))
            characterList.add(Character("Roger Meyers, Jr."))
            characterList.add(Character("Shauna Chalmers"))
            characterList.add(Character("Kumiko Albertson"))
            characterList.add(Character("Surly Duff"))
        }
    }
}
