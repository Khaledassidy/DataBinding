package com.example.databinding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.databinding.databinding.ActivityMainBinding;
/*
ne7na shofna l viewbinding eno heye waferet 3a 7ale she8l w batalt 2a3mel inflate heye bt7wele l file l xml la object w bta3mele elo inflate w ba3den bt7ot l setcontentview() w ba3teha l rooot taba3 layout le bade shofo ok

hala2 ne7na badna neshra7 l DataBinding:
databinding feha eshya moshtarake ma3 l viewbinding haw awal sha8le
sho howe she l moshtarak?
she l moshtarak baynetoun hone tnaynetoun bewafrole l inflate la kel l file l xml w ma3ad est5dem l findviewbyid

bas l DataBinding 3ando ba3d mayezet zyede:
l databinding heye bta3mele inflate lal file l xml w bt5lene batel est3mel findviewbyid()
bel 2edafe betwaferle exeprtion b2lab l xml hay l expersion metl l varibale 3ade
varibale:howe elo name esm w tybe ta3elo bekon mawjoud b tag esmo <data>
enta bt3te esm l varibale w bt3te tybe w ba3den heed l variable bt3te lal textview heda sho bese3dna bes3dna eno masln enta 3atet heda l variable la textview fa sar elo
btseer bas badak t8yer textview t3del 3lee btbtel ta3mel textview.settext()
la2 btseer bas bt8ayer bheda l data w l7ala bta3mel metl live data w bt8ayer l content bel textview
bel 2edafe eno heda momken ykoun l variable object fa enta heda l object masln elo id,name,age fa enta ta3te la kel textview wa7de mn haw w tseer bas bdak t8ayro badel ma ta3mel 4 textview settext
btseer ta3mel object mn no3 le 3atyto w ba3den ta3mel setdata la heda l variable fa kel l textview keloun byet8ayaro
hay ferto bel 2edafe eno feek ta3mel method m3yane b2lab heda l variable w ta3teha la view m3yane msln kelo 7a nshofo

bas 2awl she badna nshof keef badna nbslesh nest5dmo:
- 2awls he bade deef code m3yan b2alb l gradle file la fa3el l databinding b2lab l android tag sho howe l code:
 dataBinding{
        enable=true;
    }

-tene sha8le b 7alet databinding l xml file elo shrout m3ayne:
lezm l root tag ykoun <layout> <layout/>
tene 5etwe b7ot tag b2alb l layout heda esmo <data> <data/> heda data tag b2lbo kteer attribute metl malsn <varible> le mn7ot fe esm variable w type
kamen iza kona 3am na3mel recycleview mn5le l xml costume layout kamen nafs she 2awl tag kamen layout w b2labo tag data

-ba3den bel main activity la 2a3mel setup lal databinding:
keef kona na3mel variable b nafs esm l xml file kamen nafs she
bas la ybyen esm l xml lezm 2awl she zabet l xml file 5ale root howe layout w 7et tag data

ba3den ba3mel vaieble mn     ActivityMainBinding binding;
ba3den lezm 2a3mel intilize keef:
 binding= DataBindingUtil.setContentView(this,R.layout.activity_main);:heda satr bta3mel inflate la kel l xml file be ma feha kel l views le b2laba la hay layout w bta3meloun inflate keloun w bt3roud heda layout kelo 3ala hay l activity bel 2edafe hyde bta3mel object java mn layout w bt5zno b variable b nafs esm l xml file
 w hala2 iza badak tosal la aye she de5el l xml bt7ot bindeing dot btosal la kel l views w l attribute de5el l xml file


-
hala2 n rou7 3ala layout la net3araf 3ala sha8lten:
layout Variables:
fe 3ana tag b2lab l tag data esmo <variable>:
heda l variable heda 3mlto databinding heda k2no varibale 3ade (int x) malsaln
heda l variable elo 2 attribute:
name:name bt7aded sho esmo lal variable msln (name)
type:houn bt7aded naw3o lal variable String,int,...etc momken ykoun object enta 3emlo 7ot mabda2eyan String
 <data>
        <variable
            name="Name"
            type="String" />
    </data>
layout exeprissions:
hala2 heda l variable le 7atyto enta lezm ta3te la view msln bel textview t7otelo text=w ta3te heda l variable w tseer kel mara bas yte8ayr heda l varaible byt8ayar l textview
la ta3mel hay l 7arke btest3mel layout exeprsion keef:
bt7ot @ w 2 praces 3aks ba3d {} w b2lab heda l braces bt3te name so heda l view regester 3ala hayda l variable ya3ne kel ma yet8ayar emet l variable btet8ayr emet l textview
 android:text="@{Name}"
 @{Name}:hay esma layout exeprission

 hala2 iza ro7na 3ala l main activity
 fe 2 attribute 7a yetla3o jdded sho houne:
 -SetName()le heye hayde bta3te eme lal variable le 3mlto le esmo name
 -getName() hayde btjebkak l value taba3 l variable le 3mlto le esmo Name
ya3ne enta bas 3mlt heda l variable la7lo 3emelo setter w getter b2labo
binding.setName("khaled");:bhay tare2a 8ayrt name 2am t8ayuaret la7ala l text b2lab l textview bedoun ma 2a3mel textview.settext()


hala2 la7 na3mel exmple tene nest3mel fe badel l variable l 3ade nest3mel object ne7na na3mlo w na3te la heda l variable b2lab l layout
w 2a3ml kaza textview w 2a3mel assigment using layout exeprission la kel textview mn 5elel heda l object ya3ne msln heda l object heda 3ando name,id,age,year w kel wa7de mn textview ba3eha wa7de mn haw ya3ne 2awl textview 2a3teha id,tene name,telet l age...etc
w metl ma 2olna eno fene 2a3ml function btnafez she m3yan b2lab heda l object le bade 2a3mlo w 2a3te la button w 5ale tnazfez she le b2lbo kel ma 8ayrt bas le b2lb hayde l function la7ala la tnafez le b2albo'

fa 5akena hala2 na3mel class nsame Student elo id,name,enable boolean,getter,setter ,constructor
bel edafe bade 2a3ml function esma print() btetba3 Lod.d("Stundet","hello"+name);
ba3d heek b2lab l xml b2alb l data ba3mel new variable:
name:"Student"
type"com.exmple.DataBinding.Studnet" l class le ana 3mlto ma7al ma howe mawjoud

hala2 3ande 2 textview wa7de id,name
l id:@{String.valueOf(Student.id)}
l name:@{Student.name}
l button:sta3mlt 2awl attribute la l button is enable:android:enabled="@{Student.enable}"
w l function le 3mlta la 2a3mela assign la l button bel onclick bade est3mel lamda exeprission:
android:onClick="@{()->Student.print()}"


hala2 bel main activitvity
bade 2a3mel obejct mn l student 3abe l aheda l object
w bel binding 3ande fe method lal variable le 3mlto esmo Student
ba3mel binding.setStudent() ba3te object lmethod la hyde l function
Student student=new Student("khaled",1,true);
 binding.setStudent(student);
 bhay tare2a ana 3mlt object w 3ayta lal variable fa kel l textview metl l id 7a yet8ayr l nme 7a yte8ayr ta3el l textview w l button enable true


heda kol l databinding

hala2 iza 3am est3mel l recyele view nafs she ba3mel variable lal costume layout w ba3etah lal xml w bseer bel onbind bas b8ayer l varaible b2lab heda l object ma ba3mel settext lale 3ande






















 */











public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);




//        binding.setName("khaled");

          Student student=new Student("khaled",1,true);
          binding.setStudent(student);
    }
}