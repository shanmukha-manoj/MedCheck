package com.example.medcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class Diagnosis extends AppCompatActivity {

    ExpandableTextView etv1,etv2,etv3,etv4,etv5,etv6,etv7,etv8,etv9,etv10,etv11,etv12,etv13,etv14,etv15,etv16,etv17,etv18,etv19,etv20,etv21,etv22,etv23,etv24,etv25,etv26,etv27,etv28,etv29,etv30,etv31,etv32,etv33,etv34,etv35,etv36,etv37,etv38,etv39,etv40,etv41;

    String med1="Fungal infection:\n" +
            "\n" +
            "Diagnosis of fungal infection has relied primarily on methods such as direct microscopic examination of clinical samples, histopathology, and culture. Such approaches are dependent on personnel with relatively high levels of specific mycology training. \n" +
            "\n" +
            "The growth in the number of fungi that clinical mycologists must identify has forced investigators to develop and apply new methods for fungal identification that go beyond classical phenotypic methods. \n" +
            "\n" +
            "As a consequence, there is an increased emphasis on the use of molecular methods and antigen detection as surrogates for culture in diagnosis of fungal diseases.\n";

    String med2="Allergy:\n" +
            "\n" +
            "Doctors diagnose allergies in three steps:\n" +
            "\n" +
            "Personal and medical history. Your doctor will ask you questions to get a complete understanding of your symptoms and their possible causes. Bring your notes to help jog your memory. Be ready to answer questions about your family history, the kinds of medicines you take, and your lifestyle at home, school and work.\n" +
            " \n" +
            "Physical exam. If your doctor thinks you have an allergy, they will pay close attention to your ears, eyes, nose, throat, chest and skin during the exam. This exam may include a lung function test to detect how well you exhale air from your lungs. You may also need an X-ray of your lungs or sinuses.\n" +
            "\n" +
            "Tests to determine your allergens. Your doctor may do a skin test, patch test or blood test. No one test alone is able to diagnose an allergy. Test results are just one of many tools available to assist your doctor in making a diagnosis.\n";

    String med3="Gerd:\n" +
            "\n" +
            "Your doctor might be able to diagnose GERD based on a physical examination and history of your signs and symptoms.\n" +
            "\n" +
            "To confirm a diagnosis of GERD, or to check for complications, your doctor might recommend:\n" +
            "\n" +
            "Upper endoscopy. Your doctor inserts a thin, flexible tube equipped with a light and camera (endoscope) down your throat, to examine the inside of your esophagus and stomach. Test results can often be normal when reflux is present, but an endoscopy may detect inflammation of the esophagus (esophagitis) or other complications. An endoscopy can also be used to collect a sample of tissue (biopsy) to be tested for complications such as Barrett's esophagus.\n" +
            "\n" +
            "Ambulatory acid (pH) probe test. A monitor is placed in your esophagus to identify when, and for how long, stomach acid regurgitates there. The monitor connects to a small computer that you wear around your waist or with a strap over your shoulder. The monitor might be a thin, flexible tube (catheter) that's threaded through your nose into your esophagus, or a clip that's placed in your esophagus during an endoscopy and that gets passed into your stool after about two days.\n" +
            "\n" +
            "Esophageal manometry. This test measures the rhythmic muscle contractions in your esophagus when you swallow. Esophageal manometry also measures the coordination and force exerted by the muscles of your esophagus.\n" +
            "\n" +
            "X-ray of your upper digestive system. X-rays are taken after you drink a chalky liquid that coats and fills the inside lining of your digestive tract. The coating allows your doctor to see a silhouette of your esophagus, stomach and upper intestine. You may also be asked to swallow a barium pill that can help diagnose a narrowing of the esophagus that may interfere with swallowing.\n";
    String med4="Chronic Cholestasis:\n" +
            "\n" +
            "Cholestasis can be suspected when there is an elevation of both 5'-nucleotidase and ALP enzymes. With a few exceptions, the optimal test for cholestasis would be elevations of serum bile acid levels. \n" +
            "\n" +
            "However, this is not normally available in most clinical settings. The gamma-glutamyl transferase (GGT) enzyme was previously thought to be helpful in confirming a hepatic source of ALP; however, GGT elevations lack the necessary specificity to be a useful confirmatory test for ALP. \n" +
            "\n" +
            "Normally GGT and ALP are anchored to membranes of hepatocytes and are released in small amounts in hepatocellular damage. In cholestasis, synthesis of these enzymes is induced and they are made soluble. GGT is elevated because it leaks out from the bile duct cells due to pressure from inside bile ducts. \n" +
            "In a later stage of cholestasis AST, ALT and unconjugated bilirubin may be elevated due to hepatocyte damage as a secondary effect of cholestasis.\n";
    String med5="Drug reaction:\n" +
            "\n" +
            "An accurate diagnosis is essential. Research has suggested that drug allergies may be overdiagnosed and that patients may report drug allergies that have never been confirmed. Misdiagnosed drug allergies may result in the use of less appropriate or more expensive drugs.\n" +
            "\n" +
            "Your doctor will conduct a physical examination and ask you questions. Details about the onset of symptoms, the time you took medications, and improvement or worsening of symptoms are important clues for helping your doctor make a diagnosis.\n" +
            "\n" +
            "Your doctor may order additional tests or refer you to an allergy specialist (allergist) for tests. \n" +
            "These may include the following.\n" +
            "1)Blood test\n" +
            "2)Skin test\n";
    String med6="Peptic ulcer:\n" +
            "\n" +
            "To detect an ulcer, your doctor may first take a medical history and perform a physical exam. You then may need to undergo diagnostic tests, such as:\n" +
            "\n" +
            "Laboratory tests for H. pylori. Your doctor may recommend tests to determine whether the bacterium H. pylori is present in your body. He or she may look for H. pylori using a blood, stool or breath test. The breath test is the most accurate.\n" +
            "For the breath test, you drink or eat something that contains radioactive carbon. H. pylori breaks down the substance in your stomach. Later, you blow into a bag, which is then sealed. If you're infected with H. pylori, your breath sample will contain the radioactive carbon in the form of carbon dioxide.\n" +
            "\n" +
            "Endoscopy. Your doctor may use a scope to examine your upper digestive system (endoscopy). During endoscopy, your doctor passes a hollow tube equipped with a lens (endoscope) down your throat and into your esophagus, stomach and small intestine. Using the endoscope, your doctor looks for ulcers.\n" +
            "If your doctor detects an ulcer, a small tissue sample (biopsy) may be removed for examination in a lab. A biopsy can also identify whether H. pylori is in your stomach lining.\n" +
            "\n" +
            "Upper gastrointestinal series. Sometimes called a barium swallow, this series of X-rays of your upper digestive system creates images of your esophagus, stomach and small intestine. During the X-ray, you swallow a white liquid (containing barium) that coats your digestive tract and makes an ulcer more visible.\n";
    String med7="AIDS:\n" +
            "\n" +
            "HIV can be diagnosed through blood or saliva testing. Available tests include:\n" +
            "\n" +
            "Antigen/antibody tests. These tests usually involve drawing blood from a vein. Antigens are substances on the HIV virus itself and are usually detectable — a positive test — in the blood within a few weeks after exposure to HIV.\n" +
            "Antibodies are produced by your immune system when it's exposed to HIV. It can take weeks to months for antibodies to become detectable. The combination antigen/antibody tests can take two to six weeks after exposure to become positive.\n" +
            "\n" +
            "Antibody tests. These tests look for antibodies to HIV in blood or saliva. Most rapid HIV tests, including self-tests done at home, are antibody tests. Antibody tests can take three to 12 weeks after you're exposed to become positive.\n" +
            "\n" +
            "Nucleic acid tests (NATs). These tests look for the actual virus in your blood (viral load). They also involve blood drawn from a vein. If you might have been exposed to HIV within the past few weeks, your doctor may recommend NAT. NAT will be the first test to become positive after exposure to HIV.\n";

    String med8="Diabetes:\n" +
            "\n" +
            "Diabetes is diagnosed with fasting sugar blood tests or with A1c blood tests, also known as glycated hemoglobin tests. A fasting blood sugar test is performed after you have had nothing to eat or drink for at least eight hours. Normal fasting blood sugar is less than 100 mg/dl (5.6 mmol/l). You do not have to be fasting for an A1c blood test. Diabetes is diagnosed by one of the following (see chart):\n" +
            "\n" +
            "Your blood sugar level is equal to or greater than 126 mg/dl (7 mmol/l).\n" +
            "You have two random blood sugar tests over 200 mg/dl (11.1 mmol/l) with symptoms.\n" +
            "You have an oral glucose tolerance test with results over 200 mg/dl (11.1 mmol/l).\n" +
            "Your A1c test is greater than 6.5 percent on two separate days.\n" +
            "\n";
    String med9="Gastroenteritis:\n" + "\n"+
            "Your doctor will likely diagnose gastroenteritis based on symptoms, a physical exam and sometimes on the presence of similar cases in your community. \n" +
            "A rapid stool test can detect rotavirus or norovirus, but there are no quick tests for other viruses that cause gastroenteritis. In some cases, your doctor may have you submit a stool sample to rule out a possible bacterial or parasitic infection.\n";
    String med10="Bronchial Asthama:\n" +
            "\n" +
            "Your doctor will perform a physical exam to rule out other possible conditions, such as a respiratory infection or chronic obstructive pulmonary disease (COPD). Your doctor will also ask you questions about your signs and symptoms and about any other health problems.\n" +
            "\n" +
            "Tests to measure lung function\n" +
            "You may be given lung function tests to determine how much air moves in and out as you breathe. These tests may include:\n" +
            "\n" +
            "Spirometry. This test estimates the narrowing of your bronchial tubes by checking how much air you can exhale after a deep breath and how fast you can breathe out.\n" +
            "\n" +
            "Peak flow. A peak flow meter is a simple device that measures how hard you can breathe out. Lower than usual peak flow readings are a sign that your lungs may not be working as well and that your asthma may be getting worse. Your doctor will give you instructions on how to track and deal with low peak flow readings.\n" +
            "Lung function tests often are done before and after taking a medication to open your airways called a bronchodilator (brong-koh-DIE-lay-tur), such as albuterol. If your lung function improves with use of a bronchodilator, it's likely you have asthma.\n";
    String med11="Hypertension:\n" +
            "\n" +
            "To measure your blood pressure, your doctor or a specialist will usually place an inflatable arm cuff around your arm and measure your blood pressure using a pressure-measuring gauge.\n" +
            "A blood pressure reading, given in millimeters of mercury (mm Hg), has two numbers. The first, or upper, number measures the pressure in your arteries when your heart beats (systolic pressure). The second, or lower, number measures the pressure in your arteries between beats (diastolic pressure).\n" +
            "Blood pressure measurements fall into four general categories:\n" +
            "\n" +
            "Normal blood pressure. Your blood pressure is normal if it's below 120/80 mm Hg.\n" +
            "\n" +
            "Elevated blood pressure. Elevated blood pressure is a systolic pressure ranging from 120 to 129 mm Hg and a diastolic pressure below 80 mm Hg. Elevated blood pressure tends to get worse over time unless steps are taken to control blood pressure.\n" +
            "\n" +
            "Stage 1 hypertension. Stage 1 hypertension is a systolic pressure ranging from 130 to 139 mm Hg or a diastolic pressure ranging from 80 to 89 mm Hg.\n" +
            "\n" +
            "Stage 2 hypertension. More severe hypertension, stage 2 hypertension is a systolic pressure of 140 mm Hg or higher or a diastolic pressure of 90 mm Hg or higher.\n";
    String med12="Migrane:\n" +
            "\n" +
            "If you have migraines or a family history of migraines, a doctor trained in treating headaches (neurologist) will likely diagnose migraines based on your medical history, symptoms, and a physical and neurological examination.\n" +
            "\n" +
            "If your condition is unusual, complex or suddenly becomes severe, tests to rule out other causes for your pain might include:\n" +
            "\n" +
            "MRI. An MRI scan uses a powerful magnetic field and radio waves to produce detailed images of the brain and blood vessels. MRI scans help doctors diagnose tumors, strokes, bleeding in the brain, infections, and other brain and nervous system (neurological) conditions.\n" +
            "\n" +
            "CT scan. A CT scan uses a series of X-rays to create detailed cross-sectional images of the brain. This helps doctors diagnose tumors, infections, brain damage, bleeding in the brain and other possible medical problems that may be causing headaches.\n";

    String med13="Cervical Spondylosis:\n" +
            "\n" +
            "Your doctor will likely start with a physical exam that includes:\n" +
            "Checking the range of motion in your neck\n" +
            "Testing your reflexes and muscle strength to find out if there's pressure on your spinal nerves or spinal cord\n" +
            "Watching you walk to see if spinal compression is affecting your gait\n" +
            "\n" +
            "Imaging tests\n" +
            "Imaging tests can provide detailed information to guide diagnosis and treatment. Your doctor might recommend:\n" +
            "\n" +
            "Neck X-ray. An X-ray can show abnormalities, such as bone spurs, that indicate cervical spondylosis. Neck X-ray can also rule out rare and more serious causes for neck pain and stiffness, such as tumors, infections or fractures.\n" +
            "\n" +
            "CT scan. A CT scan can provide more detailed imaging, particularly of bones.\n" +
            "\n" +
            "MRI. MRI can help pinpoint areas where nerves might be pinched.\n" +
            "\n" +
            "Myelography. A tracer dye is injected into the spinal canal to provide more detailed X-ray or CT imaging.\n";
    String med14="Paralysis:\n" +
            "\n" +
            "Diagnosing paralysis is often easy to do because the main symptom — loss of muscle control in a body area — is obvious. An important part of the diagnosis is to determine the cause of the paralysis. This can be relatively straightforward if the paralysis occurs after an event such as a stroke or spinal cord injury. Sometimes, the doctor might want to learn more about the injury that’s causing the paralysis, the degree of the paralysis, and/or the state of the nerves involved. To do that, the doctor might use one or more of these tests:\n" +
            "\n" +
            "X-ray: This test uses small amounts of radiation to produce detailed images of the dense structures inside the body, such as the bones.\n" +
            "\n" +
            "CT scan: CT uses computers to combine many X-ray images into cross-sectional views of the inside of the body.\n" +
            "\n" +
            "MRI: MRI uses a large magnet, radio waves, and a computer to create clear images of the body.\n" +
            "\n" +
            "Myelography: This test uses a contrast dye that is injected into the spinal canal to make the nerves show up very clearly on an X-ray, CT scan, or MRI.\n" +
            "\n" +
            "Electromyography (EMG): This test is used to measure the electrical activity in the muscles and nerves.\n" +
            "Spinal tap: A long needle is injected into the spine to collect spinal fluid.\n";
    String med15="Jaundice:\n" +
            "\n" +
            "Doctors diagnose jaundice by checking for signs of liver disease such as:\n" +
            "Bruising of the skin.\n" +
            "\n" +
            "Spider angiomas (abnormal collection of blood vessels near the surface of the skin).\n" +
            "Palmar erythema (red coloration of the palms and fingertips).\n" +
            "\n" +
            "Urinalysis (urine testing) that's positive for bilirubin shows that the patient has conjugated jaundice. The findings of urinalysis should be confirmed by serum testing. The serum testing will include a complete blood count (CBC) and bilirubin levels.\n" +
            "\n" +
            "Your doctor will also do an exam to determine the size and tenderness of your liver. He or she may use imaging (ultrasonography and computer tomographic (CT) scanning) and liver biopsy (taking a sample of the liver) to further confirm diagnosis.\n";

    String med16="Malaria:\n" +
            "\n" +
            "To diagnose malaria, your doctor will likely review your medical history, conduct a physical exam and order blood tests. Blood tests are the only way to confirm a malaria diagnosis. Certain blood tests can help your doctor by showing:\n" +
            "\n" +
            "The presence of the parasite in the blood, to confirm that you have malaria\n" +
            "Which type of malaria parasite is causing your symptoms\n" +
            "\n" +
            "If your infection is caused by a parasite resistant to certain drugs\n" +
            "\n" +
            "Other blood tests help determine whether the disease is causing any serious complications.\n" +
            "\n" +
            "Some blood tests can take several days to complete, while others can produce results in less than 15 minutes.\n";

    String med17="Chickenpox:\n" +
            "\n" +
            "In the majority of cases, you won't need to have any testing done to get an official diagnosis of chickenpox. Your doctor can diagnose it by simply looking at the rash. Your doctor will also ask about any other symptoms you or child have had and when they started, as well as if you have been exposed to the chickenpox (if known).\n";
    String med18="Dengue:\n" +
            "\n" +
            "Diagnosing dengue fever can be difficult, because its signs and symptoms can be easily confused with those of other diseases — such as malaria, leptospirosis and typhoid fever.\n" +
            "\n" +
            "Your doctor will likely ask about your medical and travel history. Be sure to describe international trips in detail, including the countries you visited and the dates, as well as any contact you may have had with mosquitoes.\n" +
            "\n" +
            "Certain laboratory tests can detect evidence of the dengue viruses, but test results usually come back too late to help direct treatment decisions.\n";

    String med19="Typhoid:\n" +
            "\n" +
            "Your doctor is likely to suspect typhoid fever based on your symptoms and your medical and travel history. The diagnosis is usually confirmed by identifying Salmonella typhi in a culture of your blood or other body fluid or tissue.\n" +
            "\n" +
            "Body fluid or tissue culture\n" +
            "\n" +
            "For the culture, a small sample of your blood, stool, urine or bone marrow is placed on a special medium that encourages the growth of bacteria. The culture is checked under a microscope for the presence of typhoid bacteria. A bone marrow culture often is the most sensitive test for Salmonella typhi.\n" +
            "\n" +
            "Although performing a culture test is the most common diagnostic test, other testing may be used to confirm a suspected typhoid fever infection, such as a test to detect antibodies to typhoid bacteria in your blood, or a test that checks for typhoid DNA in your blood.\n";
    String med20="Hepatitis A:\n" +
            "\n" +
            "Hepatitis A can be diagnosed using blood tests. Your health care provider can order these tests if you have symptoms of hepatitis A or if you want to know if you were infected with HAV in the past. The blood test looks for two different types of antibodies to the virus.\n";
    String med21="Hepatitis B:\n" +
            "\n" +
            "Your doctor will examine you and look for signs of liver damage, such as yellowing skin or belly pain. Tests that can help diagnose hepatitis B or its complications are:\n" +
            "\n" +
            "Blood tests. Blood tests can detect signs of the hepatitis B virus in your body and tell your doctor whether it's acute or chronic. A simple blood test can also determine if you're immune to the condition.\n" +
            "\n" +
            "Liver ultrasound. A special ultrasound called transient elastography can show the amount of liver damage.\n" +
            "\n" +
            "Liver biopsy. Your doctor might remove a small sample of your liver for testing (liver biopsy) to check for liver damage. During this test, your doctor inserts a thin needle through your skin and into your liver and removes a tissue sample for laboratory analysis.\n";
    String med22="Hepatitis C:\n" +
            "\n" +
            "Doctors typically use one or more of the following tests to assess liver damage in chronic hepatitis C.\n" +
            "\n" +
            "Magnetic resonance elastography (MRE). A noninvasive alternative to a liver biopsy (see below), MRE combines magnetic resonance imaging technology with patterns formed by sound waves bouncing off the liver to create a visual map showing gradients of stiffness throughout the liver. Stiff liver tissue indicates the presence of scarring of the liver (fibrosis) as a result of chronic hepatitis C.\n" +
            "\n" +
            "Transient elastography. Another noninvasive test, transient elastography is a type of ultrasound that transmits vibrations into the liver and measures the speed of their dispersal through liver tissue to estimate its stiffness.\n" +
            "\n" +
            "Liver biopsy. Typically done using ultrasound guidance, this test involves inserting a thin needle through the abdominal wall to remove a small sample of liver tissue for laboratory testing.\n" +
            "\n" +
            "Blood tests. A series of blood tests can indicate the extent of fibrosis in your liver.\n";
    String med23="Hepatitis D:\n" + "\n"+
            "Call your doctor right away if you have symptoms of hepatitis D. If you have symptoms of the disease without jaundice, your doctor may not suspect hepatitis.\n" +
            "To make an accurate diagnosis, your doctor will perform a blood test that can detect anti-hepatitis D antibodies in your blood. If antibodies are found, it means you’ve been exposed to the virus.\n" +
            "Your doctor will also give you a liver function test if they suspect you have liver damage. This is a blood test that evaluates the health of your liver by measuring the levels of proteins, liver enzymes, and bilirubin in your blood. Results from the liver function test will show whether your liver is stressed or damaged.\n";

    String med24="Hepatitis E:\n" +
            "\n" +
            "Your doctor will ask for your medical history and details about your symptoms. Tell your doctor about any recent travel. Tell them if you think you might have had contact with water contaminated by sewage.\n" +
            "\n" +
            "Your doctor will use a blood test or a stool test to diagnose hepatitis E.\n" +
            "\n";
    String med25="Alcoholic hepatitis:\n" +
            "\n" +
            "If you have symptoms of alcoholic hepatitis, your doctor will ask you about your health history and alcohol consumption. Your doctor will also perform a physical exam to see if you have an enlarged liver or spleen. They may decide to order tests so they can confirm your diagnosis. These tests could include:\n" +
            "complete blood count (CBC)\n" +
            "liver function test\n" +
            "blood clotting tests\n" +
            "abdominal CT scan\n" +
            "ultrasound of the liver\n" +
            "\n" +
            "Your doctor may order a liver biopsy if needed to confirm a diagnosis of alcoholic hepatitis. A liver biopsy is an invasive procedure with certain inherent risks. It requires your doctor to remove a tissue sample from the liver. A liver biopsy will show the severity and type of liver disease.\n" +
            "\n";
    String med26="Tuberculosis:\n" +
            "\n" +
            "During the physical exam, your doctor will check your lymph nodes for swelling and use a stethoscope to listen carefully to the sounds your lungs make while you breathe.\n" +
            "\n" +
            "The most commonly used diagnostic tool for tuberculosis is a simple skin test, though blood tests are becoming more commonplace. A small amount of a substance called PPD tuberculin is injected just below the skin of your inside forearm. You should feel only a slight needle prick.\n" +
            "\n" +
            "Within 48 to 72 hours, a health care professional will check your arm for swelling at the injection site. A hard, raised red bump means you're likely to have TB infection. The size of the bump determines whether the test results are significant.\n";
    String med27="Common Cold:\n" +
            "\n" +
            "Most people with a common cold can be diagnosed by their signs and symptoms. If your doctor suspects you have a bacterial infection or other condition, he or she may order a chest X-ray or other tests to exclude other causes of your symptoms.\n";
    String med28="Pnemonia:\n" +
            "\n" +
            "Your doctor will start by asking about your medical history and doing a physical exam, including listening to your lungs with a stethoscope to check for abnormal bubbling or crackling sounds that suggest pneumonia.\n" +
            "If pneumonia is suspected, your doctor may recommend the following tests:\n" +
            "\n" +
            "Blood tests. Blood tests are used to confirm an infection and to try to identify the type of organism causing the infection. However, precise identification isn't always possible.\n" +
            "\n" +
            "Chest X-ray. This helps your doctor diagnose pneumonia and determine the extent and location of the infection. However, it can't tell your doctor what kind of germ is causing the pneumonia.\n" +
            "\n" +
            "Pulse oximetry. This measures the oxygen level in your blood. Pneumonia can prevent your lungs from moving enough oxygen into your bloodstream.\n" +
            "\n" +
            "Sputum test. A sample of fluid from your lungs (sputum) is taken after a deep cough and analyzed to help pinpoint the cause of the infection.\n" +
            "\n";
    String med29="Dimorphic Hemmooids (Piles):\n" +
            "\n" +
            "Your doctor might be able to see external hemorrhoids. Diagnosing internal hemorrhoids might include examination of your anal canal and rectum.\n" +
            "\n" +
            "Digital examination. Your doctor inserts a gloved, lubricated finger into your rectum. He or she feels for anything unusual, such as growths.\n" +
            "\n" +
            "Visual inspection. Because internal hemorrhoids are often too soft to be felt during a rectal exam, your doctor might examine the lower portion of your colon and rectum with an anoscope, proctoscope or sigmoidoscope.\n" +
            "Your doctor might want to examine your entire colon using colonoscopy if:\n" +
            "Your signs and symptoms suggest you might have another digestive system disease\n";
    String med30="Heart Attack:\n" +
            "\n" +
            "Ideally, your doctor should screen you during regular physical exams for risk factors that can lead to a heart attack.\n" +
            "\n" +
            "If you're in an emergency setting for symptoms of a heart attack, you'll be asked about your symptoms and have your blood pressure, pulse and temperature checked. You'll be connected to a heart monitor and have tests to see if you're having a heart attack.\n" +
            "\n" +
            "Tests to diagnose a heart attack include:\n" +
            "\n" +
            "Electrocardiogram (ECG). This first test done to diagnose a heart attack records electrical signals as they travel through your heart. Sticky patches (electrodes) are attached to your chest and limbs. Signals are recorded as waves displayed on a monitor or printed on paper. Because injured heart muscle doesn't conduct electrical impulses normally, the ECG may show that a heart attack has occurred or is in progress.\n" +
            "\n" +
            "Blood tests. Certain heart proteins slowly leak into your blood after heart damage from a heart attack. Emergency room doctors will take samples of your blood to check for these proteins, or enzymes.\n";
    String med31="Varicose Veins:\n" +
            "\n" +
            "To diagnose varicose veins, your doctor will do a physical exam, including looking at your legs while you're standing to check for swelling. Your doctor may also ask you to describe any pain and aching in your legs.\n" +
            "\n" +
            "You also may need an ultrasound test to see if the valves in your veins are functioning normally or if there's any evidence of a blood clot. In this noninvasive test, a technician runs a small hand-held device (transducer), about the size of a bar of soap, against your skin over the area of your body being examined. The transducer transmits images of the veins in your legs to a monitor, so a technician and your doctor can see them.\n" +
            "\n";
    String med32="Hypothyrodism:\n" +
            "\n" +
            "In general, your doctor may test for an underactive thyroid if you are feeling increasingly tired, have dry skin, constipation and weight gain, or have had previous thyroid problems or a goiter.\n" +
            "\n" +
            "Blood tests\n" +
            "Diagnosis of hypothyroidism is based on your symptoms and the results of blood tests that measure the level of TSH and sometimes the level of the thyroid hormone thyroxine. A low level of thyroxine and high level of TSH indicate an underactive thyroid. That's because your pituitary produces more TSH in an effort to stimulate your thyroid gland into producing more thyroid hormone.\n" +
            "\n" +
            "Doctors can diagnose thyroid disorders much earlier than in the past — often before you experience symptoms. Because the TSH test is the best screening test, your doctor will likely check TSH first and follow with a thyroid hormone test if needed.\n" +
            "\n" +
            "TSH tests also play an important role in managing hypothyroidism. They help your doctor determine the right dosage of medication, both initially and over time.\n";
    String med33="Hyperthyroidism:\n" +
            "\n" +
            "Medical history and physical exam. During the exam your doctor may try to detect a slight tremor in your fingers when they're extended, overactive reflexes, eye changes and warm, moist skin. Your doctor will also examine your thyroid gland as you swallow to see if it's enlarged, bumpy or tender and check your pulse to see if it's rapid or irregular.\n" +
            "\n" +
            "Blood tests. Blood tests that measure thyroxine and thyroid-stimulating hormone (TSH) can confirm the diagnosis. High levels of thyroxine and low or nonexistent amounts of TSH indicate an overactive thyroid. The amount of TSH is important because it's the hormone that signals your thyroid gland to produce more thyroxine.\n" +
            "\n" +
            "These tests are particularly necessary for older adults, who may not have classic symptoms of hyperthyroidism.\n" +
            "\n" +
            "Thyroid blood tests may give false results if you're taking biotin — a B vitamin supplement that may also be found in multivitamins. Let your doctor know if you are using biotin or a multivitamin with biotin. To ensure an accurate test, stop taking biotin at least 12 hours before blood is taken.\n" +
            "\n";
    String med34="Hypoglycemia:\n" +
            "\n" +
            "If you have signs or symptoms of low blood sugar, check your blood sugar levels with a blood glucose meter — a small device that measures and displays your blood sugar level. You have hypoglycemia when your blood sugar level drops below 70 mg/dL (3.9 mmol/L).\n" +
            "\n";
    String med35="Osteoartristis:\n" +
            "\n" +
            "During the physical exam, your doctor will check your affected joint for tenderness, swelling, redness and flexibility.\n" +
            "\n" +
            "Imaging tests\n" +
            "To get pictures of the affected joint, your doctor might recommend:\n" +
            "\n" +
            "X-rays. Cartilage doesn't show up on X-ray images, but cartilage loss is revealed by a narrowing of the space between the bones in your joint. An X-ray can also show bone spurs around a joint.\n" +
            "\n" +
            "Magnetic resonance imaging (MRI). An MRI uses radio waves and a strong magnetic field to produce detailed images of bone and soft tissues, including cartilage. An MRI isn't commonly needed to diagnose osteoarthritis but can help provide more information in complex cases.\n";
    String med36="Arthritis:\n" +
            "\n" +
            "During the physical exam, your doctor will check your joints for swelling, redness and warmth. He or she will also want to see how well you can move your joints.\n" +
            "Depending on the type of arthritis suspected, your doctor may suggest some of the following tests.\n" +
            "Laboratory tests\n" +
            "\n" +
            "The analysis of different types of body fluids can help pinpoint the type of arthritis you may have. Fluids commonly analyzed include blood, urine and joint fluid. To obtain a sample of your joint fluid, your doctor will cleanse and numb the area before inserting a needle in your joint space to withdraw some fluid.\n" +
            "\n" +
            "Imaging\n" +
            "These types of tests can detect problems within your joint that may be causing your symptoms. Examples include:\n" +
            "\n" +
            "X-rays. Using low levels of radiation to visualize bone, X-rays can show cartilage loss, bone damage and bone spurs. X-rays may not reveal early arthritic damage, but they are often used to track progression of the disease.\n" +
            "\n" +
            "Computerized tomography (CT). CT scanners take X-rays from many different angles and combine the information to create cross-sectional views of internal structures. CTs can visualize both bone and the surrounding soft tissues.\n" +
            "\n" +
            "Magnetic resonance imaging (MRI). Combining radio waves with a strong magnetic field, MRI can produce more-detailed cross-sectional images of soft tissues such as cartilage, tendons and ligaments.\n" +
            "\n" +
            "Ultrasound. This technology uses high-frequency sound waves to image soft tissues, cartilage and fluid-containing structures near the joints (bursae). Ultrasound is also used to guide needle placement for joint aspirations and injections.\n";
    String med37="Paroymsal Positional Vertigo:\n" +
            "\n" +
            "Your doctor may do a series of tests to determine the cause of your dizziness. During a physical exam, your doctor will likely look for:\n" +
            "Signs and symptoms of dizziness that are prompted by eye or head movements and then decrease in less than one minute\n" +
            "\n" +
            "Dizziness with specific eye movements that occur when you lie on your back with your head turned to one side and tipped slightly over the edge of the examination bed\n" +
            "Involuntary movements of your eyes from side to side\n" +
            "Inability to control your eye movements\n" +
            "\n" +
            "If your doctor can't find the cause of your signs and symptoms, he or she may order additional testing, such as:\n" +
            "\n" +
            "Electronystagmography (ENG) or videonystagmography (VNG). The purpose of these tests is to detect abnormal eye movement. ENG (which uses electrodes) or VNG (which uses small cameras) can help determine if dizziness is due to inner ear disease by measuring involuntary eye movements while your head is placed in different positions or your balance organs are stimulated with water or air.\n" +
            "\n" +
            "Magnetic resonance imaging (MRI). This test uses a magnetic field and radio waves to create cross-sectional images of your head and body. Your doctor can use these images to identify and diagnose a range of conditions. MRI may be performed to rule out other possible causes of vertigo.\n";
    String med38="Acne:\n" +
            "\n" +
            "Acne is diagnosed by a simple visual inspection by your doctor. There is no test for acne. Rarely, a doctor may take a swab or scraping of a lesion or pustule for microbiological examination or culture to rule out other sources of infection.\n";
    String med39="Urinary Tract Infection:\n" +
            "\n" +
            "Tests and procedures used to diagnose urinary tract infections include:\n" +
            "\n" +
            "Analyzing a urine sample. Your doctor may ask for a urine sample for lab analysis to look for white blood cells, red blood cells or bacteria. To avoid potential contamination of the sample, you may be instructed to first wipe your genital area with an antiseptic pad and to collect the urine midstream.\n" +
            "\n" +
            "Growing urinary tract bacteria in a lab. Lab analysis of the urine is sometimes followed by a urine culture. This test tells your doctor what bacteria are causing your infection and which medications will be most effective.\n" +
            "\n" +
            "Creating images of your urinary tract. If you are having frequent infections that your doctor thinks may be caused by an abnormality in your urinary tract, you may have an ultrasound, a computerized tomography (CT) scan or magnetic resonance imaging (MRI). Your doctor may also use a contrast dye to highlight structures in your urinary tract.\n";
    String med40="Psoriasis:\n" +
            "\n" +
            "Your doctor will ask questions about your health and examine your skin, scalp and nails. Your doctor might take a small sample of skin (biopsy) for examination under a microscope. This helps determine the type of psoriasis and rule out other disorders.\n";
    String med41="Impetigo:\n" +
            "\n" +
            "Doctors usually diagnose impetigo by looking at the distinctive sores. Lab tests generally aren't necessary.\n" +
            "\n" +
            "If the sores don't clear, even with antibiotic treatment, your doctor may take a sample of the liquid produced by a sore and test it to see what types of antibiotics might work best on it. Some types of the bacteria that cause impetigo have become resistant to certain antibiotic drugs.\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("onCreate","entered pharm.java");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diagnosis);

        etv1=(ExpandableTextView)findViewById(R.id.expandable_text_view1);
        etv1.setText(med1);

        etv2=(ExpandableTextView)findViewById(R.id.expandable_text_view2);
        etv2.setText(med2);

        etv3=(ExpandableTextView)findViewById(R.id.expandable_text_view3);
        etv3.setText(med3);

        etv4=(ExpandableTextView)findViewById(R.id.expandable_text_view4);
        etv4.setText(med4);

        etv5=(ExpandableTextView)findViewById(R.id.expandable_text_view5);
        etv5.setText(med5);

        etv6=(ExpandableTextView)findViewById(R.id.expandable_text_view6);
        etv6.setText(med6);

        etv7=(ExpandableTextView)findViewById(R.id.expandable_text_view7);
        etv7.setText(med7);

        etv8=(ExpandableTextView)findViewById(R.id.expandable_text_view8);
        etv8.setText(med8);

        etv9=(ExpandableTextView)findViewById(R.id.expandable_text_view9);
        etv9.setText(med9);

        etv10=(ExpandableTextView)findViewById(R.id.expandable_text_view10);
        etv10.setText(med10);

        etv11=(ExpandableTextView)findViewById(R.id.expandable_text_view11);
        etv11.setText(med11);

        etv12=(ExpandableTextView)findViewById(R.id.expandable_text_view12);
        etv12.setText(med12);

        etv13=(ExpandableTextView)findViewById(R.id.expandable_text_view13);
        etv13.setText(med13);

        etv14=(ExpandableTextView)findViewById(R.id.expandable_text_view14);
        etv14.setText(med14);

        etv15=(ExpandableTextView)findViewById(R.id.expandable_text_view15);
        etv15.setText(med15);
        etv16=(ExpandableTextView)findViewById(R.id.expandable_text_view16);
        etv16.setText(med16);
        etv17=(ExpandableTextView)findViewById(R.id.expandable_text_view17);
        etv17.setText(med17);
        etv18=(ExpandableTextView)findViewById(R.id.expandable_text_view18);
        etv18.setText(med18);
        etv19=(ExpandableTextView)findViewById(R.id.expandable_text_view19);
        etv19.setText(med19);
        etv20=(ExpandableTextView)findViewById(R.id.expandable_text_view20);
        etv20.setText(med20);
        etv21=(ExpandableTextView)findViewById(R.id.expandable_text_view21);
        etv21.setText(med21);
        etv22=(ExpandableTextView)findViewById(R.id.expandable_text_view22);
        etv22.setText(med22);
        etv23=(ExpandableTextView)findViewById(R.id.expandable_text_view23);
        etv23.setText(med23);
        etv24=(ExpandableTextView)findViewById(R.id.expandable_text_view24);
        etv24.setText(med24);
        etv25=(ExpandableTextView)findViewById(R.id.expandable_text_view25);
        etv25.setText(med25);
        etv26=(ExpandableTextView)findViewById(R.id.expandable_text_view26);
        etv26.setText(med26);
        etv27=(ExpandableTextView)findViewById(R.id.expandable_text_view27);
        etv27.setText(med27);
        etv28=(ExpandableTextView)findViewById(R.id.expandable_text_view28);
        etv28.setText(med28);
        etv29=(ExpandableTextView)findViewById(R.id.expandable_text_view29);
        etv29.setText(med29);
        etv30=(ExpandableTextView)findViewById(R.id.expandable_text_view30);
        etv30.setText(med30);
        etv31=(ExpandableTextView)findViewById(R.id.expandable_text_view31);
        etv31.setText(med31);
        etv32=(ExpandableTextView)findViewById(R.id.expandable_text_view32);
        etv32.setText(med32);
        etv33=(ExpandableTextView)findViewById(R.id.expandable_text_view33);
        etv33.setText(med33);
        etv34=(ExpandableTextView)findViewById(R.id.expandable_text_view34);
        etv34.setText(med34);
        etv35=(ExpandableTextView)findViewById(R.id.expandable_text_view35);
        etv35.setText(med35);
        etv36=(ExpandableTextView)findViewById(R.id.expandable_text_view36);
        etv36.setText(med36);
        etv37=(ExpandableTextView)findViewById(R.id.expandable_text_view37);
        etv37.setText(med37);
        etv38=(ExpandableTextView)findViewById(R.id.expandable_text_view38);
        etv38.setText(med38);
        etv39=(ExpandableTextView)findViewById(R.id.expandable_text_view39);
        etv39.setText(med39);
        etv40=(ExpandableTextView)findViewById(R.id.expandable_text_view40);
        etv40.setText(med40);
        etv41=(ExpandableTextView)findViewById(R.id.expandable_text_view41);
        etv41.setText(med41);

    }
}
