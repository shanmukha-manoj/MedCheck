package com.example.medcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class Hospital extends AppCompatActivity {
    ExpandableTextView etv1,etv2,etv3,etv4,etv5,etv6,etv7,etv8;
    String med1="CARDIOLOGY\n" +
            "\n" +
            "Fortis Escorts Heart Institute and Research Center, Delhi\n" +
            "\n" +
            "Salient Features\n" +
            "200 expert doctors and 1600 qualified employees\n" +
            "Hi-tech technology such as Dual CT Scan\n" +
            "More than 14,000 patient admissions and 7000 emergency patients handled each year\n" +
            "Around 285 hospital beds with full occupancy\n" +
            "5 equipped Cath labs\n" +
            "First of its kind E-ICU in India\n" +
            "NABH accreditation\n" +
            "Esteemed panel of Doctors\n" +
            "Dr. Ashok Seth, Cardiologist\n" +
            "Dr. Ashok Kumar Omar, Cardiologist (Non-invasive)\n" +
            "Dr. S.N. Khanna, Cardiac Surgeon\n" +
            "Dr. Z.S. Meharwal, Surgeon (Cardiovascular)\n" +
            "Dr. Nishith Chandra, Cardiologist (Interventional)\n" +
            "Dr. Aparna Jaswal, Specialist (Electrophysiology & Cardiology)\n" +
            "Address\n" +
            "Okhla Road, New Delhi - 110 025 (INDIA)\n" +
            "\n" +
            "Asian Heart Institute\n" +
            "\n" +
            "Salient Features\n" +
            "Close to 2.5 lakhs patients treated till date\n" +
            "33,000 angiographies done\n" +
            "22,000 surgeries performed\n" +
            "18,000 bypass patients provided with surgery\n" +
            "Success rate of 99.3% with regards to bypass surgeries\n" +
            "Success rate of 99.83% with regards to Cardiac Surgeries\n" +
            "Esteemed panel of Doctors\n" +
            "Dr. Ramakanta Panda, Surgeon (Cardiothoracic & Vascular)\n" +
            "Dr. Tilak Suvarna, Cardiologist (Interventional)\n" +
            "Dr. Prafulla Kerkar, Cardiologist\n" +
            "Dr. Sunil Vanzara, Surgeon (Cardiothoracic & Vascular)\n" +
            "Dr. Santosh Kumar Dora, Physiologist (Cardiac Electro)\n" +
            "Address\n" +
            "G / N Block, Bandra Kurla Complex,\n" +
            "Bandra (E), Mumbai 400 051, Maharashtra, INDIA.\n" +
            "\n" +
            "Apollo Hospitals, Greams Lane\n" +
            "\n" +
            "Salient Features\n" +
            "More than 1,40,000 heart surgeries performed till date\n" +
            "Success rate of 99.6% achieved\n" +
            "Dedicated and well equipped CCUs for Cardiothoracic concerns with a nursing ratio of 1:1\n" +
            "Latest diagnostic and medical equipment used\n" +
            "Expert team of surgeons and doctors\n" +
            "Saving a child's heart initiative for serving underprivileged children\n" +
            "Esteemed panel of Doctors\n" +
            "Dr. Amal Louis, Cardiologist\n" +
            "Dr. Guru Prasad Sogunuru, Cardiology specialist (Electrophysiology, Transplantation, Heart failure)\n" +
            "Dr. Y. Vijaychandra Reddy, Cardiologist (Interventional)\n" +
            "Dr. Asha Mahilmaran, Cardiologist\n" +
            "Dr. Karthigesan A.M, Specialist (Electrophysiology)\n" +
            "Dr. Muthukumaran C.S, Cardiologist (Pediatric)\n" +
            "Dr. Sai Satish, Cardiologist (Interventional)\n" +
            "Address\n" +
            "No. 21, Greams Lane,\n" +
            "Off. Greams Road, Chennai – 600006\n";
    String med2="Paediatrics\n" +
            "\n" +
            "Apollo Children's Hospital, Chennai\n" +
            "\n" +
            "Salient Features\n" +
            "80 hospital beds for treatment\n" +
            "Best hospital for pediatric specialties\n" +
            "Every super specialty related to pediatrics rendered with treatment\n" +
            "Equipped intensive care facilities for pediatrics\n" +
            "Comprehensive operation theaters\n" +
            "More than 70 pediatric specialists and 180 nurses available\n" +
            "Special child clinic for Insulin Pump\n" +
            "Special health check up conducted for children\n" +
            "Esteemed panel of Doctors\n" +
            "Dr. Banu K, Pediatrics specialist\n" +
            "Dr. Daga J.N, Specialist (General Pediatrics)\n" +
            "Dr. Desai D, Pediatrics specialist\n" +
            "Dr. Latha Vishwanathan, Consultant (Pediatrics)\n" +
            "Dr. Mathrubootham Sridhar, Consultant (Pediatrics)\n" +
            "Dr. Radha Rajagopalan, Specialist (Pediatrics)\n" +
            "Address\n" +
            "No. 15, Shafee Mohammed Road,\n" +
            "Thousand Lights, Chennai-600006\n" +
            "\n" +
            "Rainbow Children's Hospital & Perinatal Center, Hyderabad\n" +
            "\n" +
            "Salient Features\n" +
            "500 bedded comprehensive hospital spread across 5 locations\n" +
            "Modern methods of pediatrics adopted\n" +
            "High class facilities\n" +
            "“The Week” has conferred this hospital as amongst the top five for pediatrics consecutively for 3 years\n" +
            "Over 12 thousand admissions annually\n" +
            "24X7 transportation and emergency care\n" +
            "Esteemed panel of Doctors\n" +
            "Dr. Ramesh Kancharla, Specialist (Pediatrics, Gastroenterology)\n" +
            "Dr. Preetham Kumar Reddy, Pediatrician\n" +
            "Dr. Ramprasad, Pediatrician\n" +
            "Dr. Pallavi Maddukuri, Pediatrician\n" +
            "Dr. Rajath Athreya, Consultant (Pediatrics & Neonatology)\n" +
            "Dr. Kavitha Bhat, Pediatric Endocrinologist\n" +
            "Address\n" +
            "22, Road No - 4, (old road no-10),\n" +
            "Karvy Lanes, Banjara Hills,\n" +
            "Hyderabad - 500 034. AP, INDIA.\n" +
            "\n" +
            "Indraprasth Apollo, Delhi NCR\n" +
            "\n" +
            "Salient Features\n" +
            "First medical facility in India to be accredited by Joint Commission International, USA for 4 times\n" +
            "Laboratories are accredited by National Accreditation Board for Laboratories (NABL)\n" +
            "Hospital ranked 5th best hospital in India by THE WEEK- AC Nielson survey for neuro-pediatrics\n" +
            "The Advanced Pediatrics Centre is ranked number one department for pediatrics treatment in India\n" +
            "High Dependency Unit of 2 beds\n" +
            "Level III Pediatric Intensive Care Unit (PICU) of 9 beds\n" +
            "Neo Natal Intensive Care Unit (NNICU) of 14 beds\n" +
            "The pediatric cardiology department has the credit of performing complex surgeries like open heart surgery on a child suffering from HIV, performing angioplasty on a baby weighing 1.6 kg and many more\n" +
            "Hospital has a dedicated team of cancer specialists for treating childhood cancers\n" +
            "Esteemed panel of Doctors\n" +
            "Dr. Vineet Bhushan Gupta - Pediatric Neurologist\n" +
            "Dr. Veena Kalra - Pediatric Neurologist\n" +
            "Dr. Shina Menon - Pediatric Nephrologist\n" +
            "Dr. Ritesh Gupta - Pediatric Cardiologist\n" +
            "Dr. Ramani Narasimhan - Pediatric Orthopedician\n" +
            "Dr. Prita Trehan - Pediatrician\n" +
            "Dr. Deepa Sharma - Pediatrician\n" +
            "Dr. Amita Mahajan - Pediatrician\n" +
            "Address\n" +
            "Sarita Vihar, Delhi Mathura Road,\n" +
            "New Delhi - 110076, INDIA\n";
    String med3="Neurology\n" +
            "\n" +
            "Apollo Hospital, Greams Road, Chennai\n" +
            "\n" +
            "Salient Features\n" +
            "Hospital is certified by Joint Commission International (JCI)\n" +
            "Apollo Greams road facility was felicitated with the Best Multi-specialty award in India by The Times Health Multi-Specialty Hospital Survey\n" +
            "First hospital in South India to have received HACCP certification by the British Standards Institution\n" +
            "More than 1000 major neurosurgeries are carried out every year in the neurosciences department of this Apollo unit\n" +
            "Surgeons regularly handle patients suffering from epilepsy, diabetic neuropathy, myopathy, movement disorders etc.\n" +
            "Advanced and fully-equipped neuro-physiology laboratory on the premises of hospital\n" +
            "Many complex surgeries for treatment of spinal tumors, spinal dislocation, Parkinson's etc. are also performed by the talented neurosurgeons\n" +
            "Pediatric neurological disorders are treated by eminent neurologists on-board the hospital\n" +
            "The hospital provides robotic neurorehabilitation to their patients undergoing neurological surgeries. This makes them the only hospital in India to do so.\n" +
            "Esteemed panel of doctors\n" +
            "Dr. Dhanraj M: Neurologist\n" +
            "Dr. Geetha Lakshmipathy: Neurologist\n" +
            "Dr. T.S. Kumaravel: Neurologist\n" +
            "Dr.M. R. Sivakumar: Neurologist\n" +
            "Dr. Panneer A: Neurologist\n" +
            "Dr. Yogaraj S: Neurologist\n" +
            "Dr. Balamurugan S: Neurosurgeon\n" +
            "Dr. Siddhartha Ghosh: Neurosurgeon\n" +
            "Dr. Srinivasan Paramasivam: Neurosurgeon\n" +
            "Address\n" +
            "21, Greams Lane,\n" +
            "Off Greams Road, Chennai 600 006\n" +
            "\n" +
            "Nanavati Hospital, Mumbai\n" +
            "\n" +
            "Salient Features\n" +
            "In 2014, the hospital was honored with the Healthcare Excellence Award by Indus foundation, Indian Medical Association, Government of Telangana and Federation of Indian Chambers of Commerce & Industry (FICCI)\n" +
            "The neuro-spine surgery program that uses minimally invasive surgery approach, offered by this hospital is a one of its kind surgical facility\n" +
            "The neurosurgery department is assisted by superior diagnostic technologies for accurate investigation of neurological illnesses\n" +
            "A wide spectrum of neurological treatments for treating stroke, seizure, cancers of nervous system etc. are in place\n" +
            "Surgeons are well-versed in handling of complex conditions such as cerebral aneurysm, skull based injuries, trauma and neurological conditions in children etc.\n" +
            "Esteemed panel of doctors\n" +
            "Dr. Ashutosh Shetty: Neurologist\n" +
            "Dr. B. N. Sawant: Neurologist\n" +
            "Dr. Kishore Shetty: Neurologist\n" +
            "Dr. K C Shah: Neurologist\n" +
            "Dr. Neeta Shah: Neurologist\n" +
            "Dr. Nitin Dange: Neurologist\n" +
            "Dr. Sunanda Anand: Neurologist\n" +
            "Dr. Pradyumna J. Oak: Neurologist\n" +
            "Dr. G. M. Khan: Neurosurgeon\n" +
            "Dr. Harshadrai C. Parekh: Neurosurgeon\n" +
            "Dr. Mohinish Bhatjiwale: Neurosurgeon\n" +
            "Dr. Manoj Virani: Neurosurgeon\n" +
            "Dr. Suresh Sankhla: Neurosurgeon\n" +
            "Dr. Rajesh Jain:Neurosurgeon\n" +
            "Dr. Varsha Dutta: Neuropsychology\n" +
            "Dr. Shilpa Kulkarni: Pediatric Neurologist\n" +
            "Dr. Naresh Biyani: Pediatric Neurosurgeon\n" +
            "Address\n" +
            "S.V. Road, Vile Parle West,\n" +
            "Mumbai 400 056, India\n" +
            "\n" +
            "Indraprastha Apollo Hospitals, Delhi\n" +
            "\n" +
            "Salient Features\n" +
            "State-of-art operating rooms full-fledged with latest equipment\n" +
            "11 bedded technologically infrastructured neuro intensive care unit\n" +
            "7 bedded post operative neuro intensive care unit\n" +
            "6 bedded stroke intensive care unit full-fledged with specialized equipment\n" +
            "Exclusive movement disorder programme organized for patients suffering from advanced Parkinson's disease, severe tremor and general dystonias\n" +
            "Specialized stroke programme arranged for patients having ischemic stroke\n" +
            "Around 1000 major cranial and spinal neuro-surgeries are performed every year\n" +
            "Specialized services like Digital Subtraction Angiography (DSA - detects deformities in the blood vessels present within your brain) available at the center of neurosciences\n" +
            "Vascular procedures performed using DSA suite\n" +
            "Esteemed panel of Doctors\n" +
            "Dr. A K Banerji – Skull base Neurosurgeon\n" +
            "Dr. Bhanu Pant – Neuro Physiologist\n" +
            "Dr. Charu Gauba – Consultant Neurologist\n" +
            "Dr. Hans Raj – Neuro Physiologist\n" +
            "Dr. P N Renjen – Neurologist\n" +
            "Dr. Ranjendra Prasad – Neurosurgeon\n" +
            "Dr. Ravi Bhatia – Neurosurgeon\n" +
            "Dr. Sudheer Tyagi – Functional Neurosurgeon\n" +
            "Dr. Varindra Paul Singh – Neurosurgeon\n" +
            "Dr. Anoop Kohli – Neuro Therapist\n" +
            "Dr. C M Malhotra – Neurosurgeon\n" +
            "Dr. G K Ahuja – Consultant Neurologist\n" +
            "Dr. Mukul Verma – Interventional Neurologist\n" +
            "Dr. Pranav Kumar – Cerebro Vascular Surgeon\n" +
            "Dr. Rakesh Agarwal – Neuro Electrophysiologist\n" +
            "Dr. S K Sogani – Neurosurgeon (Trauma)\n" +
            "Dr. Sunit Mediratta – Laparoscopic Spine Surgeon\n" +
            "Dr. Vinit Suri – Interventional Neurologist\n" +
            "Address\n" +
            "Sarita Vihar, Delhi Mathura Road\n" +
            "New Delhi - 110076 (INDIA)\n";
    String med4="Oncology\n" +
            "\n" +
            "Yashoda Cancer Institute, Hyderabad\n" +
            "\n" +
            "Salient Features\n" +
            "Advanced medical technology like 1.5 Tesla MRI, Dual Source CT Scanners, Digital X-Rays utilized for diagnosis of cancer\n" +
            "Fully equipped onco-pathology laboratory where highly sophisticated techniques like frozen section biopsy, clow cytometry, immunohistochemsitry are available\n" +
            "Team of highly experienced doctors, surgeons and technicians striving to achieve their goal of best quality cancer care to each cancer patient\n" +
            "Latest technology known as Varian RapidArc Linear Accelerator utilized to provide radiation therapy\n" +
            "Highest level of safety maintained while performing chemotherapy and radiation therapy\n" +
            "Psychological counseling facility for patients who suffer from or are recovering from cancer\n" +
            "Facility for plastic surgery to reconstruct body tissues that have been distorted due to cancer or that have become misshapen after surgery.\n" +
            "Esteemed panel of doctors\n" +
            "Dr. Bharath Chandra.G – Radiation Oncologist\n" +
            "Dr. M. Bala Vikas Kumar - Oncosurgeon\n" +
            "Dr. K.Syed Akram - Radiation Oncologist\n" +
            "Dr. Pramod Tike - Radiation Oncologist\n" +
            "Dr.Y. Nalini - Radiation Oncologist\n" +
            "Dr. Veerendra Patil - Pediatric Oncologist\n" +
            "Dr. Nikhil Ghadyalpatil - Oncologist\n" +
            "Dr. Sachin Marda - Oncosurgeon\n" +
            "Address\n" +
            "1) Alexander Road, Secunderabad, Telangana 500003\n" +
            "2) Nalgonda X Roads, Malakpet, Hyderabad, Telangana 500036\n" +
            "3) Rajbhavan Road, Somajiguda, Hyderabad, Telangana 500082\n" +
            "\n" +
            "Artemis Hospital, Delhi NCR\n" +
            "\n" +
            "Salient Features\n" +
            "380 bedded tertiary care center having all medical specialties under one roof\n" +
            "Best quality primary treatment, convalescent care and rehabilitation services provided to all cancer patients\n" +
            "Most advanced technology used to provide treatment to cancer patients in the form of chemotherapy, radiation therapy and surgery\n" +
            "Safety precautions of maximum level undertaken while administering radiation therapy\n" +
            "Fully operational outpatient department catering to all cancer presents presenting for follow ups and consultation\n" +
            "Day care facility for patients requiring chemotherapy\n" +
            "Pain clinic facility\n" +
            "Separate division providing medical care for elderly cancer patients\n" +
            "Esteemed panel of doctors\n" +
            "Dr. Hari Goyal - Hemato-oncologist\n" +
            "Dr. Rakesh Chopra - Hemato-oncologist\n" +
            "Dr.Subodh Chandra Pandey - Radiation Oncologist\n" +
            "Dr.S.Jayalakshmi - Radiation Oncologist\n" +
            "Dr. Nidhi Garg - Oncologist\n" +
            "Dr. Itisha Chaudhary - Oncologist\n" +
            "Dr. Indu Agarwal - Radiation Oncologist\n" +
            "Dr. Randeep Singh - Oncologist\n" +
            "Dr. Sandeep Goel - Radiation Oncologist\n" +
            "Address\n" +
            "Plot No. 14, Sector 20,\n" +
            "Dwarka, New Delhi, Delhi 110075.\n" +
            "\n" +
            "Apollo Cancer Institute, Chennai\n" +
            "\n" +
            "Salient features\n" +
            "Day Care Chemotherapy and targeted therapy available\n" +
            "Around 50 donor transplants successfully conducted till date\n" +
            "Revolutionary “CyberKnife” system installed providing new hope to Cancer patients\n" +
            "Expert doctors and cutting edge technology used\n" +
            "First amongst Hospital groups in India to initiate Radiosurgery and Stereotactic Radiosurgery\n" +
            "Esteemed panel of Doctors\n" +
            "Dr. R. Siva Prakash, Oncologist (Surgical)\n" +
            "Dr. Ranjan Mohapatra, Oncologist (Medical)\n" +
            "Dr. Mahadev Pohtaraju, Oncologist\n" +
            "Dr. B. Chokkalingam, Surgeon (Orthopedic)\n" +
            "Address\n" +
            "No.320, Anna Salai, Teynampet,\n" +
            "Nandanam, Chennai - 600035\n";
    String med5="Obstetrics-Gynaecology\n" +
            "\n"+
            "Fortis La Femme, Delhi\n" +
            "\n" +
            "Salient Features\n" +
            "38 bedded inpatient department equipped with latest medical facilities\n" +
            "NABH accredited institute\n" +
            "Fertility clinic for women who having difficulty in conceiving\n" +
            "Breast clinic providing world class care to women suffering from breast cancer, fibroadenoma and other breast conditions\n" +
            "Fitness training provided to pregnant women and new mothers to help them gain muscular strength\n" +
            "Inter-department coordination with endocrine specialists to help monitoring of hormonal disorders in women\n" +
            "Consultation and hormonal replacement therapy offered to women who are suffering from menopausal difficulty\n" +
            "Provision of cosmetic surgery for patients who require breast reconstruction after being operated for cancer\n" +
            "Esteemed panel of doctors\n" +
            "Dr. Amita Wadhwa - Gynecologist\n" +
            "Dr. Anjila Aneja - Gynecologist\n" +
            "Dr. Birbala Rai - Gynecologist\n" +
            "Dr. Indu Tandon - Gynecologist\n" +
            "Dr. Jasbir Chandana - Gynecologist\n" +
            "Dr. Juhi Jain - Gynecologist\n" +
            "Dr. Kailash Maan - Gynecologist\n" +
            "Dr. Mala Arora - Gynecologist\n" +
            "Address\n" +
            "S - 549, Greater Kailash - II,\n" +
            "New Delhi, Delhi 110048\n" +
            "\n" +
            "Fortis La Femme, Bangalore\n" +
            "\n" +
            "Salient Features\n" +
            "Mammamia, a special division providing facilities like Lamaze classes, pre-natal counseling etc. to expecting parents\n" +
            "Library equipped with books on care during and after pregnancy\n" +
            "Fully functional operation theater for performing gynec surgeries\n" +
            "Facility for lactation consultation to new mothers\n" +
            "Fortis Bloom IVF center to provide infertility treatment to couples who require assisted conception\n" +
            "Gynec-oncology department managing all aspects of cancer affecting the female reproductive system\n" +
            "Team of highly qualified gynecologists, IVF specialists, obstetricians, counselors, providing best possible healthcare to women\n" +
            "Esteemed panel of doctors\n" +
            "Dr. Anita. B - Gynecologist\n" +
            "Dr. Sudhir Chopde - Gynecologist\n" +
            "Dr. Aruna Muralidhar - Gynecologist\n" +
            "Dr. Arwa Mohsin - Gynecologist\n" +
            "Dr. Aviva Pinto - Gynecologist\n" +
            "Dr. Jaya Bhat - Gynecologist\n" +
            "Dr. Nawab Jan - Gynecologist\n" +
            "Dr. Prajual Hegde - Gynecologist\n" +
            "Dr. Sunita D'Souza - Gynecologist\n" +
            "Dr. Revati Parthasarthy - Gynecologist\n" +
            "Address\n" +
            "No:62, Richmond Road,\n" +
            "Behind Sacred Heart Church,\n" +
            "Entry from Mother Teresa Road,\n" +
            "Richmond Town, Bengaluru 560025\n" +
            "________________________________________\n" +
            "Motherhood Hospital, Bangalore\n" +
            "\n" +
            "Salient Features\n" +
            "An experienced panel of gynecologists providing best quality ante-natal care to expectant mothers\n" +
            "I.V.F. treatment along with counselling therapy available for couples who are unable to conceive naturally\n" +
            "Radiology department equipped with latest diagnostic equipment for performing high resolution ante-natal scans\n" +
            "Gynecologists specializing in oncology providing best quality treatment to breast cancer patients\n" +
            "Reconstruction surgery performed for patients who require to undergo breast removal as part of cancer treatment\n" +
            "Minimal access methods used to perform surgeries to treat PCOD, endometriosis, vaginal cyst, uterine fibroids etc.\n" +
            "Medical management of hormonal disturbances, delayed menarche, menopausal complaints available on outpatient basis\n" +
            "Treatment of female infertility done using advanced surgical methods and through medical management\n" +
            "Fetal medicine specialists utilising advanced techniques to monitor fetal growth and wellbeing\n" +
            "Esteemed panel of doctors\n" +
            "Dr. S.K. Sharma - Gynecologist\n" +
            "Dr. Suhasini Inamdar - Gynecologist\n" +
            "Dr. Jayashree Murthy - Gynecologist\n" +
            "Dr. Vijayalakshmi - Gynecologist\n" +
            "Dr. Madhavi Reddy - Gynecologist\n" +
            "Dr. Nupur Sood - Gynecologist\n" +
            "Dr. Sapna Lulla - Gynecologist\n" +
            "Dr. Daksha Bakre - Gynecologist\n" +
            "Dr. Anitha Rao - Gynecologist\n" +
            "Dr. Pratibha Govindaiah - Gynecologist\n" +
            "Dr. Sangeeta Gomes - Gynecologist\n" +
            "Dr. Sunitha Shekokar - Gynecologist\n" +
            "Address\n" +
            "Indiranagar\n" +
            "324, Chinmaya Mission Hospital Road,\n" +
            "First Stage, Hoysala Nagar,\n" +
            "Indiranagar, Bengaluru - 560038\n" +
            "Sarjapur Road\n" +
            "514/ 1-2-3, Kaikondara Village,\n" +
            "opp. More mall, Sarjapur Road,\n" +
            "Bengaluru, Karnataka 560104\n" +
            "HRBR Layout\n" +
            "914, 5th A Cross Road,\n" +
            "HRBR Layout 1st Block,\n" +
            "Kalyan Nagar, Bengaluru - 560043\n" +
            "Hebbal\n" +
            "2266/17 & 18, Service Road,\n" +
            "G Block, Sahakara Nagar,\n" +
            "International Airport Road,\n" +
            "Hebbal, Bengaluru - 560092\n";
    String med6="Ophthalmology\n" +
            "\n" +
            "Vasan Eye Care Hospitals\n" +
            "\n" +
            "Salient Features\n" +
            "Each specialty has separate division\n" +
            "State-of-art eye operating rooms\n" +
            "Around 10 diagnostic labs for each facility\n" +
            "Pharmacy services available for 24 hours\n" +
            "Special section for post-operative care\n" +
            "Utilizes advanced eye care tools for various ophthalmic interventions and treatments\n" +
            "Team of efficient doctors and specialists for emergency care\n" +
            "Exclusive department for children's eye care\n" +
            "20000 cold phaco sub-centers for advanced micro incision cataract operations\n" +
            "Exclusive unit for alcon accurus vitreo retinal surgery\n" +
            "Esteemed panel of doctors\n" +
            "Dr. V Madhavi - Clinical Retina Specialist\n" +
            "Dr. Minati Kumari - Refractive Cornea Eye Surgeon\n" +
            "Dr. Deepak Prashant - General Eye Surgeon\n" +
            "Dr. Sumit Monga - Paediatric Eye Specialist\n" +
            "Dr. Ratnamala Mrinalini - General Eye Surgeon\n" +
            "Dr. H S Harish - Retina Surgeon\n" +
            "Dr. Rinku Das - Eye Surgeon (Glaucoma, IOL and Microsurgery)\n" +
            "Dr. R Ravikrishna - Eye Specialist (Phaco)\n" +
            "Dr. Pavan Lohiya - Paediatric Eye Surgeon (Oculoplasty)\n" +
            "Dr. Sujata Patil - General Eye Specialist\n" +
            "Dr. Dr. Aparna Bhatnagar - Reconstructive & Aesthetic Eye Surgeon\n" +
            "Dr. Mary Shoba Rani - Retina Eye Specialist\n" +
            "Dr. Anirban Das - Glaucoma and Phaco Eye Surgeon\n" +
            "Dr. Prosenjit Mondal - Retina Surgeon\n" +
            "Dr. Phani Raj Kasturi - Refractive Cornea Surgeon\n" +
            "Dr. Kolli Divakara Rao - Eye Surgeon\n" +
            "Presence: India, UAE, Sri Lanka________________________________________\n" +
            "Center for Sight Hospitals\n" +
            "\n" +
            "Salient Features\n" +
            "NABH accredited eye care centers\n" +
            "Achieved the FICCI Health-care Excellence Award for operational excellence in the private sector in 2012\n" +
            "Many branches are registered under Nursing Home Act by the Directorate General of Health Services\n" +
            "Upgraded technological base at different centers for diagnostic, clinical and surgical purposes\n" +
            "Both direct and indirect ophthalmoscopes used\n" +
            "Exclusive green laser unit for eye interventions\n" +
            "Ultra-modern digital magnification and LED cold light illumination systems utilized for operational purposes\n" +
            "Esteemed panel of doctors\n" +
            "Dr. Abha Gahlot - Cataract Surgeon\n" +
            "Dr. Anand Kumar Tomar - Ocular Oncosurgeon\n" +
            "Dr. Abhishek Sharma - Paediatric Eye Surgeon\n" +
            "Dr. Charu Khurana - Paediatric Eye Specialist\n" +
            "Dr. Dr. Ritesh Narula - Retina Eye Specialist\n" +
            "Dr. Ruchi Kabra - Caratact Surgeon & Ocular Oncosurgeon\n" +
            "Dr. Thakkar Yesha Dhirajlal - General Eye Specialist\n" +
            "Dr. Rupal Samir Shah - General Eye Surgeon\n" +
            "Dr. Prateep Vyas - Vitreoretina, Glaucoma and Cataract Surgeon\n" +
            "Dr. Shardini Vyas - Cornea & Anterior Segment Surgeon\n" +
            "Dr. Aashish Kumar Bansal - Cornea & Refractive Eye Surgeon\n" +
            "Dr. Santosh G Honavar - Eye Plastic Surgeon & Eye Oncosurgeon\n" +
            "Address\n" +
            "CORPORATE OFFICE: A-23, 1st Floor,\n" +
            "Green Park, Aurobindo Marg, New Delhi.\n" +
            "REGD. OFFICE: B - 5/24,\n" +
            "Safdarjung Enclave,\n" +
            "Opp. Deer Park, New Delhi.\n" +
            "________________________________________\n" +
            "Dr. Agarwal's Eye Hospitals\n" +
            "\n" +
            "Salient Features\n" +
            "Achieved Golden Apple, Kelman, Barraquer awards in the year 2013\n" +
            "Honored with 4 awards in ASCRS 2013\n" +
            "Centers at Chennai, Vellore and Madhya Pradesh are accredited under NABH standards\n" +
            "Nutritional optic neuropathy available for patients with neuro ophthalmology disorders\n" +
            "Oil based medical injections, laser interventions, freezing mechanisms etc. utilized to treat many retinal deformities\n" +
            "First to introduce 'Glued IOL' technique - a procedure that involves sticking a biological glue to intra-ocular lens for keeping it intact after surgery.\n" +
            "Esteemed panel of doctors\n" +
            "Dr. Sumanth Reddy - Eye Specialist (Neuro, Retina & Cataract)\n" +
            "Dr. J S Reddy - General Eye Specialist\n" +
            "Dr. Jaya Mahesh K - Cataract Surgeon\n" +
            "Dr. James Subrat Kumar Adams - Vitreo Retina Eye Surgeon\n" +
            "Dr. Rajesh B T J - Cornea & Refractive Eye Surgeon\n" +
            "Dr. Deepika John - General Eye Specialist\n" +
            "Dr. Shreepathi - Paediatric Eye Specialist\n" +
            "Dr. Amod Nayak - Cataract & Retina Surgeon\n" +
            "Dr. Aggarwal Pratik Prem - Retina Surgeon\n" +
            "Dr. Dr. Rudrappa A - Eye Physician\n" +
            "Dr. Soham Sarkar - General Eye Surgeon\n" +
            "Dr. Swati Bhattacharya - Retina & Glaucoma Surgeon\n" +
            "Dr. Harshai Shah - Phaco Surgeon\n" +
            "Dr. Sireesha - Retina Surgeon\n" +
            "Presence: Spread across 12 countries and different cities in India\n";
    String med7="Otolaryngology (ENT)\n" +
            "\n" +
            "Nanavati Super-specialty Hospital, Vile Parle\n" +
            "\n" +
            "Salient Features\n" +
            "The hospital was honored with the Healthcare Excellence Award by Indus foundation, Indian Medical Association, Government of Telangana and Federation of Indian Chambers of Commerce & Industry (FICCI) in 2014\n" +
            "A state-of-the-art Electrophysiology and Electroacoustic Centre of Audiology and Speech Therapy Audiology Centre were opened in 2008 for treating patients having speech disorders\n" +
            "The specialists treat patients suffering not only from infections of ear, nose and throat, but also patients suffering from head and neck cancer\n" +
            "The department has high-tech medical equipment for treating patients suffering from every disorder of ear, nose and throat\n" +
            "The hospital offers various packages for full body checkups to their patients\n" +
            "The hospital has tie-ups with many leading private and public sector undertakings\n" +
            "Esteemed Panel of Doctors\n" +
            "Dr. Agneesh Patial- ENT Surgeon\n" +
            "Dr. Jayant Gandhi- ENT Specialist\n" +
            "Dr. Prabodh Karnik- ENT Surgeon\n" +
            "Dr. Narayan Jayshankar- ENT Surgeon\n" +
            "Dr. Manohar Shaan- ENT & Skull base Surgeon\n" +
            "Dr. K.P Morwani- ENT Specialist\n" +
            "Dr. Uday Vora- ENT Specialist\n" +
            "Dr. R.K.Oza- Audiologist\n" +
            "Dr. Ramesh Shah- ENT Surgeon\n" +
            "Address\n" +
            "S.V. Road, Vile Parle (West),\n" +
            "Mumbai 400 056.\n" +
            "________________________________________\n" +
            "Global Hospital, Parel\n" +
            "\n" +
            "Salient Features\n" +
            "National Accreditation Board for Hospitals & Healthcare Providers (NABH) accreditation given to hospital\n" +
            "Treatments for curing deafness, hearing problems, speech disorders etc. imparted by experienced ENT surgeons\n" +
            "Hearing tests like Pure Tone Audiometry and Ear Ventilation Tubes are the 2 commonly conducted diagnostic procedures\n" +
            "State-of-the-art Intensive Care facilities for dealing with emergencies\n" +
            "12 advanced operation theaters for surgical purposes\n" +
            "Advanced diagnostic machinery like MRI and CT scan technologies\n" +
            "Esteemed panel of doctors\n" +
            "Dr Maqsood Ali:Consultant (ENT Surgery)\n" +
            "Dr Dipak L Desai: Consultant (ENT Surgery)\n" +
            "Dr Prarthana Jagtap: Consultant (ENT Surgery)\n" +
            "Dr Prabodh Karnik: Consultant (ENT Surgery)\n" +
            "Dr Milind Navalakhe: Consultant (ENT Surgery)\n" +
            "Address\n" +
            "35, Dr. E Borges Road,\n" +
            "Hospital Avenue,\n" +
            "Opp Shirodkar High School,\n" +
            "Parel, Mumbai – 400012\n" +
            "________________________________________\n" +
            "S.L. Raheja Hospital, Mahim West\n" +
            "\n" +
            "Salient Features\n" +
            "Hospital accredited by National Accreditation Board for Hospitals & Health Care Providers (NABH)\n" +
            "Experienced and well-known ENT surgeons are employed for treating otorhinolaryngological illnesses\n" +
            "Various complex conditions of ear, nose, throat, head and neck are treated at a high success rate\n" +
            "Surgeons are well-trained in reconstructive procedures like rhinoplasty, septoplasty, nasal tumor excision\n" +
            "Congenital conditions in children of the ENT variety are handled by surgeons well-versed in pediatric ENT\n" +
            "Cancers of nose, mouth, salivary glands and throat are treated\n" +
            "Esteemed panel of doctors\n" +
            "Dr. C.G. Bhave: Consultant ENT\n" +
            "Dr. Divya Prabhat: Consultant ENT\n" +
            "Dr. Juthika Sheode: Consultant ENT\n" +
            "Dr.Kamlakar Dandekar: Consultant ENT\n" +
            "Dr. Adip Shetty: Consultant ENT\n" +
            "Address\n" +
            "Police Colony,\n" +
            "Mahim, Mumbai 400016\n";
    String med8="Gastroenterology\n" +
            "\n" +
            "Asian Institute of Gastroenterology, Hyderabad\n" +
            "\n" +
            "Salient Features\n" +
            "Unique day care facility that avoids hospitalization\n" +
            "Largest ERCP procedures performed on a global basis\n" +
            "Advanced equipment and facilities\n" +
            "Dedicated staff and faculty\n" +
            "24X7 emergency, Medical ICU, Surgical ICU\n" +
            "Equipped operation theaters\n" +
            "Round the clock diagnostic facilities\n" +
            "Esteemed panel of Doctors\n" +
            "Dr. D. Nageshwar Reddy, Gastroenterologist\n" +
            "Dr. Manu Tandon, Gastroenterologist\n" +
            "Dr. Rajesh Gupta, Gastroenterologist\n" +
            "Dr. Jaya Agarwal, Gastroenterologist (Pediatric)\n" +
            "Dr. P. Manohar Reddy, Gastroenterologist\n" +
            "Dr. Rupa Banerjee, Gastroenterologist\n" +
            "Address\n" +
            "6-3-661, Somajiguda,\n" +
            "Hyderabad - 500 082. AP, India\n" +
            "\n" +
            "Apollo Hospital, Greams Road\n" +
            "\n" +
            "Salient Features\n" +
            "JCI accredited hospital\n" +
            "Well equipped 600 hospital beds\n" +
            "Special emergency care unit catering to all emergency cases\n" +
            "International Transplant Care Program utilizing cutting edge technology for pediatric liver transplant and hepatobiliary surgery methods\n" +
            "Total of 9 advancements updated in the cardiac department\n" +
            "Round the clock Blood Bank facilities\n" +
            "Special proficient staff on the Multi Organ Transplant Unit (MOTU) in the Gastroenterology department\n" +
            "Performed bloodless liver surgery using most advanced liver surgery techniques by the liver transplant care team\n" +
            "Esteemed panel of doctors\n" +
            "Dr. Bala Chandran T G - Gastro Surgeon\n" +
            "Dr. Hariharan Muthuswamy - Consultant Gastroenterologist\n" +
            "Dr. Mohan A T - Clinical Gastroenterologist\n" +
            "Dr. Prasanna Kumar Reddy - Surgeon (Laparoscopic Gastroenterology)\n" +
            "Dr. Revathy Shanmugam - Clinical Gastroenterologist\n" +
            "Dr. Elan Kumaran K - Surgeon (Organ/Liver Transplantation)\n" +
            "Dr. Surendran R - GI Surgeon\n" +
            "Dr. Usha Srinivas - Consultant Gastroenterologist\n" +
            "Dr. Sudeepta Kumar Swain - GI Surgeon\n" +
            "Dr. Seshadri Venkatesh P - Consultant Gastroenterology\n" +
            "Address\n" +
            "Apollo Hospitals\n" +
            "No. 21, Greams Lane, Off Greams Road,\n" +
            "Chennai, Tamil Nadu - 600006\n" +
            "________________________________________\n" +
            "BLK Super Speciality Hospital, Delhi\n" +
            "\n" +
            "Salient Features\n" +
            "Spread across 5 acres of campus space\n" +
            "650 well equipped hospitals beds\n" +
            "125 bedded technology equipped intensive care unit beds\n" +
            "24/7 provisions of hemodialysis, bronchoscopy, endoscopy, etc\n" +
            "Cutting-edge techniques for diagnostic, clinical and surgical gastroenterology\n" +
            "More than 600 sleeve gastrectomies and around 100 gastic bypass surgery performed by the bariatric surgery department\n" +
            "Esteemed panel of doctors\n" +
            "Dr. Deep Goel - Consultant Gastroenterologist (Bariatric & Adv. Laparoscopic)\n" +
            "Dr. Ravindra Vats - Consultant Gastroenterologist (Bariatric & Adv. Laparoscopic)\n" +
            "Dr. V P Bhalla - Senior Consultant (Digestive & Liver Disease)\n" +
            "Dr. Amit Kumar Singhal - Gastro Anesthesiologist\n" +
            "Dr. Sanjay Singh Negi - Surgeon (HPB, Liver Transplantation & GI Oncology)\n" +
            "Dr. Ankur Garg - Surgeon (HPB & Organ Transplant)\n" +
            "Address\n" +
            "BLK Super Speciality Hospital\n" +
            "Buliding No. 5, Pusa Road,\n" +
            "Rajinder Nagar, New Delhi - 110005\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital);
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
    }
}
