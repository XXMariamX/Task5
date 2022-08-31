package com.example.task5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.Recycler)
        val listOfFruits=getListOfFruits()
        val fruitAdapter=FruitAdapter(listOfFruits)
        recyclerView.adapter=fruitAdapter
    }

    private fun getListOfFruits(): List<Fruit> {
        val fruits = mutableListOf<Fruit>()
        fruits.add(Fruit("Coconut", R.drawable.coconut_svgrepo_com__1_, "A coconut is the edible fruit of the coconut palm (Cocos nucifera), a tree of the palm family. Coconut flesh is high in fat and can be dried or eaten fresh or processed into coconut milk or coconut oil. The liquid of the nut, known as coconut water, is used in beverages."))
        fruits.add(Fruit("Avocado", R.drawable.avocado_svgrepo_com, "The avocado (Persea americana) is a medium-sized, evergreen tree in the laurel family (Lauraceae), native to the Americas. It is widely cultivated for its large, fleshy fruit. The tree likely originated in the highland regions of south-central Mexico to Guatemala."))
        fruits.add(Fruit("Banana", R.drawable.banana_svgrepo_com, "Banana is one of the most important fruit crops of the world. The banana is grown in the tropics, and, though it is most widely consumed in those regions, it is valued worldwide for its flavour, nutritional value, and availability throughout the year."))
        fruits.add(Fruit("Blueberries", R.drawable.blueberries_svgrepo_com, "Blueberries can be eaten freshly picked or incorporated into a variety of recipes. They can also be purchased frozen. They have been shown to protect against heart disease and cancer, and can also help maintain bone strength, mental health, and healthful blood pressure."))
        fruits.add(Fruit("Apple", R.drawable.green_apple_svgrepo_com, "An apple is an edible fruit produced by an apple tree (Malus domestica). Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today."))
        fruits.add(Fruit("Kiwi", R.drawable.kiwi_svgrepo_com, "Kiwifruit (often shortened to kiwi in North America and continental Europe) or Chinese gooseberry is the edible berry of several species of woody vines in the genus Actinidia.[1][2] The most common cultivar group of kiwifruit (Actinidia deliciosa 'Hayward')[3] is oval, about the size of a large hen's egg: 5–8 centimetres (2–3 inches) in length and 4.5–5.5 cm (1+3⁄4–2+1⁄4 in) in diameter"))
        fruits.add(Fruit("Lime", R.drawable.lime_svgrepo_com__1_, "Lime is a green fruit, and the tree fruit itself. They are citrus fruits similar to lemons. Citrus fruits like limes are rich in vitamin C. Sailors from Britain were given lemon or lime juice to stop them falling ill with scurvy. This is how they got the nickname Limey."))
        fruits.add(Fruit("Mango", R.drawable.mango_svgrepo_com, "In some parts of the world, mango (Mangifera indica) is called the “king of fruits” (1Trusted Source). It’s a drupe, or stone fruit, which means that it has a large seed in the middle. Mango is native to India and Southeast Asia, and people have cultivated it for over 4,000 years. Hundreds of types of mango exist, each with its own characteristic taste, shape, size, and color"))
        fruits.add(Fruit("Peach", R.drawable.peach_svgrepo_com, "Peach, (Prunus persica), fruit tree of the rose family (Rosaceae) grown throughout the warmer temperate regions of both the Northern and Southern hemispheres. Peaches are widely eaten fresh and are also baked in pies and cobblers; canned peaches are a staple commodity in many regions. Yellow-fleshed varieties are especially rich in vitamin A."))
        fruits.add(Fruit("Tomato", R.drawable.tomato_svgrepo_com, "Tomato, (Solanum lycopersicum), flowering plant of the nightshade family (Solanaceae), cultivated extensively for its edible fruits. Labelled as a vegetable for nutritional purposes, tomatoes are a good source of vitamin C and the phytochemical lycopene. The fruits are commonly eaten raw in salads, served as a cooked vegetable, used as an ingredient of various prepared dishes, and pickled. "))
        fruits.add(Fruit("Watermelon", R.drawable.watermelon_svgrepo_com, "Watermelon, (Citrullus lanatus), succulent fruit and vinelike plant of the gourd family (Cucurbitaceae), native to tropical Africa and cultivated around the world. The fruit contains vitamin A and some vitamin C and is usually eaten raw. The rind is sometimes preserved as a pickle."))
        fruits.add(Fruit("Olives", R.drawable.olives_svgrepo_com, "Olives are small fruits that grow on olive trees (Olea europaea). They belong to a group of fruit called drupes, or stone fruits, and are related to mangoes, cherries, peaches, almonds, and pistachios.Olives are very high in vitamin E and other powerful antioxidants. Studies show that they are good for the heart and may protect against osteoporosis and cancer."))
        fruits.add(Fruit("Grapes", R.drawable.grapes_svgrepo_com, "Grape, (genus Vitis), genus of about 60 to 80 species of vining plants in the family Vitaceae, native to the north temperate zone, including varieties that may be eaten as table fruit, dried to produce raisins, or crushed to make grape juice or wine."))

        return fruits
    }


}