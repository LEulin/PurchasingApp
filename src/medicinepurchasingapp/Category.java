/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicinepurchasingapp;

import java.util.ArrayList;
import java.util.Iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;

/**
 *
 * @author 2ndyrGroupB
 */
public class Category {
    private ArrayList<Medicine> category;
    
    public void BodypainCategory(){
        category = new ArrayList();
        category.add(new Bodypain("Bodypain","AlaxanFR","Ibuprofen",10));
        category.add(new Bodypain("Bodypain","Aspirin Free Anacin","Acetaminophen",12));
        category.add(new Bodypain("Bodypain","Diclofenac","Cataflam",11));
        category.add(new Bodypain("Bodypain","Hydrocodone","Acetaminophen",15));
        category.add(new Bodypain("Bodypain","Celexa","Citalopram",13));
    }
    
    
    public void coughCategory(){
        category.add(new Cough("Cough","Vicks Dayquil Cough","Dextromethorphan",14));
        category.add(new Cough("Cough","Robitussin CoughGels Long-Acting","Dextromethorphan",51));
        category.add(new Cough("Cough","Delsym","Dextromethorphan",16));
        category.add(new Cough("Cough","Tessalon (Pro)"," Benzonatate",12));
        category.add(new Cough("Cough","Ambroxol","Mucosolvan",7));
    } 
    
    public void allergyCategory(){
        category.add(new Allergies("Allergies","Brompheniramine","Dimetane",5));
        category.add(new Allergies("Allergies","Cetirizine","Zyrtec",10));
        category.add(new Allergies("Allergies","Fexofenadine","Allegra",6));
        category.add(new Allergies("Allergies","Antazoline","Vasocon A",8));
        category.add(new Allergies("Allergies","Oxymetazoline","Afrin",5));
    }
    
    public void headacheCategory(){
        category.add(new Headache("Headache","Biogesic","Paracetamol",6));
        category.add(new Headache("Headache","Medicol","Ibuprofen",9));
        category.add(new Headache("Headache","Migranal","Dihydroergotamine",12));
        category.add(new Headache("Headache","Zomig","Zolmitriptan",10));
        category.add(new Headache("Headache","Maxalt","Rizatriptan",12));
    }
    
    public void displaCategory(){
        Iterator<Medicine> iterator = category.iterator();
        while (iterator.hasNext()) 
            System.out.print(iterator.next()); 
    }
}
