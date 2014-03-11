package com.example.misa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class SecondActivity extends Activity
{
	private TextView text_content;
	private String content;
	private SpannableStringBuilder style;
	private SeekBar seek_bar;
	private int off = 1;
	private int level = 0;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		// 创建内容数组
       String[] contentArray = new String[]{
    		  "We can read of things that happened 5,000 years ago in the Near East, where people first learned to write. But there are some parts of the word where even now people cannot write. The only way that they can preserve their history is to recount it as sagas -- legends handed down from one generation of another. These legends are useful because they can tell us something about migrations of people who lived long ago, but none could write down what they did. Anthropologists wondered where the remote ancestors of the Polynesian peoples now living in the Pacific Islands came from. The sagas of these people explain that some of them came from Indonesia about 2,000 years ago.\n"
    		   + " But the first people who were like ourselves lived so long ago that even their sagas, if they had any, are forgotten. So archaeologists have neither history nor legends to help them to find out where the first 'modern men' came from.\n"
    		   + " Fortunately, however, ancient men made tools of stone, especially flint, because this is easier to shape than other kinds. They may also have used wood and skins, but these have rotted away. Stone does not decay, and so the tools of long ago have remained when even the bones of the men who made them have disappeared without trace."
				," Why, you may wonder, should spiders be our friends? Because they destroy so many insects, and insects include some of the greatest enemies of the human race. Insects would make it impossible for us to live in the world; they would devour all our crops and kill our flocks and herds, if it were not for the protection we get from insect-eating animals. We owe a lot to the birds and beasts who eat insects but all of them put together kill only a fraction of the number destroyed by spiders. Moreover, unlike some of the other insect eaters, spiders never do the harm to us or our belongings.\n"
				+ " Spiders are not insects, as many people think, nor even nearly related to them. One can tell the difference almost at a glance, for a spider always has eight legs and insect never more than six.\n"
				+ " How many spiders are engaged in this work no our behalf? One authority on spiders made a census of the spiders in grass field in the south of England, and he estimated that there were more than 2,250,000 in one acre; that is something like 6,000,000 spiders of different kinds on a football pitch. Spiders are busy for at least half the year in killing insects. It is impossible to make more than the wildest guess at how many they kill, but they are hungry creatures, not content with only three meals a day. It has been estimated that the weight of all the insects destroyed by spiders in Britain in one year would be greater than the total weight of all the human beings in the country."
        		," Modern alpinists try to climb mountains by a route which will give them good sport, and the more difficult it is, the more highly it is regarded. In the pioneering days, however, this was not the case at all. The early climbers were looking for the easiest way to the top, because the summit was the prize they sought, especially if it and never been attained before. It is true that during their explorations they often faced difficulties and dangers of the most perilous nature, equipped in a manner with would make a modern climber shudder at the thought, but they did not go out of their way to court such excitement. They had a single aim, a solitary goal -- the top!\n"
        		+ " It is hard for us to realize nowadays how difficult it was for the pioneers. Except for one or two places such as Zermatt and Chamonix, which had rapidly become popular, Alpine village tended to be impoverished settlements cut off from civilization by the high mountains. Such inns as there were generally dirty and flea-ridden; the food simply local cheese accompanied by bread often twelve months old, all washed down with coarse wine. Often a valley boasted no inn at all, and climbers found shelter wherever they could -- sometimes with the local priest (who was usually as poor as his parishioners), sometimes with shepherds or cheese-makers. Invariably the background was the same: dirt and poverty, and very uncomfortable. For men accustomed to eating seven-course dinners and sleeping between fine linen sheets at home, the change to the Alps must have very hard indeed."
        		," Several cases have been reported in Russia recently of people who can detect colours with their fingers, and even see through solid and walls. One case concerns and eleven-year-old schoolgirl, Vera Petrova, who has normal vision but who can also perceive things with different parts of her skin, and through solid walls. This ability was first noticed by her father. One day she came into his office and happened to put her hands on the door of a locked safe. Suddenly she asked her father why he kept so many old newspapers locked away there, and even described the way they were done up in bundles.\n"
        		+ "    Vera's curious talent was brought to the notice of a scientific research institute in the town of Ulyanovsk, near where she lives, and in April she was given a series of tests by a special commission of the Ministry of Health of the Russian Federal Republic. During these tests she was able to read a newspaper through an opaque screen and, stranger still, by moving her elbow over a child's game of Lotto she was able to describe the figures and colours printed on it; and, in another instance, wearing stockings and slippers, to make out with her foot the outlines and colours of a picture hidden under a carpet. Other experiments showed that her knees and shoulders had a similar sensitivity. During all these tests Vera was blindfold; and, indeed, except when blindfold she lacked the ability to perceive things with her skin. It was also found that although she could perceive things with her fingers this ability ceased the moment her hands were wet."
        		,"People are always talking about 'the problem of youth'. If there is one -- which I take leave to doubt -- then it is older people who create it, not the young themselves. Let us get down to fundamentals and agree that the young are after all human beings -- people just like their elders. There is only one difference between an old man and a young one: the young man has a glorious future before him and the old one has a splendid future behind him: and maybe that is where the rub is.\n"
        		+"     When I was a teenager, I felt that I was just young and uncertain -- that I was a new boy in a huge school, and I would have been very pleased to be regarded as something so interesting as a problem. For one thing, being a problem gives you a certain identity, and that is one of the things the young are busily engaged in seeking.\n"
        		+"	I find young people exciting. They have an air of freedom, and they not a dreary commitment to mean ambitions or love of comfort. They are not anxious social climbers, and they have no devotion to material things. All this seems to me to link them with life, and the origins of things. It's as if they were, in some sense, cosmic beings in violent and lovely contrast with us suburban creatures. All that is in my mind when I meet a young person. He may be conceited, ill-mannered, presumptuous or fatuous, but I do not turn for protection to dreary cliches about respect of elders -- as if mere age were a reason for respect. I accept that we are equals, and I will argue with him, as an equal, if I think he is wrong."
        		,"I am always amazed when I hear people saying that sport creates goodwill between the nations, and that if only the common peoples of the would could meet one another at football or cricket, they would have no inclination to meet on the hattlefield. Even if one didn't know from concrete examples (the 1936 Olympic Games, for instance) that international sporting contests lead to orgies of hatred, one could deduce if from general principles.\n"
        		+"   Nearly all the sports practised nowadays are competitive. You play to win, and the game has little meaning unless you do your utmost to win. On the village green, where you pick up sides and no feeling of local patriotism is involved, it is possible to play simply for the fun and exercise: but as soon as a the question of prestige arises, as soon as you feel that you and some larger unit will be disgraced if you lose, the most savage combative instincts are aroused. Anyone who has played even in a school football match knows this. At the international level, sport is frankly mimic warfare. But the significant thing is not the behaviour of the players but the attitude of the spectators: and, behind the spectators, of the nations who work themselves into furies over these absurd contests, and seriously believe -- at any rate for short periods -- that running, jumping and kicking a ball are tests of national virtue."
        		,"Not all sounds made by animals serve as language, and we have only to turn to that extraordinary discovery of echo-location in bats to see a case in which the voice plays a strictly utilitarian role.\n"
        		+"   To get a full appreciation of what this means we must turn first to some recent human inventions. Everyone knows that if he shouts in the vicinity of a wall or a mountainside, an echo will come back. The further off this solid obstruction, the longer time will elapse for the return of the echo. A sound made by tapping on the hull of a ship will be reflected from the sea bottom, and by measuring the time interval between the taps and the receipt of the echoes, the depth of the sea at that point can be calculated. So was born the echo-sounding apparatus, now in general use in ships. Every solid object will reflect a sound, varying according to the size and nature of the object. A shoal of fish will do this. So it is a comparatively simple step from locating the sea bottom to locating a shoal of fish. With experience, and with improved apparatus, it is now possible not only to locate a shoal but to tell if it is herring, cod, or other well-known fish, by the pattern of its echo.\n"
        		+"    It has been found that certain bats emit squeaks and by receiving the echoes, they can locate and steer clear of obstacles -- or locate flying insects on which they feed. This echo-location in bats is often compared with radar, the principle of which is similar."
        		,"Chickens slaughtered in the United States, claim officials in Brussels, are not fit to grace European tables. No, say the American: our fowl are fine, we simply clean them in a different way. These days, it is differences in national regulations, far more than tariffs, that put sand in the wheels of trade between rich countries. It is not just farmers who are complaining. An electric razor that meets the European Union's safety standards must be approved by American testers before it can be sold in the United States, and an American-made dialysis machine needs the EU's okay before is hits the market in Europe.\n"
        		+"    As it happens, a razor that is safe in Europe is unlikely to electrocute Americans. So, ask businesses on both sides of the Atlantic, why have two lots of tests where one would do? Politicians agree, in principle, so America and the EU have been trying to reach a deal which would eliminate the need to double-test many products. They hope to finish in time for a trade summit between America and the EU on May 28TH. Although negotiators are optimistic, the details are complex enough that they may be hard-pressed to get a deal at all.\n"
        		+"    Why? One difficulty is to construct the agreements. The Americans would happily reach one accord on standards for medical devices and them hammer out different pacts covering, say, electronic goods and drug manufacturing. The EU -- following fine continental traditions -- wants agreement on general principles, which could be applied to many types of products and perhaps extended to other countries."
        		,"   Alfred the Great acted his own spy, visiting Danish camps disguised as a minstrel. In those days wandering minstrels were welcome everywhere. They were not fighting men, and their harp was their passport. Alfred had learned many of their ballads in his youth, and could vary his programme with acrobatic tricks and simple conjuring.\n"
   +" While Alfred's little army slowly began to gather at Athelney, the king himself set out to penetrate the camp of Guthrum, the commander of the Danish invaders. There had settled down for the winter at Chippenham: thither Alfred went. He noticed at once that discipline was slack: the Danes had the self-confidence of conquerors, and their security precautions were casual. They lived well, on the proceeds of raids on neighbouring regions. There they collected women as well as food and drink, and a life of ease had made them soft.\n"
        				+"    Alfred stayed in the camp a week before he returned to Athelney. The force there assembled was trivial compared with the Danish horde. But Alfred had deduced that the Danes were no longer fit for prolonged battle: and that their commissariat had no organization, but depended on irregular raids.\n"
   +"    So, faced with the Danish advance, Alfred did not risk open battle but harried the enemy. He was constantly on the move, drawing the Danes after him. His patrols halted the raiding parties: hunger assailed the Danish army. Now Alfred began a long series of skirmishes -- and within a month the Danes had surrendered. The episode could reasonably serve as a unique epic of royal espionage!"
        		,"    Technology trends may push Silicon Valley back to the future. Carver Mead, a pioneer in integrated circuits and a professor of computer science at the California Institute of Technology, notes there are now work-stations that enable engineers to design, test and produce chips right on their desks, much the way an editor creates a newsletter on a Macintosh. As the time and cost of making a chip drop to a few days and a few hundred dollars, engineers may soon be free to let their imaginations soar without being penalized by expensive failures. Mead predicts that inventors will be able to perfect powerful customized chips over a weekend at the office -- spawning a new generation of garage start-ups and giving the U.S. a jump on its foreign rivals in getting new products to market fast. 'We're got more garages with smart people,' Mead observes. 'We really thrive on anarchy.'\n"
        		+"    And on Asians. Already, orientals and Asian Americans constitute the majority of the engineering staffs at many Valley firms. And Chinese, Korean, Filipino and Indian engineers are graduating in droves from California's colleges. As the heads of next-generation start-ups, these Asian innovators can draw on customs and languages to forge righter links with crucial Pacific Rim markets. For instance, Alex Au, a Stanford Ph. D. from Hong Kong, has set up a Taiwan factory to challenge Japan's near lock on the memory-chip market. India-born N.Damodar Reddy's tiny California company reopened an AT & T chip plant in Kansas City last spring with financing from the state of Missouri. Before it becomes a retirement village, Silicon Valley may prove a classroom for building a global business."
        		,"    Some old people are oppressed by the fear of death. In the young there is a justification for this feeling. Young men who have reason to fear that they will be killed in battle may justifiably feel bitter in the thought that they have cheated of the best things that life has to offer. But in an old man who has known human joys and sorrows, and has achieved whatever work it was in him to do, the fear of death is somewhat abject and ignoble. The best way to overcome it -- so at least it seems to me -- is to make your interests gradually wider and more impersonal, until bit by bit the walls of the ego recede, and your life becomes increasingly merged in the universal life. An individual human existence should be like a river -- small at first, narrowly contained within its banks, and rushing passionately past boulders and over waterfalls. Gradually the river grows wider, the banks recede, the waters flow more quietly, and in the end, without any visible break, they become merged in the sea, and painlessly lose their individual being. The man who, in old age, can see his life in this way, will not suffer from the fear of death, since the things he cares for will continue. And if, with the decay of vitality, weariness increases, the thought of rest will be not unwelcome. I should wish to die while still at work, knowing that others will carry on what I can no longer do, and content in the thought that what was possible has been done."
        		," When anyone opens a current account at a bank, he is lending the bank money, repayment of which he may demand at any time, either in cash or by drawing a cheque in favour of another person. Primarily, the banker-customer relationship is that of debtor and creditor -- who is which depending on whether the customer's account is in credit or is overdrawn. But, in addition to that basically simple concept, the bank and its customer owe a large number of obligations to one another. Many of these obligations can give in to problems and complications but a bank customer, unlike, say, a buyer of goods, cannot complain that the law is loaded against him.\n"
        		+"    The bank must obey its customer's instructions, and not those of anyone else. When, for example, a customer first opens an account, he instructs the bank to debit his account only in respect of cheques draw by himself. He gives the bank specimens of his signature, and there is a very firm rule that the bank has no right or authority to pay out a customer's money on a cheques on which its customer's signature has been forged. It makes no difference that the forgery may have been a very skilful one: the bank must recognize its customer's signature. For this reason there is no risk to the customer in the practice, adopted by banks, of printing the customer's name on his cheques. If this facilitates forgery, it is the bank which will lose, not the customer."
        		,"    The deepest holes of all made for oil, and they go down to as much as 25,0000 feet. But we not need to send men down to get the oil our, as we must with other mineral deposits. The holes are only borings, less than a foot in diameter. My particular experience is largely in oil, and the search for oil has done more to improve deep drilling than any other mining activity. When is has been decided where we are going to drill, we put up at the surface an oil derrick. It has to be tall because it is like a giant block and tackle, and we have to lower into the ground and haul out of the ground great lengths of drill pipe which are rotated by an engine at the top and are fitted with a cutting bit at the bottom.\n"
        		+"    The geologist needs to know what rocks the drill has reached, so every so often a sample is obtained with a coring bit. It cuts a clean cylinder of rock, from which can be seen the strata the drill has been cutting through. Once we get down to the oil, it usually flows to the surface because great pressure, either from or water, is pushing it. This pressure must be under control, and we control it by means of the mud which we circulate down the drill pipe. We endeavour to avoid the old, romantic idea of a gusher, which wastes oil and gas. We want it to stay down the hole until we can lead it off in a controlled manner."
        		,"    Beyond two or three days, the world's best weather forecasts are speculative, and beyond six or seven they are worthless.\n"
        		+" The Butterfly Effect is the reason. For small pieces of weather -- and to a global forecaster, small can mean thunderstorms and blizzards -- any prediction deteriorates rapidly. Errors and uncertainties multiply, cascading upward through a chain of turbulent features, from dust devils and squalls up to continent-size eddies that only satellites can see.\n"
        		+"    The modern weather models work with a grid of points of the order of sixty miles apart, and even so, some starting data has to guessed, since ground stations and satellites cannot see everywhere. But suppose the earth could be covered with sensors spaced one foot apart, rising at one-foot intervals all the way to the top of the atmosphere. Suppose every sensor gives perfectly accurate readings of temperature, pressure, humidity, and any other quantity a meteorologist would want. Precisely at noon an infinitely powerful computer takes all the data and calculates what will happen at each point at 12.01, then 1202, then 12.03...\n"
        		+"    The computer will still be unable to predict whether Princeton, New Jersey, will have sun or rain on a day one month away. At noon the spaces between the sensors will hide fluctuations that the computer will not know about, tiny deviations from the average. By 12.01, those fluctuations will already have created small errors one foot away. Soon the errors will have multiplied to the ten-foot scale, and so on up to the size of the globe."
       };
		text_content = (TextView)this.findViewById(R.id.content);
		Intent intent = getIntent(); 
	    String value = intent.getStringExtra("val");
	    String txt = intent.getStringExtra("txt");
	    // 设置标题
		setTitle(txt);

		/* SpinnerAdapter adapter = ArrayAdapter.createFromResource(this, R.array.level, android.R.layout.simple_spinner_dropdown_item);
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		actionBar.setListNavigationCallbacks(adapter, new DropDownListenser());*/
		
		// 取得正文内容
	    int i = Integer.parseInt(value, 10);
	    content = contentArray[i];
	    
	    changeLevel(level);
	    
		// 设置SeekBar
		seek_bar = (SeekBar)findViewById(R.id.seekBar);
        seek_bar.setProgress(6);
        seek_bar.setOnSeekBarChangeListener(sbLis);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		menu.add(0,1,1, "高亮单词");
		menu.add(0,2,2, "取消高亮");
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		if(item.getItemId() == 1)
		{
			off = 0;
			seek_bar = (SeekBar)findViewById(R.id.seekBar);
			seek_bar.setVisibility(View.VISIBLE);
			changeLevel(level);
			return true;
		}
		if(item.getItemId() == 2)
		{
			off = 1;
			seek_bar = (SeekBar)findViewById(R.id.seekBar);
			seek_bar.setVisibility(View.GONE);
			changeLevel(level);
			return true;
		}
		return false;
	}
    private OnSeekBarChangeListener sbLis = new OnSeekBarChangeListener(){
   	 
		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			//进度改变时触发
			//seek_tip.setText(String.valueOf(seek_bar.getProgress()));
 
		}
 
		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// 开始拖动时触发，与onProgressChanged区别在于onStartTrackingTouch在停止拖动前只触发一次
			//而onProgressChanged只要在拖动，就会重复触发
		}
 
		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			//结束拖动时触发
			if( Integer.valueOf(seek_bar.getProgress()) == 0 ) {
				changeLevel(0);
				return;
			}
			if( Integer.valueOf(seek_bar.getProgress()) <= 20 ) {
				seek_bar.setProgress(20);
				changeLevel(1);
				return;
			}
			if( Integer.valueOf(seek_bar.getProgress()) <= 40 ) {
				seek_bar.setProgress(40);
				changeLevel(2);
				return;
			}
			if( Integer.valueOf(seek_bar.getProgress()) <= 60 ) {
				seek_bar.setProgress(60);
				changeLevel(3);
				return;
			}
			if( Integer.valueOf(seek_bar.getProgress()) <= 80 ) {
				seek_bar.setProgress(80);
				changeLevel(4);
				return;
			}
			if( Integer.valueOf(seek_bar.getProgress()) <= 100 ) {
				seek_bar.setProgress(100);
				changeLevel(5);
				return;
			}
		}
 
    };
    
	// 分级
	public void changeLevel(int level)
	{	  
		if(off == 1) {
			text_content.setText(content);
			return;
		}
		String[][] keywords = {
			   //level 0
			   {"St.Petersburg","Las","sauerkraut","package","satiation","vivify","sedulously","convulsive","megacycle","radio astronomer","radio frequency","bluebottle","legibly","penholder","seismometer","ninepin","ticklish","mahout","inmost","winkle","interminably","methylated","bactericidal","carbonated","correspondingly","disunited","unreasoning","disloyalty","purchasable","Leaning","Ptolemy","Aristotelian","Inquisition","bulrush","ladybird","colour-blind","hover-train","Norfolk","indisposition","curative","fervently","forefathers","Baltic","inrush","steepen","zoomorphic","bogged","sabre-toothed","paleontological","crevasse","vole","unutterable","intimation","indefinable","undeclared","disinherit","encroaching","absurdly","vanished","framed","viperine","haemolytic","neurotoxic","mamba","strychnine","scaly","electroencephalograph","secrecy","New","squall","dust","coring","geologist","cutting","block","justifiably","Kansas","AT%26T","memory-chip","Macintosh","commissary","thither","Chippenham","Athelney","wandering","electrocute","dialysis","mimic","social","lotto","the Alps","flea-ridden","alpinist","Matterhorn","fossil","afresh","cobra","checker","parishioner","painlessly","Missouri","partridge","acrobatic","Siberian","frantically","sociologist","grimly","chambermaid","kashmir","drifting","passionately","abatement","princeton","uniquely","albatross","ethanol","Stockholm","cherub","Polynesian","Indonesia","Morocco","derrick","twofold","Aristotle","tipster","recuperation","longitudinal","Apollo","indifferently","run-down","galleon","fritter","contrivance","caprice","blandishment","anthropologist","weariness","rattlesnake","potentiality","phenomena","pestilence","overwhelmingly","migration","hovercraft","effectiveness","contamination","vertebrate","vernacular","topography","termite","tadpole","tableland","sustenance","superstructure","strata","spiteful","speculation","proceeds","prevailing","porcupine","physiological","nebula","mythology","meteorologist","integrated","insularity","infallibility","indescribable","inclement","imperceptible","immolation","heretic","gusher","flint","familiarity","epithet","eddy","drove","disinfectant","delinquency","ceaselessly","Antipodes","myxomatosis","waterlogged","aquaplane","oceanarium","interstellar", "preservation", "porpoise", "scavenger", "thermodynamics", "chicanery", "fatuous", "content", "court", "crack", "fit", "like", "mean", "might", "oppress", "permanently", "ring", "bewilder", "fluctuation", "freshen", "leakage", "sincerity", "slumber", "transverse", "yeast", "California", "conceited", "evaluation", "analogous", "culpable", "ignoble", "insinuate", "itinerant", "preponderance","presumptuous","radiance","serenity","snout","trifling","viper", "aberrant","archaeologist","arsenic","auditory", "carnivore"}
			   //level 1
			   ,{"snobbery","boo","absorbing","wriggle","actuality","overheads","preacher","undercurrent","inconvenience","disgusting","starboard","squadron","jerky","punctuate","civilized","workstation","Dane","minstrel","cod","disillusionment","combative","savannah","debit","moot","endearing","municipality","foreman","lizard","calf","newsletter","catastrophic","demon","orphanage","flagship","shudder","orgy","indignity","cliche","authoritarian","vitality","supernatural","sophistication","resentful","gravitational","devastation","boredom","astronomical","acidic","accompaniment","digestive","unduly","undulate","undue","undeniable","tussle","terrestrial","sterilize","slur","shoal","sewage","reputable","recount","protagonist","promiscuous","pristine","preferential","potency","ply","pennant","penalize","patriotism","overrun","ordnance","ointment","myriad","mermaid","mariner","majestic","interweave","impoverish","impersonal","illumination","herring","heath","grid","gratify","forgery","ferment","fathom","fascination","espionage","enterprising","edifice","dune","dredge","debtor","cynic","customize","counteract","churn","cactus","blindfold","ballast","ballad","anarchy","alpine","abject","whimsical","vie","venom","variant","utilitarian","trickle","tremor","tether","tangible","swoop","subservient","speculative","spasm","solitary","snag","skirmish","shun","sediment","sanitation","saliva","saga","rugged","reminiscence","recede","perilous","patronage","omen","muzzle","intrigue","innovator","improvise","impending","hypocrisy","hub","heady","harry","grudge","flirt","exterminate","entail","ensue","dreary","domesticate","cosmopolitan","concoct","chasm","cascade","canyon","burrow","blizzard","bequeath","banish","banal","avenge","assail","armament","anecdote","affluent","adolescence","ablaze","tempo","taboo","plausible","paradox","obstruction","lark","intermittent","aggravate","vulgar","trivial","suffice","subdue","slander","slack","skyscraper","silicon","shatter","shark","sensor","propulsion","predominant","pertinent","persecute","pedestrian","opaque","negligible","monstrous","magnitude","lunar","latitude","infinity","inclination","inaccessible","illiterate","hypothesis","humidity","heave","harp","glider","generalize","facilitate","energize","endow","electrode","elapse","drainage","disgrace","devotion","deviation","descendant","decompose","cosmic","conqueror","comprehend","commonplace","clatter","butt","ashore","torrent","throng","tame","slipper","ornament","navigation","mosquito","Mercury","horizontal","harness","graph","friction","despise","deduce","crust","envision","rendezvous","futile","susceptible","gale","sanguine","spawn","equilibrium","apparatus","attain","gifted","silt","spatial","turbulent","beaver","squeak","discern","crest","trough"}
			   //level 2
			   ,{"cm","ageing","goodwill","psychologist","suburban","alarming","victorian","manoeuvre","hammer","psychiatrist","creditor","visualize","toxic","stereotype","sceptical","psychiatric","prolonged","portfolio","pagan","maturity","loom","ironically","imperial","graphic","epic","ego","dolphin","discredit","diagnosis","defendant","convertible","belly","arena","administrative","soothe","robust","portray","juvenile","justification","incumbent","gilt","exquisite","chant","blur","alienate","aesthetic","triple","tribal","savage","odds","incur","hierarchy","epidemic","deteriorate","census","adverse","adolescent","administer","settler","oxygen","boring","virtual","vicious","terrace","spiral","slaughter","shove","sensation","resent","prey","plea","pest","perception","patent","outlaw","obligation","morality","literally","likelihood","inspiration","incidentally","inadequate","hurricane","humanity","hull","hamper","forge","expedition","eternal","episode","emission","distort","deprive","defy","deem","cylinder","constitute","compulsory","complication","appreciation","absurd","wreck","vertical","underline","unconscious","transmit","thrive","theoretical","tenant","strictly","steep","splendid","specimen","signature","shepherd","scent","rub","rotate","rot","rigid","remedy","reinforce","receipt","realm","rational","prescribe","preliminary","precaution","plantation","pioneer","pine","physicist","particle","outlook","oriental","organism","multiply","mineral","linen","legend","intimate","interval","hydrogen","grace","glorious","formation","exclusively","earthquake","disorder","dimension","delicate","cushion","curl","conversion","confess","compound","coarse","circulate","cheque","cheat","casual","carrot","cannon","bud","bronze","boast","assign","assemble","appetite","ancestor","accommodation","accelerate","premise","conceive","erode","manifest","utter","cater","lash","haul","confine","backward", "artificial","beast","infant","mushroom","proposition","scratch","tariff","tribe"}
			   //level 3
			   ,{"Danish","broker","virus","identity","dividend","allegation","vulnerable","pact","controversial","riot","priority","initiative","enhance","controversy","competitive","clash","chip","assumption","alongside","venture","tissue","solid","rhythm","retreat","ray","port","plunge","perspective","pension","mount","maximum","luxury","invest","intense","inquiry","Indian","implication","grip","forecast","fierce","eliminate","dust","drum","cricket","cow","contest","consideration","communicate","code","circuit","carrier","capacity","bat","analysis","acre","abandon","infect","device","encounter","alcohol"}
			   //level 4
			   ,{"behaviour","commitment","tough","technique","supreme","standard","slip","settlement","senior","positive","original","odd","nuclear","means","increasingly","impose","finance","democratic","commission","cash","agent","adopt","caption","summit","mortgage","safe","dispute"}
			   //level 5
			   ,{"list","leave","accord","account","process","keep","current"}
			   };
	    style = new SpannableStringBuilder(content);
		for(int m = 0; m <= level; m++) {
		   for(int n = keywords[m].length - 1; n >=0; n--)
		   {
			  int start = content.indexOf(keywords[m][n]); 
			  // 检索单词
			  searchWord(keywords[m][n], 0);
			  text_content.setText(style);
		   }
		}
	}
	public void searchWord(String word, int start)
	{
		if(start > content.length()) {
			return;
		}
		int result = content.indexOf(word, start);
	    if(result > -1) {
	    	// 排除掉错误单词
	    	String pre = content.charAt(result -1) + "";
	    	Pattern pattern = Pattern.compile("[a-zA-Z]");
	        Matcher m = pattern.matcher(pre); 
	        if(m.find()){
	        	return;
	        }
	    	// 设置高亮
	    	int end = result + word.length();
	    	style.setSpan(new ForegroundColorSpan(Color.RED),result, end, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
	    	searchWord(word, end + 1);
	    }
	}	

}



