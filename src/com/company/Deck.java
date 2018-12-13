package com.company;

import java.util.ArrayList;

public class Deck {
        private ArrayList<Card>unDealt;
        private ArrayList<Card>Dealt;

        public Deck(String[] ranks, String[] suits, int[] pointValues)
        {
            unDealt = new ArrayList<>();
            Dealt = new ArrayList<>();
            for(int i=0;i<ranks.length;i++)
            {
                for(int j=0;j<suits.length;j++)
                {
                    for(int k=0;k<pointValues.length;k++)
                    {
                        unDealt.add(new Card(ranks[i],suits[j],pointValues[k]));
                    }
                }
            }
        }

        public boolean isEmpty()
        {

        }

        public int size()
        {

        }

        public void deal()
        {

        }

        public void shuffle()
        {

        }
}
