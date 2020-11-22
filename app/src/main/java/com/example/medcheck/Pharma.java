package com.example.medcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class Pharma extends AppCompatActivity {

    ExpandableTextView etv1,etv2,etv3,etv4,etv5,etv6,etv7,etv8,etv9,etv10,etv11,etv12,etv13,etv14,etv15,etv16,etv17,etv18,etv19,etv20,etv21,etv22,etv23,etv24,etv25,etv26,etv27,etv28,etv29,etv30,etv31,etv32,etv33,etv34,etv35,etv36,etv37,etv38,etv39,etv40,etv41;

    String med1="Fungal infection:\n" +
            "\n" +
            "There are several types of antifungal medicines. They come as creams, sprays, solutions, shampoos, medicines to take by mouth, and injections. Most work by damaging the cell wall of the fungus, which causes the fungal cell to die.\n" +
            "\n" +
            "Antifungal creams, liquids or sprays (also called topical antifungals):\n" +
            "These are used to treat fungal infections of the skin, scalp and nails. They include clotrimazole, econazole, ketoconazole, miconazole, tioconazole, terbinafine, and amorolfine. They come in various different brand names.\n" +
            "\n" +
            "Antifungal medicines taken by mouth:\n" +
            "There are various types. For example:\n" +
            "Miconazole is available as an oral gel, and nystatin as a liquid. They are applied to the mouth. They are used to treat thrush (candida infection) of the mouth and throat.\n" +
            "Terbinafine, itraconazole, fluconazole, and voriconazole are available as tablets, which are absorbed into the body. They are used to treat various fungal infections. The one chosen depends on what type of infection you have. For example:\n" +
            "Terbinafine is commonly used to treat nail infections which are usually caused by a tinea type of fungus.\n" +
            "Fluconazole is commonly used to treat vaginal thrush, as an alternative to using antifungal cream. It is also used to treat and prevent certain fungal infections within the body.\n" +
            "There are also separate leaflets in this series dealing with athlete's foot, ringworm and fungal groin infection.\n" +
            "\n" +
            "Antifungal injections:\n" +
            "These may be used if you have a serious fungal infection within the body. Amphotericin, flucytosine, itraconazole, voriconazole, anidulafungin, and micafungin are medicines that are sometimes used in this way. The one chosen depends on the type of fungus causing the infection. These are specialist medications that are used for people who are usually quite ill in hospital.\n";

    String med2="Allergy:\n" +
            "\n" +
            "Antihistamines\n" +
            "Antihistamines block histamine, a symptom-causing chemical released by your immune system during an allergic reaction.\n" +
            "Oral antihistamines are available over-the-counter and by prescription. They ease a runny nose, itchy or watery eyes, hives, swelling, and other signs or symptoms of allergies. Because some of these drugs can make you feel drowsy and tired, take them with caution when you need to drive or do other activities that require alertness.\n" +
            "\n" +
            "Antihistamines that tend to cause drowsiness include:\n" +
            "Diphenhydramine\n" +
            "Chlorpheniramine\n" +
            "\n" +
            "These antihistamines are much less likely to cause drowsiness:\n" +
            "Cetirizine (Zyrtec, Zyrtec Allergy)\n" +
            "Desloratadine (Clarinex)\n" +
            "Fexofenadine (Allegra, Allegra Allergy)\n" +
            "Levocetirizine (Xyzal, Xyzal Allergy)\n" +
            "Loratadine (Alavert, Claritin)\n";

    String med3="GERD:\n" +
            "\n" +
            "Antacids that neutralize stomach acid. Antacids, such as Mylanta, Rolaids and Tums, may provide quick relief.\n" +
            "\n" +
            "Medications to reduce acid production. These medications — known as H-2-receptor blockers — include cimetidine (Tagamet HB), famotidine (Pepcid AC) and nizatidine (Axid AR). H-2-receptor blockers don't act as quickly as antacids, but they provide longer relief and may decrease acid production from the stomach for up to 12 hours. \n" +
            "\n" +
            "Medications that block acid production and heal the esophagus. These medications — known as proton pump inhibitors — are stronger acid blockers than H-2-receptor blockers and allow time for damaged esophageal tissue to heal. \n" +
            "Prescription-strength treatments for GERD include:\n" +
            "\n" +
            "Prescription-strength H-2-receptor blockers. These include prescription-strength famotidine (Pepcid) and nizatidine. These medications are generally well-tolerated but long-term use may be associated with a slight increase in risk of vitamin B-12 deficiency and bone fractures.\n" +
            "\n" +
            "Prescription-strength proton pump inhibitors. These include esomeprazole (Nexium), lansoprazole \n" +
            "(Prevacid), omeprazole (Prilosec, Zegerid), pantoprazole (Protonix), rabeprazole (Aciphex) and dexlansoprazole (Dexilant). Although generally well-tolerated, these medications might cause diarrhea, headache, nausea and vitamin B-12 deficiency. Chronic use might increase the risk of hip fracture.\n" +
            "\n" +
            "Medication to strengthen the lower oesophageal sphincter. Baclofen may ease GERD by decreasing the frequency of relaxations of the lower oesophageal sphincter. Side effects might include fatigue or nausea.\n";

    String med4="Chronic cholestasis:\n" +
            "\n" +
            "Your liver plays an important role in metabolizing medications. Some medications are more difficult for your liver to metabolize than others and may be Trusted Source toxic to your liver. These medications include:\n" +
            "some antibiotics, such as amoxicillin (Amoxil, Moxatag) and minocycline (Minocin)\n" +
            "anabolic steroids\n" +
            "some nonsteroidal anti-inflammatories (NSAIDs), such as ibuprofen (Advil, Motrin IB)\n" +
            "oral contraceptives\n" +
            "certain antiepileptic drugs\n" +
            "certain antifungal drugs\n" +
            "some antipsychotic drugs\n" +
            "certain antimicrobial drugs\n" +
            "You should always take medications as directed, and don’t stop taking medications your doctor has prescribed without talking with them first.\n";

    String med5="Drug reaction:\n" +
            "\n" +
            "The following interventions may be used to treat an allergic reaction to a drug:\n" +
            "\n" +
            "Withdrawal of the drug. If your doctor determines that you have a drug allergy — or likely allergy — discontinuing the drug is the first step in treatment. In many cases, this may be the only intervention necessary.\n" +
            "\n" +
            "Antihistamines. Your doctor may prescribe an antihistamine or recommend an over-the-counter antihistamine such as diphenhydramine (Benadryl) that can block immune system chemicals activated during an allergic reaction.\n" +
            "\n" +
            "Corticosteroids. Either oral or injected corticosteroids may be used to treat inflammation associated with more-serious reactions.\n" +
            "\n" +
            "Treatment of anaphylaxis. Anaphylaxis requires an immediate epinephrine injection as well as hospital care to maintain blood pressure and support breathing.\n";

    String med6="Peptic ulcer disease:\n" +
            "\n" +
            "Antibiotic medications to kill H. pylori. If H. pylori is found in your digestive tract, your doctor may recommend a combination of antibiotics to kill the bacterium. These may include amoxicillin (Amoxil), clarithromycin (Biaxin), metronidazole (Flagyl), tinidazole (Tindamax), tetracycline and levofloxacin.\n" +
            "\n" +
            "Medications that block acid production and promote healing. Proton pump inhibitors — also called PPIs — reduce stomach acid by blocking the action of the parts of cells that produce acid. These drugs include the prescription and over-the-counter medications omeprazole (Prilosec), lansoprazole (Prevacid), rabeprazole (Aciphex), esomeprazole (Nexium) and pantoprazole (Protonix).\n" +
            "\n" +
            "Medications to reduce acid production. Acid blockers — also called histamine (H-2) blockers — reduce the amount of stomach acid released into your digestive tract, which relieves ulcer pain and encourages healing.\n" +
            "Available by prescription or over the counter, acid blockers include the medications famotidine (Pepcid AC), cimetidine (Tagamet HB) and nizatidine (Axid AR).\n" +
            "\n" +
            "Medications that protect the lining of your stomach and small intestine. In some cases, your doctor may prescribe medications called cytoprotective agents that help protect the tissues that line your stomach and small intestine.\n" +
            "Options include the prescription medications sucralfate (Carafate) and misoprostol (Cytotec).\n";

    String med7="AIDS:\n" +
            "\n" +
            "Nucleoside/Nucleotide Reverse Transcriptase Inhibitors (NRTIs)\n" +
            "NRTIs force the HIV virus to use faulty versions of building blocks so infected cells can't make more HIV.\n" +
            "Abacavir, or ABC (Ziagen)\n" +
            "Didanosine, or ddl (Videx)\n" +
            "Emtricitabine, or FTC (Emtriva)\n" +
            "Lamivudine, or 3TC (Epivir)\n" +
            "Stavudine, or d4T (Zerit)\n" +
            "\n" +
            "Non-nucleoside Reverse Transcriptase Inhibitors (NNRTIs)\n" +
            "These are also called \"non-nukes.\" NNRTIs bind to a specific protein so the HIV virus can't make copies of itself, similar to jamming a zipper.\n" +
            "Delavirdine or DLV (Rescripor)\n" +
            "Doravirine, or DOR (Pifeltro)\n" +
            "Efavirenz or EFV (Sustiva)\n" +
            "\n" +
            "Etravirine or ETR (Intelence)Protease Inhibitors (PIs)\n" +
            "These drugs block a protein that infected cells need to put together new HIV virus particles.\n" +
            "Atazanavir or ATV (Reyataz)\n" +
            "Darunavir or DRV (Prezista)\n" +
            "Fosamprenavir or FPV (Lexiva)\n" +
            "Indinavir or IDV (Crixivan)\n";

    String med8="Diabetes: \n" +
            "\n" +
            "Metformin (Glucophage, Glumetza, others). Generally, metformin is the first medication prescribed for type 2 diabetes. It works by lowering glucose production in the liver and improving your body's sensitivity to insulin so that your body uses insulin more effectively.\n" +
            "\n" +
            "Sulfonylureas. These medications help your body secrete more insulin. Examples include glyburide (DiaBeta, Glynase), glipizide (Glucotrol) and glimepiride (Amaryl). Possible side effects include low blood sugar and weight gain.\n" +
            "\n" +
            "Meglitinides. These medications — such as repaglinide (Prandin) and nateglinide (Starlix) — work like sulfonylureas by stimulating the pancreas to secrete more insulin, but they're faster acting, and the duration of their effect in the body is shorter. They also have a risk of causing low blood sugar and weight gain.\n" +
            "\n" +
            "DPP-4 inhibitors. These medications — sitagliptin (Januvia), saxagliptin (Onglyza) and linagliptin (Tradjenta) — help reduce blood sugar levels, but tend to have a very modest effect. They don't cause weight gain, but may cause joint pain and increase your risk of pancreatitis.\n" +
            "\n" +
            "GLP-1 receptor agonists. These injectable medications slow digestion and help lower blood sugar levels. Their use is often associated with weight loss. Possible side effects include nausea and an increased risk of pancreatitis.\n" +
            "\n" +
            "SGLT2 inhibitors. These drugs prevent the kidneys from reabsorbing sugar into the blood. Instead, the sugar is excreted in the urine. Examples include canagliflozin (Invokana), dapagliflozin (Farxiga) and empagliflozin (Jardiance).\n" +
            "\n" +
            "Insulin. Some people who have type 2 diabetes need insulin therapy. In the past, insulin therapy was used as a last resort, but today it's often prescribed sooner because of its benefits. Low blood sugar (hypoglycemia) is a possible side effect of insulin.\n";

    String med9="Gastroenteritis:\n" +
            "\n" +
            "If your child has viral gastroenteritis, you should give your child an oral rehydration solution—such as Pedialyte, Naturalyte, Infalyte, and CeraLyte—as directed to replace lost fluids and electrolytes. \n" +
            "\n" +
            "Oral rehydration solutions are liquids that contain glucose and electrolytes. Talk with a doctor about giving these solutions to your infant. Infants should drink breast milk or formula as usual.\n" +
            "\n" +
            "Older adults, adults with a weakened immune system, and adults with severe diarrhea or symptoms of dehydration should also drink oral rehydration solutions.\n" +
            "\n" +
            "In some cases, adults can take over-the-counter medicines such as loperamide(Imodium) and bismuth subsalicylate (Pepto-Bismol, Kaopectate) to treat diarrhea caused by viral gastroenteritis.\n" +
            "\n" +
            "These medicines can be unsafe for infants and children. Talk with a doctor before giving your child an over-the-counter medicine. If you have bloody diarrhea or fever—signs of infections with bacteria or parasites—don’t use over-the-counter medicines to treat diarrhea. See a doctor for treatment.\n";

    String med10="Asthmatic Bronchitis:\n" +
            "\n" +
            "Asthmatic bronchitis treatments are essentially the same as those used to treat asthma and bronchitis, and may include:\n" +
            "\n" +
            "Short-acting bronchodilators, such as albuterol, to help open the airway to provide short-term relief\n" +
            "Inhaled corticosteroids.\n" +
            "\n" +
            "Long-acting bronchodilators used together with inhaled corticosteroids\n" +
            "Leukotriene modifiers\n" +
            "Cromolyn or theophylline\n" +
            "Combination inhalers containing both a steroid and a bronchodilator\n" +
            "\n" +
            "Long-acting anticholinergics\n" +
            "A humidifier or steam\n" +
            "Bacterial respiratory infection may be treated with antibiotics.\n" +
            "\n" +
            "Treatment also involves avoiding asthma triggers by following these tips:\n" +
            "Wash your bed linens and blankets in hot water.\n" +
            "Dust and vacuum regularly.\n" +
            "Use a HEPA air filter in your home.\n" +
            "Keep pets out of your bedroom.\n" +
            "Don't smoke, and try to stay away from other people who smoke.\n" +
            "Wash your hands frequently to prevent the spread of infection.\n";

    String med11="Hypertension:\n" +
            "\n" +
            "Medications to treat high blood pressure:\n" +
            "\n" +
            "Thiazide diuretics. Diuretics, sometimes called water pills, are medications that act on your kidneys to help your body eliminate sodium and water, reducing blood volume.\n" +
            "Thiazide diuretics are often the first, but not the only, choice in high blood pressure medications. Thiazide diuretics include chlorthalidone, hydrochlorothiazide (Microzide) and others.\n" +
            "\n" +
            "Angiotensin-converting enzyme (ACE) inhibitors. These medications — such as lisinopril (Zestril), benazepril (Lotensin), captopril (Capoten) and others — help relax blood vessels by blocking the formation of a natural chemical that narrows blood vessels. People with chronic kidney disease may benefit from having an ACE inhibitor as one of their medications.\n" +
            "\n" +
            "Angiotensin II receptor blockers (ARBs). These medications help relax blood vessels by blocking the action, not the formation, of a natural chemical that narrows blood vessels. ARBs include candesartan (Atacand), losartan (Cozaar) and others. People with chronic kidney disease may benefit from having an ARB as one of their medications.\n" +
            "\n" +
            "Calcium channel blockers. These medications — including amlodipine (Norvasc), diltiazem (Cardizem, Tiazac, others) and others — help relax the muscles of your blood vessels. Some slow your heart rate. Calcium channel blockers may work better for older people and people of African heritage than do ACE inhibitors alone.\n";
    String med12="Migraine:\n" +
            "\n" +
            "Medications used to relieve migraine pain work best when taken at the first sign of an oncoming migraine — as soon as signs and symptoms of a migraine begin. Medications that can be used to treat it include:\n" +
            "\n" +
            "Pain relievers. These over-the-counter or prescription pain relievers include aspirin or ibuprofen (Advil, Motrin IB, others). Migraine relief medications that combine caffeine, aspirin and acetaminophen (Excedrin Migraine) may be helpful, but usually only against mild migraine pain.\n" +
            "\n" +
            "Triptans. These are prescription drugs such as sumatriptan (Imitrex, Tosymra) and rizatriptan (Maxalt) are prescription drugs used for migraine because they block pain pathways in the brain\n" +
            "\n" +
            "Dihydroergotamines (D.H.E. 45, Migranal). Available as a nasal spray or injection, these are most effective when taken shortly after the start of migraine symptoms for migraines that tend to last longer than 24 hours. \n" +
            "\n" +
            "Lasmiditan (Reyvow). This new oral tablet is approved for the treatment of migraine with or without aura. In drug trials, lasmiditan significantly improved pain as well as nausea and sensitivity to light and sound. \n" +
            "\n" +
            "Ubrogepant (Ubrelvy). This oral calcitonin gene-related peptide receptor antagonist is approved for the treatment of acute migraine with or without aura in adults. It's the first drug of this type approved for migraine treatment. \n" +
            "\n" +
            "Opioid medications. People who have migraines who can't take other migraine medications, narcotic opioid medications, especially those that contain codeine, might help. Because they can be highly addictive, these are usually used only if no other treatments are effective.\n" +
            "\n" +
            "Anti-nausea drugs. These can help if your migraine with aura is accompanied by nausea and vomiting. Anti-nausea drugs include chlorpromazine, metoclopramide (Reglan) or prochlorperazine (Compro). These are usually taken with pain medications.\n";
    String med13="Cervical spondylosis:\n" +
            "\n" +
            "Treatment for cervical spondylosis depends on the severity of your signs and symptoms. The goal of treatment is to relieve pain, help you maintain your usual activities as much as possible, and prevent permanent injury to the spinal cord and nerves.\n" +
            "\n" +
            "If over-the-counter pain relievers aren't enough, your doctor might prescribe:\n" +
            "\n" +
            "Nonsteroidal anti-inflammatory drugs. While some types of NSAIDs are available over the counter, you may need prescription-strength versions to relieve the pain and inflammation associated with cervical spondylosis.\n" +
            "\n" +
            "Corticosteroids. A short course of oral prednisone might help ease pain. If your pain is severe, steroid injections may be helpful.\n" +
            "\n" +
            "Muscle relaxants. Certain drugs, such as cyclobenzaprine, can help relieve muscle spasms in the neck.\n" +
            "\n" +
            "Anti-seizure medications. Some epilepsy medications, such as gabapentin (Neurontin, Horizant) and pregabalin (Lyrica), can dull the pain of damaged nerves.\n" +
            "\n" +
            "Antidepressants. Certain antidepressant medications have been found to help ease neck pain from cervical spondylosis.\n";
    String med14="Paralysis (brain hemorrhage):\n" +
            "\n" +
            "Medications used to help prevent stroke in high-risk patients (especially those who have experienced a previous TIA or ischemic stroke) fall into two major categories: \n" +
            "Anticoagulants and Antiplatelet agents.\n" +
            "\n" +
            "Anticoagulants thin the blood and prevent clotting. Heparin acts quickly and is given intravenously or subcutaneously (beneath the skin) while a patient is in the hospital. Slower-acting warfarin can be given orally and is used over a longer period. Because these drugs affect the blood's ability to clot, they require close monitoring by a physician.\n" +
            "\n" +
            "Antiplatelet drugs prevent platelet aggregation. Platelets are specialized cells in the blood that initiate a healing process. Large numbers of platelets clump together to form a clot, which can sometimes block an artery or break loose, travel through the bloodstream and block a smaller artery. Antiplatelet drugs make platelets less sticky and less likely to form clots, reducing the risk of ischemic stroke in patients who have had TIA or prior ischemic stroke.\n";
    String med15="Jaundice:\n" +
            "\n" +
            "Treatment will depend on the underlying cause.\n" +
            "Jaundice treatment targets the cause rather than the jaundice symptoms.\n" +
            "\n" +
            "The following treatments are used:\n" +
            "\n" +
            "Anemia-induced jaundice may be treated by boosting the amount of iron in the blood by either taking iron supplements or eating more iron-rich foods. \n" +
            "\n" +
            "Hepatitis-induced jaundice requires antiviral or steroid medications.\n" +
            "\n" +
            "Doctors can treat obstruction-induced jaundice by surgically removing the obstruction.\n" +
            "\n" +
            "If the jaundice has been caused by use of a medication, treatment for involves changing to an alternative medication.\n";
    String med16="Malaria:\n" +
            "\n" +
            "The most common antimalarial drugs include:\n" +
            "\n" +
            "Artemisinin-based combination therapies (ACTs). ACTs are, in many cases, the first line treatment for malaria. There are several different types of ACTs. Examples include artemether-lumefantrine (Coartem) and artesunate-amodiaquine. Each ACT is a combination of two or more drugs that work against the malaria parasite in different ways.\n" +
            "\n" +
            "Chloroquine phosphate. Chloroquine is the preferred treatment for any parasite that is sensitive to the drug. But in many parts of the world, the parasites that cause malaria are resistant to chloroquine, and the drug is no longer an effective treatment.\n" +
            "\n" +
            "Other common antimalarial drugs include:\n" +
            "\n" +
            "Combination of atovaquone and proguanil (Malarone)\n" +
            "Quinine sulfate (Qualaquin) with doxycycline (Vibramycin, Monodox, others)\n" +
            "Mefloquine\n" +
            "Primaquine phosphate\n";
    String med17="Chicken pox:\n" +
            "\n" +
            "In otherwise healthy children, chickenpox typically needs no medical treatment. Your doctor may prescribe an antihistamine to relieve itching. But for the most part, the disease is allowed to run its course.\n" +
            "\n" +
            "If you're at high risk of complications:\n" +
            "\n" +
            "For people who are at high risk of complications from chickenpox, doctors sometimes prescribe medications to shorten the length of the infection and to help reduce the risk of complications.\n" +
            "\n" +
            "If you or your child are at high risk of complications, your doctor may suggest an antiviral drug such as acyclovir (Zovirax, Sitavig) or another drug called immune globulin intravenous (Privigen). These medications may lessen the severity of chickenpox when given within 24 hours after the rash first appears.\n" +
            "\n" +
            "Other antiviral drugs, such as valacyclovir (Valtrex) and famciclovir, also may lessen the severity of the disease, but may not be approved or appropriate for everyone. In some instances, your doctor may recommend getting the chickenpox vaccine after you've been exposed to the virus. This can prevent the disease or lessen its severity.\n";
    String med18="Dengue:\n" +
            "\n" +
            "No specific treatment for dengue fever exists. Your doctor may recommend that you drink plenty of fluids to avoid dehydration from vomiting and a high fever.\n" +
            "\n" +
            "While recovering from dengue fever, watch for signs and symptoms of dehydration. Call your doctor right away if you develop any of the following:\n" +
            "Decreased urination\n" +
            "Few or no tears\n" +
            "Dry mouth or lips\n" +
            "Lethargy or confusion\n" +
            "Cold or clammy extremities\n" +
            "\n" +
            "Acetaminophen (Tylenol, others) can alleviate pain and reduce fever. Avoid pain relievers that can increase bleeding complications — such as aspirin, ibuprofen (Advil, Motrin IB, others) and naproxen sodium (Aleve, others).\n" +
            "\n" +
            "If you have severe dengue fever, you may need:\n" +
            "Supportive care in a hospital\n" +
            "Intravenous (IV) fluid and electrolyte replacement\n" +
            "Blood pressure monitoring\n" +
            "Transfusion to replace blood loss\n";
    String med19="Typhoid:\n" +
            "\n" +
            "Antibiotic therapy is the only effective treatment for typhoid fever.\n" +
            "\n" +
            "Commonly prescribed antibiotics include:\n" +
            "\n" +
            "Ciprofloxacin (Cipro). In the United States, doctors often prescribe this for adults who aren't pregnant. Another similar drug called ofloxacin also may be used. Unfortunately, many Salmonella typhi bacteria are no longer susceptible to antibiotics of this type, particularly strains picked up in Southeast Asia.\n" +
            "\n" +
            "Azithromycin (Zithromax). This may be used if a person is unable to take ciprofloxacin or the bacteria are resistant to ciprofloxacin.\n" +
            "\n" +
            "Ceftriaxone. This injectable antibiotic is an alternative in more-complicated or serious infections and for people who may not be candidates for ciprofloxacin, such as children.\n" +
            "Other treatments\n" +
            "\n" +
            "Other treatments include:\n" +
            "\n" +
            "Drinking fluids. This helps prevent the dehydration that results from a prolonged fever and diarrhea. If you're severely dehydrated, you may need to receive fluids through a vein (intravenously).\n" +
            "\n" +
            "Surgery. If your intestines become torn, you'll need surgery to repair the hole.\n";
    String med20="Hepatitis A:\n" +
            "\n" +
            "No specific treatment exists for hepatitis A. Your body will clear the hepatitis A virus on its own. In most cases of Hepatitis-A, the liver heals within six months with no lasting damage.\n" +
            "Hepatitis A treatment usually focuses on keeping comfortable and controlling signs and symptoms. \n" +
            "\n" +
            "You may need to:\n" +
            "\n" +
            "Rest. Many people with hepatitis A infection feel tired and sick and have less energy.\n" +
            "\n" +
            "Manage nausea. Nausea can make it difficult to eat. Try snacking throughout the day rather than \n" +
            "eating full meals. To get enough calories, eat more high-calorie foods. For instance, drink fruit juice or milk rather than water. Drinking plenty of fluids is important to prevent dehydration if vomiting occurs.\n" +
            "\n" +
            "Avoid alcohol and use medications with care. Your liver may have difficulty processing medications and alcohol. If you have hepatitis, don't drink alcohol. It can cause more liver damage. Talk to your doctor about all the medications you take, including over-the-counter drugs.\n";
    String med21="Hepatitis B:\n" +
            "\n" +
            "Most people diagnosed with chronic hepatitis B infection need treatment for the rest of their lives. Treatment helps reduce the risk of liver disease and prevents you from passing the infection to others. \n" +
            "\n" +
            "Treatment for chronic hepatitis B may include:\n" +
            "\n" +
            "Antiviral medications. Several antiviral medications — including entecavir (Baraclude), tenofovir (Viread), lamivudine (Epivir), adefovir (Hepsera) and telbivudine (Tyzeka) — can help fight the virus and slow its ability to damage your liver. These drugs are taken by mouth. Talk to your doctor about which medication might be right for you.\n" +
            "\n" +
            "Interferon injections. Interferon alfa-2b (Intron A) is a man-made version of a substance produced by the body to fight infection. It's used mainly for young people with hepatitis B who wish to avoid long-term treatment or women who might want to get pregnant within a few years, after completing a finite course of therapy. Interferon should not be used during pregnancy. Side effects may include nausea, vomiting, difficulty breathing and depression.\n" +
            "\n" +
            "Liver transplant. If your liver has been severely damaged, a liver transplant may be an option. During \n" +
            "a liver transplant, the surgeon removes your damaged liver and replaces it with a healthy liver. Most transplanted livers come from deceased donors, though a small number come from living donors who donate a portion of their livers.\n";
    String med22="Hepatitis C:\n" +
            "\n" +
            "Hepatitis C is treated using direct acting antiviral (DAA) tablets.\n" +
            "DAA tablets are the safest and most effective medicines for treating hepatitis C.\n" +
            "They're highly effective at clearing the infection in more than 90% of people.\n" +
            "The tablets are taken for 8 to 12 weeks. The length of treatment will depend on which type of hepatitis C you have.\n" +
            "Some types of hepatitis C can be treated using more than 1 type of DAA.\n" +
            "\n" +
            "Some approved hepatitis C medicines include:\n" +
            "Simeprevir\n" +
            "Sofosbuvir\n" +
            "A combination of ledipasvir and sofosbuvir\n" +
            "A combination of ombitasvir, paritaprevir and ritonavir, taken with or without dasabuvir\n" +
            "A combination of sofosbuvir and velpatasvir\n" +
            "A combination of sofosbuvir, velpatasvir and voxilaprevir\n" +
            "A combination of glecaprevir and pibrentasvir\n" +
            "Ribavarin\n";
    String med23="Hepatitis D:\n" +
            "\n" +
            "There’s no cure yet for HDV. Until doctors come up with better options, the drug prescribed most often is pegylated interferon alfa (peg-IFNa).\n" +
            "\n" +
            "Peg-IFNa doesn’t work well for everyone. It can also cause many side effects, like lack of energy, weight loss, flu-like symptoms, and mental health issues like depression.\n" +
            "\n" +
            "Doctors aren’t sure how long treatment for HDV should last. You may need to take peg-IFNa for a year. If a blood test still shows a certain amount of the virus in your body, your doctor may suggest that you stay on PEG-IFNa for up to 1 more year.\n" +
            "\n" +
            "Peg-IFNa is often able to clear HDV from most people who have a co-infection. If you have a super-infection, the virus is less likely to go away. You may need to learn to manage HDV and HBV as lifelong conditions.\n" +
            "\n" +
            "Other types of HDV treatment are being tested. These include drugs that attack the virus or prevent it from latching on to hepatitis B cells that they need to survive.\n" +
            "If you have advanced liver disease, your doctor will recommend a liver transplant.\n";
    String med24="Hepatitis E:\n" +
            "\n" +
            "Medical therapy consists of electrolyte repletion and stabilization.\n" +
            "\n" +
            "Ribavirin may be considered in severe acute hepatitis E or chronic hepatitis E of transplant recipients who are not able to clear HEV after immunosuppression is reduced (see Medical Management). \n" +
            "\n" +
            "Pegylated interferon alfa, if not contraindicated, is an alternate treatment option for patients with chronic hepatitis E infection who have ribavirin-treatment failure.\n" +
            "\n" +
            "In most cases, hepatitis E goes away on its own in about 4-6 weeks. These steps can help ease your symptoms:\n" +
            "Rest\n" +
            "Eat healthy foods\n" +
            "Drink lots of water\n" +
            "Avoid alcohol\n";
    String med25="Alcoholic hepatitis:\n" +
            "\n" +
            "Medications to reduce liver inflammation:\n" +
            "\n" +
            "If you have severe alcoholic hepatitis, your doctor might recommend:\n" +
            "\n" +
            "Corticosteroids. These medications have shown some short-term benefit in increasing the survival of certain people with severe alcoholic hepatitis. However, corticosteroids have serious side effects and generally aren't prescribed if you have failing kidneys, gastrointestinal bleeding or an infection.\n" +
            "\n" +
            "Pentoxifylline. Your doctor might recommend this anti-inflammatory medication if you can't take corticosteroids. The benefit of pentoxifylline (Pentoxil) for alcoholic hepatitis isn't clear. Study results are inconsistent.\n";
    String med26="Osteoarthristis:\n" +
            "\n" +
            "Medications:\n" +
            "\n" +
            "Acetaminophen. Acetaminophen (Tylenol, others) has been shown to help some people with osteoarthritis who have mild to moderate pain. Taking more than the recommended dose of acetaminophen can cause liver damage.\n" +
            "\n" +
            "Nonsteroidal anti-inflammatory drugs (NSAIDs).  NSAIDs, such as ibuprofen (Advil, Motrin IB, others) and naproxen sodium (Aleve, others), taken at the recommended doses, typically relieve osteoarthritis pain. \n" +
            "\n" +
            "Therapy:\n" +
            "\n" +
            "Physical therapy. A physical therapist can show you exercises to strengthen the muscles around your joint, increase your flexibility and reduce pain. Regular gentle exercise that you do on your own, such as swimming or walking, can be equally effective.\n" +
            "\n" +
            "Occupational therapy. An occupational therapist can help you discover ways to do everyday tasks without putting extra stress on your already painful joint. \n";
    String med27="Arthritis:\n" +
            "\n" +
            "The main goal of treatment is to reduce the amount of pain you’re experiencing and prevent additional damage to the joints. Some people find heating pads and ice packs to be soothing. Others use mobility assistance devices, like canes or walkers, to help take pressure off sore joints.\n" +
            "\n" +
            "Medication:\n" +
            "A number of different types of medication treat arthritis:\n" +
            "\n" +
            "Analgesics, such as hydrocodone (Vicodin) or acetaminophen (Tylenol), are effective for pain management, but don’t help decrease inflammation.\n" +
            "\n" +
            "Nonsteroidal anti-inflammatory drugs (NSAIDs), such as ibuprofen (Advil) and salicylates, help control pain and inflammation. Salicylates can thin the blood, so they should be used very cautiously with additional blood thinning medications.\n" +
            "\n" +
            "Menthol or capsaicin creams block the transmission of pain signals from your joints.\n";
    String med28="Tuberculosis:\n" +
            "\n" +
            "It is very important that people who have TB disease are treated, finish the medicine, and take the drugs exactly as prescribed. \n" +
            "\n" +
            "If they stop taking the drugs too soon, they can become sick again; if they do not take the drugs correctly, the TB bacteria that are still alive may become resistant to those drugs. TB that is resistant to drugs is harder and more expensive to treat.\n" +
            "\n" +
            "TB disease can be treated by taking several drugs for 6 to 9 months.  There are 10 drugs currently approved by the U.S. Food and Drug Administration (FDA) for treating TB. Of the approved drugs, the first-line anti-TB agents that form the core of treatment regimens are:\n" +
            "isoniazid (INH)\n" +
            "rifampin (RIF)\n" +
            "ethambutol (EMB)\n" +
            "pyrazinamide (PZA)\n";

    String med29="Common Cold:\n" +
            "\n" +
            "There's no cure for the common cold. Antibiotics are of no use against cold viruses and shouldn't be used unless there's a bacterial infection. Treatment is directed at relieving signs and symptoms.\n" +
            "Pros and cons of commonly used cold remedies include:\n" +
            "\n" +
            "Pain relievers. For a fever, sore throat and headache, many people turn to acetaminophen (Tylenol, others) or other mild pain relievers. Use acetaminophen for the shortest time possible and follow label directions to avoid side effects.\n" +
            "Use caution when giving aspirin to children or teenagers. Children and teenagers recovering from chickenpox or flu-like symptoms should never take aspirin. This is because aspirin has been linked to Reye's syndrome, a rare but potentially life-threatening condition, in such children.\n" +
            "\n" +
            "Decongestant nasal sprays. Adults can use decongestant drops or sprays for up to five days. Prolonged use can cause rebound symptoms. Children younger than 6 shouldn't use decongestant drops or sprays.\n" +
            "\n" +
            "Cough syrups. The Food and Drug Administration (FDA) and the American Academy of Pediatrics strongly recommends against giving OTC cough and cold medicines to children younger than age 4 as they may be harmful. There's no good evidence that these remedies are beneficial or safe for children.\n";

    String med30="Pneumonia:\n" +
            "\n" +
            "Specific treatments depend on the type and severity of your pneumonia, your age and your overall health. The options include:\n" +
            "\n" +
            "Antibiotics. These medicines are used to treat bacterial pneumonia. It may take time to identify the type of bacteria causing your pneumonia and to choose the best antibiotic to treat it. If your symptoms don't improve, your doctor may recommend a different antibiotic.\n" +
            "\n" +
            "Cough medicine. This medicine may be used to calm your cough so that you can rest. Because coughing helps loosen and move fluid from your lungs, it's a good idea not to eliminate your cough completely. In addition, you should know that very few studies have looked at whether over-the-counter cough medicines lessen coughing caused by pneumonia. If you want to try a cough suppressant, use the lowest dose that helps you rest.\n" +
            "\n" +
            "Fever reducers/pain relievers. You may take these as needed for fever and discomfort. These include drugs such as aspirin, ibuprofen (Advil, Motrin IB, others) and acetaminophen (Tylenol, others).\n";

    String med31="Dimorphic hemmorhoids(piles):\n" +
            "\n" +
            "If your hemorrhoids produce only mild discomfort, your doctor might suggest over-the-counter creams, ointments, suppositories or pads. These products contain ingredients such as witch hazel, or hydrocortisone and lidocaine, which can temporarily relieve pain and itching.\n" +
            "\n" +
            "Don't use an over-the-counter steroid cream for more than a week unless directed by your doctor because it can thin your skin.\n";

    String med32="Heart attack:\n" +
            "\n" +
            "Medications to treat a heart attack might include:\n" +
            "\n" +
            "Aspirin. The 911 operator might tell you to take aspirin, or emergency medical personnel might give you aspirin immediately. Aspirin reduces blood clotting, thus helping maintain blood flow through a narrowed artery.\n" +
            "\n" +
            "Thrombolytics. These drugs, also called clotbusters, help dissolve a blood clot that's blocking blood flow to your heart. The earlier you receive a thrombolytic drug after a heart attack, the greater the chance you'll survive and have less heart damage.\n" +
            "\n" +
            "Antiplatelet agents. Emergency room doctors may give you other drugs known as platelet aggregation inhibitors to help prevent new clots and keep existing clots from getting larger.\n" +
            "\n" +
            "Other blood-thinning medications. You'll likely be given other medications, such as heparin, to make your blood less \"sticky\" and less likely to form clots. Heparin is given by IV or by an injection under your skin.\n" +
            "\n" +
            "Pain relievers. You might be given a pain reliever, such as morphine.\n" +
            "\n" +
            "Nitroglycerin. This medication, used to treat chest pain (angina), can help improve blood flow to the \n" +
            "heart by widening (dilating) the blood vessels.\n" +
            "\n" +
            "Beta blockers. These medications help relax your heart muscle, slow your heartbeat and decrease blood pressure, making your heart's job easier. Beta blockers can limit the amount of heart muscle damage and prevent future heart attacks.\n" +
            "\n" +
            "ACE inhibitors. These drugs lower blood pressure and reduce stress on the heart.\n" +
            "\n" +
            "Statins. These drugs help control your blood cholesterol.\n";

    String med33="Varicose veins:\n" +
            "\n" +
            "If you don't respond to self-care or compression stockings, or if your condition is more severe, your doctor may suggest one of these varicose vein treatments:\n" +
            "\n" +
            "Sclerotherapy. In this procedure, your doctor injects small- and medium-sized varicose veins with a solution or foam that scars and closes those veins. In a few weeks, treated varicose veins should fade.\n" +
            "\n" +
            "Foam sclerotherapy of large veins. Injection of a large vein with a foam solution is also a possible treatment to close a vein and seal it.\n" +
            "\n" +
            "Laser treatment. Doctors are using new technology in laser treatments to close off smaller varicose veins and spider veins. Laser treatment works by sending strong bursts of light onto the vein, which makes the vein slowly fade and disappear. No incisions or needles are used.\n" +
            "\n" +
            "High ligation and vein stripping. This procedure involves tying off a vein before it joins a deep vein and removing the vein through small incisions. This is an outpatient procedure for most people. Removing the vein won't adversely affect circulation in your leg because veins deeper in the leg take care of the larger volumes of blood.\n";

    String med34="Hypothyroidism:\n" +
            "\n" +
            "Standard treatment for hypothyroidism involves daily use of the synthetic thyroid hormone levothyroxine (Levo-T, Synthroid, others). This oral medication restores adequate hormone levels, reversing the signs and symptoms of hypothyroidism.\n" +
            "\n" +
            "You'll likely start to feel better soon after you start treatment. The medication gradually lowers cholesterol levels elevated by the disease and may reverse any weight gain. Treatment with levothyroxine will likely be lifelong, but because the dosage you need may change, your doctor is likely to check your TSH level every year.\n" +
            "\n" +
            "Levothyroxine causes virtually no side effects when used in the appropriate dose and is relatively inexpensive. If you change brands, let your doctor know to ensure you're still receiving the right dosage.\n" +
            "\n" +
            "Also, don't skip doses or stop taking the drug because you're feeling better. If you do, the symptoms of hypothyroidism will gradually return.\n";

    String med35="Hyperthyroidism:\n" +
            "\n" +
            "Anti-thyroid medications. These medications gradually reduce symptoms of hyperthyroidism by preventing your thyroid gland from producing excess amounts of hormones. They include methimazole (Tapazole) and propylithiouracil.\n" +
            "\n" +
            "Symptoms usually begin to improve within several weeks to months, but treatment with anti-thyroid medications typically continues at least a year and often longer.\n" +
            "\n" +
            "For some people, this clears up the problem permanently, but other people may experience a relapse. Both drugs can cause serious liver damage, sometimes leading to death. Because propylthiouracil has caused far more cases of liver damage, it generally should be used only when you can't tolerate methimazole.\n" +
            "\n" +
            "A small number of people who are allergic to these drugs may develop skin rashes, hives, fever or joint pain. They also can make you more susceptible to infection.\n" +
            "\n";

    String med36="Hypoglychemia:\n" +
            "\n" +
            "Oral hypoglycemic drugs are used only in the treatment of type 2 diabetes which is a disorder involving resistance to secreted insulin. Type 1 diabetes involves a lack of insulin and requires insulin for treatment. There are now four classes of hypoglycemic drugs:\n" +
            "Sulfonylureas\n" +
            "Metformin\n" +
            "Thiazolidinediones\n" +
            "Alpha-glucosidase inhibitors.\n" +
            "\n" +
            "These drugs are approved for use only in patients with type 2 diabetes and are used in patients who have not responded to diet, weight reduction, and exercise. They are not approved for the treatment of women who are pregnant with diabetes.\n" +
            "\n" +
            "SULFONYLUREAS – Sulfonylureas are the most widely used drugs for the treatment of type 2 diabetes and appear to function by stimulating insulin secretion. \n" +
            "\n" +
            "Pharmacokinetics – Sulfonylureas differ mainly in their potency & their duration of action. Glipizide, glyburide (glibenclamide), and glimepiride are so-called second-generation sulfonylureas. They have a potency that allows them to be given in much lower doses.\n" +
            "\n" +
            "Those drugs with longer half-lives (particularly chlorpropamide, glyburide, and glimepiride) can be given once daily. This benefit may be counterbalanced by a substantially increased risk of hypoglycemia.\n";

    String med37="(vertigo) Paroymsal Positional Vertigo:\n" +
            "\n" +
            "Medicines called vestibular suppressants (such as antihistamines, sedatives, or scopolamine) may be tried if your symptoms are severe. \n" +
            "\n" +
            "Antiemetic medicines may also be used to reduce nausea and vomiting that can occur with vertigo. In rare cases, surgery may be used to treat BPPV.\n" +
            "\n";

    String med38="Acne:\n" +
            "\n" +
            "The most common topical prescription medications for acne are:\n" +
            "\n" +
            "Retinoids and retinoid-like drugs. Drugs that contain retinoic acids or tretinoin are often useful for moderate acne. These come as creams, gels and lotions. Examples include tretinoin (Avita, Retin-A, others), adapalene (Differin) and tazarotene (Tazorac, Avage, others). You apply this medication in the evening, beginning with three times a week, then daily as your skin becomes used to it\n" +
            "\n" +
            "Antibiotics. These work by killing excess skin bacteria and reducing redness and inflammation. For the first few months of treatment, you may use both a retinoid and an antibiotic, with the antibiotic applied in the morning and the retinoid in the evening. Examples include clindamycin with benzoyl peroxide (Benzaclin, Duac, others) and erythromycin with benzoyl peroxide (Benzamycin). \n" +
            "\n" +
            "Azelaic acid and salicylic acid.  Prescription azelaic acid (Azelex, Finacea) is an option during \n" +
            "pregnancy and while breast-feeding. It can also be used to manage discoloration that occurs with some types of acne. Side effects include skin redness and minor skin irritation.\n" +
            "\n" +
            "Salicylic acid may help prevent plugged hair follicles and is available as both wash-off and leave-on products. Studies showing its effectiveness are limited. Side effects include skin discoloration and minor skin irritation.\n" +
            "\n" +
            "Dapsone. Dapsone (Aczone) 5% gel twice daily is recommended for inflammatory acne, especially in women with acne. Side effects include redness and dryness.\n";

    String med39="Urinary tract infection:\n" +
            "\n" +
            "Drugs commonly recommended for simple UTIs include:\n" +
            "Trimethoprim/sulfamethoxazole (Bactrim, Septra, others)\n" +
            "Fosfomycin (Monurol)\n" +
            "Nitrofurantoin (Macrodantin, Macrobid)\n" +
            "Cephalexin (Keflex)\n" +
            "Ceftriaxone\n" +
            "\n" +
            "The group of antibiotic medicines known as fluoroquinolones — such as ciprofloxacin (Cipro), levofloxacin and others — isn't commonly recommended for simple UTIs, as the risks of these medicines generally outweigh the benefits for treating uncomplicated UTIs. In some cases, such as a complicated UTI or kidney infection, your doctor might prescribe a fluoroquinolone medicine if there are no other treatment options.\n" +
            "\n" +
            "Often, symptoms clear up within a few days of treatment. But you may need to continue antibiotics for a week or more. Take the entire course of antibiotics as prescribed.\n";

    String med40="Psoriasis:\n" +
            "\n" +
            "Corticosteroids. Your doctor may prescribe a stronger corticosteroid cream or ointment— triamcinolone (Acetonide, Trianex), clobetasol (Temovate) for smaller, less-sensitive or tougher-to-treat areas.\n" +
            "\n" +
            "Vitamin D analogues. Synthetic forms of vitamin D, such as calcipotriene and calcitriol (Vectical) slow skin cell growth. This type of drug may be used alone or with topical corticosteroids. Calcitriol may cause less irritation in sensitive areas. Calcipotriene and calcitriol are usually more expensive than topical corticosteroids.\n" +
            "\n" +
            "Retinoids. Tazarotene (Tazorac, Avage) is available as a gel and cream and applied once or twice daily. The most common side effects are skin irritation and increased sensitivity to light.\n" +
            "Tazarotene isn't recommended when you're pregnant or breast-feeding or if you intend to become pregnant.\n" +
            "\n" +
            "Salicylic acid. Salicylic acid shampoos and scalp solutions reduce the scaling of scalp psoriasis. It may be used alone, or to enhance the ability of other medications to more easily penetrate the skin.\n" +
            "\n" +
            "Coal tar. Coal tar reduces scaling, itching and inflammation. It's available over-the-counter or by prescription in various forms, such as shampoo, cream and oil. These products can irritate the skin. They're also messy, stain clothing and bedding, and can have a strong odor.\n" +
            "Coal tar treatment isn't recommended for women who are pregnant or breast-feeding.\n" +
            "\n" +
            "Anthralin. Anthralin (another tar product) is a cream used to slow skin cell growth. It can also remove scales and make skin smoother. It should not be used on the face or genitals. Anthralin can irritate skin, and it stains almost anything it touches. It's usually applied for a short time and then washed off.\n";

    String med41="Impetigo:\n" +
            "\n" +
            "Impetigo typically is treated with an antibiotic ointment or cream that you apply directly to the sores. You may need to first soak the affected area in warm water or use wet compresses to help remove the scabs so the antibiotic can penetrate the skin.\n" +
            "\n" +
            "If you have more than just a few impetigo sores, your doctor might recommend antibiotic drugs that can be taken by mouth. Be sure to finish the entire course of medication even if the sores are healed. This helps prevent the infection from recurring and makes antibiotic resistance less likely.\n" +
            "\n" +
            "Topical antibiotics, systemic antibiotics, or a combination of both is effective therapy for impetigo. \n" +
            "Empiric bacterial coverage is aimed at eradicating Staphylococcus aureus and group A beta-haemolytic streptococci (GABHS; also known as Streptococcus pyogenes). Antihistamines may be prescribed for symptomatic relief in patients with pruritus.\n" +
            "\n" +
            "Mupirocin applied topically has been shown to be effective for localized impetigo, but resistance has emerged. Retapamulin is a newer option\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("onCreate","entered pharm.java");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pharma);

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
