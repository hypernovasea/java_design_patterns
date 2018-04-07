package iterator;

import factory.Avenger;

public class IteratorDriver {

    public static void main(String[] args){

        XMan x1 = new XMan("Wolverine", "Advanced healing, adamantium skeleton");
        XMan x2 = new XMan("Storm", "Weather manipulation");
        XMan x3 = new XMan("Cyclops", "Concussive blast from eyes");
        XMan x4 = new XMan("Jean Gray", "Telekinesis, telepathy");
        XMan x5 = new XMan("Archangel", "Powerful wings");
        XMan x6 = new XMan("Beast", "Strength, speed, agility");

        XMan[] xmen = {x1, x2, x3, x4, x5, x6};
        XMenIterator xIter = new XMenIterator(xmen);

        while(xIter.hasNext()){
            XMan x = xIter.next();
            System.out.println("\n");
            x.mutation();

        }
    }
}
