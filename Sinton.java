
    package com.company;
    public final class Sinton {
        private static Sinton inst;
        public String val;

        private Sinton(String val) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            this.val = val;
        }

        public static Sinton getInst(String val) {
            if (inst == null) {
                inst = new Sinton(val);
            }
            return inst;
        }
    }
