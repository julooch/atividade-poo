package atividade1;

public class Suprimentos {
        private int numeroItem;
        private String descricaoItem;
        private int quantidadeItem;
        private double precoItem;

        public Suprimentos(int numeroItem, String descricaoItem, int quantidadeItem, double precoItem) {
            this.numeroItem = numeroItem;
            this.descricaoItem = descricaoItem;
            this.quantidadeItem = (quantidadeItem >= 0) ? quantidadeItem : 0;
            this.precoItem = (precoItem >= 0.0) ? precoItem : 0.0;
        }

        public int getNumeroItem() {

            return numeroItem;
        }

        public void setNumeroItem(int numeroItem) {

            this.numeroItem = numeroItem;
        }

        public String getDescricaoItem() {

            return descricaoItem;
        }

        public void setDescricaoItem(String descricaoItem) {

            this.descricaoItem = descricaoItem;
        }

        public int getQuantidadeItem() {

            return quantidadeItem;
        }

        public void setQuantidadeItem(int quantidadeItem) {
            this.quantidadeItem = (quantidadeItem >= 0) ? quantidadeItem : 0;
        }

        public double getPrecoItem() {
            return precoItem;
        }

        public void setPrecoItem(double precoItem) {

            this.precoItem = (precoItem >= 0.0) ? precoItem : 0.0;
        }

        public double getInvoiceAmount() {

            return quantidadeItem * precoItem;
        }
    }