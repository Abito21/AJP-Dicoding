package com.dicoding.ajp_dicoding1.utils

import com.dicoding.ajp_dicoding1.R
import com.dicoding.ajp_dicoding1.data.Movies

// Objek terdiri dari data Movie atau Film dan TV Show atau serial TV.
object DataMoview {
    // Mengembalikan nilai data berupa array yang terdiri id, title, -
    // description, genre, realease year dan gambar poster.

    // Data : Item Movie
    fun getDataMovies(): ArrayList<Movies> {

        return arrayListOf(
            Movies(
                "MOVIE-1",
                "Overlord",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "Horror, War, Science Fiction",
                "2018",
                R.drawable.poster_overlord
            ),

            Movies(
                "MOVIE-2",
                "Spider-Man: Into the Spider-Verse",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "Action, Adventure, Animation, Science Fiction, Comedy",
                "2019",
                R.drawable.poster_spiderman
            ),

            Movies(
                "MOVIE-3",
                "T-34",
                "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                "War, Action, Drama, History",
                "2018",
                R.drawable.poster_t34
            ),

            Movies(
                "MOVIE-4",
                "How to Train Your Dragon: The Hidden World",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "Animation, Family, Adventure",
                "2019",
                R.drawable.poster_how_to_train
            ),

            Movies(
                "MOVIE-5",
                "Mortal Engines",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "Adventure, Fantasy",
                "2018",
                R.drawable.poster_mortal_engines
            ),

            Movies(
                "MOVIE-6",
                "Aquaman",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "Action, Adventure, Fantasy",
                "2019",
                R.drawable.poster_aquaman
            ),

            Movies(
                "MOVIE-7",
                "Cold Pursuit",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "Action, Crime, Thriller",
                "2019",
                R.drawable.poster_cold_persuit
            ),

            Movies(
                "MOVIE-8",
                "Alita: Battle Angel",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "Action, Science Fiction, Adventure",
                "2019",
                R.drawable.poster_alita
            ),

            Movies(
                "MOVIE-9" +
                        "",
                "Creed II",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "Drama",
                "2019",
                R.drawable.poster_creed
            ),

            Movies(
                "MOVIE-10",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "Adventure, Fantasy, Drama",
                "2018",
                R.drawable.poster_crimes
            )
        )
    }

    // Data : Item Tv Show
    fun getDataTvShows(): ArrayList<Movies> {

        return arrayListOf(
            Movies(
                "TVSHOW-1",
                "Dragon Ball",
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                "Comedy, Sci-Fi & Fantasy, Animation, Action & Adventure",
                "1989",
                R.drawable.poster_dragon_ball
            ),

            Movies(
                "TVSHOW-2",
                "Marvel's Iron Fist",
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "2017",
                R.drawable.poster_iron_fist
            ),

            Movies(
                "TVSHOW-3",
                "Naruto Shippūden",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "Animation, Comedy, Drama",
                "2007",
                R.drawable.poster_naruto_shipudden
            ),

            Movies(
                "TVSHOW-4",
                "The Simpsons",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "Animation, Comedy, Family, Drama",
                "1989",
                R.drawable.poster_the_simpson
            ),

            Movies(
                "TVSHOW-5",
                "Arrow",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "Crime, Drama, Mystery, Action & Adventure",
                "2012",
                R.drawable.poster_arrow
            ),

            Movies(
                "TVSHOW-6",
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "Drama, Sci-Fi & Fantasy",
                "2014",
                R.drawable.poster_flash
            ),

            Movies(
                "TVSHOW-7",
                "Game of Thrones",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "Sci-Fi & Fantasy, Drama, Action & Adventure, Mystery",
                "1h",
                R.drawable.poster_got
            ),

            Movies(
                "TVSHOW-8",
                "Gotham",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "Drama, Fantasy, Crime",
                "2014",
                R.drawable.poster_gotham
            ),

            Movies(
                "TVSHOW-9",
                "Grey's Anatomy",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "Drama",
                "2005",
                R.drawable.poster_grey_anatomy
            ),

            Movies(
                "TVSHOW-10",
                "Hanna",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                "Action & Adventure, Drama",
                "2019",
                R.drawable.poster_hanna
            )

        )
    }

}