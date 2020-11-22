package com.example.medcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Healthtips extends AppCompatActivity {
    TextView et1,et2,et3,et4;
    String s1="PHYSICAL HEALTH TIPS:\n" +
            "\n" +
            "Eat a healthy diet.\n" +
            "Consume less salt and sugar.\n" +
            "Reduce intake of harmful fats.\n" +
            "Avoid harmful use of alcohol.\n" +
            "Don't smoke.\n" +
            "Be active.\n" +
            "Check your blood pressure regularly.\n" +
            "Get tested.\n";
    String s2="FOOD TIPS:\n" +
            "The key to a healthy diet is to eat the right amount of calories for how active you are so you balance the energy you consume with the energy you use.\n" +
            "If you eat or drink more than your body needs, you'll put on weight because the energy you do not use is stored as fat. If you eat and drink too little, you'll lose weight.\n" +
            "You should also eat a wide range of foods to make sure you're getting a balanced diet and your body is receiving all the nutrients it needs.\n" +
            "It's recommended that men have around 2,500 calories a day (10,500 kilojoules). Women should have around 2,000 calories a day (8,400 kilojoules).\n";
    String s3="VEG:\n" +
            "\n" +
            "A few healthy foods to eat on a vegetarian diet are:\n" +
            "Fruits: Apples, bananas, berries, oranges, melons, pears, peaches\n" +
            "Vegetables: Leafy greens, asparagus, broccoli, tomatoes, carrots\n" +
            "Grains: Quinoa, barley, buckwheat, rice, oats\n" +
            "Legumes: Lentils, beans, peas, chickpeas.\n" +
            "Nuts: Almonds, walnuts, cashews, chestnuts\n" +
            "Seeds: Flaxseeds, chia and hemp seeds\n" +
            "Healthy fats: Coconut oil, olive oil, avocados\n" +
            "Proteins: Tempeh, tofu, seitan, natto, nutritional yeast, spirulina, eggs, dairy products\n";
    String s4="Non-Veg:\n" +
            "\n" +
            "Vegetables: These should play a fundamental role at most meals. They are low in calories yet full of important micronutrients and fiber.\n" +
            "Fruits: A natural sweet treat, fruit provides micronutrients and antioxidants that can help improve health (19Trusted Source).\n" +
            "Meat and fish: Meat and fish have been the major sources of protein throughout evolution. They are a staple in the human diet, although vegetarian and vegan diets have become popular as well.\n" +
            "Nuts and seeds: These are one of the best fat sources available and also contain important micronutrients.\n" +
            "Eggs: Considered one of the healthiest foods on the planet, whole eggs pack a powerful combination of protein, beneficial fats and micronutrients (20).\n" +
            "Dairy: Dairy products such as natural yogurt and milk are convenient, low-cost sources of protein and calcium.\n" +
            "Healthy starches: For those who aren’t on a low-carb diet, whole food starchy foods like potatoes, quinoa and Ezekiel bread are healthy and nutritious.\n" +
            "Beans and legumes: These are fantastic sources of fiber, protein and micronutrients.\n" +
            "Beverages: Water should make up the majority of your fluid intake, along with drinks like coffee and tea.\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.healthtips);
        et1=findViewById(R.id.tip1);
        et2=findViewById(R.id.tip2);
        et3=findViewById(R.id.tip3);
        et4=findViewById(R.id.tip4);
        et1.setText(s1);
        et2.setText(s2);
        et3.setText(s3);
        et4.setText(s4);

    }
}