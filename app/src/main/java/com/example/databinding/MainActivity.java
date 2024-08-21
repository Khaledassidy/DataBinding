package com.example.databinding;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

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



hala2 heda le 7kene molo 3ebra 3an 1 way data binding sho asde bel one way databinding eno ana hounnle 3am yseer kel ma 8ayer data mn l activity 3am tet8ayr l view le howe textview heda data esmo data
ya3ne change of data->change in view

bas haka2 badna net3lam 2end way data binding eno bel 3aks hala2 kel ma yet8ayr l view resource bada tet8ayar data ya3ne t5ayal 3ana edit text mn7ot feha ma3lomet ne7na hala2 badna kel ma tet8ayr hay l edit text badna bnaf l wa2t tet8ayr data le heye data w hay data ana 7ateta nafsa lal textview fa 7atet8ayr textview
ya3ne t5ayal 3ana edit text 7tena feha eno heye teb3a la student.name  w 3ana textview teb3a la student.name bnafs l wa2t fa ne7na hala2 badna kel ma tet8ayr l edit text bade tet8ayr l student name w ta8yer hay l student name 7a tet8ayr l textview le heye teb3a la student name
ya3ne bi direction ta8yer l view-->3am tet8ayar l  data le heye data le 3ande

fa en7an badna na3mel 2 direction:
bas tet8ayar l data tet8ayr l view(edit text) w bas tet8ayr l view(edittext) tet8ayr l  data
ya3ne metl yseer synctonization been l view w data

fa hala2 7a zeed edit text w 2a3teha text:@{student.name} bhay l 7ale aye ta3del 3ala l student name 7a yet8ayr text bel edit text
la ente2l l 2 data bining le le b7aje 8ayer sha8le bel @{student.name} la 5aleha bi directional b3mela @={student.name}
@={student.name}:houn ya3ne lama eje 7ades tetx b2lab l edit text l user y8ayro la yed7ads l name w lama eje 8ayer name la et8ayr l edit text

halala2 howe bhay tare2a bas 3am n8ayer l edit text 3am yet8ayr data bas mesh 3am tbyen 3al textview ya3ne ne7na kel mara 3am nrou7 n8ayer l edit text 3am rou7 ekbous l button 3am yetb3le 3al log cat l esm le 3am 8ayro bas mesh 3am yet8ayar 3aledit text ya3ne ana l edit text w l textview tnaynetoun e5den name kel ma 8ayer l edit text lezm yet8ayr l textview kamen bas mesh 3am yezbat howe 3am tet8ayr bas lezm kel mara bas yet8ayr lezm na3mel notify la data le 3ande ya3ne la 7el hay l meshle lezm nefham sho sar:
ne7na bas 3am n8ayer l edit text w 7aten text=@={Studne.name} bhay l 7ale bas 3am n8ayer text l b2laba l edit text 3am yen3amal call la method le esma setname le b2alb class l stiudent w 3am yet8ayar l data bas l meshkle le 3ana eno ma 3am ne3ml update lal view fa lezem kel mara bas n8ayer l edittext na3mel update lal view le e5de heda l name
keef:
bade est3mel interface b2lab l class l Student esmo observable heda l class bese3den la ya3mel refresh lal view keef howe l view le 2e5den name 3am ye5do b method le mawjoude bel class l student le esmo getname fa lezm ne7na 2awl ma n8ayer l edit text na3mel notify cahnge eno 2a3ml notification la be2e l view eno ntebho l data change fa 7anyrou7 yestd3e l getname w y8ayer l text
feek heek bado yseer 2awl she bade 2a3ml extend la class l student mn l interface le esmo BaseObservable lesh l2no mn 5elel heda l class b5elene osal la function esma :
 notifyPropertyChanged():hyde bta3mek listner bte5od integer le howe sho l property le n3mlna change ya3ne sho l property le n3ama change le heye name
 bas heda l notifyProperychange be2olak ana be5od l get() function ta3el hay l property le n3amal change lesh l2no ne7na bel xml bas 3am n7ot Student.name 3am yestd3e l getname mesh 3am ye5od name de8re
 ne7na 3ana class esmo Databinding le howe byen3amlo generate w mnermzlo b BR
 BR:heda l class l BR b2labo kel l variable le 3mlta ana bel xml bya3teha id l id bekoun nafs l name l variable la kel variable menon tyeb ne7na bas 3am n7ot @{Student.name} 3am te5od l getname() metl ma 2olna w 2alak howe bel changeproperty ana be5od l get function ta3el l property l change 3ala shakl id tyeb keef bade 2a3te l get function id la 2a3tah id best3mel notation esma @Bindlable hay iza 7atyta fo2 l getname bta3mel id la hayde le property l change
  notifyPropertyChanged() eno ntebh fe property change sho hay l property heye name tyeb keef 3am yjeeb name mn 5elel l getname w howe function change property bet5od l get() function ta3et l property change 3a shakl id 3ashen 2olo lal changeproperty eno ntebh hay l property change fa bade 3ashn l property  tbyen bel BR class bade 7ot id la hayde l property change fa bas 2a3mel notation fo2 l getname() b7ot fo2 l getname notation esma @Bindable
  fa sa3eta bas 2a3mel BR dot 7a tbayen name l2no n7atala id la hay l roperty fa bel set name b2olo ntebh hay l property le esma name bada tet8ayr kel mara w ana bade e5od l get function ta3et hay l property fa ba3mela @bindlable fow2a 3ashn ybyen l id taba3a w ba3teha lal change property
 notifyPropertyChanged(BR.name);:hyade bteb3at notification lal databinding eno fe 3ande data t8ayaret 2aw filed t8ayar sho howe l filed l t8yar howe le ma7toto fo2 l get function ta3olo notation @bindable
 tyeb howe keef bsame l id le b2alb l BR:7asab esm function ta3et l get ya3ne 3ande masln esma GetName() fa howe bye5od l esm le ba3d l get w be7wela l small fa iza 7atet BR dot 7a tbyen name heda l filed le t8ayar
 fa bedour l notifyPropertyChanged(BR.name); bero7 iza t8ayr heda l filed l name berou7 b5le kel l views le e5de heda l name yet3adal
howe class BR generated la7alo ma3 databinding w class generated mamno3 yet3dal 3lyhoun ya3ne iza shofna fe 3ana she ssmo java (Generated) b2labo iza fat7na 7a nshof kel l files ta3wlet l databinding w 7a nshof class esmo BR b2labo l id ta3wlet l variable w l id ta3el l kel l eshya le 7aytna fo2 l getteer notation @bindable


hala2 bhay tare2a 3mlna l bi derectional Data binding


ba3d bade 2a3mel example 3ala l click listner eno ana bade etba3 toast
3ala button m3yan bas ekbes fa brou7ba3mel class esmo listner msln b7ot b2lbo context w ba3mel costructor w b2labo function esma onclicklistner bte5od view  w btetba3 toast
w ba3den brou7 3ala l xml b3ref variable mno3 heda l calss w b2lab l button l attribute le esma onclick ba3te l method le 3mlta
berja3 bel main activity iza 3mlt bidning dot 7a tnyen method esma set listner w get lisner fa ana ba3mel object mn heda listner ba3te l cotect taba3 hyde l activity w ba3teha lal setlistner



















 */











public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        Listner listner=new Listner(this);
        binding.setListner(listner);

//        binding.setName("khaled");

          Student student=new Student("khaled",1,true);
          binding.setStudent(student);
    }


}