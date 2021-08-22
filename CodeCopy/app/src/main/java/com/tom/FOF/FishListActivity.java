package com.tom.FOF;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tom.FOF.app.Fish;

import java.util.ArrayList;
import java.util.List;

public class FishListActivity extends AppCompatActivity implements OnRecyclerViewClickListener {


    static String FISH_NAME = "fish_name";
    static String FISH_IMAGE = "fish_name";


    List<Fish> getFishes() {

        List<Fish> fishList = new ArrayList<Fish>();

        Fish angler = new Fish(R.drawable.angler, "Angler", "These carnivorous fish have huge heads that bear enormous, crescent-shaped mouths, that hinges back like a snake, full of long, fang-like teeth angled inward for efficient prey grabbing. The teeth can be depressed to offer no impediment to an object gliding towards the stomach but prevent its escape from the mouth.\n" +
                "\n" +
                "The anglerfish can distend its stomach, since its bones are thin and flexible, to enormous size, allowing it to swallow prey up to twice as large as its entire body.\n" +
                "\n" +
                "The Angler gets its name from the fishing rod shaped tapered dorsal fin ray protruding from its snout which it raises and waves about. The fleshy lure at the end gives the impression of a small fish in difficulties.\n" +
                "\n" +
                "Lying half submerged in sand or sea weed and assuming the colour of its surroundings the Angler entices its prey to within striking distance.\n" +
                "\n" +
                "Most common on the south and south west coasts, the Angler is rarely found past the eastern end of the English Channel. The species migrates inshore in the autumn returning to deep water in March and June to spawn in depths of around 1,500 m. The spawn of the anglerfish of the consists of a thin sheet of transparent gelatinous material 25 cm wide and greater than 10 m long. The eggs in this sheet are in a single layer, each in its own cavity. The spawn is free in the sea. The larvae are free-swimming and have the pelvic fins elongated into filaments. Such an egg sheet is rare among fish.\n" +
                "\n" +
                "The young fish swim freely, helped by their long fin rays which reduce in size as they grow. On reaching a length of 8cm. the Angler goes down to the sea bed - so stories of it coming to the surface to drag down seabirds are highly improbable!\n" +
                "\n" +
                "The Angler is sometimes confused with the Monkfish which is roughly the same shape. Noted as the first source of medical insulin, the Angler has a soft, bony skeleton whereas the Monk is cartilaginous.\n" +
                "\n" +
                "The tail meat is known as Monkfish and is widely used in cooking and is often compared to lobster tail in taste and texture. In Asia, especially Korea and Japan, Monkfish liver, known as Ankimo, is considered a delicacy.\n" +
                "\n" +
                "Because the Angler lives by luring its prey, it is usually only caught when bottom fishing for other species. But beware its sharp teeth as it can live for several hours out of water.\n" +
                "\n ", "<a href='https://www.fish-o-fax.com/angler.htm'>Open</a> or <a href='https://www.fish-o-fax.com/angler.htm'>Open</a>");
        fishList.add(angler);
        fishList.add(new Fish(R.drawable.bass, "Bass", "The Bass, a member of the Sea Perch and Grouper family, is a voracious roving predator which actively chases schools of fish, using powerful crushing dentals to kill its prey.\n" +
                "\n" +
                "The word bass comes from Middle English bars, meaning \"perch\".\n" +
                "\n" +
                "The North Sea population of this species is mostly made up of summer migrants from the western Channel and Bay of Biscay, which return south in November/December when the sea temperature drops below 9°C.\n" +
                "\n" +
                "The Bass spawns offshore in spring and as fry they are pelagic, but as they develop they move into estuaries where they stay for a year or two. Juveniles, called schoolies live in schools and have a very slow growth rate so many nursery grounds for Bass are now designated as protected areas in which no fishing is allowed.\n" +
                "\n" +
                "This fish, which can live over 20 years, feeds freely at night, especially from open beaches along the surf line or in daytime in fast water over estuary bars, around headlands, over rocky ground and shallow wrecks.\n" +
                "\n" +
                "European bass was one of the first types of fish to be farmed commercially in Europe. They were historically cultured in coastal lagoons and tidal reservoirs, before mass-production techniques were developed starting in the late 1960s.\n" +
                "\n" +
                "Although not on the IUCN ‘Red List’ there are restrictions in most areas required by the regional IFCA. The restrictions could range from a total ban to limited day catch or restricted zones. Always check beforehand as fines for landing are substantial.\n" +
                "\n" +
                "At sea look out for gulls weaving and diving into the sea as this could be the sign that a school of sprats, young herring, sand eels or sand smelts which has been forced to the surface by Bass.\n" +
                "\n" +
                "Trolling live sandeel on the drift is favoured and on inshore marks, ledgered sandeel or peeler crab. For deeper rocky marks and shallow wrecks use large lasks of Mackerel with a flowing trace rig.\n" +
                "\n" +
                "For shore fishing start fishing at low water and move towards the shore with incoming tide.\n" +
                "\n" +
                "For bait use peeler crab or sandeel, if they inhabit that area, or fresh mackerel.\n" +
                "\n"+
                "Keep the rig as light as possible with a strong leader line for large bass. Keep points of hooks sharp improves catches.\n", "<a href='https://www.fish-o-fax.com/bass.htm'>Open</a> "));
                fishList.add(new Fish(R.drawable.bream, "Bream", "A relatively common sea-bream in northern European waters, although north of the English Channel it is probably a summertime migrant.\n" +
                "\n" +
                "The Black Bream is not black but has silvery grey sides with dusky bars. These colours fade soon after death when they turn almost black.\n" +
                "\n" +
                "Black sea bream is protogynous meaning females can change to males.\n" +
                "\n" +
                "Juveniles are more colourful and usually have numerous broken yellowish stripes along the sides, spotted fins and a dark edge to the tail which often persists into adult life.\n" +
                "\n" +
                "Classed as 'Demersal', living close to or on the seabed it is one of the few sea species in which the male builds a nest by digging a depression in the sandy sea-bed in which the female lays her eggs in April and May. Here they are guarded by the male until they hatch; the young tend to form a loose school around the nest for several weeks after hatching.\n" +
                "\n" +
                "Although not on the IUCN ‘Red List’ there are restrictions in some areas required by the regional IFCA. The restrictions could range from a total ban to limited day catch or restricted zones where there is natural habitat for spawning and home to juveniles.\n" +
                "\n" +
                "Active mainly during the day, the best time to fish for Bream is before and after slack water as they prefer to feed during weak tidal runs. Once hooked, the Bream will give excellent sport on light tackle, especially if using fresh water spinning rod.\n" +
                "\n" +
                "For bait use long strips of Squid or Mackerel (with or without a worm cocktail) which are most effective when presented above the lead weight.\n" +
                "\n" +
                "Best to use a net to land your catch as it may only be lip hooked and likely to drop off before landing. Hold by the belly when disgorging as there are sharp dorsal spines that can cause painful injury.\n", "<a href= https:fish-o-fax.com/bream>"));
        fishList.add(new Fish(R.drawable.cod, "Cod", "Cod has been an important economic commodity in international markets since the Viking period (around 800 AD). Norwegians travelled with dried cod and soon a dried cod market developed in southern Europe.\n" +
                "\n" +
                "In 1733, Britain tried to gain control over trade between New England and the British Caribbean by imposing the Molasses Act.  In the late 20th and early 21st centuries, fishing off the European and American coasts severely depleted stocks and become a major political issue. , Iceland re-emerged as a fishing power and entered the Cod Wars\n" +
                "\n" +
                "Adult cod are active hunters and feeds on almost anything, varying its habitat in its constant search for sustenance and using its chin barbel and pelvic fins to detect food on or just beneath the sea bed. Juvenile small Cod, , are called Codling, of up to 3 kilos are caught all the year round, particularly in Scotland and the north east coast during spring and summer. The heavier fish move inshore between October and April.\n" +
                "\n" +
                "Maturing at three to four years, the female sheds 4-5 million eggs in late spring - the main spawning ground being the eastern end of the English Channel. Growing to 63 cm over three years and usually living six to ten years, the Cod gains weight throughout its life.\n" +
                "\n" +
                "Colouration varies considerably, with specimens taken over a sandy bottom showing pale grey, those from among sea weed, brown, green or even reddish. The Atlantic cod can change colour at certain water depths. It has two distinct colour phases: gray-green and reddish brown\n" +
                "\n" +
                "Whilst mating, Cod make grunting noises by vibrating the muscles of the swim bladder an also to show aggression.\n" +
                "\n" +
                "Cod is popular as a food with a mild flavour and a dense, flaky, white flesh. Cod livers are processed to make cod liver oil, an important source of vitamin A, vitamin D, vitamin E, and Omega-3 fatty acids.\n" +
                "\n" +
                "Cod and related species are plagued by parasites.\n" +
                "\n" +                "Young Atlantic cod or haddock prepared in strips for cooking is called 'Scrod'. In the United Kingdom, Atlantic cod is one of the most common ingredients in fish and chips, along with haddock and plaice.\n", "<a href= https:fish-o-fax.com/cod>"));

        /*fishList.add(new Fish(R.drawable.dab, "Dab", "its Good", "Dab Link"));
        fishList.add(new Fish(R.drawable.dogfish, "Dogfish, Lessor Spotted", "its Good", "Dogfish"));
        fishList.add(new Fish(R.drawable.dory, "Dory, John", "its Good", "Dory Link"));
        fishList.add(new Fish(R.drawable.eel, "Eel", "its Good", "Eel Link"));
        fishList.add(new Fish(R.drawable.flounder, "Flounder", "its Good", "Flouder Link "));
        fishList.add(new Fish(R.drawable.garfish, "Garfish", "its Good", "GarFish  link"));
        fishList.add(new Fish(R.drawable.gurnard, "Gurnard", "its Good", "Gurnard Link"));
        fishList.add(new Fish(R.drawable.haddock, "Haddock", "its Good", "Haddock link"));
        fishList.add(new Fish(R.drawable.hake,"Hake","its Good"));
        fishList.add(new Fish(R.drawable.halibut,"Halibut","its Good"));
        fishList.add(new Fish(R.drawable.ling,"Ling","its Good"));
        fishList.add(new Fish(R.drawable.mackerel,"Mackerel","its Good"));
        fishList.add(new Fish(R.drawable.monkfish,"Monkfish","its Good"));
        fishList.add(new Fish(R.drawable.mullet,"Mullet","its Good"));
        fishList.add(new Fish(R.drawable.plaice,"Plaice","its Good"));
        fishList.add(new Fish(R.drawable.pollack,"Pollack","its Good"));
        fishList.add(new Fish(R.drawable.pout,"Pout","its Good"));
        fishList.add(new Fish(R.drawable.saithe,"Saithe","its Good"));
        fishList.add(new Fish(R.drawable.shark,"Shark, Porbeagle","its Good"));
        fishList.add(new Fish(R.drawable.skate,"Skate","its Good"));
        fishList.add(new Fish(R.drawable.smoothhound,"Smoothhound, Lesser Spotted","its Good"));
        fishList.add(new Fish(R.drawable.spurdog,"Spurdog","its Good"));
        fishList.add(new Fish(R.drawable.thornback,"Tornback Ray","its Good"));
        fishList.add(new Fish(R.drawable.tope,"Tope","its Good"));
        fishList.add(new Fish(R.drawable.turbot,"Turbot","its Good"));
        fishList.add(new Fish(R.drawable.weever,"Weever","its Good"));
        fishList.add(new Fish(R.drawable.whiting,"Whiting","its Good"));
        fishList.add(new Fish(R.drawable.wrasse,"Wrasse","its Good"));*/

        return fishList;
    }
        RecyclerView recyclerView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_list);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView =findViewById(R.id.fishlist);
        recyclerView.setLayoutManager(linearLayoutManager);
        FishAdapter fishAdapter = new FishAdapter(getFishes());
        fishAdapter.setOnReceiveContentListener(this);
        recyclerView.setAdapter(fishAdapter);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onItemClickListener(int position, Fish fish) {

        Intent intent =new Intent(FishListActivity.this,FishDetailActivity.class);
        intent.putExtra("Name",fish.getFishName());
        intent.putExtra(FISH_IMAGE,fish.getFishimage());
        intent.putExtra("description",fish.getDescription());
        intent.putExtra("hlink", fish.gethLink());
        startActivity(intent);

    }
}